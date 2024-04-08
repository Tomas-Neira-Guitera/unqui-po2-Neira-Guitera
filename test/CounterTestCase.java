import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ar.edu.unq.po2.tp3.Counter;



class CounterTestCase {

	private Counter counter;
	
	@BeforeEach
	public void setUp() {
		
		counter = new Counter();
		
		counter.addNumber(1);
		counter.addNumber(3);
		counter.addNumber(5);
		counter.addNumber(7);
		counter.addNumber(9);
		counter.addNumber(2);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(4);
	}
	
	@Test
	public void testNumerosPares(){
		
		int cantidad = counter.cantidadDePares();
		
		assertEquals(cantidad, 2);
	}
	
	@Test
	public void testNumerosImpares(){
		
		int cantidad = counter.cantidadDeImpares();
		
		assertEquals(cantidad, 8);
	}
}
