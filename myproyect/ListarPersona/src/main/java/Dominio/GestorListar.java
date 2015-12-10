package Dominio;

public class GestorListar {
	
	GestorDAO gestor2= new GestorDAO();
	
	public void G_listarEmpleados(){
		gestor2.listarEmpleadosDAO();
	}
	
	public void G_listarAlumnos(){
		gestor2.listarAlumnosDAO();
	}
	

}
