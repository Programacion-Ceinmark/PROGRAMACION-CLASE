package tema_2_estructuras_selectivas;

import java.util.Scanner;

public class Menucase {

	public static void main(String[] args) {
		// definimos el scanner y la variable opcion
		Scanner teclado = new Scanner(System.in);
		int opcion;

		// metemos todo dentro de un do-while para que el menú solo se cierre en caso de
		// elegir
		// la opción de salir.
		do {

			System.out.println("\n--- MENÚ DE OPCIONES ---");
			System.out.println("1. Opción 1");
			System.out.println("2. Opción 2");
			System.out.println("3. Opción 3");
			System.out.println("4. Opción 4");
			System.out.println("5. Opción 5");
			System.out.println("0. Salir");
			// pedida y registro de la opción
			opcion = teclado.nextInt();

			// definimos el menu de opciones
			switch (opcion) {
			case 0:
				System.out.println("Has decido SALIR...");
				break;

			case 1:
				System.out.println("Has elegido la OPCIÓN 1");
				break;

			case 2:
				System.out.println("Has elegido la OPCIÓN 2");
				break;
			case 3:
				System.out.println("Has elegido la OPCIÓN 3");
				break;

			case 4:
				System.out.println("Has elegido la OPCIÓN 4");
				break;

			case 5:
				System.out.println("Has elegido la OPCIÓN 5");
				break;
			default:
				// Capturamos cualquier número que no esté entre el 0 y 5
				System.out.println("Opción no válida, intentelo de nuevo.");
				break;
			}

		} while (opcion != 0);

		teclado.close();
	}

}
