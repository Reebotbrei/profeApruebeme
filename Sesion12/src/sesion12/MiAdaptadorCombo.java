package sesion12;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MiAdaptadorCombo implements ActionListener {

    private JComboBox<String> combo;
    private JFrame padre;

    public MiAdaptadorCombo(JFrame padre, JComboBox<String> combo) {
        this.combo = combo;
        this.padre = padre;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String fecha = (String) combo.getSelectedItem();
        JOptionPane.showMessageDialog(padre, "Fecha seleccionada: " + fecha);
    }
}
