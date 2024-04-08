package ar.edu.unq.po2.tp4;

import java.util.ArrayList;
import java.util.List;

public class Supermercado {

	private String nombre;
	private String direccion;
	private List<Producto> catalogo;
	
	public Supermercado(String nombre, String direccion){
		
		this.nombre = nombre;
		this.direccion = direccion;
		this.catalogo = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public String getDireccion() {
		return direccion;
	}
	
	public void agregarProducto(Producto productoNuevo) {
		
		catalogo.add(productoNuevo);
	}
	
	public int cantidadDeProductos() {
		
		return catalogo.size();
	}
	
	public float sumaDeTodosLosPrecios() {
		
		float precioDeLosProductos = 0;
		
		for (Producto unProducto : catalogo ) {
			precioDeLosProductos = precioDeLosProductos + unProducto.getPrecio();
			}

		return precioDeLosProductos;
	}
	
	
	
	
}
