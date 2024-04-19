package ar.edu.uqn.po2.tp5;

public class Producto implements Pagable {

	private double precio;
	private int stock;
	
	public Producto(double p, int s) {
		
		precio = p;
		stock = s;	
	}

	public double obtenerMonto() {
		return precio;
	}

	public void actualizarPrecio(double precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}
	
	public void procesar() {
		
		stock = stock - 1;
	}
	
}
