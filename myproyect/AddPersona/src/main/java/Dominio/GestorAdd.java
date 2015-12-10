package Dominio;

public class GestorAdd {
	
	GestorDAO gestor2= new GestorDAO();
	
	
	
	public void G_añadirEmpleado(Empleado e){
		gestor2.addEmpleadoDAO(e);
		
	}
	
	public void G_añadirAlumno(Alumno a){
		gestor2.addAlumnoDAO(a);
	}
	

}
