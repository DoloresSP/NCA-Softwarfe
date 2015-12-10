package Dominio;

public class Alumno extends Persona{
	
	private String nivel;

	public Alumno(String dni, long telefono, String email, String cuenta,
			String direccion, String estado, String nivel) {
		super(dni, telefono, email, cuenta, direccion, estado);
		this.nivel = nivel;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}
	
	

}
