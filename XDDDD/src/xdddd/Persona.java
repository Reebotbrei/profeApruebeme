/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xdddd;

/**
 *
 * @author Estudiante
 */
public class Persona {
    private String nombre;
    private String apellido;
    public Persona(String nombre, String apellido){
        this.nombre= nombre;
        this.apellido = apellido;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){  
        return this.apellido;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    public String getApellido(){
        return this.apellido;
    }
    @Override
    public String toString(){
        return this.nombre + " " + this.apellido;
    }
    
}
