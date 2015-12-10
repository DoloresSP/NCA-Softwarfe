package Dominio;

public class GestorAutenticar {
	
	GestorDAO gestor2= new GestorDAO();
	
	public void G_autenticar(String dni, String contraseña){
		gestor2.autenticarDAO(dni, contraseña);
	}
	

}
