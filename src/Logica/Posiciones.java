/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.util.ArrayList;

/**
 *
 * @author Jessica
 */
public class Posiciones {
    final public static int C = 0;
    final public static int N = 1;
    final public static int E = 2;
    final public static int O = 3;
    final public static int S = 4;
    
    final public static int NE = 5;
    final public static int NO = 6;
    final public static int SE = 7;
    final public static int SO = 8;
    
    final public static int NE1 = 9;
    final public static int NE2 = 10;
    final public static int NE3 = 11;
    final public static int NO1 = 12;
    final public static int NO2 = 13;
    final public static int NO3 = 14;
    final public static int SE1 = 15;
    final public static int SE2 = 16;
    final public static int SE3 = 17;
    final public static int SO1 = 18;
    final public static int SO2 = 19;
    final public static int SO3 = 20;
    
    final public static int N2 = 21;
    final public static int E2 = 22;
    final public static int O2 = 23;
    final public static int S2 = 24;
    
    public static ArrayList<Integer> getCasillasMovimiento(int posicion){
        
        ArrayList<Integer> casillas = new ArrayList<Integer>();
        switch(posicion){
            case Posiciones.C:
                casillas.add(Posiciones.N);
                casillas.add(Posiciones.E);
                casillas.add(Posiciones.O);
                casillas.add(Posiciones.S);
                casillas.add(Posiciones.NE);
                casillas.add(Posiciones.NO);
                casillas.add(Posiciones.SE);
                casillas.add(Posiciones.SO);
                break;
            case Posiciones.N:
                casillas.add(Posiciones.C);
                casillas.add(Posiciones.NE);
                casillas.add(Posiciones.NO);
                casillas.add(Posiciones.N2);
                casillas.add(Posiciones.NE1);
                casillas.add(Posiciones.NO3);
                break;
            case Posiciones.E:
                casillas.add(Posiciones.C);
                casillas.add(Posiciones.NE);
                casillas.add(Posiciones.SE);
                casillas.add(Posiciones.E2);
                casillas.add(Posiciones.NE3);
                casillas.add(Posiciones.SE1);
                break;
            case Posiciones.O:
                casillas.add(Posiciones.C);
                casillas.add(Posiciones.NO);
                casillas.add(Posiciones.SO);
                casillas.add(Posiciones.O2);
                casillas.add(Posiciones.NO1);
                casillas.add(Posiciones.SO3);
                break;
            case Posiciones.S:
                casillas.add(Posiciones.C);
                casillas.add(Posiciones.SE);
                casillas.add(Posiciones.SO);
                casillas.add(Posiciones.S2);
                casillas.add(Posiciones.SE3);
                casillas.add(Posiciones.SO1);
                break;
            case Posiciones.NE:
                casillas.add(Posiciones.C);
                casillas.add(Posiciones.N);
                casillas.add(Posiciones.E);
                casillas.add(Posiciones.NE1);
                casillas.add(Posiciones.NE2);
                casillas.add(Posiciones.NE3);
                break;
            case Posiciones.SE:
                casillas.add(Posiciones.C);
                casillas.add(Posiciones.S);
                casillas.add(Posiciones.E);
                casillas.add(Posiciones.SE1);
                casillas.add(Posiciones.SE2);
                casillas.add(Posiciones.SE3);
                break;
            case Posiciones.SO:
                casillas.add(Posiciones.C);
                casillas.add(Posiciones.S);
                casillas.add(Posiciones.O);
                casillas.add(Posiciones.SO1);
                casillas.add(Posiciones.SO2);
                casillas.add(Posiciones.SO3);
                break;
            case Posiciones.NO:
                casillas.add(Posiciones.C);
                casillas.add(Posiciones.N);
                casillas.add(Posiciones.O);
                casillas.add(Posiciones.NO1);
                casillas.add(Posiciones.NO2);
                casillas.add(Posiciones.NO3);
                break;
            case Posiciones.N2:
                casillas.add(Posiciones.N);
                casillas.add(Posiciones.NE1);
                casillas.add(Posiciones.NO3);
                break;
            case Posiciones.E2:
                casillas.add(Posiciones.E);
                casillas.add(Posiciones.NE3);
                casillas.add(Posiciones.SE1);
                break;
            case Posiciones.O2:
                casillas.add(Posiciones.O);
                casillas.add(Posiciones.NO1);
                casillas.add(Posiciones.SO3);
                break;
            case Posiciones.S2:
                casillas.add(Posiciones.S);
                casillas.add(Posiciones.SE3);
                casillas.add(Posiciones.SO1);
                break;
            case Posiciones.NE1:
                casillas.add(Posiciones.N);
                casillas.add(Posiciones.N2);
                casillas.add(Posiciones.NE);
                casillas.add(Posiciones.NE2);
                break;
            case Posiciones.NE2:
                casillas.add(Posiciones.NE1);
                casillas.add(Posiciones.NE3);
                casillas.add(Posiciones.NE);
                break;
            case Posiciones.NE3:
                casillas.add(Posiciones.E);
                casillas.add(Posiciones.E2);
                casillas.add(Posiciones.NE);
                casillas.add(Posiciones.NE2);
                break;
            case Posiciones.SE1:
                casillas.add(Posiciones.E);
                casillas.add(Posiciones.E2);
                casillas.add(Posiciones.SE);
                casillas.add(Posiciones.SE2);
                break;
            case Posiciones.SE2:
                casillas.add(Posiciones.SE1);
                casillas.add(Posiciones.SE3);
                casillas.add(Posiciones.SE);
                break;
            case Posiciones.SE3:
                casillas.add(Posiciones.S);
                casillas.add(Posiciones.S2);
                casillas.add(Posiciones.SE);
                casillas.add(Posiciones.SE2);
                break;
            case Posiciones.SO1:
                casillas.add(Posiciones.S);
                casillas.add(Posiciones.S2);
                casillas.add(Posiciones.SO);
                casillas.add(Posiciones.SO2);
                break;
            case Posiciones.SO2:
                casillas.add(Posiciones.SO1);
                casillas.add(Posiciones.SO3);
                casillas.add(Posiciones.SO);
                break;
            case Posiciones.SO3:
                casillas.add(Posiciones.O);
                casillas.add(Posiciones.O2);
                casillas.add(Posiciones.SO);
                casillas.add(Posiciones.SO2);
                break;
            case Posiciones.NO1:
                casillas.add(Posiciones.O);
                casillas.add(Posiciones.O2);
                casillas.add(Posiciones.NO);
                casillas.add(Posiciones.NO2);
                break;
            case Posiciones.NO2:
                casillas.add(Posiciones.NO1);
                casillas.add(Posiciones.NO3);
                casillas.add(Posiciones.NO);
                break;
            case Posiciones.NO3:
                casillas.add(Posiciones.N);
                casillas.add(Posiciones.N2);
                casillas.add(Posiciones.NO);
                casillas.add(Posiciones.NO2);
                break;
        }
        return casillas;
    }
    
