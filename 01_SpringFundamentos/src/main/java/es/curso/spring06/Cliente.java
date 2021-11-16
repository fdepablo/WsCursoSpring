package es.curso.spring06;

public class Cliente {
	private String nombre;
	private Pedido pedido;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Pedido getPedido() {
		return pedido;
	}
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	
	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", pedido=" + pedido + "]";
	}	
}
