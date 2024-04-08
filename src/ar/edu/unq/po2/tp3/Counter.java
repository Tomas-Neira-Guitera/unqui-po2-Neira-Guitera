package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.List;

public class Counter {

	private List<Integer> listaDeNumeros;
	
	public List<Integer> getListaDeNumeros() {
		return listaDeNumeros;
	}
	
	public Counter() {
		listaDeNumeros = new ArrayList<Integer>();
	}

	public void setListaDeNumeros(List<Integer> listaDeNumeros) {
		this.listaDeNumeros = listaDeNumeros;
	}

	public int cantidadDePares() {
		
		int contador = 0;
		
		for (int numero : listaDeNumeros) {
			contador = this.unoSiCeroSiNo(this.esPar(numero));
		}
		return contador;
	}

	public int cantidadDeImpares() {
		
		int contador = 0;
		
		for (int numero : listaDeNumeros) {
			contador = this.unoSiCeroSiNo(!(this.esPar(numero)));
		}
		return contador;
	}
	
	private boolean esPar(int x) {
		
		return (x % 2 == 0);	
	}
	
	private int unoSiCeroSiNo(boolean condicion) {
		
		if(condicion) {
			return 1;
		}
		else {
			return 0;
		}
	}
	
	public int cantidadDeMultiplosDe(int x) {
		
		int contador = 0;
		
		for (int numero : listaDeNumeros) {
			contador = this.unoSiCeroSiNo(this.sonMultiplos(x, numero));
		}
		return contador;	
	}
	
	private boolean sonMultiplos(int x, int y) {
		
		return (x % y == 0);
	}

	public void addNumber(int x) {
		
		getListaDeNumeros().add(x);
	}

}
