package pojos;

/**
 * Esta clase realiza varios tipos de multiplicación.
 * 
 * @author Andrés Pérez
 * @version 1.0
 *
 */
public class Producto {

	private double a;
	private double b;
	private int c;
	private int d;
	private double e;
	private double f;
	private double g;
	private double pot1;
	private double pot2;

	public Producto() {
	}

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

	public double getPot1() {
		return pot1;
	}

	public void setPot1(double pot1) {
		this.pot1 = pot1;
	}

	public double getPot2() {
		return pot2;
	}

	public void setPot2(double pot2) {
		this.pot2 = pot2;
	}

	/**
	 * El método <i>productoNumerosReales</i> multiplica dos números reales.</br>
	 * <b>Ej:</b> 6.9 <b> x </b> 4.1
	 * 
	 * @param i
	 * @param h
	 * @param a Representa el primer número.
	 * @param b Representa el segundo número.
	 * @return Retorna el producto de los parámetros introducidos (a <b>x</b> b).
	 */
	public double productoNumerosReales(double a, double b) {
		double totalProd1 = a * b;
		return totalProd1;
	}

	/**
	 * El método <i>productoNumerosEnteros</i> multiplica dos números enteros.</br>
	 * <b>Ej:</b> 5 <b> x </b> 4
	 * 
	 * @param c Representa el primer número entero.
	 * @param d Representa el segundo número entero.
	 * @return Retorna el producto de los dos parámetros introducidos (c <b>x</b>
	 *         d).
	 */
	public int productoNumerosEnteros(int c, int d) {
		int totalProdEnteros = c * d;
		return totalProdEnteros;
	}

	/**
	 * El método <i>productoNumerosReales2</i> multiplica tres números reales.</br>
	 * <b>Ej:</b> 12.5 <b> x </b> 4.2 <b> x </b> 1.2
	 * 
	 * @param e Representa el primer número real.
	 * @param f Representa el segundo número real.
	 * @param g Representa el tercer número real.
	 * @return Retorna el producto de los tres parámetros anteriores (e <b>x</b> f
	 *         <b>x</b> g).
	 */
	public double productoNumerosReales2(double e, double f, double g) {
		double totalProdReales2 = e * f * g;
		return totalProdReales2;
	}

	/**
	 * El método <i>potencia</i> realiza la potencia de los parámetros
	 * introducidos.</br>
	 * <b>Ej:</b> 6 <b> x </b> 4
	 * 
	 * @param pot1 Representa el primer número.
	 * @param pot2 Representa el segundo número.
	 * @return Retorna el cálculo de una potencia (pot1 <b>x</b> pot2).
	 */
	public double potencia(double pot1, double pot2) {
		double totalPotencia = Math.pow(pot1, pot2);
		return totalPotencia;
	}

}
