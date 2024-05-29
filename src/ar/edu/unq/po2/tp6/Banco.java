package ar.edu.unq.po2.tp6;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	List<Cliente> clientes;
	
	public Banco() {
		clientes = new ArrayList<>();
	}
	
	public void incorporarCliente(Cliente unCliente) {
	
		clientes.add(unCliente);
	}

	public boolean seEncuentraEnElBanco(Cliente unCliente) {
		
		return clientes.contains(unCliente);
	}

}
