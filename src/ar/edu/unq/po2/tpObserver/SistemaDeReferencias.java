package ar.edu.unq.po2.tpObserver;

import java.util.List;

public class SistemaDeReferencias {

	
	List<Articulo> articulos;
	List<Interes> intereses;
	
	void agregarArticulo(Articulo a) {
		
		getArticulos().add(a);
		notificarIntereses(a);
		
	}

	private void notificarIntereses(Articulo a) {
		getIntereses().stream().forEach(i -> i.nuevoArticulo(a));
	}

	public List<Articulo> getArticulos() {
		return articulos;
	}

	public List<Interes> getIntereses() {
		return intereses;
	}
	
}
