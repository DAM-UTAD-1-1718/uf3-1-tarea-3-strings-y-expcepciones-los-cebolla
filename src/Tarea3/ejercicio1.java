package Tarea3;

import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio1 {
	// Declaración de variables
	static int suma = 0;

	public boolean sumaDeNumeros(boolean excepciones) {
		Scanner sc = new Scanner(System.in);
		String entrada = sc.nextLine();
		int numero = 0;

		ArrayList<Integer> caracteres = new ArrayList<Integer>();
		// Proceso
		for (int i = 0; i < entrada.length(); i++) {
			// Comprobamos si lo introducido es un número
			try {
				numero = Integer.parseInt("" + entrada.charAt(i));
				caracteres.add(numero);

			} catch (NumberFormatException ex) {

			}
		}
		// Recorre la lista y suma los números
		int longitud = caracteres.size();
		for (int j = 0; j < longitud; j++) {
			numero = caracteres.get(j);
			suma += numero;
		}

		return true;
	}

	// Salida
	public static void main(String[] args) {
		System.out.println("Introduce una cadena con numeros y letras");
		ejercicio1 sumaNumeros = new ejercicio1();
		sumaNumeros.sumaDeNumeros(true);
		System.out.println("la suma de los numeros es " + suma);
	}
}
