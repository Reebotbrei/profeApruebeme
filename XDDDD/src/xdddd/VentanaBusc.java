/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xdddd;

    
import javax.swing.*;

public class VentanaBusc extends JFrame {
    
    private JButton botonHistorial;
    private JButton botonBuscar;
    private JLabel labelBuscar;
    private JButton botonEliminar;
    private JButton botonNuevo;
    private JButton botonEditar;
    private JLabel labelBienvenida;
    private JTextField textF;
    private JList list;
    private JScrollPane jScrollPane1;
    
    //mandar objeto dc
    public VentanaBusc(Doctor dc){
        
        setSize(800,600);
        setLocation(100,100);
        setVisible(true);
        setLayout(null);
        
        botonHistorial = new JButton();
        botonHistorial.setBounds(20, 60, 120, 25);
        botonHistorial.setText("Historial");
        botonHistorial.addMouseListener(new AdaptadorButon(this));// en historial se pone la ventana de historiañ
        botonHistorial.setVisible(true);
        add(botonHistorial);
        
        labelBienvenida = new JLabel();
        labelBienvenida.setBounds(220,60,280,25);
        labelBienvenida.setText("Bienvenido Dr. " + dc.toString());
        labelBienvenida.setVisible(true);
        add(labelBienvenida);
        
        labelBuscar = new JLabel();
        labelBuscar.setBounds(20,120,280,25);
        labelBuscar.setText("Pacientes de hoy");
        labelBuscar.setVisible(true);
        add(labelBuscar);
        
        botonBuscar = new JButton();
        botonBuscar.setBounds(220,180,120,25);
        botonBuscar.setText("Buscar");
        botonBuscar.addMouseListener(new AdaptadorButon(this)); //en buscar ocurre el evento buscar
        botonBuscar.setVisible(true);
        add(botonBuscar);
        
        textF = new JTextField();
        textF.setBounds(20,180,120,25);
        textF.setVisible(true);
        add(textF);
        
        jScrollPane1 = new javax.swing.JScrollPane();
        dc.agregarPaciente(new Paciente("yo", "aea"));
        ModeloParaList modelo = new ModeloParaList(dc.getPacientes());
        list = new JList(modelo);
        list.setBounds(20,250,220,120);        
        jScrollPane1.setViewportView(list);
        jScrollPane1.setVisible(true);
        add(list);
        add(jScrollPane1);
        pack();
        setSize(800,600);
        
        
        
    }
}
