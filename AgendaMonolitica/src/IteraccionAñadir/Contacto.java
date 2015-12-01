package IteraccionAñadir;

public class Contacto {

	private String Nombre;
	private String Apellido;
	private long telefono;
	private String dni;
	
	
	public Contacto(String nombre, String apellido, long telefono, String dni) {
		super();
		Nombre = nombre;
		Apellido = apellido;
		this.telefono = telefono;
		this.dni = dni;
	}
	
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getApellido() {
		return Apellido;
	}
	public void setApellido(String apellido) {
		Apellido = apellido;
	}
	public long getTelefono() {
		return telefono;
	}
	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	
	
	
	
}
