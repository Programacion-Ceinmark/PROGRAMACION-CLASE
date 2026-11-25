package tema3_matrices;

public class Inicia2d {
	public static void main(String[] args) {
		// Definimos el tamaño de la matriz
		int filas = 5;
		int columnas = 8;
		char[][] matriz = new char[filas][columnas];

		// 1er bucle para inicializar la matriz
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				matriz[i][j] = 't';
			}
		}

		// 2do bucle para recorrer la matriz
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println(); // salto de línea por cada fila
		}
	}
}