    public static String getNombrePosicion(int pos){
        switch(pos){
            case 0:
                return "C";
            case 1:
                return "N";
            case 2:
                return "E";
            case 3:
                return "O";
            case 4:
                return "S";
            case 5:
                return "NE";
            case 6:
                return "NO";
            case 7:
                return "SE";
            case 8:
                return "SO";
            case 9:
                return "NE1";
            case 10:
                return "NE2";
            case 11:
                return "NE3";
            case 12:
                return "NO1";
            case 13:
                return "NO2";
            case 14:
                return "NO3";
            case 15:
                return "SE1";
            case 16:
                return "SE2";
            case 17:
                return "SE3";
            case 18:
                return "SO1";
            case 19:
                return "SO2";
            case 20:
                return "SO3";
            case 21:
                return "N2";
            case 22:
                return "E2";
            case 23:
                return "O2";
            case 24:
                return "S2";
            default:
                return "";
        }
    }
    
    public static int getIntPosicion(String pos){
        if (pos.equals("C")){
            return 0;
        }
        if (pos.equals("N")){
            return 1;
        }
        if (pos.equals("E")){
            return 2;
        }
        if (pos.equals("O")){
            return 3;
        }
        if (pos.equals("S")){
            return 4;
        }
        if (pos.equals("NE")){
            return 5;
        }
        if (pos.equals("NO")){
            return 6;
        }
        if (pos.equals("SE")){
            return 7;
        }
        if (pos.equals("SO")){
            return 8;
        }
        if (pos.equals("NE1")){
            return 9;
        }
        if (pos.equals("NE2")){
            return 10;
        }
        if (pos.equals("NE3")){
            return 11;
        }
        if (pos.equals("NO1")){
            return 12;
        }
        if (pos.equals("NO2")){
            return 13;
        }
        if (pos.equals("NO3")){
            return 14;
        }
        if (pos.equals("SE1")){
            return 15;
        }
        if (pos.equals("SE2")){
            return 16;
        }
        if (pos.equals("SE3")){
            return 17;
        }
        if (pos.equals("SO1")){
            return 18;
        }
        if (pos.equals("SO2")){
            return 19;
        }
        if (pos.equals("SO3")){
            return 20;
        }
        if (pos.equals("N2")){
            return 21;
        }
        if (pos.equals("E2")){
            return 22;
        }
        if (pos.equals("O2")){
            return 23;
        }
        if (pos.equals("S2")){
            return 24;
        }
        else{
            return -1;
        }
    }
    
