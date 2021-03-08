package pojos;

public class Producto {

	public double productoNumerosReales(double a, double b) {
		double totalProd1 = a * b;
		return totalProd1;
	}

	public int productoNumerosEnteros(int c, int d) {
		int totalProdEnteros = c * d;
		return totalProdEnteros;
	}

	public double productoNumerosReales2(double e, double f, double g) {
		double totalProdReales2 = e * f * g;
		return totalProdReales2;
	}

	public double potencia(double pot1, double pot2) {
		double totalPotencia = Math.pow(pot1, pot2);
		return totalPotencia;
	}

}
