package ar.edu.uqn.po2.tp5;

public class ProductoDeCooperativa extends Producto{

	public ProductoDeCooperativa(double p, int s) {
		super(p, s);
	}

	public double getPrecio() {
		
		return this.getPrecio() * 0.9;
	}
	
	
}
