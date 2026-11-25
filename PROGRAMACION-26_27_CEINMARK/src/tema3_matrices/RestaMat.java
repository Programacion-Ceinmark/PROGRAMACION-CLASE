package tema3_matrices;

import java.util.Scanner;

public class RestaMat {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		// Solicitar las dimensiones de la matriz
		System.out.print("Introducir el nº de filas: ");
		int filas = teclado.nextInt();
		System.out.print("Introducir el nº de columnas: ");
		int columnas = teclado.nextInt();

		int[][] matriz_A = new int[filas][columnas];
		int[][] matriz_B = new int[filas][columnas];
		int[][] matriz_R = new int[filas][columnas];

		// Rellenar matriz A
		System.out.println("\n--- DATOS DE LA MATRIZ A ---");
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				System.out.print("A[" + i + "][" + j + "]:");
				matriz_A[i][j] = teclado.nextInt();
			}
		}

		// Rellenar matriz B
		System.out.println("\n--- DATOS DE LA MATRIZ B ---");
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				System.out.print("B[" + i + "][" + j + "]:");
				matriz_B[i][j] = teclado.nextInt();
			}
		}

		// Calculamos la suma posición a posición y la mostramos
		System.out.println("\n--- MATRIZ RESULTADO (A - B) ---");
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				matriz_R[i][j] = matriz_A[i][j] - matriz_B[i][j];
				System.out.print(matriz_R[i][j] + "\t");
			}
			System.out.println();
		}
		teclado.close();

	}
}
