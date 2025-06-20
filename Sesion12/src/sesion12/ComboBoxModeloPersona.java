/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sesion12;

import java.util.List;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author Estudiante
 */
public class ComboBoxModeloPersona 
        extends DefaultComboBoxModel<Persona>{

    public ComboBoxModeloPersona(List<Persona> personas) {
        super();
        for(Persona per : personas){
            addElement(per);
        }
    }
    
    
    
}
