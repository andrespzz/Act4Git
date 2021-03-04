package main;

import java.util.Scanner;

public class Calculadora {
	
	static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		boolean continuar = true;
		int opcion;
		while (continuar) {
            opcion = solicitarOpcion();

            switch (opcion) {
            case 1:
                //añadirCd();
                break;
            case 2:
                //mostrarListadoCds();
                break;
            case 0:
                continuar = false;
                System.out.println("Saliendo de la App...");
                break;
            }
        }
	}

	private static int solicitarOpcion() {
		int opcion = -1;

        do {
            try {
                System.out.println("Indica que desea realizar: " + "\n1 - Sumar"
                        + "\n2 - Restar" + "\n3 - Multplicar" + "\n4 - Dividir o raiz cuadrada" + "\n0 - ");
                opcion = Integer.parseInt(sc.nextLine());

                if (opcion < 0 || opcion > 5) {
                    System.out.println("El valor introducido no es válido. Debe introducir 0, 1 o 2");
                }
            } catch (NumberFormatException e) {
                System.out.println("El valor introducido debe ser numérico");
            }
        } while (opcion < 0 || opcion > 4);

        return opcion;
	}

}
