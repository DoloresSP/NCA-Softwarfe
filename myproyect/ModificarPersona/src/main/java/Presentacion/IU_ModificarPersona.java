package Presentacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.JList;
import javax.swing.JMenuBar;
import java.awt.BorderLayout;
import javax.swing.JTabbedPane;
import java.awt.FlowLayout;
import javax.swing.border.TitledBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DropMode;
import javax.swing.JButton;
import javax.swing.AbstractListModel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.ListSelectionModel;


public class IU_ModificarPersona {

 private JFrame frmModificarPersona;
 private JTabbedPane tabbedPane;
 private JPanel Empleados;
 private JPanel Alumnos;
 private JLabel lblNewLabel;
 private JLabel lblNombre;
 private JLabel lblApellidos;
 private JLabel lblDni;
 private JLabel lblNCuenta;
 private JLabel lblEstado;
 private JComboBox comboBox;
 private JLabel lblDireccin;
 private JLabel lblFechaDeNacimiento;
 private JLabel lblPuestoDeTrabajo;
 private JLabel lblNomina;
 private JTextField textField;
 private JTextField textField_1;
 private JFormattedTextField formattedTextField;
 private JFormattedTextField formattedTextField_1;
 private JTextField textField_2;
 private JFormattedTextField formattedTextField_2;
 private JComboBox comboBox_1;
 private JTextField textField_3;
 private JButton btnGuardar;
 private JLabel lblNivel;
 private JComboBox comboBox_2;
 private JScrollPane scrollPane;
 private JList list;
 private JScrollPane scrollPane_1;
 private JList list_1;

 /**
  * Launch the application.
  */
 public static void main(String[] args) {
  EventQueue.invokeLater(new Runnable() {
   public void run() {
    try {
     IU_ModificarPersona window = new IU_ModificarPersona();
     window.frmModificarPersona.setVisible(true);
    } catch (Exception e) {
     e.printStackTrace();
    }
   }
  });
 }

 /**
  * Create the application.
  */
 public IU_ModificarPersona() {
  initialize();
 }

