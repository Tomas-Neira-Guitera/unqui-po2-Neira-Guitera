package ar.edu.unq.po2.tpObserver;

import java.util.ArrayList;
import java.util.List;

public class Investigador {

	List<Articulo> articulosDeInteres;
	Interes interes;
	
	
	public Investigador(Interes i) {
		
		interes = i;
		interes.suscribirInteresado(this);
		articulosDeInteres = new ArrayList<Articulo>();
	}
	
	
	public void recibirArticulo(Articulo a) {
		articulosDeInteres.add(a);
	}

}
