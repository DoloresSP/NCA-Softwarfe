package Presentacion;

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

public class IU_Listar {

	JFrame frame;
	private JTabbedPane tabbedPane;
	private JPanel EMPLEADOS;
	private JPanel ALUMNOS;
	private JButton btnListarEmpleados;
	private JButton btnListarAlumnos;
	private JList list;
	private JScrollBar scrollBar;
	private JButton btnMostrarEmpleado;
	private JList list_1;
	private JScrollBar scrollBar_1;
	private JButton btnMostrarAlumno;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IU_Listar window = new IU_Listar();
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
	public IU_Listar() {
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
					btnMostrarEmpleado = new JButton("Mostrar Informe");
					btnMostrarEmpleado.setBounds(249, 277, 137, 23);
					EMPLEADOS.add(btnMostrarEmpleado);
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
					list_1.setModel(new AbstractListModel() {
						String[] values = new String[] {"Lucas Puente", "Maria Pozo"};
						public int getSize() {
							return values.length;
						}
						public Object getElementAt(int index) {
							return values[index];
						}
					});
					list_1.setBounds(45, 67, 143, 192);
					ALUMNOS.add(list_1);
				}
				{
					scrollBar_1 = new JScrollBar();
					scrollBar_1.setBounds(187, 67, 17, 192);
					ALUMNOS.add(scrollBar_1);
				}
				{
					btnMostrarAlumno = new JButton("Mostrar Informe");
					btnMostrarAlumno.addActionListener(new BtnEliminar_1ActionListener());
					btnMostrarAlumno.setBounds(247, 261, 143, 23);
					ALUMNOS.add(btnMostrarAlumno);
				}
			}
		}
	}
	private class BtnListarAlumnosActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
		}
	}
	private class BtnEliminar_1ActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
		}
	}
}
