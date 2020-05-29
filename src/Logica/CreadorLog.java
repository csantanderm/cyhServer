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
    
    public static Log crearBienvenida(int niebla, int territorio, int horario){
        String color = "#2e6c80;";
        
        String personaje = "<span style='color: "+color
                +" font-family:tahoma; display: inline-block; padding: 3px 10px; font-weight: bold;'>>>Narrador: </span> ";
        String mensaje = "<span style='color: "+color
                +" font-family:tahoma; display: inline-block; padding: 3px 10px;'>Esta historia comienza en "
                + getNombreTerritorio(territorio)
                +". Se hallan en medio de un "+getNombreNiebla(niebla)+".</span><br>"; 
        
        Log log = new Log(mensaje,personaje);
        return log;
    }
    
    public static Log personajeSeMueve(String nombrePj, String casilla, boolean enMovimiento){
        String color = "#2e6c80;";
        String personaje = "<span style='color: "+color
                    +" font-family:tahoma; display: inline-block; padding: 3px 10px; font-weight: bold;'>>>Narrador: </span> ";;
        String mensaje="";
        if (enMovimiento){
            mensaje = "<span style='color: "+color
                    +" font-family:tahoma; display: inline-block; padding: 3px 10px;'>"
                    +" Te trasladas a la posición "+casilla+".</span><br>";
        }else{
            mensaje = "<span style='color: "+color
                    +" font-family:tahoma; display: inline-block; padding: 3px 10px;'>"
                    + nombrePj +" se traslada a la posición "+casilla+".</span><br>";
            }
        
        Log log = new Log(mensaje,personaje);
        return log;
    }
    
    public static Log personajeUsaObjeto(String nombrePj, String nombreObjeto, boolean usuario){
        String color = "#2e6c80;";
        String personaje = "<span style='color: "+color
                    +" font-family:tahoma; display: inline-block; padding: 3px 10px; font-weight: bold;'>>>Narrador: </span> ";;
        String mensaje="";
        if (usuario){
            mensaje = "<span style='color: "+color
                    +" font-family:tahoma; display: inline-block; padding: 3px 10px;'>"
                    +" Usas "+nombreObjeto+". Tu salud aumenta en 3.</span><br>";
        }else{
            mensaje = "<span style='color: "+color
                    +" font-family:tahoma; display: inline-block; padding: 3px 10px;'>"
                    + nombrePj +" usa "+nombreObjeto+". Su salud aumenta en 3.</span><br>";
            }
        
        Log log = new Log(mensaje,personaje);
        return log;
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
