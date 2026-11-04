package tema3_arrays;

import java.util.Scanner;

public class BuscarNumero {
	public static void main(String[] args) {

		// Defino el scanner
		Scanner teclado = new Scanner(System.in);

		// Definir array con los números que queramos
		int[] lista = { 4, 8, 15, 16, 23, 42 };
		// Guardar el núm que nos piden
		System.out.println("Introduce un número para buscarlo: ");
		int buscado = teclado.nextInt();

		// Defino un booleano para controlar si se ha encontrado o no
		boolean encontrado = false;

		// Recorremos el array en busca del número introducido
		for (int i = 0; i < lista.length; i++) {
			if (lista[i] == buscado) {
				System.out.println("¡Número encontrado en la posición " + i + "!");
				encontrado = true;
				break; // se sale del for al encontrar dicho número
			}
		}

		// En caso de que no lo encuentra
		if (!encontrado) {
			System.out.println("El número " + buscado + " no existe en la lista.");
		}
		teclado.close();
	}
}
