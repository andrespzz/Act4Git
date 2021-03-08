package main;

import pojos.Cociente;
import pojos.Producto;
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
		Producto producto = new Producto();
		
		System.out.println("Producto dos números reales: " + producto.productoNumerosReales(50.50, 2.50));
		System.out.println("Producto dos números enteros: " + producto.productoNumerosEnteros(100, 2));
		System.out.println("Producto tres números reales: " + producto.productoNumerosReales2(50.75, 20.50, 100.01));
		System.out.println("Potencia de un número: " + producto.potencia(50, 7));

		// división - julia
		Cociente division = new Cociente();
		System.out.println("División dos números reales: " + division.DivisionDosReales(150.50, 5.70));
		System.out.println("División dos números enteros: " + division.DivisionDosEnteros(70, 2));
		System.out.println("División inverso real: " + division.InversoReal(150));
		System.out.println("Raíz de un número: " + division.RaizNumero(50));
	}

}
