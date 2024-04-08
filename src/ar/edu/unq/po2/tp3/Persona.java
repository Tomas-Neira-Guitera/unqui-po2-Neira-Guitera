package ar.edu.unq.po2.tp3;
import java.time.LocalDate;
public class Persona {

	String nombre;
	LocalDate fechaDeNacimiento;	
	int edad;
	
	public Persona(String nombre, LocalDate fechaDeNacimiento) {
		
		setNombre(nombre);
		setFechaDeNacimiento(fechaDeNacimiento);
		setEdad();
		
	}
	
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	private void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	
	private void setEdad() {
		
		LocalDate fechaActual = LocalDate.now();
		int añoActual = fechaActual.getYear();
		int añoDeLaFechaDeNacimiento = fechaDeNacimiento.getYear();
		
		this.edad = añoActual - añoDeLaFechaDeNacimiento;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public LocalDate getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public boolean menorQue(Persona p1) {
		
		int edadP1 = p1.getEdad();
		
		return getEdad() < edadP1;
	}
}
