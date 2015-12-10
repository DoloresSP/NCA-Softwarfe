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


public class IU_MostrarInforme {

 JFrame frmAadirPersona;
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
 private JTextField textField_3;
 private JButton btnGuardar;
 private JLabel lblNivel;
 private JTextField textField_4;
 private JTextField textField_5;
 private JTextField textField_6;
 private JTextField textField_7;

 /**
  * Launch the application.
  */
 public static void main(String[] args) {
  EventQueue.invokeLater(new Runnable() {
   public void run() {
    try {
     IU_MostrarInforme window = new IU_MostrarInforme();
     window.frmAadirPersona.setVisible(true);
    } catch (Exception e) {
     e.printStackTrace();
    }
   }
  });
 }

 /**
  * Create the application.
  */
 public IU_MostrarInforme() {
  initialize();
 }

 /**
  * Initialize the contents of the frame.
  */
 private void initialize() {
  frmAadirPersona = new JFrame();
  frmAadirPersona.setTitle("Añadir Persona");
  frmAadirPersona.setBounds(100, 100, 480, 520);
  frmAadirPersona.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  frmAadirPersona.getContentPane().setLayout(new BorderLayout(0, 0));
  {
   tabbedPane = new JTabbedPane(JTabbedPane.TOP);
   frmAadirPersona.getContentPane().add(tabbedPane, BorderLayout.CENTER);
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
     lblNombre.setBounds(155, 21, 46, 14);
     Empleados.add(lblNombre);
    }
    {
     lblApellidos = new JLabel("Apellidos:");
     lblApellidos.setBounds(155, 55, 46, 14);
     Empleados.add(lblApellidos);
    }
    {
     lblDni = new JLabel("DNI:");
     lblDni.setBounds(155, 94, 46, 14);
     Empleados.add(lblDni);
    }
    {
     lblNCuenta = new JLabel("Nº Cuenta:");
     lblNCuenta.setBounds(150, 137, 70, 14);
     Empleados.add(lblNCuenta);
    }
    {
     lblEstado = new JLabel("Estado:");
     lblEstado.setBounds(150, 183, 46, 14);
     Empleados.add(lblEstado);
    }
    {
     lblDireccin = new JLabel("Dirección:");
     lblDireccin.setBounds(150, 228, 55, 14);
     Empleados.add(lblDireccin);
    }
    {
     lblFechaDeNacimiento = new JLabel("Fecha de Nacimiento:");
     lblFechaDeNacimiento.setBounds(150, 273, 108, 14);
     Empleados.add(lblFechaDeNacimiento);
    }
    {
     lblPuestoDeTrabajo = new JLabel("Puesto de trabajo:");
     lblPuestoDeTrabajo.setBounds(150, 322, 98, 14);
     Empleados.add(lblPuestoDeTrabajo);
    }
    {
     lblNomina = new JLabel("Nomina:");
     lblNomina.setBounds(150, 364, 46, 14);
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
     textField_3 = new JTextField();
     textField_3.setBounds(278, 361, 86, 20);
     Empleados.add(textField_3);
     textField_3.setColumns(10);
    }
    {
    	textField_6 = new JTextField();
    	textField_6.setBounds(278, 180, 86, 20);
    	Empleados.add(textField_6);
    	textField_6.setColumns(10);
    }
    {
    	textField_7 = new JTextField();
    	textField_7.setBounds(278, 319, 86, 20);
    	Empleados.add(textField_7);
    	textField_7.setColumns(10);
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
     lblNombre.setBounds(155, 21, 46, 14);
     Alumnos.add(lblNombre);
    }
    {
     lblApellidos = new JLabel("Apellidos:");
     lblApellidos.setBounds(155, 55, 46, 14);
     Alumnos.add(lblApellidos);
    }
    {
     lblDni = new JLabel("DNI:");
     lblDni.setBounds(155, 94, 46, 14);
     Alumnos.add(lblDni);
    }
    {
     lblNCuenta = new JLabel("Nº Cuenta:");
     lblNCuenta.setBounds(150, 137, 70, 14);
     Alumnos.add(lblNCuenta);
    }
    {
     lblEstado = new JLabel("Estado:");
     lblEstado.setBounds(150, 183, 46, 14);
     Alumnos.add(lblEstado);
    }
    {
     lblDireccin = new JLabel("Dirección:");
     lblDireccin.setBounds(150, 228, 55, 14);
     Alumnos.add(lblDireccin);
    }
    {
     lblFechaDeNacimiento = new JLabel("Fecha de Nacimiento:");
     lblFechaDeNacimiento.setBounds(150, 273, 108, 14);
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
     lblNivel = new JLabel("Nivel:");
     lblNivel.setBounds(150, 319, 46, 14);
     Alumnos.add(lblNivel);
    }
    {
    	textField_4 = new JTextField();
    	textField_4.setBounds(278, 180, 86, 20);
    	Alumnos.add(textField_4);
    	textField_4.setColumns(10);
    }
    {
    	textField_5 = new JTextField();
    	textField_5.setBounds(278, 316, 86, 20);
    	Alumnos.add(textField_5);
    	textField_5.setColumns(10);
    }
   }
   {
    
    
   }
  }
 }
}