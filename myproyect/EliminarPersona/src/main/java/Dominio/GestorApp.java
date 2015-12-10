package Dominio;

public class GestorApp {
	
	GestorEliminar gestorEliminar=new GestorEliminar();
	
	public void EliminarEmpleadoApp(Empleado e){
		gestorEliminar.G_eliminarEmpleado(e);
	}
	
	public void EliminarAlumnoApp(Alumno a){
		gestorEliminar.G_eliminarAlumno(a);
	}
	
	

}
