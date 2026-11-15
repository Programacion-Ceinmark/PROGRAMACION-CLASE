package tema_2;

import java.util.Scanner;

public class Menu_IF {

	public static void main(String[] args) {

		// definimos el scanner
		Scanner teclado = new Scanner(System.in);

		// escribimos el menú
		System.out.println("--- MENÚ DE OPCIONES ---");
		System.out.println("1. Sumar");
		System.out.println("2. Restar");
		System.out.println("3. Multiplicar");
		System.out.println("4. Dividir");
		System.out.println("5. Resto (%)");
		System.out.println("6. Salir");
		// pide la opción y la guarda
		System.out.println("Selecciona una opción: ");
		int opcion = teclado.nextInt();

		// condiciones por cada opción:
		if (opcion == 0) {
			System.out.println("Has salido del programa.");
		} else if (opcion >= 1 && opcion <= 5) {
			// pedir 1er nº
			System.out.println("Introduce el primer nº entero: ");
			int n1 = teclado.nextInt();
			// pedir 2do nº
			System.out.println("Introduce el segundo nº entero: ");
			int n2 = teclado.nextInt();

			// control de opción elegida
			if (opcion == 1) {
				int suma = n1 + n2;
				System.out.println("Resultado: " + suma);
			} else if (opcion == 2) {
				int resta = n1 - n2;
				System.out.println("Resultado: " + resta);
			} else if (opcion == 3) {
				int multi = n1 * n2;
				System.out.println("Resultado: " + multi);
			} else if (opcion == 4) {
				// Control para evitar division entre 0
				if (n2 != 0) {
					double div = (double) n1 / n2;
					System.out.println("Resultado: " + div);
				} else {
					System.out.println("Error: No se puede dividir entre 0.");
				}
			} else if(opcion == 5) {
				// Control para evitar division entre 0
				if (n2 != 0) {
					int resto = n1 % n2;
					System.out.println("Resultado resto: " + resto);
				} else {
					System.out.println("Error: No se puede dividir entre 0.");
				}
			}
		} else {
			System.out.println("Opción no valida.");
		}
		teclado.close();
	}

}
