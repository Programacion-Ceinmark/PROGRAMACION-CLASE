package tema_2;

import java.util.Scanner;

public class NotaValida {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		// pedimos la nota
		System.out.println("Introduce una nota");
		double nota = teclado.nextDouble();
		
		// Verifico sí está dentro del intervalo de notas [0-10]
		if (nota >= 0 && nota <= 10 ) {
			System.out.println("La nota es válida");
		} else {
			System.out.println("La nota no es válida");
		}
		teclado.close();
		
		

	}

}
