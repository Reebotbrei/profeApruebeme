/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xdddd;
import java.util.ArrayList;
import java.util.List;

public class Doctor extends Persona{
    private List<Paciente> pacientes;
    public Doctor(String nombre, String apellido) {
        super(nombre, apellido);
    } 
    public void agregarPaciente(Paciente pac){
        if(pacientes == null) this.pacientes = new ArrayList<>();
        this.pacientes.add(pac);
    }
    public List<Paciente> getPacientes(){
        return this.pacientes;
    }
}
