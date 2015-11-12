package IteraccionAñadir;

public class GestionarAñadir {

	private static GestorDAO g=new GestorDAO();
	public GestionarAñadir() {
		super();
		// TODO Auto-generated constructor stub
	}

	static void G_añadir(String nombre, String apellido, long telefono, String dni){
		g.añadirDAO(nombre, apellido, telefono, dni);
	}
	
}
