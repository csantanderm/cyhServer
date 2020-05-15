/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author Jessica
 */
public class NivelesExp {
    public static final int NIVEL2 = 30;
    public static final int NIVEL3 = 40;
    public static final int NIVEL4 = 55;
    public static final int NIVEL5 = 75;
    public static final int NIVEL6 = 100;
    public static final int NIVEL7 = 130;
    public static final int NIVEL8 = 165;
    public static final int NIVEL9 = 205;
    public static final int NIVEL10 = 250;
    public static final int NIVEL11 = 300;
    public static final int NIVEL12 = 355;
    public static final int NIVEL13 = 415;
    public static final int NIVEL14 = 480;
    public static final int NIVEL15 = 550;
    public static final int NIVEL16 = 625;
    public static final int NIVEL17 = 705;
    public static final int NIVEL18 = 790;
    public static final int NIVEL19 = 880;
    public static final int NIVEL20 = 975;
    
    public static int expNecesaria(int nivelActual){
        switch(nivelActual){
            case 1:
                return NIVEL2;
            case 2:
                return NIVEL3;
            case 3:
                return NIVEL4;
            case 4:
                return NIVEL5;
            case 5:
                return NIVEL6;
            case 6:
                return NIVEL7;
            case 7:
                return NIVEL8;
            case 8:
                return NIVEL9;
            case 9:
                return NIVEL10;
            case 10:
                return NIVEL11;
            case 11:
                return NIVEL12;
            case 12:
                return NIVEL13;
            case 13:
                return NIVEL14;
            case 14:
                return NIVEL15;
            case 15:
                return NIVEL16;
            case 16:
                return NIVEL17;
            case 17:
                return NIVEL18;
            case 18:
                return NIVEL19;
            case 19:
                return NIVEL20;
            default:
                return 0;
            
        }
    }
}
