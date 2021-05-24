package Act4GrupalJUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pojos.Cociente;

class CocienteJUnit {
	//Crear el objeto
	private Cociente cociente;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		//Me interesa antes de cada test tener un objeto persona limpio (nuevo)
		cociente = new Cociente();
		//configuramos todo lo que queramos antes de cada @Test
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	
	@Test
	void testDivisionDosReales() {
		cociente.setA(50);
		cociente.setB(10);
		
		double res = 50 / 10;
		
		assertEquals(res, cociente.DivisionDosReales(cociente.getA(), cociente.getB()));
	}
	
	
	@Test
	void testDivisionDosEnteros() {
		cociente.setC(70);
		cociente.setD(2);
		
		int res = 70 / 2;
		
		assertEquals(res, cociente.DivisionDosReales(cociente.getC(), cociente.getD()));
	}
	
	@Test
	void testInversoReal() {
		cociente.setUno(1);
		cociente.setInvR(150);
		
		double res = cociente.getUno() / 150;
		
		assertEquals(res, cociente.InversoReal(cociente.getInvR()));
	}
	
	@Test
	void testRaizNumero() {
		cociente.setRaizn(50);
		
		double res = Math.sqrt(50);
		
		assertEquals(res, cociente.RaizNumero(cociente.getRaizn()));
	}

}
