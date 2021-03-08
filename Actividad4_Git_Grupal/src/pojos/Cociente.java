package pojos;

public class Cociente {
	
	public Cociente() {
	}

	public double DivisionDosReales (double a, double b){
		double DivisionDosReales = a / b;
		return DivisionDosReales;
	}
	
	public double DivisionDosEnteros (double c, double d){
		double DivisionDosEnteros = c / d;
		return DivisionDosEnteros;
	}
	
	public double InversoReal (double invR) {
		double DivisionDosEnteros = 1 / invR;
		return DivisionDosEnteros;
	}
	
	public double RaizNumero (double raizn) {
		double RaizNumero = Math.sqrt(raizn);
		return RaizNumero;
	}

}