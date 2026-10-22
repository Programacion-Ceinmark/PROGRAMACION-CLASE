package tema_2_estructuras_selectivas;

import java.util.Scanner;

public class MenuMeses {
	public static void main(String[] args) {

		// definimos el scanner y la variable opcion
		Scanner teclado = new Scanner(System.in);
		String mes;

		System.out.println("Introduce el nombre del mes:");

		// registrar la letra introducida
		mes = teclado.next().toLowerCase();

		// montamos el switch
		switch (mes) {

		case "enero":
			System.out.println("El nº del mes introducido es 1");
			break;

		case "febrero":
			System.out.println("El nº del mes introducido es 2");
			break;

		case "marzo":
			System.out.println("El nº del mes introducido es 3");
			break;

		case "abril":
			System.out.println("El nº del mes introducido es 4");
			break;

		case "mayo":
			System.out.println("El nº del mes introducido es 5");
			break;

		case "junio":
			System.out.println("El nº del mes introducido es 6");
			break;

		case "julio":
			System.out.println("El nº del mes introducido es 7");
			break;

		case "agosto":
			System.out.println("El nº del mes introducido es 8");
			break;

		case "septiembre":
			System.out.println("El nº del mes introducido es 9");
			break;

		case "octubre":
			System.out.println("El nº del mes introducido es 10");
			break;

		case "noviembre":
			System.out.println("El nº del mes introducido es 11");
			break;

		case "diciembre":
			System.out.println("El nº del mes introducido es 12");
			break;

		default:
			System.out.println("MES INTRODUCIDO INCORRECTO!!");
		}
		teclado.close();
	}

}
