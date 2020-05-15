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
public class Personaje {
    int id;
    String nombre;
    int clase;
    int rango;
    int nivel;
    int exp;
    boolean estaVivo;
    String icono;
    String log;
    
    int saludMax;
    int salud;
    final int almaMax=100;
    int alma;
    
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
    
    public Personaje(int idPj, String nombrePj, int clasePj, int saludmax, int dex, int res, int agi, int con, int movmax, int accionmax, int pos, String iconoPj){
        id=idPj;
        nombre=nombrePj;
        clase = clasePj;
        rango = Rangos.CADETE;
        nivel = 1;
        exp = 15;
        estaVivo=true;
        icono=iconoPj;
        
        saludMax = saludmax;
        salud = 7;
        alma=50;
       
        destreza = dex;
        resistencia = res;
        agilidad = agi;
        conciencia = con;
        
        movMax=movmax;
        mov=movmax;
        accionesMax=accionmax;
        acciones=accionmax;
        
        posicion=pos;
                
        objetos = new ArrayList<StackObjeto>();
        objetos.add(new StackObjeto(0,"Orbe curativo",StackObjeto.CONSUMIBLE,"Cura 1 de salud.","objetos/orbe_curativo.png"));
        objetos.add(new StackObjeto(1,"Piel de wargo", StackObjeto.RECURSO,"Piel de pelo grueso.","objetos/piel_de_wargo.png"));
        
        habilidades = new ArrayList<Habilidad>();
        habilidades.add(new Habilidad(0,"Pies ligeros",Habilidad.ESTRATEGICA,"Obtiene +1 de movimiento en este turno.aaa  soy asd skllals dooffooe asd asdjkhas asliasds dsf",3,"habilidades/pies_ligeros.png",0));
        
//        habilidades.add(new Habilidad(1,"Doble ataque",Habilidad.PASIVA,"Si el ataque tiene exito, daña x2",2));
//        habilidades.add(new Habilidad(3,"Caca3",Habilidad.OFENSIVA,"Avanza a una casilla y daña al enemigo.",3));
//        //habilidades.add(new Habilidad(4,"Caca4",Habilidad.ESTRATEGICA,"Si el ataque tiene exito, daña x2",2));
//        habilidades.add(new Habilidad(5,"caca5",Habilidad.OFENSIVA,"Avanza a una casilla y daña al enemigo.",3));
//        habilidades.add(new Habilidad(6,"caca6",Habilidad.PASIVA,"Si el ataque tiene exito, daña x2",2));
//        habilidades.add(new Habilidad(7,"caca7",Habilidad.PASIVA,"Avanza a una casilla y daña al enemigo.",3));
//        habilidades.add(new Habilidad(8,"caca8",Habilidad.DEFENSIVA,"Si el ataque tiene exito, daña x2",2));
//        habilidades.add(new Habilidad(9,"caca9",Habilidad.DEFENSIVA,"Avanza a una casilla y daña al enemigo.",3));
        //habilidades.add(new Habilidad(10,"son diez",Habilidad.PASIVA,"Si el ataque tiene exito, daña x2",2));
        
        estados = new ArrayList<EstadoAlterado>();
        estados.add(new EstadoAlterado(0,"Convulsividad","En este turno, puedes atacar dos veces",0,"estados/quemadura.png"));
        estados.add(new EstadoAlterado(0,"Piel de piedra","La próxima vez que recibas daño, -1 al daño recibido.",0,"estados/quemadura.png"));
        estados.add(new EstadoAlterado(0,"Quemadura Nivel 1","Por cada accion o movimiento de tu personaje, -1 a la salud.",1,"estados/quemadura.png"));
        
        log = "";
        
        
    }

    public String getIcono() {
        return icono;
    }

    
    public int getExp() {
        return exp;
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

    public ArrayList<EstadoAlterado> getEstados() {
        return estados;
    }
    
    public ArrayList<Habilidad> getHabilidades() {
        return habilidades;
    }

    public ArrayList<StackObjeto> getObjetos() {
        return objetos;
    }

    public String getNombre() {
        return nombre;
    }

    public int getClase() {
        return clase;
    }

    public int getRango() {
        return rango;
    }

    public int getNivel() {
        return nivel;
    }

    public int getSaludMax() {
        return saludMax;
    }

    public int getSalud() {
        return salud;
    }

    public int getAlmaMax() {
        return almaMax;
    }

    public int getAlma() {
        return alma;
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

    public int getPosicion() {
        return posicion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setClase(int clase) {
        this.clase = clase;
    }

    public void setRango(int rango) {
        this.rango = rango;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void setSaludMax(int saludMax) {
        this.saludMax = saludMax;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public void setAlma(int alma) {
        this.alma = alma;
    }

    public void setDestreza(int destreza) {
        this.destreza = destreza;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    public void setAgilidad(int agilidad) {
        this.agilidad = agilidad;
    }

    public void setConciencia(int conciencia) {
        this.conciencia = conciencia;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public int getId() {
        return id;
    }

    public boolean isEstaVivo() {
        return estaVivo;
    }

    public String getLog() {
        return log;
    }
    
    
}
