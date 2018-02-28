package Tarea3;

import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio2 {
	// Declaraci�n de variables
	static int suma = 0;

	public boolean punto(boolean excepciones) {
		Scanner sc = new Scanner(System.in);
		String entrada = sc.nextLine();
		StringBuilder textoFinal = new StringBuilder();
		String cadena = "";
		char caracterNuevo = 'a';
		char[] arrEntrada = entrada.toCharArray();
		// Proceso
		ArrayList<Character> caracteres = new ArrayList<Character>();
		// A�adimos los caracteres en el array
		for (char elto : arrEntrada) {
			caracteres.add(elto);
		}
		int longitud = caracteres.size();
		// Recorre el array
		for (int j = 0; j < longitud; j++) {
			// Identifica los puntos
			if (caracteres.get(j) == '.') {
				caracterNuevo = caracteres.get(j + 1);
				cadena = Character.toString(caracterNuevo);
				String mayuscula = cadena.toUpperCase();
				// Se a�aden los caracteres uno por uno al texto
				textoFinal.append(caracteres.get(j));
				textoFinal.append(mayuscula);
			} else {
				textoFinal.append(caracteres.get(j));
			}
		}
		// Salida
		System.out.println(textoFinal);
		return true;
	}

	public static void main(String[] args) {
		// Llamada al m�todo
		ejercicio2 llamada = new ejercicio2();
		llamada.punto(true);

	}
}
