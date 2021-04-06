package pojos;

/**
 * 
 * @author Julia
 * @version 1.0
 *
 */

public class Cociente {

	/**
	 * El metodo <i>DivisionDosReales</i> divide dos numeros reales. </br>
	 * <b>Ej:</b> 26 <b> :  </b> 2
	 * @param a Representa el primer numero
	 * @param b Representa el segundo numero
	 * @return Devuelve la división de los valores introducidos (a <b>:</b> b).
	 */
	public double DivisionDosReales (double a, double b){
		double DivisionDosReales = a / b;
		return DivisionDosReales;
	}
	
	/**
	 * El metodo <i>DivisionDosEnteros</i> divide dos numeros enteros. </br>
	 * <b>Ej:</b> 10 <b> :  </b> 5
	 * @param c Representa el primer numero
	 * @param d Representa el segundo numero
	 * @return Devuelve la division de los valores introducidos (a <b>:</b> b).
	 */
	public double DivisionDosEnteros (double c, double d){
		double DivisionDosEnteros = c / d;
		return DivisionDosEnteros;
	}
	
	/**
	 * El metodo <i>InversoReal</i> calcula el numero inverso. </br>
	 * @param invR Representa el numero a invertir
	 * @return Devuelve el numero inverso calculado
	 */
	public double InversoReal (double invR) {
		double InversoReal = 1 / invR;
		return InversoReal;
	}
	
	/**
	 * El metodo <i>RaizNumero</i> calcula la raiz cuadrada de un numero. </br>
	 * <b>Ej:</b> 2 <b> (2) =  </b> 4
	 * @param raizn Representa el numero para calcular su raiz
	 * @return Devuelve la raiz cuadrada calculada
	 */
	public double RaizNumero (double raizn) {
		double RaizNumero = Math.sqrt(raizn);
		return RaizNumero;
	}

}