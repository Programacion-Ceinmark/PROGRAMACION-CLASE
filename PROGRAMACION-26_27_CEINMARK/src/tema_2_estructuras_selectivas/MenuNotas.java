package tema_2_estructuras_selectivas;

import java.util.Scanner;

public class MenuNotas {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		//
		// double nota = teclado.nextDouble();
		boolean notaValida = false;
		double nota = -1;

		// El bucle se repite hasta que el usuario introduce un dato correcto
		while (!notaValida) {
			System.out.println("Introduce la nota del alumno (0 a 10): ");

			// 1. Comprobamos si lo que mete es un nº
			if (teclado.hasNextDouble()) {
				nota = teclado.nextDouble();
				// 2. Comprobar si el nº esta dentro del rango permitido (de 0 a 10)
				if (nota >= 0 && nota <= 10) {
					notaValida = true; // dato correcto, cambiamos la condicion para salir del bucle.
				} else {
					System.out.println("Error: La nota no está en el rango permitido, INTENTALO DE NUEVO");
				}
			} else {
				// si mete texto, letras, simbolos, algo que no sea numero:
				System.out.println("Error: No has introducido un nº valido. INTENTALO DE NUEVO");
				teclado.next();
			}
		}
		// Una vez asegurado que le metemos un numero correcto:
		// forzamos a que la nota sea un entero para usar el switch
		int nota_int = (int) nota;
		System.out.println("NOTA INTRODUCIDA: " + nota_int);
		switch (nota_int) {

		case 0:
		case 1:
		case 2:
			System.out.println("MUY DEFICIENTE");
			break;

		case 3:
		case 4:
			System.out.println("INSUFICIENTE");
			break;

		case 5:
			System.out.println("SUFICIENTE");
			break;

		case 6:
			System.out.println("BIEN");
			break;

		case 7:
		case 8:
			System.out.println("NOTABLE");
			break;

		case 9:
		case 10:
			System.out.println("SOBRESALIENTE");
			break;

		default:
			System.out.println("NOTA MAL INTRODUCIDA");
			break;
		}

		teclado.close();
	}
}