 /**
  * Initialize the contents of the frame.
  */
 private void initialize() {
  frmModificarPersona = new JFrame();
  frmModificarPersona.setTitle("Modificar Persona");
  frmModificarPersona.setBounds(100, 100, 480, 520);
  frmModificarPersona.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  frmModificarPersona.getContentPane().setLayout(new BorderLayout(0, 0));
  {
   tabbedPane = new JTabbedPane(JTabbedPane.TOP);
   frmModificarPersona.getContentPane().add(tabbedPane, BorderLayout.CENTER);
   {
    Empleados = new JPanel();
    tabbedPane.addTab("EMPLEADOS", null, Empleados, null);
    Empleados.setLayout(null);
    {
     lblNewLabel = new JLabel("");
     lblNewLabel.setBorder(new TitledBorder(null, "Imagen", TitledBorder.LEADING, TitledBorder.TOP, null, null));
     lblNewLabel.setBounds(10, 11, 135, 128);
     Empleados.add(lblNewLabel);
    }
    {
     lblNombre = new JLabel("Nombre:");
     lblNombre.setBounds(155, 21, 70, 14);
     Empleados.add(lblNombre);
    }
    {
     lblApellidos = new JLabel("Apellidos:");
     lblApellidos.setBounds(155, 55, 70, 14);
     Empleados.add(lblApellidos);
    }
    {
     lblDni = new JLabel("DNI:");
     lblDni.setBounds(155, 94, 46, 14);
     Empleados.add(lblDni);
    }
    {
     lblNCuenta = new JLabel("Nº Cuenta:");
     lblNCuenta.setBounds(155, 137, 98, 14);
     Empleados.add(lblNCuenta);
    }
    {
     lblEstado = new JLabel("Estado:");
     lblEstado.setBounds(155, 183, 46, 14);
     Empleados.add(lblEstado);
    }
    {
     comboBox = new JComboBox();
     comboBox.setModel(new DefaultComboBoxModel(new String[] {"Activo ", "De baja"}));
     comboBox.setBounds(278, 180, 86, 20);
     Empleados.add(comboBox);
    }
    {
     lblDireccin = new JLabel("Dirección:");
     lblDireccin.setBounds(155, 228, 86, 14);
     Empleados.add(lblDireccin);
    }
    {
     lblFechaDeNacimiento = new JLabel("Fecha de Nacimiento:");
     lblFechaDeNacimiento.setBounds(155, 273, 125, 14);
     Empleados.add(lblFechaDeNacimiento);
    }
    {
     lblPuestoDeTrabajo = new JLabel("Puesto de trabajo:");
     lblPuestoDeTrabajo.setBounds(155, 322, 125, 14);
     Empleados.add(lblPuestoDeTrabajo);
    }
    {
     lblNomina = new JLabel("Nomina:");
     lblNomina.setBounds(155, 364, 46, 14);
     Empleados.add(lblNomina);
    }
    {
     textField = new JTextField();
     textField.setBounds(278, 18, 86, 20);
     Empleados.add(textField);
     textField.setColumns(10);
    }
    {
     textField_1 = new JTextField();
     textField_1.setBounds(278, 52, 86, 20);
     Empleados.add(textField_1);
     textField_1.setColumns(10);
    }
    {
     formattedTextField = new JFormattedTextField();
     formattedTextField.setBounds(278, 91, 86, 20);
     Empleados.add(formattedTextField);
    }
    {
     formattedTextField_1 = new JFormattedTextField();
     formattedTextField_1.setBounds(278, 134, 86, 20);
     Empleados.add(formattedTextField_1);
    }
    {
     textField_2 = new JTextField();
     textField_2.setBounds(278, 225, 86, 20);
     Empleados.add(textField_2);
     textField_2.setColumns(10);
    }
    {
     formattedTextField_2 = new JFormattedTextField();
     formattedTextField_2.setBounds(278, 270, 86, 20);
     Empleados.add(formattedTextField_2);
    }
    {
     comboBox_1 = new JComboBox();
     comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Profesor", "Adminitrador", "Limpieza"}));
     comboBox_1.setBounds(278, 319, 86, 20);
     Empleados.add(comboBox_1);
    }
    {
     textField_3 = new JTextField();
     textField_3.setBounds(278, 361, 86, 20);
     Empleados.add(textField_3);
     textField_3.setColumns(10);
    }
    {
     btnGuardar = new JButton("Guardar");
     btnGuardar.setBounds(360, 419, 89, 23);
     Empleados.add(btnGuardar);
    }
    {
     scrollPane = new JScrollPane();
     scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
     scrollPane.setViewportBorder(new TitledBorder(null, "Empleados", TitledBorder.LEADING, TitledBorder.TOP, null, null));
     scrollPane.setBounds(10, 180, 135, 198);
     Empleados.add(scrollPane);
     {
      list = new JList();
      list.setLayoutOrientation(JList.VERTICAL_WRAP);
      list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
      list.setModel(new AbstractListModel() {
       String[] values = new String[] {"Em 1", "Em 2", "Em 3", "Em 4", "Em 5", "Em 6", "Em 7"};
       public int getSize() {
        return values.length;
       }
       public Object getElementAt(int index) {
        return values[index];
       }
      });
      scrollPane.setViewportView(list);
     }
    }
   }
   {
    Alumnos = new JPanel();
    tabbedPane.addTab("ALUMNOS", null, Alumnos, null);
    Alumnos.setLayout(null);
    {
     lblNewLabel = new JLabel("");
     lblNewLabel.setBorder(new TitledBorder(null, "Imagen", TitledBorder.LEADING, TitledBorder.TOP, null, null));
     lblNewLabel.setBounds(10, 11, 135, 128);
     Alumnos.add(lblNewLabel);
    }
    {
     lblNombre = new JLabel("Nombre:");
     lblNombre.setBounds(155, 21, 70, 14);
     Alumnos.add(lblNombre);
    }
    {
     lblApellidos = new JLabel("Apellidos:");
     lblApellidos.setBounds(155, 55, 70, 14);
     Alumnos.add(lblApellidos);
    }
    {
     lblDni = new JLabel("DNI:");
     lblDni.setBounds(155, 94, 46, 14);
     Alumnos.add(lblDni);
    }
    {
     lblNCuenta = new JLabel("Nº Cuenta:");
     lblNCuenta.setBounds(155, 137, 86, 14);
     Alumnos.add(lblNCuenta);
    }
    {
     lblEstado = new JLabel("Estado:");
     lblEstado.setBounds(155, 183, 46, 14);
     Alumnos.add(lblEstado);
    }
    {
     comboBox = new JComboBox();
     comboBox.setModel(new DefaultComboBoxModel(new String[] {"Activo ", "De baja"}));
     comboBox.setBounds(278, 180, 86, 20);
     Alumnos.add(comboBox);
    }
    {
     lblDireccin = new JLabel("Dirección:");
     lblDireccin.setBounds(155, 228, 86, 14);
     Alumnos.add(lblDireccin);
    }
    {
     lblFechaDeNacimiento = new JLabel("Fecha de Nacimiento:");
     lblFechaDeNacimiento.setBounds(155, 273, 123, 14);
     Alumnos.add(lblFechaDeNacimiento);
    }
    {
     textField = new JTextField();
     textField.setBounds(278, 18, 86, 20);
     Alumnos.add(textField);
     textField.setColumns(10);
    }
    {
     textField_1 = new JTextField();
     textField_1.setBounds(278, 52, 86, 20);
     Alumnos.add(textField_1);
     textField_1.setColumns(10);
    }
    {
     formattedTextField = new JFormattedTextField();
     formattedTextField.setBounds(278, 91, 86, 20);
     Alumnos.add(formattedTextField);
    }
    {
     formattedTextField_1 = new JFormattedTextField();
     formattedTextField_1.setBounds(278, 134, 86, 20);
     Alumnos.add(formattedTextField_1);
    }
    {
     textField_2 = new JTextField();
     textField_2.setBounds(278, 225, 86, 20);
     Alumnos.add(textField_2);
     textField_2.setColumns(10);
    }
    {
     formattedTextField_2 = new JFormattedTextField();
     formattedTextField_2.setBounds(278, 270, 86, 20);
     Alumnos.add(formattedTextField_2);
    }
    {
     btnGuardar = new JButton("Guardar");
     btnGuardar.setBounds(360, 419, 89, 23);
     Alumnos.add(btnGuardar);
    }
    {
     lblNivel = new JLabel("Nivel:");
     lblNivel.setBounds(155, 319, 46, 14);
     Alumnos.add(lblNivel);
    }
    {
     comboBox_2 = new JComboBox();
     comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"A1", "A2", "B1", "B2", "C1", "C2"}));
     comboBox_2.setBounds(278, 316, 86, 20);
     Alumnos.add(comboBox_2);
    }
    {
     scrollPane_1 = new JScrollPane();
     scrollPane_1.setViewportBorder(new TitledBorder(null, "Alumnos", TitledBorder.LEADING, TitledBorder.TOP, null, null));
     scrollPane_1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
     scrollPane_1.setBounds(10, 180, 135, 198);
     Alumnos.add(scrollPane_1);
     {
      list_1 = new JList();
      list_1.setModel(new AbstractListModel() {
       String[] values = new String[] {"Alumno 1", "Alumno 2", "Alumno 3", "Alumno 4", "Alumno 5"};
       public int getSize() {
        return values.length;
       }
       public Object getElementAt(int index) {
        return values[index];
       }
      });
      scrollPane_1.setViewportView(list_1);
     }
    }
   }
   {
    
    
   }
  }
 }
}