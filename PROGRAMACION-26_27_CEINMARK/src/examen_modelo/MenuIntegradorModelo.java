package examen_modelo;
import java.util.Scanner;

/**
 * Ejercicio 4 - Modelo de Examen (Menú Integrador) Bucle do-while con switch
 * conteniendo lógica del Tema 1, Tema 2 y Tema 3.
 */
public class MenuIntegradorModelo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcion;

		do {
			System.out.println("\n=== MENU INTEGRADOR ===");
			System.out.println("1. Calcular descuento de producto (Tema 1)");
			System.out.println("2. Clasificar categoría por edad (Tema 2)");
			System.out.println("3. Buscar carácter en array (Tema 3)");
			System.out.println("0. Salir");
			System.out.print("Seleccione una opción: ");
			opcion = sc.nextInt();

			switch (opcion) {
			case 1:
				// Apartado a) Tema 1 - Cálculo de Descuento
				System.out.print("Introduce el precio del producto: ");
				double precio = sc.nextDouble();
				System.out.print("Introduce el % de descuento: ");
				double porcentaje = sc.nextDouble();

				double importeDescuento = precio * (porcentaje / 100.0);
				double precioFinal = precio - importeDescuento;

				System.out.printf("Importe descontado: %.2f €\n", importeDescuento);
				System.out.printf("Precio final: %.2f €\n", precioFinal);
				break;

			case 2:
				// Apartado b) Tema 2 - Clasificación por Edad
				System.out.print("Introduce tu edad: ");
				int edad = sc.nextInt();

				if (edad < 0) {
					System.out.println("Categoría: Edad no válida");
				} else if (edad <= 12) {// 0-12
					System.out.println("Categoría: Infantil");
				} else if (edad <= 17) { // 13-17
					System.out.println("Categoría: Juvenil");
				} else if (edad <= 64) {//18-64
					System.out.println("Categoría: Adulto");
				} else {// 64-...
					System.out.println("Categoría: Senior");
				}
				break;

			case 3:
				// Apartado c) Tema 3 - Búsqueda en Array de Caracteres
				System.out.print("Introduce una palabra de 5 letras: ");
				String palabra = sc.next();

				// Convertimos la palabra en un array de caracteres char[]
				char[] letras = palabra.toCharArray();

				System.out.print("Introduce el carácter a buscar: ");
				char caracterBuscado = sc.next().charAt(0);

				int contador = 0;
				for (int i = 0; i < letras.length; i++) {
					if (letras[i] == caracterBuscado) {
						contador++;
					}
				}

				System.out.println(
						"El carácter '" + caracterBuscado + "' aparece " + contador + " vez/veces en el array.");
				break;

			case 0:
				// Apartado d) Salida del programa
				System.out.println("¡Hasta pronto!");
				break;

			default:
				// Apartado d) Opción incorrecta
				System.out.println("Opción no válida.");
				break;
			}

		} while (opcion != 0);

		sc.close();
	}
}