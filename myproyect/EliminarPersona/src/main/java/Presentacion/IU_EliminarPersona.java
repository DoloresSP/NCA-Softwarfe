package Presentacion;

import Dominio.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JScrollBar;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.AbstractListModel;

public class IU_EliminarPersona extends JFrame {

	JFrame frame;
	private JTabbedPane tabbedPane;
	private JPanel EMPLEADOS;
	private JPanel ALUMNOS;
	private JButton btnListarEmpleados;
	private JButton btnListarAlumnos;
	private JList list;
	private JScrollBar scrollBar;
	private JButton btnEliminar;
	private JLabel lblNombre;
	private JLabel lblDni;
	private JLabel lblPuesto;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JList list_1;
	private JScrollBar scrollBar_1;
	private JLabel lblNombre_1;
	private JLabel lblDni_1;
	private JLabel lblNivel;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JButton btnEliminar_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IU_EliminarPersona window = new IU_EliminarPersona();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public IU_EliminarPersona() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 451, 377);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		{
			tabbedPane = new JTabbedPane(JTabbedPane.TOP);
			frame.getContentPane().add(tabbedPane, BorderLayout.CENTER);
			{
				EMPLEADOS = new JPanel();
				tabbedPane.addTab("EMPLEADOS", null, EMPLEADOS, null);
				EMPLEADOS.setLayout(null);
				{
					btnListarEmpleados = new JButton("Listar Empleados");
					btnListarEmpleados.setBounds(56, 11, 143, 32);
					EMPLEADOS.add(btnListarEmpleados);
				}
				{
					list = new JList();
					list.setModel(new AbstractListModel() {
						String[] values = new String[] {"Antonio Garcia ", "Lucia Sesmero", "Marta Pérez"};
						public int getSize() {
							return values.length;
						}
						public Object getElementAt(int index) {
							return values[index];
						}
					});
					list.setBounds(56, 54, 143, 192);
					EMPLEADOS.add(list);
				}
				{
					scrollBar = new JScrollBar();
					scrollBar.setBounds(198, 54, 17, 192);
					EMPLEADOS.add(scrollBar);
				}
				{
					btnEliminar = new JButton("Eliminar");
					btnEliminar.addActionListener(new BtnEliminarActionListener());
					btnEliminar.setBounds(297, 277, 89, 23);
					EMPLEADOS.add(btnEliminar);
				}
				{
					lblNombre = new JLabel("Nombre:");
					lblNombre.setBounds(237, 55, 46, 14);
					EMPLEADOS.add(lblNombre);
				}
				{
					lblDni = new JLabel("DNI:");
					lblDni.setBounds(237, 92, 46, 14);
					EMPLEADOS.add(lblDni);
				}
				{
					lblPuesto = new JLabel("Puesto:");
					lblPuesto.setBounds(237, 135, 46, 14);
					EMPLEADOS.add(lblPuesto);
				}
				{
					textField = new JTextField();
					textField.setBounds(300, 52, 86, 20);
					EMPLEADOS.add(textField);
					textField.setColumns(10);
				}
				{
					textField_1 = new JTextField();
					textField_1.setBounds(300, 89, 86, 20);
					EMPLEADOS.add(textField_1);
					textField_1.setColumns(10);
				}
				{
					textField_2 = new JTextField();
					textField_2.setBounds(300, 132, 86, 20);
					EMPLEADOS.add(textField_2);
					textField_2.setColumns(10);
				}
			}
			{
				ALUMNOS = new JPanel();
				ALUMNOS.setToolTipText("");
				ALUMNOS.setName("");
				tabbedPane.addTab("ALUMNOS", null, ALUMNOS, null);
				{
					btnListarAlumnos = new JButton("Listar Alumnos");
					btnListarAlumnos.setBounds(45, 11, 131, 32);
					btnListarAlumnos.addActionListener(new BtnListarAlumnosActionListener());
					ALUMNOS.setLayout(null);
					ALUMNOS.add(btnListarAlumnos);
				}
				{
					list_1 = new JList();
					list_1.setBounds(45, 67, 143, 192);
					ALUMNOS.add(list_1);
				}
				{
					scrollBar_1 = new JScrollBar();
					scrollBar_1.setBounds(187, 67, 17, 192);
					ALUMNOS.add(scrollBar_1);
				}
				{
					lblNombre_1 = new JLabel("Nombre:");
					lblNombre_1.setBounds(233, 68, 46, 14);
					ALUMNOS.add(lblNombre_1);
				}
				{
					lblDni_1 = new JLabel("Dni:");
					lblDni_1.setBounds(233, 108, 46, 14);
					ALUMNOS.add(lblDni_1);
				}
				{
					lblNivel = new JLabel("Nivel:");
					lblNivel.setBounds(233, 155, 46, 14);
					ALUMNOS.add(lblNivel);
				}
				{
					textField_3 = new JTextField();
					textField_3.setBounds(301, 65, 86, 20);
					ALUMNOS.add(textField_3);
					textField_3.setColumns(10);
				}
				{
					textField_4 = new JTextField();
					textField_4.setBounds(301, 105, 86, 20);
					ALUMNOS.add(textField_4);
					textField_4.setColumns(10);
				}
				{
					textField_5 = new JTextField();
					textField_5.setBounds(301, 152, 86, 20);
					ALUMNOS.add(textField_5);
					textField_5.setColumns(10);
				}
				{
					btnEliminar_1 = new JButton("Eliminar");
					btnEliminar_1.addActionListener(new BtnEliminar_1ActionListener());
					btnEliminar_1.setBounds(301, 261, 89, 23);
					ALUMNOS.add(btnEliminar_1);
				}
			}
		}
	}
	private class BtnListarAlumnosActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
		}
	}
	
	GestorApp g= new GestorApp();
	
	private class BtnEliminarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			
			//g.EliminarEmpleadoApp(e);
			
		}
	}
	private class BtnEliminar_1ActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			//g.EliminarAlumnoApp(a);
			
			
		}
	}
}
