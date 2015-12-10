package Presentacion;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

import javax.swing.JFrame;

public class IU_Autenticar {

	private JFrame frmLogin;

	private JPanel panel;
	private JLabel lblUsuario;
	private JLabel lblPassword;
	private JButton btnEntrar;
	private JTextField tfUsuario;
	private JPasswordField pwdfPassword;
	private JLabel lblAviso;
	private JComboBox comboBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IU_Autenticar window = new IU_Autenticar();
					window.frmLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void Visible(){
		frmLogin.setVisible(true);
	}

	/**
	 * Create the application.
	 */
	public IU_Autenticar() {
		initialize();


	}

	/**
	 * Initialize the contents of the frame.
	 */


	private void initialize() {
		frmLogin = new JFrame();
		frmLogin.setTitle("Login\r\n");
		frmLogin.setBounds(100, 100, 450, 300);
		frmLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLogin.getContentPane().setLayout(null);
		{
			panel = new JPanel();
			panel.setBounds(0, 0, 434, 261);
			frmLogin.getContentPane().add(panel);
			panel.setLayout(null);
			{
				lblUsuario = new JLabel("Usuario:");
				lblUsuario.setBounds(45, 99, 46, 14);
				panel.add(lblUsuario);
			}
			{
				lblPassword = new JLabel("Contraseña:");
				lblPassword.setBounds(31, 136, 60, 14);
				panel.add(lblPassword);
			}
			{
				btnEntrar = new JButton("Entrar");
				btnEntrar.addActionListener(new BtnEntrarActionListener());
				btnEntrar.setBounds(274, 190, 89, 23);
				panel.add(btnEntrar);
			}
			{
				tfUsuario = new JTextField();
				tfUsuario.addActionListener(new TfUsuarioActionListener());
				tfUsuario.setBounds(124, 96, 111, 20);
				panel.add(tfUsuario);
				tfUsuario.setColumns(10);
			}
			{
				pwdfPassword = new JPasswordField();
				pwdfPassword.addActionListener(new PwdfPasswordActionListener());
				pwdfPassword.setBounds(124, 133, 111, 20);
				panel.add(pwdfPassword);
			}
			{
				lblAviso = new JLabel("");
				lblAviso.setBounds(274, 136, 111, 14);
				panel.add(lblAviso);
			}
			{
				comboBox = new JComboBox();
				comboBox.setModel(new DefaultComboBoxModel(new String[] {"Español", "Ingles"}));
				comboBox.setBounds(274, 42, 89, 20);
				panel.add(comboBox);
			}
		}
	}
	private class TfUsuarioActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {

			//Activamos los de la contraseña
			lblPassword.setEnabled(true);
			pwdfPassword.setEnabled(true);
			//Pasamos el foco (el cursor) al campo de la contraseña
			pwdfPassword.requestFocus();



		}
	}
	private class PwdfPasswordActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {

			//obtenemos la contraseña introducida
			if
			(String.valueOf(pwdfPassword.getPassword()).toString().equals(arg0)) //No se por que da este error todavia
			{
				lblAviso.setBackground(Color.GREEN);
				lblAviso.setText("Contraseña correcta. Puede entrar");
				lblAviso.setVisible(true);
				btnEntrar.setEnabled(true);
				lblPassword.setEnabled(false);
				pwdfPassword.setEnabled(false);
			} else {
				lblAviso.setBackground(Color.RED);
				lblAviso.setText("Contraseña incorrecta. Vuelva a intentarlo");
				lblAviso.setVisible(true);
				btnEntrar.setEnabled(false);
			}
		}
	}
	private class BtnEntrarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			Menu menu=new Menu();
			menu.frmMenu.setVisible(true);
			//para que aparezca la otra ventana
			
			//menu.main(null);
			//menu.initialize();
			
		}
	}
}