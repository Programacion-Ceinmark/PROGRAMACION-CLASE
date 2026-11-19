package entradaSalidaDatos;

import java.util.Scanner;

public class PrimeraUltima {

	public static void main(String[] args) {
		/**
		 * Realiza la clase Java PrimeraUltima		
		 * Lee una palabra por teclado (String) y 
		 * muestra por pantalla cuál es su primera letra y cuál es su última letra.
		 */
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce una palabra: ");
		String palabra = teclado.nextLine();
		
		char primera = palabra.charAt(0);
		char ultima = palabra.charAt(palabra.length() - 1);
		
		System.out.println("Primera letra: "+ primera);
		System.out.println("Ultima letra: "+ ultima);
		System.out.println(palabra.length());
		teclado.close();
	}

}
