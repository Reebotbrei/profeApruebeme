/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t3;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
/**
 *
 * @author Estudiante
 */
public class GuardarConsulta extends JFrame{  
    
       private JLabel nombre;
       private JLabel consulta;
       private JLabel diagnostico;
       private JLabel receta;
       private JButton guardar ;
       private JButton salir;
       private JTextArea consultaCampo ;
       private JTextArea diagnosticoCampo ;
       private JTextArea recetaCampo ;
    
    public  GuardarConsulta(){
        
        setLocation(700, 200);
        setVisible(true);
        setLayout(null);
                
        nombre = new JLabel();
        nombre.setBounds(20, 10, 80, 25);
        nombre.setText("Miguel: ");
        nombre.setVisible(true);
        add(nombre);
        
        consulta = new JLabel();
        consulta.setBounds(20, 40, 80, 25);
        consulta.setText("Consulta: ");
        consulta.setVisible(true);
        add(consulta);
        
        diagnostico = new JLabel();
        diagnostico.setBounds(20, 180, 80, 25);
        diagnostico.setText("Diagnóstico: ");
        diagnostico.setVisible(true);
        add(diagnostico);
        
        receta = new JLabel();
        receta.setBounds(20, 360, 80, 25);
        receta.setText("Receta: ");
        receta.setVisible(true);
        add(receta);
        
        guardar = new JButton();
        guardar.setText("Guardar");
        guardar.setBounds(300,10,100,25);
        guardar.setVisible(true);
        guardar.addMouseListener(new AdaptadorGuardar(this, "Guardar"));
        add(guardar);
      
        salir = new JButton();
        salir.setText("Salir");
        salir.setBounds(300,520,100,25);
        salir.setVisible(true);
        salir.addMouseListener(new AdaptadorGuardar(this, "Salir"));
        add(salir);
        
        consultaCampo = new JTextArea();        
        consultaCampo.setBounds(21, 60, 400, 120);
        consultaCampo.setVisible(true);
        add(consultaCampo);
        
        diagnosticoCampo = new JTextArea();        
        diagnosticoCampo.setBounds(21, 205, 400, 155);
        diagnosticoCampo.setVisible(true);
        add(diagnosticoCampo);
        
        recetaCampo = new JTextArea();        
        recetaCampo.setBounds(21, 380, 400, 130);
        recetaCampo.setVisible(true);
        add(recetaCampo);       
        
        pack();
        setSize(450, 600);
    }
}
