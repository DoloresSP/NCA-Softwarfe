
package IteraccionBuscar;
import IteraccionAñadir.*;

public class GestionarBuscar {
	
	private static GestorDAO gestor= new GestorDAO();
	
	public static void G_buscar(String dni){
		gestor.buscarDAO(dni);
	}
}
