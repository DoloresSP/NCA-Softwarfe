package IteraccionAñadir;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import IteraccionAñadir.*;


public class Interfaz {

	private JFrame frame;
	private JPanel panel;
	private JLabel lblNombre;
	private JTextField nombreAdd;
	private JLabel lblNewLabel;
	private JTextField ApellidosAdd;
	private JLabel lblTelefono;
	private JLabel lblDni;
	private JLabel lblNombre_1;
	private JTextField TelefonoAdd;
	private JTextField DniAdd;
	private JTextField Dni;
	private JTextField Apellidos;
	private JTextField Nombre;
	private JTextField Telefono;
	private JTextField dniBuscar;
	private JLabel lblBuscar;
	private JLabel lblDni_1;
	private JLabel lblApellidos;
	private JLabel lblTelefono_1;
	private JLabel lblAadir_1;
	private JButton btnAadir;
	private JButton btnModificar;
	private JButton btnEliminar;
	private JButton btnBuscar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfaz window = new Interfaz();
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
	public Interfaz() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 661, 401);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		{
			panel = new JPanel();
			frame.getContentPane().add(panel, BorderLayout.CENTER);
			GridBagLayout gbl_panel = new GridBagLayout();
			gbl_panel.columnWidths = new int[]{0, 323, 0, 0};
			gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 28, 0, 0, 0, 0};
			gbl_panel.columnWeights = new double[]{1.0, 0.0, 1.0, Double.MIN_VALUE};
			gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
			panel.setLayout(gbl_panel);
			{
				lblAadir_1 = new JLabel("A\u00D1ADIR");
				GridBagConstraints gbc_lblAadir_1 = new GridBagConstraints();
				gbc_lblAadir_1.insets = new Insets(0, 0, 5, 5);
				gbc_lblAadir_1.gridx = 1;
				gbc_lblAadir_1.gridy = 0;
				panel.add(lblAadir_1, gbc_lblAadir_1);
			}
			{
				lblNombre = new JLabel("Nombre:");
				GridBagConstraints gbc_lblNombre = new GridBagConstraints();
				gbc_lblNombre.anchor = GridBagConstraints.WEST;
				gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
				gbc_lblNombre.gridx = 0;
				gbc_lblNombre.gridy = 1;
				panel.add(lblNombre, gbc_lblNombre);
			}
			{
				nombreAdd = new JTextField();
				GridBagConstraints gbc_nombreAdd = new GridBagConstraints();
				gbc_nombreAdd.insets = new Insets(0, 0, 5, 5);
				gbc_nombreAdd.fill = GridBagConstraints.HORIZONTAL;
				gbc_nombreAdd.gridx = 1;
				gbc_nombreAdd.gridy = 1;
				panel.add(nombreAdd, gbc_nombreAdd);
				nombreAdd.setColumns(10);
			}
			{
				lblNewLabel = new JLabel("Apellidos:");
				GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
				gbc_lblNewLabel.anchor = GridBagConstraints.WEST;
				gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
				gbc_lblNewLabel.gridx = 0;
				gbc_lblNewLabel.gridy = 2;
				panel.add(lblNewLabel, gbc_lblNewLabel);
			}
			{
				ApellidosAdd = new JTextField();
				ApellidosAdd.setText("");
				GridBagConstraints gbc_ApellidosAdd = new GridBagConstraints();
				gbc_ApellidosAdd.insets = new Insets(0, 0, 5, 5);
				gbc_ApellidosAdd.fill = GridBagConstraints.HORIZONTAL;
				gbc_ApellidosAdd.gridx = 1;
				gbc_ApellidosAdd.gridy = 2;
				panel.add(ApellidosAdd, gbc_ApellidosAdd);
				ApellidosAdd.setColumns(10);
			}
			{
				lblTelefono = new JLabel("Telefono:");
				GridBagConstraints gbc_lblTelefono = new GridBagConstraints();
				gbc_lblTelefono.anchor = GridBagConstraints.WEST;
				gbc_lblTelefono.insets = new Insets(0, 0, 5, 5);
				gbc_lblTelefono.gridx = 0;
				gbc_lblTelefono.gridy = 3;
				panel.add(lblTelefono, gbc_lblTelefono);
			}
			{
				TelefonoAdd = new JTextField();
				GridBagConstraints gbc_TelefonoAdd = new GridBagConstraints();
				gbc_TelefonoAdd.insets = new Insets(0, 0, 5, 5);
				gbc_TelefonoAdd.fill = GridBagConstraints.HORIZONTAL;
				gbc_TelefonoAdd.gridx = 1;
				gbc_TelefonoAdd.gridy = 3;
				panel.add(TelefonoAdd, gbc_TelefonoAdd);
				TelefonoAdd.setColumns(10);
			}
			{
				btnAadir = new JButton("A\u00D1ADIR");
				btnAadir.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						GestorApp gestor=new GestorApp();
						gestor.AñadirApp(nombreAdd.toString(), ApellidosAdd.toString(), Long.parseLong(TelefonoAdd.toString()), DniAdd.toString());
					}
				});
				GridBagConstraints gbc_btnAadir = new GridBagConstraints();
				gbc_btnAadir.fill = GridBagConstraints.HORIZONTAL;
				gbc_btnAadir.gridheight = 2;
				gbc_btnAadir.insets = new Insets(0, 0, 5, 0);
				gbc_btnAadir.gridx = 2;
				gbc_btnAadir.gridy = 3;
				panel.add(btnAadir, gbc_btnAadir);
			}
			{
				lblDni = new JLabel("Dni:");
				GridBagConstraints gbc_lblDni = new GridBagConstraints();
				gbc_lblDni.anchor = GridBagConstraints.WEST;
				gbc_lblDni.insets = new Insets(0, 0, 5, 5);
				gbc_lblDni.gridx = 0;
				gbc_lblDni.gridy = 4;
				panel.add(lblDni, gbc_lblDni);
			}
			{
				DniAdd = new JTextField();
				GridBagConstraints gbc_DniAdd = new GridBagConstraints();
				gbc_DniAdd.insets = new Insets(0, 0, 5, 5);
				gbc_DniAdd.fill = GridBagConstraints.HORIZONTAL;
				gbc_DniAdd.gridx = 1;
				gbc_DniAdd.gridy = 4;
				panel.add(DniAdd, gbc_DniAdd);
				DniAdd.setColumns(10);
			}
			{
				lblBuscar = new JLabel("Buscar:");
				GridBagConstraints gbc_lblBuscar = new GridBagConstraints();
				gbc_lblBuscar.insets = new Insets(0, 0, 5, 5);
				gbc_lblBuscar.anchor = GridBagConstraints.EAST;
				gbc_lblBuscar.gridx = 0;
				gbc_lblBuscar.gridy = 7;
				panel.add(lblBuscar, gbc_lblBuscar);
			}
			{
				dniBuscar = new JTextField();
				GridBagConstraints gbc_dniBuscar = new GridBagConstraints();
				gbc_dniBuscar.insets = new Insets(0, 0, 5, 5);
				gbc_dniBuscar.fill = GridBagConstraints.HORIZONTAL;
				gbc_dniBuscar.gridx = 1;
				gbc_dniBuscar.gridy = 7;
				panel.add(dniBuscar, gbc_dniBuscar);
				dniBuscar.setColumns(10);
			}
			{
				btnBuscar = new JButton("BUSCAR");
				btnBuscar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						GestorApp gestor=new GestorApp();
						gestor.BuscarApp(dniBuscar.toString());
					}
				});
				GridBagConstraints gbc_btnBuscar = new GridBagConstraints();
				gbc_btnBuscar.fill = GridBagConstraints.HORIZONTAL;
				gbc_btnBuscar.insets = new Insets(0, 0, 5, 0);
				gbc_btnBuscar.gridx = 2;
				gbc_btnBuscar.gridy = 7;
				panel.add(btnBuscar, gbc_btnBuscar);
			}
			{
				lblDni_1 = new JLabel("Dni:");
				GridBagConstraints gbc_lblDni_1 = new GridBagConstraints();
				gbc_lblDni_1.fill = GridBagConstraints.BOTH;
				gbc_lblDni_1.insets = new Insets(0, 0, 5, 5);
				gbc_lblDni_1.gridx = 0;
				gbc_lblDni_1.gridy = 9;
				panel.add(lblDni_1, gbc_lblDni_1);
			}
			{
				Dni = new JTextField();
				GridBagConstraints gbc_Dni = new GridBagConstraints();
				gbc_Dni.insets = new Insets(0, 0, 5, 5);
				gbc_Dni.fill = GridBagConstraints.HORIZONTAL;
				gbc_Dni.gridx = 1;
				gbc_Dni.gridy = 9;
				panel.add(Dni, gbc_Dni);
				Dni.setColumns(10);
			}
			{
				lblNombre_1 = new JLabel("Nombre:");
				GridBagConstraints gbc_lblNombre_1 = new GridBagConstraints();
				gbc_lblNombre_1.anchor = GridBagConstraints.WEST;
				gbc_lblNombre_1.insets = new Insets(0, 0, 5, 5);
				gbc_lblNombre_1.gridx = 0;
				gbc_lblNombre_1.gridy = 10;
				panel.add(lblNombre_1, gbc_lblNombre_1);
			}
			{
				Nombre = new JTextField();
				GridBagConstraints gbc_Nombre = new GridBagConstraints();
				gbc_Nombre.insets = new Insets(0, 0, 5, 5);
				gbc_Nombre.fill = GridBagConstraints.HORIZONTAL;
				gbc_Nombre.gridx = 1;
				gbc_Nombre.gridy = 10;
				panel.add(Nombre, gbc_Nombre);
				Nombre.setColumns(10);
			}
			{
				btnModificar = new JButton("MODIFICAR");
				btnModificar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						GestorApp gestor=new GestorApp();
						Contacto c=new Contacto(Nombre.toString(), Apellidos.toString(), Long.parseLong(Telefono.toString()), Dni.toString());
						gestor.ModificarApp(c);
					}
				});
				GridBagConstraints gbc_btnModificar = new GridBagConstraints();
				gbc_btnModificar.fill = GridBagConstraints.HORIZONTAL;
				gbc_btnModificar.insets = new Insets(0, 0, 5, 0);
				gbc_btnModificar.gridx = 2;
				gbc_btnModificar.gridy = 10;
				panel.add(btnModificar, gbc_btnModificar);
			}
			{
				lblApellidos = new JLabel("Apellidos:");
				GridBagConstraints gbc_lblApellidos = new GridBagConstraints();
				gbc_lblApellidos.insets = new Insets(0, 0, 5, 5);
				gbc_lblApellidos.anchor = GridBagConstraints.WEST;
				gbc_lblApellidos.gridx = 0;
				gbc_lblApellidos.gridy = 11;
				panel.add(lblApellidos, gbc_lblApellidos);
			}
			{
				Apellidos = new JTextField();
				GridBagConstraints gbc_Apellidos = new GridBagConstraints();
				gbc_Apellidos.insets = new Insets(0, 0, 5, 5);
				gbc_Apellidos.fill = GridBagConstraints.HORIZONTAL;
				gbc_Apellidos.gridx = 1;
				gbc_Apellidos.gridy = 11;
				panel.add(Apellidos, gbc_Apellidos);
				Apellidos.setColumns(10);
			}
			{
				btnEliminar = new JButton("ELIMINAR");
				btnEliminar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						GestorApp gestor=new GestorApp();
						gestor.EliminarApp(Dni.toString());
					}
				});
				GridBagConstraints gbc_btnEliminar = new GridBagConstraints();
				gbc_btnEliminar.fill = GridBagConstraints.HORIZONTAL;
				gbc_btnEliminar.insets = new Insets(0, 0, 5, 0);
				gbc_btnEliminar.gridx = 2;
				gbc_btnEliminar.gridy = 11;
				panel.add(btnEliminar, gbc_btnEliminar);
			}
			{
				lblTelefono_1 = new JLabel("Telefono:");
				GridBagConstraints gbc_lblTelefono_1 = new GridBagConstraints();
				gbc_lblTelefono_1.insets = new Insets(0, 0, 5, 5);
				gbc_lblTelefono_1.anchor = GridBagConstraints.WEST;
				gbc_lblTelefono_1.gridx = 0;
				gbc_lblTelefono_1.gridy = 12;
				panel.add(lblTelefono_1, gbc_lblTelefono_1);
			}
			{
				Telefono = new JTextField();
				GridBagConstraints gbc_Telefono = new GridBagConstraints();
				gbc_Telefono.insets = new Insets(0, 0, 5, 5);
				gbc_Telefono.fill = GridBagConstraints.HORIZONTAL;
				gbc_Telefono.gridx = 1;
				gbc_Telefono.gridy = 12;
				panel.add(Telefono, gbc_Telefono);
				Telefono.setColumns(10);
			}
		}
	}

}

