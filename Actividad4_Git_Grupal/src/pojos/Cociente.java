package pojos;

public class Cociente {
	private double numCocienteR1;
	private double numCocienteR2;
	private int numCocienteE1;
	private int numCocienteE2;
	private double numCocienteR3;
	private double numCocienteR4;
	
	//CONSTRUCTOR
	public Cociente(double numCocienteR1, double numCocienteR2, int numCocienteE1, int numCocienteE2, double numCocienteR3) {
		this.numCocienteR1 = numCocienteR1;
		this.numCocienteR2 = numCocienteR2;
		this.numCocienteE1 = numCocienteE1;
		this.numCocienteE2 = numCocienteE2;
		this.numCocienteR3 = numCocienteR3;
	}
	
	public double DivisionDosReales (){
		double DivisionDosReales = numCocienteR1 / numCocienteR2;
		return DivisionDosReales;
	}
	
	public double DivisionDosEnteros (){
		double DivisionDosEnteros = numCocienteE1 / numCocienteE2;
		return DivisionDosEnteros;
	}
	
	public double InversoReal () {
		double DivisionDosEnteros = 1 / numCocienteR3;
		return DivisionDosEnteros;
	}
	
	public double RaizNumero () {
		double RaizNumero = Math.sqrt(numCocienteR4);
		return RaizNumero;
	}

}