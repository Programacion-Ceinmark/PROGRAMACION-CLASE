package tema3_matrices;

import java.util.Scanner;

public class Diagonal {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		// Solicitamos un único tamaño porque la matriz es cuadrada (filas == columnas)
		System.out.print("Introduce el tamaño de la matriz cuadrada: ");
		int n = teclado.nextInt();

		int[][] m = new int[n][n];
		int sumaDiagonal = 0;

		// Rellenamos la matriz
		System.out.println("\n--- Introduce los datos ---");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("Elemento [" + i + "][" + j + "]: ");
				m[i][j] = teclado.nextInt();
			}
		}

		// Mostramos la matriz
		System.out.println("\n--- MATRIZ COMPLETA ---");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(m[i][j] + "\t");
			}
			System.out.println("\n");
		}
		
		// Recorremos y mostramos la diagonal principal (desde m[0][0] hasta m[n][n])
		System.out.println("\n--- DIAGONAL PRINCIPAL ---");
		System.out.print("Elementos:");
		for (int i = 0; i < n; i++) {
			System.out.print(m[i][i] + " ");
			sumaDiagonal += m[i][i]; // Acumulamos el valor de la suma
		}
		
		// Mostramos el total de la diagonal
		System.out.println("\nSuma de la diagonal: " + sumaDiagonal);
		teclado.close();
		
	}
}
