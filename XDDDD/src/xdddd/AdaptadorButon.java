/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xdddd;


import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import  javax.swing.*;

public class AdaptadorButon implements MouseListener  {
    private JFrame padre;
    
    public AdaptadorButon(JFrame padre){
        this.padre = padre;
       
    }
    // aqui courre el evento, se puede traer una clase como parametro, faltan
    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
    
}
