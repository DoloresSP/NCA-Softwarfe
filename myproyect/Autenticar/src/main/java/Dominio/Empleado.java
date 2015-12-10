package Dominio;

public class Empleado extends Persona {
	
	private String puesto_trabajo;
	private double nomina;
	private String fecha_nacimiento;
	
	
	
	public Empleado(String dni, long telefono, String email, String cuenta,
			String direccion, String estado, String puesto_trabajo,
			double nomina, String fecha_nacimiento) {
		
		super(dni, telefono, email, cuenta, direccion, estado);
		this.puesto_trabajo = puesto_trabajo;
		this.nomina = nomina;
		this.fecha_nacimiento = fecha_nacimiento;
	}



	public String getPuesto_trabajo() {
		return puesto_trabajo;
	}



	public void setPuesto_trabajo(String puesto_trabajo) {
		this.puesto_trabajo = puesto_trabajo;
	}



	public double getNomina() {
		return nomina;
	}



	public void setNomina(double nomina) {
		this.nomina = nomina;
	}



	public String getFecha_nacimiento() {
		return fecha_nacimiento;
	}



	public void setFecha_nacimiento(String fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}
	
	
	

}
