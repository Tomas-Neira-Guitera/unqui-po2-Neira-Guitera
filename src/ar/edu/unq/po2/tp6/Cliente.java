package ar.edu.unq.po2.tp6;

public class Cliente {

	private String nombre;
	private String apellido;
	private String direccion;
	private int edad;
	private double sueldoMensual;
	
	
	public Cliente(String n, String a, String d, int e, double s) {
		
		nombre = n;
		apellido = a;
		direccion = d;
		edad = e;
		sueldoMensual = s;	
	}

	public double sueldoNetoAnual() {
		
		return getSueldoMensual() * 12;
	}

	private double getSueldoMensual() {
		
		return sueldoMensual;
	}

}
