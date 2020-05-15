/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.util.ArrayList;

public class Enemigo {
    
    final static public int NORMAL = 0;
    final static public int MVP = 1;
    final static public int CUERVO = 2;
    final static public int MVPCUERVO = 3;
    
    String nombre;
    String icono;
    int saludMax;
    int salud;
    int expBrindada;
    int tipoEnemigo;
    int destreza;
    int resistencia;
    int agilidad;
    int conciencia;
    int movMax;
    int mov;
    int accionesMax;
    int acciones;
    int posicion;
    
    ArrayList<StackObjeto> objetos;
    ArrayList<Habilidad> habilidades;
    ArrayList<EstadoAlterado> estados;
    ArrayList<StackObjeto> recompensas;
    
    public Enemigo (String nombreenemigo, int saludmax, int dex, int res, int agi, int con, int movmax, int accionesmax,int pos, int exp, int tipo, String iconoEnemigo){
        nombre=nombreenemigo;
        icono=iconoEnemigo;
        saludMax = saludmax;
        salud = saludmax;
        destreza = dex;
        resistencia = res;
        agilidad = agi;
        conciencia = con;
        movMax = movmax;
        mov = movmax;
        accionesMax = accionesmax;
        acciones = accionesmax;
        posicion = pos;
        expBrindada=exp;
        tipoEnemigo=tipo;
        
        objetos = new ArrayList<StackObjeto>();
        habilidades = new ArrayList<Habilidad>();
        estados = new ArrayList<EstadoAlterado>();
        recompensas = new ArrayList<StackObjeto>();
    }

    public String getIcono() {
        return icono;
    }
    
    public String getNombre() {
        return nombre;
    }

    public int getSaludMax() {
        return saludMax;
    }

    public int getSalud() {
        return salud;
    }

    public int getDestreza() {
        return destreza;
    }

    public int getResistencia() {
        return resistencia;
    }

    public int getAgilidad() {
        return agilidad;
    }

    public int getConciencia() {
        return conciencia;
    }

    public int getMovMax() {
        return movMax;
    }

    public int getMov() {
        return mov;
    }

    public int getAccionesMax() {
        return accionesMax;
    }

    public int getAcciones() {
        return acciones;
    }

    public int getPosicion() {
        return posicion;
    }

    public ArrayList<StackObjeto> getObjetos() {
        return objetos;
    }

    public ArrayList<Habilidad> getHabilidades() {
        return habilidades;
    }

    public ArrayList<EstadoAlterado> getEstados() {
        return estados;
    }
    
    public int getExpBrindada() {
        return expBrindada;
    }

    public ArrayList<StackObjeto> getRecompensas() {
        return recompensas;
    }

    public int getTipoEnemigo() {
        return tipoEnemigo;
    }

   
    
}
