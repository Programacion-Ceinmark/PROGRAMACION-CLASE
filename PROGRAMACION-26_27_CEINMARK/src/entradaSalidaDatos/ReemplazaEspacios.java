package entradaSalidaDatos;

import java.util.Scanner;

public class ReemplazaEspacios {

	public static void main(String[] args) {
		/**
		 * Lee una frase entera por teclado mediante sc.nextLine() y
		 * muestra por pantalla la misma frase sustituyendo 
		 * todos los espacios en blanco por guiones bajos _ empleando el método .replace().
		 */
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce una frase: ");
		String frase = teclado.nextLine();
		System.out.println(frase);
		String resultado = frase.replace(" ", "777");
		System.out.println("Frase modificada: " + resultado);
		teclado.close();
	}

}
