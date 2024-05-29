package tp6.test;

import static org.junit.Assert.*;
import org.junit.Test;
import ar.edu.unq.po2.tp6.Cliente;

public class ClienteTestCase {

	@Test
	public void unClienteSabeDecirSuSueldoAnual() {
		
		Cliente unCliente = new Cliente("Tomas", "Neira", "Calle falsa 123", 20, 10000);
	
		assertTrue(unCliente.sueldoNetoAnual() == 120000);
	}
	
	
	
	@Test
	public void unClienteSolicitaUnCreditoPersonalAlBanco() {
		
		
	}
	
	@Test
	public void unClienteSolicitaUnCreditoHipotecariolAlBanco() {
		
		
	}
}
