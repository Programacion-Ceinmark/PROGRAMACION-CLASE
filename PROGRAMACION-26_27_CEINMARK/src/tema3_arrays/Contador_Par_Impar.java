package tema3_arrays;

import java.util.Iterator;
import java.util.Scanner;

public class Contador_Par_Impar {

	public static void main(String[] args) {

		// Definimos un scanner para meter los valores del array
		Scanner teclado = new Scanner(System.in);

		// Definimos las variables y array para almacenar los números
		int[] numeros = new int[6];
		int[] numPares = new int[6];
		int[] numImpares = new int[6];
		
		int contador_Pares = 0;
		int contador_Impares = 0;

		// Lectura de los 6 nº que mete el usuario
		System.out.println("Introduce 6 nº enteros:");
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Número " + (i + 1) + ": ");
			numeros[i] = teclado.nextInt();
		}

		// Recorremos array para evaluar si es par (num % 2 == 0) o impar

		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] % 2 == 0) {
				contador_Pares++;
				for (int j = 0; j < numeros.length; j++) {
					numPares[j] = numeros[i];
				}
			} else {
				contador_Impares++;
				for (int k = 0; k < numeros.length; k++) {
					numImpares[k] = numeros[i];
				}
			}
		}

		// Mostramos la cantidad de nº-s que son par e impar
		System.out.println("--- RECUENTO ---");
		
		System.out.println("Cantidad de números pares: " + contador_Pares);
		
		System.out.println("Cantidad de números impares: " + contador_Impares);
		teclado.close();
	}
}
