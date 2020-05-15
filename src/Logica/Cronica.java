/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author mmancora
 */
public class Cronica implements Serializable {
    
    ArrayList<Personaje> personajes;
    ArrayList<Enemigo> enemigos;
    int niebla;
    int territorio;
    Personaje principal;
    
    public Cronica(ArrayList<Personaje> personajesCro, ArrayList<Enemigo> enemigosCro, int Niebla, int Territorio){
        personajes = personajesCro;
        enemigos = enemigosCro;
        niebla = Niebla;
        territorio = Territorio;

        
    }

    public ArrayList<Personaje> getPersonajes() {
        return personajes;
    }

    public ArrayList<Enemigo> getEnemigos() {
        return enemigos;
    }

    public int getNiebla() {
        return niebla;
    }

    public int getTerritorio() {
        return territorio;
    }

    public Personaje getPrincipal() {
        return principal;
    }

    public void setPrincipal(int id) {
        for(int i =0;i<personajes.size();i++){
            if (id==personajes.get(i).getId()){
                principal=personajes.get(i);
                personajes.remove(i);
            }
        }
    }
    
    
    
}
