package Dominio;

public class GestorApp {
	
	GestorAutenticar gestor1=new GestorAutenticar();
	
	public void AutenticarApp(String dni, String contraseña){
		gestor1.G_autenticar(dni, contraseña);
	}
	
	

}
