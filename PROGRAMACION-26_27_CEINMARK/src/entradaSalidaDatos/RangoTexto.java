package entradaSalidaDatos;

import java.util.Scanner;

public class RangoTexto {

	public static void main(String[] args) {
		/**
		 * Lee una palabra de al menos 
		 * 5 letras por teclado y muestra por pantalla únicamente las tres primeras letras en mayúsculas
		 * utilizando el método .substring().
		 */
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce una palabra de 5 letras minimo: ");
		String palabra = teclado.next();
		
		String tresPrimeras = palabra.substring(0, 2).toUpperCase();
		System.out.println("Tres primeras letras: " + tresPrimeras);
		teclado.close();
		
	}

}
