package pojos;

public class Producto {
	private double numProdR1;
	private double numProdR2;
	private int numProdE3;
	private int numProdE4;
	private double numProdR3;
	private double numProdR4;
	private double numProdR5;
	private double potencia1;
	private double potencia2;

	public Producto(double numProdR1, double numProdR2, int numProdE3, int numProdE4, double numProdR3,
			double numProdR4, double numProdR5, double potencia1, double potencia2) {
		super();
		this.numProdR1 = numProdR1;
		this.numProdR2 = numProdR2;
		this.numProdE3 = numProdE3;
		this.numProdE4 = numProdE4;
		this.numProdR3 = numProdR3;
		this.numProdR4 = numProdR4;
		this.numProdR5 = numProdR5;
		this.potencia1 = potencia1;
		this.potencia2 = potencia2;

	}

	public double productoNumerosReales() {
		double totalProd1 = numProdR1 * numProdR2;
		return totalProd1;
	}

	public int productoNumerosEnteros() {
		int totalProdEnteros = numProdE3 * numProdE4;
		return totalProdEnteros;
	}

	public double productoNumerosReales2() {
		double totalProdReales2 = numProdR3 * numProdR4 * numProdR5;
		return totalProdReales2;
	}

	public double potencia() {
		double totalPotencia = Math.pow(potencia1, potencia2);
		return totalPotencia;
	}

}
