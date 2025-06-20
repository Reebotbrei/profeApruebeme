/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xdddd;

import javax.swing.DefaultListModel;
import java.util.List;

public class ModeloParaList extends DefaultListModel<Paciente> {
    public ModeloParaList(){}
    public ModeloParaList(List<Paciente> pacientes) {
        super();
        for(Paciente pac : pacientes){
            addElement(pac);
        }
    }
}
