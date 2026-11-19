package tema_2_estructuras_selectivas;

import java.util.Scanner;

public class Menudias {
	public static void main(String[] args) {

		// definimos el scanner y la variable opcion
		Scanner teclado = new Scanner(System.in);
		char letra;
		do {

			// FORMATO DEL MENÚ
			System.out.println("L -> Lunes ");
			System.out.println("M -> Martes");
			System.out.println("X -> Miércoles");
			System.out.println("J -> Jueves");
			System.out.println("V -> Viernes");
			System.out.println("S -> Sábado");
			System.out.println("D -> Domingo");
			System.out.println("Introduce una letra para el día de la semana:");

			// registrar la letra introducida
			letra = teclado.next().toUpperCase().charAt(0);

			// defino un if que mira si lo que se introduce es una letra sí o sí
			if (Character.isLetter(letra)) {

				// montamos el switch
				switch (letra) {

				case 'L':
					System.out.println("Lunes");
					break;

				case 'M':
					System.out.println("Martes");
					break;

				case 'X':
					System.out.println("Miércoles");
					break;

				case 'J':
					System.out.println("Jueves");
					break;

				case 'V':
					System.out.println("Viernes");
					break;

				case 'S':
					System.out.println("Sábado");
					break;

				case 'D':
					System.out.println("Domingo");
					break;

				default:
					System.out.println("LETRA INTRODUCIDA INCORRECTA!!");
				}
			} else {
				System.out.println("No has introducido una letra, mete el dato en conciones.");
			}
		} while (Character.isLetter(letra) || !Character.isLetter(letra));
	}
}
