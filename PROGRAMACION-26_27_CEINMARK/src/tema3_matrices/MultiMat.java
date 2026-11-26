package tema3_matrices;

import java.util.Iterator;
import java.util.Scanner;

public class MultiMat {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		// DIMENSIONES DE A
		System.out.print("Nº de filas de A: ");
		int filas_A = teclado.nextInt();
		System.out.print("Nº de columnas de A: ");
		int columnas_A = teclado.nextInt();

		// DIMENSIONES DE B
		System.out.print("Nº de filas de B: ");
		int filas_B = teclado.nextInt();
		System.out.print("Nº de columnas de B: ");
		int columnas_B = teclado.nextInt();

		// Comprobamos obligación de "columnas de A == filas de B"
		if (columnas_A != filas_B) {
			System.out.println(
					"\nERROR: No se pueden multiplicar. B tiene que tener tantas filas como columnas tiene A!!");
			teclado.close();
			return; // termine la ejecucion del programa
		}

		// Definimos las matrices
		int[][] A = new int[filas_A][columnas_A];
		int[][] B = new int[filas_B][columnas_B];
		// La matriz resultado tendrá [filas_A][columnas_B]
		int[][] R = new int[filas_A][columnas_B];

		// Rellenar matriz A
		System.out.println("\n--- DATOS DE LA MATRIZ A ---");
		for (int i = 0; i < filas_A; i++) {
			for (int j = 0; j < columnas_A; j++) {
				System.out.print("A[" + i + "][" + j + "]:");
				A[i][j] = teclado.nextInt();
			}
		}

		// Rellenar matriz B
		System.out.println("\n--- DATOS DE LA MATRIZ B ---");
		for (int i = 0; i < filas_B; i++) {
			for (int j = 0; j < columnas_B; j++) {
				System.out.print("B[" + i + "][" + j + "]:");
				B[i][j] = teclado.nextInt();
			}
		}

		// Multiplicación de matrices (3 bucles seguidos)
		// 1º recorrer filas de A
		// 2º recorrer columnas de B
		// 3º recorrer los elementos a multiplicar y sumar
		for (int i = 0; i < filas_A; i++) {
			for (int j = 0; j < columnas_B; j++) {
				for (int k = 0; k < columnas_A; k++) {
					R[i][j] += A[i][k] * B[k][j];
				}
			}
		}

		// Mostrar matriz resultado (R)
		System.out.println("\n--- MATRIZ RESULTADO ---");
		for (int i = 0; i < filas_A; i++) {
			for (int j = 0; j < columnas_B; j++) {
				System.out.print(R[i][j] + "\t");
			}
			System.out.println("\n");
		}
		teclado.close();
		System.out.println();
	}
}
