package entradaSalidaDatos;

import java.util.Scanner;

public class VocalesASCII {

	public static void main(String[] args) {

		/**
		 * Lee un carácter por teclado (char) y muestra por pantalla una tabla sencilla
		 * que indique el carácter introducido y los valores ASCII del carácter
		 * original, del carácter en minúscula y del carácter en mayúscula.
		 */

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un caracter: ");
		char caracter = teclado.next().charAt(0);

		char minus = Character.toLowerCase(caracter);
		char mayus = Character.toUpperCase(caracter);

		System.out.println("Caracter introducido: " + caracter + "(ASCII: " + (int) caracter + ")");
		System.out.println("En minuscula: " + minus + "(ASCII: " + (int) minus + ")");
		System.out.println("En mayuscula: " + mayus + "(ASCII: " + (int) mayus + ")");
		teclado.close();
	}

}
