import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.Punto;
import ar.edu.unq.po2.tp3.Rectangulo;

class RectanguloTestCase {

	
	@Test
	void testCrearUnRectanguloApropiado() {
		
		Punto puntoBase = new Punto();
		
		Rectangulo unRectangulo = new Rectangulo(puntoBase, 10, 6);
		
		Punto puntoSupIzqEsperado = new Punto(0,0);
		Punto puntoSupDerEsperado = new Punto(10, 0);
		Punto puntoInfIzqEsperado = new Punto(0, -6);
		Punto puntoInfDerEsperado = new Punto(10, -6);
		
		
		assertEquals(unRectangulo.getEsquinaSuperiorIzquierda(), puntoSupIzqEsperado);
		assertEquals(unRectangulo.getEsquinaSuperiorDerecha(), puntoSupDerEsperado);
		assertEquals(unRectangulo.getEsquinaInferiorIzquierda(), puntoInfIzqEsperado);
		assertEquals(unRectangulo.getEsquinaInferiorDerecha(), puntoInfDerEsperado);
	}

}
