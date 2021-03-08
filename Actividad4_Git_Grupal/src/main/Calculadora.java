package main;

import pojos.Suma;

public class Calculadora {

	public static void main(String[] args) {
		// suma - andrés
		Suma suma = new Suma();

		System.out.println("Suma dos números reales: " + suma.SumaDosReales(13.25, 65.50) + " Valor acumulado: " + suma.ValorAcumulado());
		System.out.println("Suma dos números enteros: " + suma.SumaDosEnteros(50, 60)+ " Valor acumulado: " + suma.ValorAcumulado());
		System.out.println("Suma tres números reales: " + suma.SumaTresReales(100.50, 200.50, 1000.01)+ " Valor acumulado: " + suma.ValorAcumulado());

		// resta - diego

		// producto - javi

		// división - julia

	}

}
