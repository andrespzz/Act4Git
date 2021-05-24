package pojos;

/**
 * 
 * @author Julia
 * @version 1.0
 *
 */

public class Cociente {
	
	//ATRIBUTOS
	private double DivisionDosReales;
	private int DivisionDosEnteros;
	private double InversoReal;
	private double RaizNumero;
	private double a;
	private double b;
	private int c;
	private int d;
	private double invR;
	private double raizn;
	private double uno;
	
	//CONSTRUCTORES
	public Cociente () {
	}

	//GET Y SET
	
	public double getDivisionDosReales() {
		return DivisionDosReales;
	}

	public double getUno() {
		return uno;
	}

	public void setUno(double uno) {
		this.uno = uno;
	}

	public void setDivisionDosReales(double divisionDosReales) {
		DivisionDosReales = divisionDosReales;
	}

	public double getDivisionDosEnteros() {
		return DivisionDosEnteros;
	}

	public void setDivisionDosEnteros(int divisionDosEnteros) {
		DivisionDosEnteros = divisionDosEnteros;
	}

	public double getInversoReal() {
		return InversoReal;
	}

	public void setInversoReal(double inversoReal) {
		InversoReal = inversoReal;
	}

	public double getRaizNumero() {
		return RaizNumero;
	}

	public void setRaizNumero(double raizNumero) {
		RaizNumero = raizNumero;
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

	public double getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	public double getD() {
		return d;
	}

	public void setD(int d) {
		this.d = d;
	}

	public double getInvR() {
		return invR;
	}

	public void setInvR(double invR) {
		this.invR = invR;
	}

	public double getRaizn() {
		return raizn;
	}

	public void setRaizn(double raizn) {
		this.raizn = raizn;
	}
	
	//TO STRING
	@Override
	public String toString() {
		return "Cociente [DivisionDosReales=" + DivisionDosReales + ", DivisionDosEnteros=" + DivisionDosEnteros
				+ ", InversoReal=" + InversoReal + ", RaizNumero=" + RaizNumero + "]";
	}

	//MÉTODOS
	/**
	 * El metodo <i>DivisionDosReales</i> divide dos numeros reales. </br>
	 * <b>Ej:</b> 26 <b> :  </b> 2
	 * @param a Representa el primer numero
	 * @param b Representa el segundo numero
	 * @return Devuelve la división de los valores introducidos (a <b>:</b> b).
	 */
	public double DivisionDosReales (double a, double b){
		DivisionDosReales = a / b;
		return DivisionDosReales;
	}

	/**
	 * El metodo <i>DivisionDosEnteros</i> divide dos numeros enteros. </br>
	 * <b>Ej:</b> 10 <b> :  </b> 5
	 * @param c Representa el primer numero
	 * @param d Representa el segundo numero
	 * @return Devuelve la division de los valores introducidos (a <b>:</b> b).
	 */
	public int DivisionDosEnteros (int c, int d){
		DivisionDosEnteros = c / d;
		return DivisionDosEnteros;
	}

	/**
	 * El metodo <i>InversoReal</i> calcula el numero inverso. </br>
	 * @param invR Representa el numero a invertir
	 * @return Devuelve el numero inverso calculado
	 */
	public double InversoReal (double invR) {
		double uno = 1;
		InversoReal = uno / invR;
		return InversoReal;
	}
	
	/**
	 * El metodo <i>RaizNumero</i> calcula la raiz cuadrada de un numero. </br>
	 * <b>Ej:</b> 2 <b> (2) =  </b> 4
	 * @param raizn Representa el numero para calcular su raiz
	 * @return Devuelve la raiz cuadrada calculada
	 */
	public double RaizNumero (double raizn) {
		RaizNumero = Math.sqrt(raizn);
		return RaizNumero;
	}

}