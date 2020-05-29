/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author mmancora
 */
public class CreadorStackObjeto {
    
    public static final int ORBE_CURATIVO = 1;
    public static final int PIEL_WARGO = 2;
    public static final int PLASMA_WARGO = 3;
    public static final int PROTEINA = 4;
    public static final int CAL_VIVA = 5;
    public static final int ANIMA_DE_LA_IRA = 6;
    
    public static StackObjeto crearStack(int id, int cantidad){
        
        StackObjeto nuevo = new StackObjeto();
        
        switch(id){
            case ORBE_CURATIVO:
                nuevo.setId(id);
                nuevo.setNombre("Orbe curativo");
                nuevo.setTipo(StackObjeto.CONSUMIBLE);
                nuevo.setIcono("objetos/orbe_curativo.png");
                nuevo.setDescripcionUso("Recupera 3 de salud.");
                nuevo.setDescripcionCompleta("Orbe que interactua con el alma del usuario, estimulando la regeneración de tejidos de forma casi instantánea. Recupera 3 de salud.");
                nuevo.setCantidadMax(5);
                nuevo.setCantidad(cantidad);
                break;
            case PIEL_WARGO:
                nuevo.setId(id);
                nuevo.setNombre("Piel de wargo");
                nuevo.setTipo(StackObjeto.RECURSO);
                nuevo.setIcono("objetos/piel_de_wargo.png");
                nuevo.setDescripcionUso("Piel gruesa y peluda.");
                nuevo.setDescripcionCompleta("Piel gruesa y peluda que se usa para confeccionar ropa de invierno en Dina. Se vende en el Aro Mercante.");
                nuevo.setCantidadMax(5);
                nuevo.setCantidad(cantidad);
                break;
            case PLASMA_WARGO:
                nuevo.setId(id);
                nuevo.setNombre("Plasma de wargo");
                nuevo.setTipo(StackObjeto.RECURSO);
                nuevo.setIcono("objetos/plasma_de_wargo.png");
                nuevo.setDescripcionUso("Liquido vital de un wargo.");
                nuevo.setDescripcionCompleta("Liquido vital de wargo, usado para la confección de elíxires.");
                nuevo.setCantidadMax(5);
                nuevo.setCantidad(cantidad);
                break;
            case PROTEINA:
                nuevo.setId(id);
                nuevo.setNombre("Proteina animal");
                nuevo.setTipo(StackObjeto.CONSUMIBLE);
                nuevo.setIcono("objetos/proteina_animal.png");
                nuevo.setDescripcionUso("Recupera 1 de Alma. Probabilidad de causar enfermedad. Cocinable");
                nuevo.setDescripcionCompleta("Alimento de origen animal. Necesita ser cocinado para no causar enfermedades.");
                nuevo.setCantidadMax(5);
                nuevo.setCantidad(cantidad);
            case CAL_VIVA:
                nuevo.setId(id);
                nuevo.setNombre("Cal viva");
                nuevo.setTipo(StackObjeto.RECURSO);
                nuevo.setIcono("objetos/cal_viva.png");
                nuevo.setDescripcionUso("Cal extraida de huesos.");
                nuevo.setDescripcionCompleta("Cal extraída de huesos. Usada para la confección de elíxires.");
                nuevo.setCantidadMax(5);
                nuevo.setCantidad(cantidad);
            case ANIMA_DE_LA_IRA:
                nuevo.setId(id);
                nuevo.setNombre("Ánima de la ira");
                nuevo.setTipo(StackObjeto.IMPORTANTE);
                nuevo.setIcono("objetos/anima_de_la_ira.png");
                nuevo.setDescripcionUso("Espíritu residual de un wargo.");
                nuevo.setDescripcionCompleta("Espiritu residual de un wargo. Se utiliza en el sellado de habilidades.");
                nuevo.setCantidadMax(3);
                nuevo.setCantidad(cantidad);
        }
        return nuevo;
    }
    
   
}
