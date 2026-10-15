package tema_2;

import java.util.Scanner;

public class Menu_SWITCH {

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
		System.out.println("0. Salir");

		// Pide la opción y la guarda
		System.out.println("Selecciona una opción: ");
		int opcion = teclado.nextInt();

		// El switch evalúa diréctamente el valor de la opción elegida
		switch (opcion) {
			case 0:
				System.out.println("Has salido del programa.");
				break;
				
			case 1: case 2: case 3: case 4: case 5:
			// Pedimos los nºs unicamente si ha elegido una opción válida.
				System.out.println("Introduce el 1er entero: ");
				int n1 = teclado.nextInt();
				System.out.println("Introduce el 2do entero: ");
				int n2 = teclado.nextInt();
				
				// Un segundo switch intero decide qué operación se realiza:
				switch (opcion){
					
					case 1:
						int suma = n1 + n2;
						System.out.println("Resultado: " + suma);
						break;
						
					case 2:
						int resta = n1 - n2;
						System.out.println("Resultado: " + resta);
					
					case 3:
						int multi = n1 * n2;
						System.out.println("Resultado: " + multi);
					
					case 4:
						// control para evitar división entre 0
						if(n2 != 0) {
							double div = (double) n1 / n2;
							System.out.println("Resultado: " + div);
						} else {
							System.out.println("Error: no se puede dividir entre 0");
						}
						break;
						
					case 5:
						// control para evitar división entre 0
						if(n2 != 0) {
							int resto = n1 % n2;
							System.out.println("Resultado resto: " + resto);
						} else {
							System.out.println("Error: no se puede dividir entre 0");
						}
						break;
				}
				break;
			default:
				// Captura cualquier nº que no sea 0,1,2,3,4 o 5
				System.out.println("Opción no válida.");
				break;
		}
		teclado.close();

	}
}
