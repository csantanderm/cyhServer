/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

public class Clases {
    final public static int COMBATIENTE = 0;
    final public static int GUARDIA = 1;
    final public static int ACROBATA = 2;
    final public static int ESTRATEGA = 3;
    
    public static String getNombreClase(int clase){
        switch(clase){
            case COMBATIENTE:
                return "Combatiente";
            case GUARDIA:
                return "Guardia";
            case ACROBATA:
                return "Acróbata";
            case ESTRATEGA:
                return "Estratega";
            default:
                return "";
        }
    }
}
