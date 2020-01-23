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
     public String encencerTelefono(Radio t){
//Si el teléfono no esta encendido y el método encendido es verdadero entonces el teléfono se encenderá.
 if(t.getencendido()==false){
    t.setencendido(true);
    return "El telefono se eh encendido";
 }
//Si no entonces el teléfono ya estaba encendio.
    else
    return "El telefono ya estaba encendido";
 //método para apagar el telefono
 }
 public String apagarTelefono(Radio t){
//Si el teléfono esta encendido entonces el teléfono se apagara.
 if(t.getencendido()==(true)){
    t.setencendido(false);
    return "El telefono se apagó";
 }
//Si no entonces el teléfono ya estaba apagado.
    else
    return "El teléfono ya estaba apagado";
 }
//*método para realizar una llamada con la clase teléfono como parámetro.
 public String hacerllamada(Radio t){
//Si el estado del teléfono esta encendido entonces podra realizar una llamada.
    if(t.getencendida()==(true)){
        return "Llamada activa";
 }
//Si no entonces el teléfono esta apagado y deberá encenderse primero.
    else
    return "falta encender el telefono";

 }
} 
