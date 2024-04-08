package ar.edu.unq.po2.tp4;

public class Producto {

	private String nombre;
	private float precio;
	private boolean preciosCuidados;
	private Descuento descuento;
	
	
	public Producto(String nombre, float precio) {
		
		this.nombre = nombre;
		this.precio = precio;
		this.preciosCuidados = false;
	}

	public float getPrecio() {
		
		if (this.preciosCuidados) {
			
			return precio * descuento.montoDelDescuento();
			
		} else {
			return precio;
		}
		
	}

	public void actualizarPrecio(float precio) {
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}
	
	public boolean perteneceAPreciosCuidados() {
		
		return this.preciosCuidados;
	}
	
	public void incorporarAPreciosCuidados(double descuentoParaElProducto) {
		
		this.preciosCuidados = true;
		this.descuento = new Descuento(descuentoParaElProducto);
	}
	
	public void eliminarDePreciosCuidados() {
		
		this.preciosCuidados = false;
	}	
	
}
