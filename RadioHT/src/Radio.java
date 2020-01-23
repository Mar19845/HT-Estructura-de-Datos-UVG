/**
 *
 * @author Juan Marroquin
 */
public class Radio implements Funcionalidad{
    private boolean Encendido;
    private Emisoras[] EmisoraFm;
    private Emisoras[] EmisoraAm;
    private Emisoras[][] Favoritas;
    private int Freq;
    private int PosFm;
    private int PosAm;
    //Constructor
    public Radio(){
        Encendido = false;
        Freq = 1; // 1 = Fm / 0 = Am
        EmisoraFm = new Emisoras[20];
        EmisoraAm = new Emisoras[20];
        Favoritas = new Emisoras[2][12];
        PosFm = 0;
        PosAm=0;
        //Llenar Estaciones Fm
        EmisoraFm[0] = new Emisoras("88.1", 0);
	EmisoraFm[1] = new Emisoras("89.7", 1);
	EmisoraFm[2] = new Emisoras("90.1", 2);
	EmisoraFm[3] = new Emisoras("91.1", 3);
	EmisoraFm[4] = new Emisoras("91.3", 4);
	EmisoraFm[5] = new Emisoras("92.2",  5);
	EmisoraFm[6] = new Emisoras("94.9",  6);
	EmisoraFm[7] = new Emisoras("95.0", 7);
	EmisoraFm[8] = new Emisoras("95.3",  8);
	EmisoraFm[9] = new Emisoras("96.5", 9);
	EmisoraFm[10] = new Emisoras("97.3", 10);
	EmisoraFm[11] = new Emisoras("98.3", 11);
        EmisoraFm[12] = new Emisoras("99.3", 12);
	EmisoraFm[13] = new Emisoras("100.3", 13);
	EmisoraFm[14] = new Emisoras("100.9", 14);
	EmisoraFm[15] = new Emisoras("101.1", 15);
	EmisoraFm[16] = new Emisoras("101.5", 16);
	EmisoraFm[17] = new Emisoras("102.5", 17);
	EmisoraFm[18] = new Emisoras("107.3",18);
	EmisoraFm[19] = new Emisoras("107.7", 19);
        // llenar estaciones Am
        EmisoraAm[0] = new Emisoras("560", 0);
	EmisoraAm[1] = new Emisoras("580", 1);
	EmisoraAm[2] = new Emisoras("610", 2);
	EmisoraAm[3] = new Emisoras("640", 3);
	EmisoraAm[4] = new Emisoras("700", 4);
	EmisoraAm[5] = new Emisoras("730", 5);
	EmisoraAm[6] = new Emisoras("760", 6);
	EmisoraAm[7] = new Emisoras("790", 7);
	EmisoraAm[8] = new Emisoras("820", 8);
	EmisoraAm[9] = new Emisoras("880", 9);
	EmisoraAm[10] = new Emisoras("910", 10);
	EmisoraAm[11] = new Emisoras("940", 11);
        EmisoraAm[12] = new Emisoras("970", 12);
	EmisoraAm[13] = new Emisoras("1030", 13);
	EmisoraAm[14] = new Emisoras("1090", 14);
	EmisoraAm[15] = new Emisoras("1120", 15);
	EmisoraAm[16] = new Emisoras("1150", 16);
	EmisoraAm[17] = new Emisoras("1190", 17);
	EmisoraAm[18] = new Emisoras("1270", 18);
	EmisoraAm[19] = new Emisoras("1330", 19);
    }
    
    @Override
    public String estacionActual() {
        String Descripcion ="";
        if(Freq==1){
            if(EmisoraFm[PosFm]!=null){
                Descripcion=EmisoraFm[PosFm].getEstacion()+" Fm";  
            }
        }
        else if(Freq==0){
            if(EmisoraAm[PosAm]!=null){
                Descripcion=EmisoraAm[PosAm].getEstacion()+" Am";  
            }
        }
        return Descripcion;
    }
    
    @Override
    public boolean estado() {
        String Estado= "";
        if (Encendido != true){
            Estado = "Estoy encendido";
        }
        else{
            Estado = "Estoy Apagado";
        }
        return Encendido;
    }

    @Override
    public void onOff() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void cambiarFrecuencia() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void avanzar() {
        if(Freq == 1) {
            PosFm++;
            if(PosFm==20) {
                PosFm = 0;
            }
	}
        else if(Freq == 0) {
            PosAm++;
            if(PosAm == 19) {
                PosAm = 0;
            }
        }
    }

    @Override
    public void guardar(int boton) {
        boton= boton-1;
        if(Freq == 1) {
            Favoritas[Freq][boton] = EmisoraFm[PosFm];
        }
        else if(Freq == 0) {
            Favoritas[Freq][boton] = EmisoraFm[PosAm];
        }
    }
        

    @Override
    public void seleccionarEmisora(int boton) {
        boton= boton-1;
       if(Favoritas[Freq][boton] != null) {
           if(Freq == 1) {
               PosFm = Favoritas[Freq][boton].getFrecuencia();	
           }
           if(Freq == 0) {
               PosAm = Favoritas[Freq][boton].getFrecuencia();
           }
		}
	} 
    }