package entradaSalidaDatos;

import java.util.Scanner;

public class SumaASCII {

	public static void main(String[] args) {
		/**
		 * Lee dos caracteres independientes por teclado (char), obtiene sus códigos
		 * numéricos ASCII mediante casting a (int) y muestra por pantalla la suma total
		 * de ambos códigos.
		 */

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el primer caracter: ");
		char c1 = teclado.next().charAt(0);
		System.out.println("Introduce el segundo caracter: ");
		char c2 = teclado.next().charAt(0);

		int ascii_1 = (int) c1;
		int ascii_2 = (int) c2;
		int suma = ascii_1 + ascii_2;
		
		System.out.println("ASCII DE '" + c1 + "': " + ascii_1);
		System.out.println("ASCII DE '" + c2 + "': " + ascii_2);
		System.out.println("Suma total: " + suma);
		teclado.close();
	}

}
