package tema3_matrices;

import java.util.Scanner;

public class ArraySum {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		// Solicitar las dimensiones de la matriz
		System.out.println("Introducir el nº de filas: ");
		int filas = teclado.nextInt();
		System.out.println("Introducir el nº de columnas: ");
		int columnas = teclado.nextInt();
		
		int[][] matriz = new int[filas][columnas];
		int[] sumaFilas = new int[filas];
		
		// Rellenamos la matriz por teclado y aprovechamos para hacer la suma de cada fila
		System.out.println("\n--- Introduce los elementos de la matriz ---");
		for (int i = 0; i < filas; i++) {
			System.out.println("Fila " + i);
			int resultadoFila = 0;
			for (int j = 0; j < columnas; j++) {
				System.out.print("\tElemento [" + i + "][" + j + "]: ");
				matriz[i][j] = teclado.nextInt();
				resultadoFila += matriz[i][j];
			}
			sumaFilas[i] = resultadoFila; // Guarda el resultado total de la fila en el array
		}
		
		// Mostramos el contenido del array que queda
		System.out.println("\n-- SUMA DE CADA FILA ---");
		for (int i = 0; i < sumaFilas.length; i++) {
			System.out.println("Fila " + i + ": " + sumaFilas[i]);
		}
		teclado.close();
	}
}
