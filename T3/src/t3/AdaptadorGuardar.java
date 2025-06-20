/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t3;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 *
 * @author Estudiante
 */
public class AdaptadorGuardar implements MouseListener{
    private JFrame padre;
    private String mensaje;

    public AdaptadorGuardar(JFrame padre,String mensaje) {
        this.padre = padre;
        this.mensaje = mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    

    @Override
    public void mouseClicked(MouseEvent e) {
        JOptionPane.showMessageDialog(this.padre, this.mensaje);
    }

    @Override
    public void mousePressed(MouseEvent e) {}

    @Override
    public void mouseReleased(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}
}
