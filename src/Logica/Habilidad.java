/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.io.Serializable;


public class Habilidad implements Serializable{
    
    final static public int OFENSIVA = 0;
    final static public int DEFENSIVA = 1;
    final static public int PASIVA = 2;
    final static public int ESTRATEGICA = 3;

    final static public int OBJETIVO_AUTO = 0;
    final static public int OBJETIVO_ALIADO = 1;
    final static public int OBJETIVO_ALIADOS = 2;
    final static public int OBJETIVO_AUTOYALIADOS = 3;
    final static public int OBJETIVO_ENEMIGO = 4;
    final static public int OBJETIVO_ENEMIGOS = 5;
    final static public int OBJETIVO_TODOS = 6;
    final static public int OBJETIVO_NULO = 7;
    
    
    int id;
    String nombre;
    int tipo;
    String descripcionCorta;
    String descripcionLarga;
    int enfriamiento;
    int objetivo;
    String icono;
    
    public Habilidad(int idHab,String nombreHab, int tipoHab, String desc, int cd, String rutaIcono, int objetivoH){
        id = idHab;
        nombre = nombreHab;
        tipo=tipoHab;
        descripcionCorta = desc;
        enfriamiento = cd;
        icono = rutaIcono;
        objetivo = objetivoH;
    }

    public int getEnfriamiento() {
        return enfriamiento;
    }

    public int getObjetivo() {
        return objetivo;
    }

    
    public String getIcono() {
        return icono;
    }
 
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTipo() {
        return tipo;
    }

    public String getDescripcionCorta() {
        return descripcionCorta;
    }

    public String getDescripcionLarga() {
        return descripcionLarga;
    }

    public int getCooldown() {
        return enfriamiento;
    }
    
//    public String getStringTipo(){
//        switch(tipo){
//            case OFENSIVA:
//                return "Ofensiva";
//            case DEFENSIVA:
//                return "Defensiva";
//            case PASIVA:
//                return "Pasiva";
//            case ESTRATEGICA:
//                return "Estratégica";   
//        }
//        return "";
//    }
    public String getStringObjetivo(){
        switch(objetivo){
            case OBJETIVO_AUTO:
                return "Mi personaje";
            case OBJETIVO_ALIADO:
                return "Un aliado";
            case OBJETIVO_ALIADOS:
                return "Todos tus aliados";
            case OBJETIVO_AUTOYALIADOS:
                return "Todo tu escuadrón";
            case OBJETIVO_ENEMIGO:
                return "Un enemigo";
            case OBJETIVO_ENEMIGOS:
                return "Todos los enemigos";
            case OBJETIVO_TODOS:
                return "Todos en el campo";
            case OBJETIVO_NULO:
                return "";
        }
        return "";
    }
}
