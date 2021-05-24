package main;

import pojos.Cociente;
import pojos.Producto;
import pojos.Resta;
import pojos.Suma;

public class Calculadora {

	public static void main(String[] args) {
		// suma - diego
		Suma suma = new Suma();

		System.out.println("**SUMAS**");
		
		System.out.println("Suma dos n�meros reales: " + suma.SumaDosReales(13.25, 65.50) + " Valor acumulado: " + suma.ValorAcumulado());
		System.out.println("Suma dos n�meros enteros: " + suma.SumaDosEnteros(50, 60)+ " Valor acumulado: " + suma.ValorAcumulado());
		System.out.println("Suma tres n�meros reales: " + suma.SumaTresReales(100.50, 200.50, 1000.01)+ " Valor acumulado: " + suma.ValorAcumulado());

		// resta - javi
		Resta resta = new Resta();

		System.out.println("\n**RESTAS**");
		System.out.println("Resta dos n�meros reales: " + resta.RestaDosReales(145.00, 65.50) + " Valor acumulado: " + resta.valorAcumulado());
		System.out.println("Resta dos n�meros enteros: " + resta.RestaDosEnteros(100, 60)+ " Valor acumulado: " + resta.valorAcumulado());
		System.out.println("Resta tres n�meros reales: " + resta.RestaTresReales(100.50, 7.50, 10.25)+ " Valor acumulado: " + resta.valorAcumulado());

		// producto - andr�s
		Producto producto = new Producto();
		
		System.out.println("\n**PRODUCTOS**");
		System.out.println("Producto dos n�meros reales: " + producto.productoNumerosReales(50.50, 2.50));
		System.out.println("Producto dos n�meros enteros: " + producto.productoNumerosEnteros(100, 2));
		System.out.println("Producto tres n�meros reales: " + producto.productoNumerosReales2(50.75, 20.50, 100.01));
		System.out.println("Potencia de un n�mero: " + producto.potencia(50, 7));

		// divisi�n - julia
		Cociente division = new Cociente();
		System.out.println("\n**DIVISIONES Y RAIZ CUADRADA**");
		System.out.println("Divisi�n dos n�meros reales: " + division.DivisionDosReales(150.50, 5.70));
		System.out.println("Divisi�n dos n�meros enteros: " + division.DivisionDosEnteros(70, 2));
		System.out.println("Divisi�n inverso real: " + division.InversoReal(150));
		System.out.println("Ra�z de un n�mero: " + division.RaizNumero(50));
	}

}
