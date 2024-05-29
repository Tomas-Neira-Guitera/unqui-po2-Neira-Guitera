package ar.edu.unq.po2.tpObserver;

import java.util.List;

public abstract class Interes {

	String valor;
	List<Investigador> interesados;
	
	public Interes(String v) {
		
		valor = v;
	}
	
	
	public void nuevoArticulo(Articulo a) {
		
		if(esDeMiInteres()) {
			getInteresados().stream().forEach(i -> i.recibirArticulo(a));
		}
		
	}

	protected abstract boolean esDeMiInteres();

	public void suscribirInteresado(Investigador i) {
		
		interesados.add(i);
	}
	
	public void desuscribirInteresado(Investigador i) {
		
		interesados.remove(i);
	}

	public String getValor() {
		return valor;
	}


	public List<Investigador> getInteresados() {
		return interesados;
	}

}
