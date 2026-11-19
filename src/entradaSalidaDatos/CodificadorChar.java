package entradaSalidaDatos;

import java.util.Scanner;

public class CodificadorChar {

	public static void main(String[] args) {
		/**
		 * Lee un carácter por teclado y muestra por pantalla los dos caracteres siguientes en la tabla ASCII
		 * separados por una flecha (->). (Ejemplo: Si se introduce 'A', muestra 'B' -> 'C').
		 */
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un caracter: ");
		char c1 = teclado.next().charAt(0);
		
		char sig1 = (char) (c1 + 1);
		char sig2 = (char) (c1 + 2);
		System.out.println("Secuencia forma corta: " + c1 + " -> " + sig1 + " -> " + sig2);
		
		int sig1_int = c1+1;
		char sig1_l = (char) sig1_int;
		int sig2_int = c1+2;
		char sig2_l = (char) sig2_int;
		System.out.println("Secuencia forma larga: " + (int)c1 + " -> " + sig1_int + " -> " + sig2_int);
		teclado.close();
	}

}
