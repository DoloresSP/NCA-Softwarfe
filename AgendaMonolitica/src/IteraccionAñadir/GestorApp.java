package IteraccionAñadir;
import IteraccionBuscar.*;
import IteraccionEliminar.*;
import IteraccionModificar.*;


public class GestorApp {
	private static GestionarAñadir gAñadir=new GestionarAñadir();
	private static GestionarBuscar gBuscar=new GestionarBuscar();
	private static GestionarModificar gModi=new GestionarModificar();
	private static GestionarEliminar gEliminar=new GestionarEliminar();
	
	
	public GestorApp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static void AñadirApp(String nombre, String apellido, long telefono, String dni){
		gAñadir.G_añadir(nombre, apellido, telefono, dni);
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
