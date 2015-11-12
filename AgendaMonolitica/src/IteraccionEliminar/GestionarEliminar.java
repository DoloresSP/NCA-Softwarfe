package IteraccionEliminar;

import IteraccionAñadir.GestorDAO;

public class GestionarEliminar {

	private static GestorDAO gestor= new GestorDAO();
	
	public static void G_eliminar(String dni){
		gestor.eliminarDAO(dni);
	}
	
}
