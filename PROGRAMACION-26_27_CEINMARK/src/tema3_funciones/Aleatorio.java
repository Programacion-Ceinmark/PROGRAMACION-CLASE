package tema3_funciones;

import java.util.Random;

public class Aleatorio {

	static int pares = 0;
	static int impares = 0;

	public static void generarNumsAleatorios() {
		Random numAleatorio = new Random();

		for (int i = 0; i < 10; i++) {
			int numGenerado = numAleatorio.nextInt(1000); // genera 1 numero entre 0 y 999
			System.out.print(numGenerado + " ");

			if (Par.esPar(numGenerado)) {
				pares++;
			} else {
				impares++;
			}
		}
	}

	public static void mostrarResultados() {
		System.out.println("\nTotal números pares: " + pares);
		System.out.println("\nTotal números impares: " + impares);
	}

	public static void main(String[] args) {
		generarNumsAleatorios();
		mostrarResultados();
	}
}
