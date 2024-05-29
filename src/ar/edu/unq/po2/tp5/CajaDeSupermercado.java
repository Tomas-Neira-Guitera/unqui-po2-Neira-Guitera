package ar.edu.unq.po2.tp5;

import java.util.List;
import java.util.stream.Stream;

public class CajaDeSupermercado {

	
	public double montoTotalDeLosProductos(List<Pagable> pagables) {
		
		Stream<Pagable> streamDePagables = pagables.stream();
		
		streamDePagables.forEach(p -> p.procesar());
		return streamDePagables.mapToDouble(p -> p.obtenerMonto()).sum();
		
	}
	
}
