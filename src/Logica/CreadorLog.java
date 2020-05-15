/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;




/**
 *
 * @author mmancora
 */
public class CreadorLog {
    
    static public String crearBienvenida(int niebla, int territorio, int horario){
        String color = "#2e6c80;";
        String conFormato = "<span style='color: "+color+" font-family:tahoma; display: inline-block; padding: 3px 10px; font-weight: bold;'>>>Narrador: </span> ";
        conFormato = conFormato + "<span style='color: "+color+" font-family:tahoma; display: inline-block; padding: 3px 10px;'>Esta historia comienza en  "+getNombreTerritorio(territorio)+". Se hallan en medio de un "+getNombreNiebla(niebla)+".<span>"; 
        
        return conFormato;
    }
    
    public static String getNombreTerritorio(int territorio){
        switch(territorio){
            case NieblasTerritorios.TERRITORIO_BOSQUENEGRO:
                return "el Bosque Negro";
            case NieblasTerritorios.TERRITORIO_OROPURO:
                return "Oropuro";
            case NieblasTerritorios.TERRITORIO_LAGUNABLANCA:
                return "la Laguna Blanca";
            default:
                return "";
        }
    }
    
    public static String getNombreNiebla(int niebla){
        switch(niebla){
            case NieblasTerritorios.CODIGOBLANCO:
                return "código blanco";
            case NieblasTerritorios.CODIGONEGRO:
                return "código negro";
            case NieblasTerritorios.CODIGOAZUL:
                return "código azul";
            default:
                return "";
        }
    }
    
}
