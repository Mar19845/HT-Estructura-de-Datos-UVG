/**
 *@author Carlos Raxtum
 * @author Juan Marroquin
 */
public class Emisoras {
    private String Estacion;
    private int Frecuencia;
    //constructor
    public Emisoras(String Estacion, int Frecuencia) {
        this.Estacion = Estacion;
        this.Frecuencia = Frecuencia;
    }
    // getters y setters estacion
    public String getEstacion() {
        return Estacion;
    }
    public void setEstacion(String Estacion) {
        this.Estacion = Estacion;
    }
    //getters y setters Frecuencia
    public int getFrecuencia() {
        return Frecuencia;
    }
    public void setFrecuencia(int Frecuencia) {
        this.Frecuencia = Frecuencia;
    }
        
}
