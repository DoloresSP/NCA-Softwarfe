package Presentacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Dimension;


public class Menu {

	JFrame frmMenu;
	private JPanel panel;
	private JButton btnAadirPersona;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnListarPersonas;
	private JButton btnCerrar;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu window = new Menu();
					window.frmMenu.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Menu() {
		
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		
		
		frmMenu = new JFrame();
		frmMenu.setTitle("Menu");
		frmMenu.setBounds(100, 100, 500, 350);
		frmMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMenu.getContentPane().setLayout(null);
		{
			panel = new JPanel();
			panel.setBounds(31, 11, 406, 83);
			frmMenu.getContentPane().add(panel);
			{
				lblNewLabel = new JLabel("");
				lblNewLabel.setIcon(new ImageIcon(Menu.class.getResource("/Presentacion/Imagen.jpg")));
				
				panel.add(lblNewLabel);
			}
		}
		{
			btnAadirPersona = new JButton("Añadir Persona");
			btnAadirPersona.setBounds(50, 128, 140, 40);
			frmMenu.getContentPane().add(btnAadirPersona);
		}
		{
			btnNewButton = new JButton("Modificar Persona");
			btnNewButton.setBounds(50, 203, 140, 42);
			frmMenu.getContentPane().add(btnNewButton);
		}
		{
			btnNewButton_1 = new JButton("Eliminar Persona");
			btnNewButton_1.addActionListener(new BtnNewButton_1ActionListener());
			btnNewButton_1.setBounds(303, 128, 140, 40);
			frmMenu.getContentPane().add(btnNewButton_1);
		}
		{
			btnListarPersonas = new JButton("Listar Personas");
			btnListarPersonas.addActionListener(new BtnListarPersonasActionListener());
			btnListarPersonas.setBounds(303, 203, 140, 42);
			frmMenu.getContentPane().add(btnListarPersonas);
		}
		{
			btnCerrar = new JButton("Cerrar");
			btnCerrar.setBounds(373, 277, 89, 23);
			frmMenu.getContentPane().add(btnCerrar);
		}
	}

	public class BtnNewButton_1ActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {			
			/*IU_EliminarPersona eliminar=new IU_EliminarPersona();
			eliminar.frame.setVisible(true);*/
			
			
		}
	}
	private class BtnListarPersonasActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			IU_Listar lista= new IU_Listar();
			lista.frame.setVisible(true);
		}
	}
}