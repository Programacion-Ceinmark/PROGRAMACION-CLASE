package tema3_arrays_STRINGS_CHARS;

import java.util.Scanner;

public class BuscadorNombres {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		String[] nombres = { "Jon", "Dani", "Armen", "Gorka", "Xabi" };

		System.out.println("Introduce un nombre a buscar: ");
		String nombre_introducido = teclado.nextLine();

		// defino una variable booleana para controlar si ha encontrado o no el nombre
		boolean encontrado = false;

		// Recorro el array comparando el nombre introducido con cada uno de la lista
		for (int i = 0; i < nombres.length; i++) {
			if (nombres[i].equalsIgnoreCase(nombre_introducido)) {
			
				encontrado = true;
				break; //  salimos del bucle en cuanto encuentra el nombre
			}
		}
		if (encontrado) {
			System.out.println("El nombre " + nombre_introducido + " SÍ está en la lista.");
		} else {
			System.out.println("El nombre " + nombre_introducido + "NO ESTÁ en la lista.");
		}
		teclado.close();
	}

}
