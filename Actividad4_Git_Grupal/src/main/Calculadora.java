package main;

import pojos.Producto;
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
		Producto producto = new Producto();
		
		System.out.println("Producto dos n�meros reales: " + producto.productoNumerosReales(50.50, 2.50));
		System.out.println("Producto dos n�meros enteros: " + producto.productoNumerosEnteros(100, 2));
		System.out.println("Producto tres n�meros reales: " + producto.productoNumerosReales2(50.75, 20.50, 100.01));
		System.out.println("Potencia de un n�mero: " + producto.potencia(50, 7));

		// divisi�n - julia

	}

}
