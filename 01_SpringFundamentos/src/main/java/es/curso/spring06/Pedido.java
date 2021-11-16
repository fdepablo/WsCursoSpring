package es.curso.spring06;

public class Pedido {
	private int id;
	private double precio;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	@Override
	public String toString() {
		return "Pedido [id=" + id + ", precio=" + precio + "]";
	}
	
}
