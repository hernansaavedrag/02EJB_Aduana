package cl.model;

public class Cliente {
	
	private String nombre;
	private String apellido;
	private String rut;
	
	public Cliente() {
		// TODO Auto-generated constructor stub
	}

	public Cliente(String rut, String nombre, String apellido) {
		
		this.rut = rut;
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	public String getRut() {
		return rut;
	}

	public void setRut(String rut)
	{
		this.rut = rut;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public void mostrar() {
		System.out.println("Hola mundo");
	}
	
	
	
	

}
