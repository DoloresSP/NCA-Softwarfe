package IteraccionModificar;

import IteraccionA�adir.*;

public class GestionarModificar {

	private static GestorDAO gestor= new GestorDAO();
	
	
	public static void G_modificar(Contacto c){
		 gestor.modificarDAO(c);
		
	}
}
