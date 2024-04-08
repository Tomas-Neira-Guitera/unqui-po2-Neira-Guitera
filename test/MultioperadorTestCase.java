import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.Multioperador;

class MultioperadorTestCase {

	
	private Multioperador multioperador = new Multioperador();
	@Test
	void testSuma() {
		
		int resultadoDeLaSuma = multioperador.sumar(new int[]{1,2,3,4});
		
		assertEquals(resultadoDeLaSuma, 10);
	}
	
	@Test
	void testResta() {
		
		int resultadoDeLaSuma = multioperador.restar(new int[]{4,3,2,1});
		
		assertEquals(resultadoDeLaSuma, -2);
	}
	
	@Test
	void testMultiplicacion() {
	
	int resultadoDeLaSuma = multioperador.multiplicar(new int[]{1,2,3,4});
	
	assertEquals(resultadoDeLaSuma, 24);
	}

}
