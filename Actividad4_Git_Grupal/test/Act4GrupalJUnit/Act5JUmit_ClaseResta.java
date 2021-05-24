package Act4GrupalJUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pojos.Resta;

public class Act5JUmit_ClaseResta {
	private Resta resta;
	@BeforeAll
    static void setUpBeforeClass() throws Exception {

    }

    @AfterAll
    static void tearDownAfterClass() throws Exception {
    }

    @BeforeEach
    void setUp() throws Exception {
        //Me interesa antes de cada test tener un objeto persona limpio (nuevo)
        resta = new Resta();
        //configuramos todo lo que queramos antes de cada @Test
    }

    @AfterEach
    void tearDown() throws Exception {
    }
    
    @Test
    public void restaDosReales() {
    	resta.setA(145.00);
    	resta.setB(65.50);
    	
    	double resultado = 145.00 - 65.50;
    	
    	assertEquals(resultado, resta.RestaDosReales(resta.getA(), resta.getB()));
    }
   
    @Test
    public void RestaDosEnteros() {
    	resta.setC(100);
    	resta.setD(60);
    	
    	int resultado = 100 - 60;
    	
    	assertEquals(resultado, resta.RestaDosEnteros(resta.getC(), resta.getD()) );
	}
    
    @Test
    public void RestaTresReales() {
    	resta.setE(100.50);
    	resta.setF(7.50);
    	resta.setG(10.25);
    	
    	double resultado = 100.50 - 7.50 - 10.25;
    	
    	assertEquals(resultado, resta.RestaTresReales(resta.getE(), resta.getF(), resta.getG()) );
    }
    
}

