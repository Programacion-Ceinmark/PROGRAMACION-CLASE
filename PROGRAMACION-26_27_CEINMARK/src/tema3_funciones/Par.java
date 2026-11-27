package tema3_funciones;

import java.util.Scanner;

public class Par {

	// Método esPar
	public static boolean esPar(int numero) {
		return numero % 2 == 0;

	}

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.print("Introduce un nº entero: ");
		int num = teclado.nextInt();

		// Usamos directamente la llamada a la función dentro del if
		if (esPar(num)) {
			System.out.println("El nº " + num + " es PAR.");
		} else {
			System.out.println("El nº " + num + " es IMPAR.");
		}
		teclado.close();
	}

}
