package Dominio;

public class GestorApp {
	
	GestorModificar gestorModificar=new GestorModificar();
	
	public void EliminarEmpleadoApp(Empleado e){
		gestorModificar.G_modificarEmpleado(e);
	}
	
	public void EliminarAlumnoApp(Alumno a){
		gestorModificar.G_modificarAlumno(a);
	}
	
	

}
