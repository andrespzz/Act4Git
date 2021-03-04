package pojos;

public class Suma {
	private double numSumaR1;
	private double numSumaR2;
	private int numSumaE1;
	private int numSumaE2;
	private double numSumaR3;
	private double numSumaR4;
	private double numSumaR5;
	private double valorAcumulado;

	//CONSTRUCTOR
	public Suma(double numSumaR1, double numSumaR2, int numSumaE1, int numSumaE2, double numSumaR3, double numSumaR4,
			double numSumaR5, double valorAcumulado) {
		this.numSumaR1 = numSumaR1;
		this.numSumaR2 = numSumaR2;
		this.numSumaE1 = numSumaE1;
		this.numSumaE2 = numSumaE2;
		this.numSumaR3 = numSumaR3;
		this.numSumaR4 = numSumaR4;
		this.numSumaR5 = numSumaR5;
		this.valorAcumulado = valorAcumulado;
	}
	
	public double SumaDosReales (){
		double SumaDosReales = numSumaR1 + numSumaR2;
		valorAcumulado += SumaDosReales;
		return SumaDosReales;
	}
	
	public double SumaDosEnteros (){
		double SumaDosEnteros = numSumaE1 + numSumaE2;
		valorAcumulado += SumaDosEnteros;
		return SumaDosEnteros;
	}
	
	public double SumaTresReales (){
		double SumaTresReales = numSumaR3 + numSumaR4 + numSumaR5;
		valorAcumulado += SumaTresReales;
		return SumaTresReales;
	}
	
	public double ValorAcumulado () {
		return valorAcumulado;
	}
}