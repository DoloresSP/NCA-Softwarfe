package Dominio;

public class GestorApp {
	
	GestorMostrarInforme gestorMostrar=new GestorMostrarInforme();
	
	public void EliminarEmpleadoApp(String dni){
		gestorMostrar.G_mostrarEmpleado(dni);
	}
	
	public void EliminarAlumnoApp(String dni){
		gestorMostrar.G_mostrarAlumno(dni);
	}
	
	

}
