package sesion12;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Estudiante
 */
public class Historial extends JFrame {
    
    private JLabel miLabel;
    private JButton miBoton;
    private JButton btnAtras;
    private JComboBox<String> comboBox;
    
    public Historial() {
        
        setLocation(100, 100);
        setVisible(true);
        setLayout(null);
        
        
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Juan", "Quispe"));
        personas.add(new Persona("Mario", "Bros"));
        personas.add(new Persona("Martin", "Quiroz"));
        
        ComboBoxModeloPersona modelo = new ComboBoxModeloPersona(personas);
        
        List<String> fechas = new ArrayList<>();
        LocalDate hoy = LocalDate.now();
        for (int i = 0; i < 10; i++) {
            LocalDate fecha = hoy.minusDays(i);
            fechas.add(fecha.toString()); // formato: "2025-06-20"
        }

        comboBox = new JComboBox<>(fechas.toArray(new String[0]));
        comboBox.setBounds(10, 10, 120, 30);
        comboBox.setVisible(true);

        MiAdaptadorCombo adapterCombo = new MiAdaptadorCombo(this, comboBox);
        comboBox.addActionListener(adapterCombo);
        add(comboBox);
        
        miBoton = new JButton();
        miBoton.setText("GUARDAR");
        miBoton.setBounds(150,10,120,30);
        miBoton.setVisible(true);
        
        MiAdaptador adapter = new MiAdaptador(this, "");
        adapter.setMensaje("HOLA, COMO TAS?");
        miBoton.addMouseListener(adapter);
        add(miBoton);
        
        btnAtras = new JButton();
        btnAtras.setText("ATRÁS");
        btnAtras.setBounds(260, 230, 100, 25);
        btnAtras.setVisible(true);

        MiAdaptador adapterGuardar = new MiAdaptador(this, "");
        adapterGuardar.setMensaje("Volver al menú");
        btnAtras.addMouseListener(adapterGuardar);
        add(btnAtras);
        

        // Columnas
        String[] columnas = {"Nombre", "Apellido"};
        DefaultTableModel modeloTabla = new DefaultTableModel(columnas, 0);

        // Lista para la tabla
        List<Persona> personasTabla = new ArrayList<>();
        personasTabla.add(new Persona("Juan", "Quispe"));
        personasTabla.add(new Persona("Mario", "Bros"));
        personasTabla.add(new Persona("Martin", "Quiroz"));

        // Añadir filas al modelo de la tabla
        for (Persona p : personasTabla) {
            Object[] fila = {p.getNombre(), p.getApellido()};
            modeloTabla.addRow(fila);
        }

        JTable tabla = new JTable(modeloTabla);
        JScrollPane scroll = new JScrollPane(tabla);
        scroll.setBounds(10, 60, 350, 150);
        add(scroll);

       setSize(400, 300);
        
        
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }
}
