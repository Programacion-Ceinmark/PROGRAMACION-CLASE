package tema3_arrays_STRINGS_CHARS;

import java.util.Iterator;
import java.util.Scanner;

public class Ej10_Contar_Frase {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String[] frutas = { "Manzana", "Pera", "Manzana", "Naranja", "Plátano", "Manzana", "Pera" };

		// Pedimos nombre de la fruta y la guardo
		System.out.println("Introduce una fruta para contar cuántas hay");
		String frutaIntroducida = teclado.nextLine();

		int contador = 0;
		
		for (int i = 0; i < frutas.length; i++) {
			if(frutas[i].equalsIgnoreCase(frutaIntroducida)) {
				contador++;
			}
		}
		
		// Mostrar resultado
		System.out.println("La fruta '" + frutaIntroducida + "' aparece " + contador + " veces.");
		teclado.close();
	}
}
