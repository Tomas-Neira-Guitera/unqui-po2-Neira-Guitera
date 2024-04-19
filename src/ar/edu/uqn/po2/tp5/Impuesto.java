package ar.edu.uqn.po2.tp5;

public class Impuesto implements Pagable, Factura{

	private Agencia agencia;
	
	private double tasaDelServicio;
	
	public Impuesto(double valor, Agencia agenciaARegistrar) {
		
		tasaDelServicio = valor;
		agencia = agenciaARegistrar;
		
	}
	
	public double obtenerMonto() {
		return tasaDelServicio;
	}
	
	public void procesar() {
		agencia.registrarPago(this);
	}
	
}
