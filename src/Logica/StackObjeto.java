/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.io.File;
import java.io.Serializable;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;


public class StackObjeto implements Serializable{
    
    final public static int IMPORTANTE = 0;
    final public static int CONSUMIBLE = 1;
    final public static int RECURSO = 2;
    
    int id;
    String nombre;
    int cantidad;
    int cantidadMax;
    int tipo;
    String descripcionCompleta;
    String descripcionUso;
    String icono;
    
    
    public StackObjeto(int idObjeto, String nombreObj, int tipoObj, String desc, String iconArchivo){
        id=idObjeto;
        nombre=nombreObj;
        cantidad=1;
        cantidadMax=1;
        tipo=tipoObj;
        descripcionUso=desc;
        icono = iconArchivo;
    }

    public String getIcono() {
        return icono;
    }

    public int getTipo() {
        return tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public String getDescripcionUso() {
        return descripcionUso;
    }
    
    public String getStringTipo(){
        if (tipo==RECURSO){
            return "Recurso";
        }
        if (tipo==CONSUMIBLE){
            return "Consumible";
        }
        return "";
    }

    public int getId() {
        return id;
    }

    public int getCantidadMax() {
        return cantidadMax;
    }

    public String getDescripcionCompleta() {
        return descripcionCompleta;
    }
    
    
}
