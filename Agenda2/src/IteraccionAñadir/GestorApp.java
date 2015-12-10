package IteraccionA�adir;
import IteraccionBuscar.*;
import IteraccionEliminar.*;
import IteraccionModificar.*;


public class GestorApp {
	private static GestionarA�adir gA�adir=new GestionarA�adir();
	private static GestionarBuscar gBuscar=new GestionarBuscar();
	private static GestionarModificar gModi=new GestionarModificar();
	private static GestionarEliminar gEliminar=new GestionarEliminar();
	
	
	public GestorApp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static void A�adirApp(String nombre, String apellido, long telefono, String dni){
		gA�adir.G_a�adir(nombre, apellido, telefono, dni);
	}
	
	public static void BuscarApp(String dni){
		gBuscar.G_buscar(dni);
	}
	
	public static void ModificarApp(Contacto c){
		gModi.G_modificar(c);
	}
	
	public static void EliminarApp(String dni){
		gEliminar.G_eliminar(dni);
	}
	
	
}
