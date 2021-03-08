package pojos;

public class Suma {

	private double valorAcumulado;

	public Suma() {
	}

	public double SumaDosReales(double d, double e) {
		double SumaDosReales = d + e;
		valorAcumulado += SumaDosReales;
		return SumaDosReales;
	}

	public double SumaDosEnteros(double f, double g) {
		double SumaDosEnteros = f + g;
		valorAcumulado += SumaDosEnteros;
		return SumaDosEnteros;
	}

	public double SumaTresReales(double h, double i, double j) {
		double SumaTresReales = h + i + j;
		valorAcumulado += SumaTresReales;
		return SumaTresReales;
	}

	public double ValorAcumulado() {
		return valorAcumulado;
	}
}