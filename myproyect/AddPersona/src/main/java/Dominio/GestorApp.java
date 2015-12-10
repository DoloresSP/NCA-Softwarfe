package Dominio;

public class GestorApp {
	
	GestorAdd gestorAdd=new GestorAdd();
	
	public void AddEmpleadoApp(Empleado e){
		gestorAdd.G_añadirEmpleado(e);
	}
	
	public void AddAlumnoApp(Alumno a){
		gestorAdd.G_añadirAlumno(a);
	}
	
	

}
