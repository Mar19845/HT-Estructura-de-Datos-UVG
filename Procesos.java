/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author craxt
 */
public class Procesos {
    public boolean encendida;
    public boolean apagada;
    public Procesos()
 {   
    //*Se inicializan los atributos.
    this.encendida = encendida;
 } 
     public String encencerRadio(Radio t){

 if(t.getencendido()==false){
    t.setencendido(true);
    return "El radio se eh encendido";
 }

    else
    return "El radio ya estaba encendido";

 }
 public String apagarRadio(Radio t){

 if(t.getencendido()==(true)){
    t.setencendido(false);
    return "El radio se apagó";
 }

    else
    return "El radio ya estaba apagado";
 }
} 

} 