    public static int[] getCoordenadas(int posicion){
        int [] donde = new int[2];
        switch(posicion){
            case Posiciones.C:
                donde[0]=181;
                donde[1]=173;
                break;
            case Posiciones.N:
                donde[0]=181;
                donde[1]=93;
                break;
            case Posiciones.E:
                donde[0]=269;
                donde[1]=173;
                break;
            case Posiciones.O:
                donde[0]=93;
                donde[1]=173;
                break;
            case Posiciones.S:
                donde[0]=181;
                donde[1]=266;
                break;
            case Posiciones.NE:
                donde[0]=242;
                donde[1]=116;
                break;
            case Posiciones.NO:
                donde[0]=121;
                donde[1]=116;
                break;
            case Posiciones.SE:
                donde[0]=242;
                donde[1]=240;
                break;
            case Posiciones.SO:
                donde[0]=123;
                donde[1]=240;
                break;
            case Posiciones.NE1:
                donde[0]=242;
                donde[1]=41;
                break;
            case Posiciones.NE2:
                donde[0]=294;
                donde[1]=80;
                break;
            case Posiciones.NE3:
                donde[0]=324;
                donde[1]=127;
                break;
            case Posiciones.NO1:
                donde[0]=39;
                donde[1]=127;
                break;
            case Posiciones.NO2:
                donde[0]=69;
                donde[1]=80;
                break;
            case Posiciones.NO3:
                donde[0]=122;
                donde[1]=41;
                break;
            case Posiciones.SE1:
                donde[0]=324;
                donde[1]=229;
                break;
            case Posiciones.SE2:
                donde[0]=294;
                donde[1]=282;
                break;
            case Posiciones.SE3:
                donde[0]=242;
                donde[1]=318;
                break;
            case Posiciones.SO1:
                donde[0]=122;
                donde[1]=318;
                break;
            case Posiciones.SO2:
                donde[0]=69;
                donde[1]=282;
                break;
            case Posiciones.SO3:
                donde[0]=39;
                donde[1]=229;
                break;
            case Posiciones.N2:
                donde[0]=181;
                donde[1]=30;
                break;
            case Posiciones.E2:
                donde[0]=333;
                donde[1]=175;
                break;
            case Posiciones.O2:
                donde[0]=30;
                donde[1]=175;
                break;
            case Posiciones.S2:
                donde[0]=181;
                donde[1]=331;
                break;
        }
        return donde;
    }
}
