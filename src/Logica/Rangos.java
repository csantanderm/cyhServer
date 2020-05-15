/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

public class Rangos {
    final public static int RECLUTA = 0;
    final public static int CADETE = 1;
    final public static int ALFEREZ = 2;
    final public static int TENIENTE = 3;
    final public static int CAPITAN = 4;
    final public static int MAYOR = 5;
    final public static int CORONEL = 6;
    final public static int GENERAL = 7;
    
    public static String getNombreRango(int rango){
        switch(rango){
            case RECLUTA:
                return "Recluta";
            case CADETE:
                return "Cadete";
            case ALFEREZ:
                return "Alférez";
            case TENIENTE:
                return "Teniente";
            case CAPITAN:
                return "Capitán";
            case MAYOR:
                return "Mayor";
            case CORONEL:
                return "Coronel";
            case GENERAL:
                return "General";
            default:
                return "";
        }
    }
}
