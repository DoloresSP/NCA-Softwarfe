package Dominio;

public class GestorMostrarInforme {
	
	GestorDAO gestor2= new GestorDAO();
	
	public void G_mostrarEmpleado(String dni){
		gestor2.mostrarEmpleadoDAO(dni);
	}
	
	public void G_mostrarAlumno(String dni){
		gestor2.mostrarAlumnoDAO(dni);
	}
	

}
