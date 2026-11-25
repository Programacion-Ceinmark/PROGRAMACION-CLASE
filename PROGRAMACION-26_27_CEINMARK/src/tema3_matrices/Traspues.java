package tema3_matrices;

import java.util.Scanner;

public class Traspues {
	public static void main(String[] args) {
		// pedimos las dimensiones de la matriz
		Scanner teclado = new Scanner(System.in);

		// Solicitar las dimensiones de la matriz
		System.out.println("Introducir el nº de filas: ");
		int filas = teclado.nextInt();
		System.out.println("Introducir el nº de columnas: ");
		int columnas = teclado.nextInt();

		int[][] original = new int[filas][columnas];
		int[][] invertida = new int[columnas][filas];

		// Insertamos datos a la matriz original
		System.out.println("\n--- Introduce los datos de la matriz ---");
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				System.out.print("\tElemento [" + i + "][" + j + "]: ");
				original[i][j] = teclado.nextInt();
			}
		}

		// Proceso de trasposición: intercambiar filas por columnas
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				invertida[j][i] = original[i][j];
			}
		}

		// Mostramos la matriz original
		System.out.println("\n--- MATRIZ ORIGINAL ---");
		for (int i = 0; i < original.length; i++) {
			for (int j = 0; j < original[0].length; j++) {
				System.out.print(original[i][j] + "\t");
			}
			System.out.println("\n");
		}
		
		// Mostramos la matriz invertida
		System.out.println("\n--- MATRIZ TRASPUESTA ---");
		for (int i = 0; i < invertida.length; i++) {
			for (int j = 0; j < invertida[0].length; j++) {
				System.out.print(invertida[i][j] + "\t");
			}
			System.out.println("\n");
		}

		teclado.close();
	}
}
