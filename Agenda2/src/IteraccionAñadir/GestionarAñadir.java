package IteraccionA�adir;

public class GestionarA�adir {

	private static GestorDAO g=new GestorDAO();
	public GestionarA�adir() {
		super();
		// TODO Auto-generated constructor stub
	}

	static void G_a�adir(String nombre, String apellido, long telefono, String dni){
		g.a�adirDAO(nombre, apellido, telefono, dni);
	}
	
}
