package Dominio;

public class GestorApp {
	
	GestorListar gestorListar=new GestorListar();
	
	public void ListarEmpleadosApp(){
		gestorListar.G_listarEmpleados();
	}
	
	public void ListarAlumnosApp(){
		gestorListar.G_listarAlumnos();
	}
	
	

}
