package examen_modelo;

import java.util.Iterator;
import java.util.Scanner;

public class ClasificadorNotas {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		double[] notas = new double[5];

		System.out.println("=== GESTIÓN DE NOTAS ===");

		// a)
		for (int i = 0; i < notas.length; i++) {
			do {
				System.out.print("Introduce la nota " + (i + 1) + ":");
				notas[i] = teclado.nextDouble();

				if (notas[i] < 0 || notas[i] > 10) {
					System.out.println("Error: vuelve a introducir una nota valida (del 0 al 10)");
				}

			} while (notas[i] < 0 || notas[i] > 10);

		}

		// b)
		double suma = 0.0;
		double notaMaxima = notas[0];
		int aprobados = 0;
		int suspensos = 0;

		for (int i = 0; i < notas.length; i++) {
			suma += notas[i];

			if (notas[i] > notaMaxima) {
				notaMaxima = notas[i];
			}

			if (notas[i] >= 5.0) {
				aprobados++;

			} else {
				suspensos++;
			}
		}

		double media = suma / notas.length;

		System.out.printf("Nota media: %.2f\n", media);
		System.out.printf("Nota máxima: %.2f\n", notaMaxima);
		System.out.println("Aprobados: " + aprobados);
		System.out.println("Suspensos: " + suspensos);

		teclado.close();
	}
}
