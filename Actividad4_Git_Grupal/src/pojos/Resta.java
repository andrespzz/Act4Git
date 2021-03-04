package pojos;

public class Resta {

	private double numRestaR1;
	private double numRestaR2;
	private int numRestaE1;
	private int numRestaE2;
	private double numRestaR3;
	private double numRestaR4;
	private double numRestaR5;
	private double valorAcumuladoResta;
	
	public Resta(double numRestaR1, double numRestaR2, int numRestaE1, int numRestaE2, double numRestaR3,
			double numRestaR4, double numRestaR5, double valorAcumuladoResta) {
		this.numRestaR1 = numRestaR1;
		this.numRestaR2 = numRestaR2;
		this.numRestaE1 = numRestaE1;
		this.numRestaE2 = numRestaE2;
		this.numRestaR3 = numRestaR3;
		this.numRestaR4 = numRestaR4;
		this.numRestaR5 = numRestaR5;
		this.valorAcumuladoResta = valorAcumuladoResta;
	}
	
	
	public double RestaDosReales() {
		double restaDosReales = numRestaR1 - numRestaR2;
		valorAcumuladoResta += restaDosReales;
		return restaDosReales;
	}
	
	public int RestaDosEnteros() {
		int restaDosEnteros = numRestaE1 - numRestaE2;
		valorAcumuladoResta += restaDosEnteros;
		return restaDosEnteros;
	}
	
	public double RestaTresEnteros() {
		double restaTresReales = numRestaR3 - numRestaR4 - numRestaR5;
		valorAcumuladoResta += restaTresReales;
		return restaTresReales;
	}
	
	public double valorAcumulado() {
		return valorAcumuladoResta;
	}
}

