package pojos;

public class Resta {

	private double valorAcumuladoResta;

	public Resta() {

	}

	public double RestaDosReales(double a, double b) {
		double restaDosReales = a - b;
		valorAcumuladoResta += restaDosReales;
		return restaDosReales;
	}

	public int RestaDosEnteros(int c, int d) {
		int restaDosEnteros = c - d;
		valorAcumuladoResta += restaDosEnteros;
		return restaDosEnteros;
	}

	public double RestaTresReales(double e, double f, double g) {
		double restaTresReales = e - f - g;
		valorAcumuladoResta += restaTresReales;
		return restaTresReales;
	}

	public double valorAcumulado() {
		return valorAcumuladoResta;
	}
}

