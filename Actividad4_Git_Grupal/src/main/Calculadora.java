package main;

import pojos.Suma;

public class Calculadora {

	public static void main(String[] args) {
		// suma - andr�s
		Suma suma = new Suma();

		System.out.println("Suma dos n�meros reales: " + suma.SumaDosReales(13.25, 65.50) + " Valor acumulado: " + suma.ValorAcumulado());
		System.out.println("Suma dos n�meros enteros: " + suma.SumaDosEnteros(50, 60)+ " Valor acumulado: " + suma.ValorAcumulado());
		System.out.println("Suma tres n�meros reales: " + suma.SumaTresReales(100.50, 200.50, 1000.01)+ " Valor acumulado: " + suma.ValorAcumulado());

		// resta - diego

		// producto - javi

		// divisi�n - julia

	}

}
