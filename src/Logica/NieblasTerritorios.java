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
public class NieblasTerritorios {
    public static final int CODIGOBLANCO = 0;
    public static final int CODIGONEGRO = 1;
    public static final int CODIGOAZUL = 2;
    public static final int CODIGOROJO = 3;
    public static final int CODIGOVERDE = 4;
    public static final int CODIGOAMARILLO = 5;
    
    public static final int TERRITORIO_VALLEWARGO = 0;
    public static final int TERRITORIO_OROPURO = 1;
    public static final int TERRITORIO_BOSQUENEGRO = 2;
    public static final int TERRITORIO_LAGUNABLANCA = 3;
    public static final int TERRITORIO_ALTOSDELSERUM = 0;

    public static String getGraficoTerritorio(int territorio){
        switch(territorio){
            case TERRITORIO_BOSQUENEGRO:
                return "bosque_negro.png";
            case TERRITORIO_OROPURO:
                return "oropuro.png";
            case TERRITORIO_LAGUNABLANCA:
                return "laguna_blanca.png";
            default:
                return "";
        }
    }
    
    
    
    public static String getGraficoNiebla (int niebla){
        switch (niebla){
            case CODIGOBLANCO:
                return "niebla_blanca.png";
            default:
                return "";
        }
    }
    
}
