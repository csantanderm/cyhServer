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
    
    
    public StackObjeto(){
        
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

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCantidadMax(int cantidadMax) {
        this.cantidadMax = cantidadMax;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public void setDescripcionCompleta(String descripcionCompleta) {
        this.descripcionCompleta = descripcionCompleta;
    }

    public void setDescripcionUso(String descripcionUso) {
        this.descripcionUso = descripcionUso;
    }

    public void setIcono(String icono) {
        this.icono = icono;
    }
    
    
    
}
