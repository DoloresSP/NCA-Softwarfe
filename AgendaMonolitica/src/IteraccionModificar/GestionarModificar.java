package IteracionModificar;

import IteracionAñadir.*;

public class GestionarModificar {

	private static GestorDAO gestor= new GestorDAO();
	
	
	public static void G_modificar(Contacto c){
		 gestor.modificarDAO(c);
		
	}
}
