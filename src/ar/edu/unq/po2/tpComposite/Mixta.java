package ar.edu.unq.po2.tpComposite;

import java.util.List;
import java.util.stream.Stream;

public class Mixta implements PorcionDeTierra {
	
	private List<PorcionDeTierra> subdiviciones;
	
	
	public double ganancia() {
		
		double gananciaTotal;
	
		Stream<PorcionDeTierra> subdivicionesStream = subdiviciones.stream();
	
		gananciaTotal = subdivicionesStream.mapToDouble(t -> t.ganancia()).sum();
		
		return (gananciaTotal * 0.25);
		
	}

}
