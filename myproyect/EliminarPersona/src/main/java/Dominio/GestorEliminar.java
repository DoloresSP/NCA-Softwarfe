package Dominio;

public class GestorEliminar {
	
	GestorDAO gestor2= new GestorDAO();
	
	public void G_eliminarEmpleado(Empleado e){
		gestor2.eliminarEmpleadoDAO(e);
	}
	
	public void G_eliminarAlumno(Alumno a){
		gestor2.eliminarAlumnoDAO(a);
	}
	

}
