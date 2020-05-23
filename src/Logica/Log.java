/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.io.Serializable;

/**
 *
 * @author mmancora
 */
public class Log implements Serializable{
    
    String mensaje, personaje;
    
    public Log(String msg, String pj){
        mensaje = msg;
        personaje = pj;
    }

    public String getMensaje() {
        return mensaje;
    }

    public String getPersonaje() {
        return personaje;
    }
    
    
}
