/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laradio;

/**
 *
 * @author craxt
 */
public class LaRadio{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    
    public void cambiarFrecuencia(){
        if(this.esAM==true){
            this.esAM=false;
        }
        else{
            this.esAM=true;
        }
        System.out.println("cambio de FM a AM o viceversa");
        
    }
    public void encender(){
        this.estaEncendido = true;
        System.out.println("Esta encendido");
    }        
    
    public void apagar(){
        this.estaapagamos = true;
        System.out.println("Esta apagado");
    }        
    
}
