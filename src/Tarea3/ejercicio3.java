package Tarea3;

import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio3 {
	// Declaración de variables
	static int suma = 0;

	public boolean sumaDeNumeros(boolean excepciones) throws ExcepcionIntervalo {
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
		// Recorremos la lista y se suman los números
		int longitud = caracteres.size();
		for (int j = 0; j < longitud; j++) {
			numero = caracteres.get(j);
			suma += numero;
		}
		// Comprobamos si la suma es mayor a 20
		try {
			if (suma > 20)
				throw new ExcepcionIntervalo("Error fuera de rango: ");
		} catch (ExcepcionIntervalo ex) {
			System.out.println(ex.getMessage());
		}

		return true;
	}

	// Salida
	public static void main(String[] args) throws ExcepcionIntervalo {
		System.out.println("Introduce una cadena con numeros y letras");
		ejercicio3 sumaNumeros = new ejercicio3();
		sumaNumeros.sumaDeNumeros(true);
		System.out.println("la suma es " + suma);
	}
}

class ExcepcionIntervalo extends Exception {
	public ExcepcionIntervalo(String msg) {
		super(msg);
	}

}
