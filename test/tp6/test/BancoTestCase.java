package tp6.test;

import org.junit.Test;

import ar.edu.unq.po2.tp6.Banco;
import ar.edu.unq.po2.tp6.Cliente;

import static org.junit.Assert.*;

public class BancoTestCase {

	
	@Test
	public void unBancoRegistraAUnCliente() {
		
		Banco unBanco = new Banco();
		Cliente unCliente = new Cliente("Tomas", "Neira", "Calle falsa 123", 20, 10000);
		
		
		unBanco.incorporarCliente(unCliente);
		
		assertTrue(unBanco.seEncuentraEnElBanco(unCliente));
		
	}
}
