package Logica;


import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class EstadoAlterado implements Serializable {
    
    public static final int POSITIVO = 0;
    public static final int NEGATIVO = 1;
    
    int id;
    String nombre;
    String descripcion;
    ArrayList<String> curasConocidas;
    int tipo;
    String icono;
    
    public EstadoAlterado(int idEstado, String nombreEstado, String descEstado, int tipoEstado, String ruta){
        id = idEstado;
        nombre = nombreEstado;
        descripcion = descEstado;
        tipo = tipoEstado;

        icono = ruta;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTipo() {
        return tipo;
    }

    public String getIcono() {
        return icono;
    }

    
    
}
