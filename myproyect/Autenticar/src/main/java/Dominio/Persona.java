package Dominio;

public class Persona {
	
	protected String nombre;
	protected String apellidos;
	protected String dni;
	protected long telefono;
	protected String email;
	protected String cuenta;
	protected String direccion;
	protected String estado;
	
	
	public Persona(String dni, long telefono, String email, String cuenta,
			String direccion, String estado) {
		super();
		this.dni = dni;
		this.telefono = telefono;
		this.email = email;
		this.cuenta = cuenta;
		this.direccion = direccion;
		this.estado = estado;
	}


	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}


	public long getTelefono() {
		return telefono;
	}


	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getCuenta() {
		return cuenta;
	}


	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
	
	

}
