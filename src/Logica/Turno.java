/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;


public class Turno {
    
    public static final int PRINCIPAL =0;
    public static final int ALIADO = 1;
    public static final int ENEMIGO = 2;
    
    String nombre;
    int tipo;
    int iniciativa;
    boolean turnoActivo;
    String icono;
    
    public Turno(String nombreTurno, int tipoTurno, int agilidadTurno, int concienciaTurno, String iconoTurno){
        nombre=nombreTurno;
        tipo=tipoTurno;
        iniciativa=agilidadTurno+concienciaTurno;
        turnoActivo=false;
        icono=iconoTurno;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTipo() {
        return tipo;
    }

    public int getIniciativa() {
        return iniciativa;
    }

    public void setTurnoActivo(boolean turnoActivo) {
        this.turnoActivo = turnoActivo;
    }

    public String getIcono() {
        return icono;
    }

    public boolean isTurnoActivo() {
        return turnoActivo;
    }
    
    
    
}
