package es.curso.spring04;

public class Persona {
	private int id;
	private String nombre;
	private int edad;
	private double peso;
	private Direccion direccion;
	
	public Persona() {
		super();
		this.id = 1;
	}	
	
	public Persona(String nombre, int edad, double peso) {
		super();
		this.id = 2;
		this.nombre = nombre;
		this.edad = edad;
		this.peso = peso;
	}
	
	public Persona(String nombre, int edad, double peso, Direccion direccion) {
		super();
		this.id = 3;
		this.nombre = nombre;
		this.edad = edad;
		this.peso = peso;
		this.direccion = direccion;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + ", edad=" + edad + ", peso=" + peso + ", direccion="
				+ direccion + "]";
	}
}
