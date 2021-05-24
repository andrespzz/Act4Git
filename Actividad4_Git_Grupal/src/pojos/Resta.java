package pojos;
/**
 * 
 * @author javim
 * @version 1.0
 *
 */

public class Resta {

	private double a;
	private double b;
	private int c;
	private int d;
	private double e;
	private double f;
	private double g;
	
	
	
	public double getA() {
		return a;
	}


	public void setA(double a) {
		this.a = a;
	}


	public double getB() {
		return b;
	}


	public void setB(double b) {
		this.b = b;
	}


	public int getC() {
		return c;
	}


	public void setC(int c) {
		this.c = c;
	}


	public int getD() {
		return d;
	}


	public void setD(int d) {
		this.d = d;
	}


	public double getE() {
		return e;
	}


	public void setE(double e) {
		this.e = e;
	}


	public double getF() {
		return f;
	}


	public void setF(double f) {
		this.f = f;
	}


	public double getG() {
		return g;
	}


	public void setG(double g) {
		this.g = g;
	}


	public double getValorAcumuladoResta() {
		return valorAcumuladoResta;
	}


	public void setValorAcumuladoResta(double valorAcumuladoResta) {
		this.valorAcumuladoResta = valorAcumuladoResta;
	}


	private double valorAcumuladoResta;
	public Resta() {

	}
	
	
	 /**
	 *El método <i>RestaDosReales</i> resta dos números reales.</br> 
	 * <b>Ej:</b> 6.9 <b> x </b> 4.1
	 * @param a Representa el primer número.
	 * @param b Representa el segundo número.
	 * @return Retorna el producto de los parámetros introducidos (a <b>-</b> b).
	 */
	public double RestaDosReales(double a, double b) {
		double restaDosReales = a - b;
		valorAcumuladoResta += restaDosReales;
		return restaDosReales;
	}
	
	
	/**
     * El método <i>RestaDosEnteros</i> resta dos números enteros.</br> 
	 * <b>Ej:</b> 5 <b> x </b> 4
	 * @param c Representa el primer número entero.
	 * @param d Representa el segundo número entero.
	 * @return Retorna el producto de los dos parámetros introducidos (c <b>-</b> d).
	 */
	public int RestaDosEnteros(int c, int d) {
		int restaDosEnteros = c - d;
		valorAcumuladoResta += restaDosEnteros;
		return restaDosEnteros;
	}

	
	/**
	 * El método <i> RestaTresReales</i> resta tres números reales.</br> 
	 * <b>Ej:</b> 12.5 <b> x </b> 4.2 <b> x </b> 1.2
	 * @param e Representa el primer número real.
	 * @param f Representa el segundo número real.
	 * @param g Representa el tercer número real.
	 * @return Retorna el producto de los tres parámetros anteriores (e <b>-</b> f <b>-</b> g).
	 */
	public double RestaTresReales(double e, double f, double g) {
		double restaTresReales = e - f - g;
		valorAcumuladoResta += restaTresReales;
		return restaTresReales;
	}

	
	/**
	 * El método <i>valorAcumulado</i> resta tres números reales.</br> 
	 * @return valorAcumuladoResta
	 */
	public double valorAcumulado() {
		return valorAcumuladoResta;
	}
}

