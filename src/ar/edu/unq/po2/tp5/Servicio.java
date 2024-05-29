package ar.edu.unq.po2.tp5;

public class Servicio implements Pagable, Factura{

	private double costoDelServicio;
	private int cantidadDeUnidadesConsumidas;
	private Agencia agencia;
	
	public Servicio(double c, int u, Agencia agenciaARegistrar) {
		
		costoDelServicio = c;
		cantidadDeUnidadesConsumidas = u;
		agencia = agenciaARegistrar;
		
	}
	
	public double obtenerMonto() {
		return costoDelServicio * cantidadDeUnidadesConsumidas;
	}
	
	public void procesar() {
		agencia.registrarPago(this);
	}
	
}
