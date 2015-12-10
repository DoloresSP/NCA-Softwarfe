package Dominio;

public class GestorModificar {
	
	GestorDAO gestor2= new GestorDAO();
	
	public void G_modificarEmpleado(Empleado e){
		gestor2.modificarEmpleadoDAO(e);
	}
	
	public void G_modificarAlumno(Alumno a){
		gestor2.modificarAlumnoDAO(a);
	}
	

}
