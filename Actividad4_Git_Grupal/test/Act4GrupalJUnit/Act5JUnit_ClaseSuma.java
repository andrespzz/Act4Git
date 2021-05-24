package Act4GrupalJUnit;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pojos.Suma;

public class Act5JUnit_ClaseSuma {
	//crear objeto
	private Suma suma;
	@BeforeAll
    static void setUpBeforeClass() throws Exception {

    }

    @AfterAll
    static void tearDownAfterClass() throws Exception {
    }

    @BeforeEach
    void setUp() throws Exception {
        //Me interesa antes de cada test tener un objeto persona limpio (nuevo)
        suma = new Suma();
        //configuramos todo lo que queramos antes de cada @Test
    }

    @AfterEach
    void tearDown() throws Exception {
    }
    
    @Test
    public void testSumaDosReales() {
    	suma.setD(10.54);
    	suma.setE(30.98);
    	
    	double res = 10.54 + 30.98;
    	
    	assertEquals(res, suma.SumaDosReales(suma.getD(), suma.getE()));
    	assertEquals(res, suma.ValorAcumulado());
    }
    
    @Test
    public void testSumaDosEnteros() {
    	suma.setF(13);
    	suma.setG(65);
    	
    	int res = 13 + 65;
    	
    	assertEquals(res, suma.SumaDosEnteros(suma.getF(), suma.getG()));
    	assertEquals(res, suma.ValorAcumulado());
    }
    
    @Test
    public void testSumaTresReales() {
    	suma.setH(34.56);
    	suma.setI(10.1);
    	suma.setJ(234.234);
    	
    	double res = 34.56 + 10.1 + 234.234;
    	
    	assertEquals(res, suma.SumaTresReales(suma.getH(), suma.getI(), suma.getJ()));
    	assertEquals(res, suma.ValorAcumulado());
    }
    
    @Test
    public void testValorAcumulado() {
    	suma.setValorAcumulado(45.67);
    	double valor = 45.67;
    	
    	assertEquals(valor, suma.ValorAcumulado());
    }
    

}
