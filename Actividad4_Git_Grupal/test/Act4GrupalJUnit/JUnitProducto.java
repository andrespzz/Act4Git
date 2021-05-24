package Act4GrupalJUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pojos.Producto;

class JUnitProducto {
	
	// TESTS ANDRÉS

	private Producto producto;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {

	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		producto = new Producto();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	public void testMultiplicarDosReales() {
		producto.setA(50.50);
		producto.setB(2.50);

		double res = 50.50 * 2.50;

		assertEquals(res, producto.productoNumerosReales(producto.getA(), producto.getB()));
	}

	@Test
	public void testMultiplicarDosEnteros() {
		producto.setC(100);
		producto.setD(2);

		int res = 100 * 2;

		assertEquals(res, producto.productoNumerosEnteros(producto.getC(), producto.getD()));
	}

	@Test
	public void testMultiplicarTresReales() {
		producto.setE(50.75);
		producto.setF(20.50);
		producto.setG(100.01);

		double res = 50.75 * 20.50 * 100.01;

		assertEquals(res, producto.productoNumerosReales2(producto.getE(), producto.getF(), producto.getG()));
	}

	@Test
	public void testPotencia() {
		producto.setPot1(50);
		producto.setPot2(7);

		double res = Math.pow(50, 7);

		assertEquals(res, producto.potencia(producto.getPot1(), producto.getPot2()));

	}

}
