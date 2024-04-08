package ar.edu.unq.po2.tp3;

public class Multioperador {

	
	public int sumar(int[] arrayDeNumeros) {
		
		int sumaHastaAhora = 0;
		
		for(int unNumero : arrayDeNumeros) {
			
			sumaHastaAhora = sumaHastaAhora + unNumero;
		}
		
		return sumaHastaAhora;
	}
	
	public int restar(int[] arrayDeNumeros) {
		
		int restaHastaAhora = arrayDeNumeros[0];
		
		for(int i = 1; i < arrayDeNumeros.length; i++) {
			
			restaHastaAhora = restaHastaAhora - arrayDeNumeros[i];
		}
		
		return restaHastaAhora;
	}
	
	public int multiplicar(int[] arrayDeNumeros) {
		
		int multiplicacionHastaAhora = 1;
		
		for(int unNumero : arrayDeNumeros) {
			
			multiplicacionHastaAhora = multiplicacionHastaAhora * unNumero;
		}
		
		return multiplicacionHastaAhora;
	}
}
