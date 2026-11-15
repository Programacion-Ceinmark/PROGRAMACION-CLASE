package entradaSalidaDatos;

import java.util.Scanner;

public class FormatoEmail {

	public static void main(String[] args) {
		/**
		 * Realiza la clase Java FormatoEmail
		 * Pide al usuario su nombre de usuario (ejemplo: juan) y 
		 * el dominio de su empresa o centro (ejemplo: educa.madrid.org) por separado, y
		 * muestra por pantalla la dirección de correo completa en minúsculas con el formato usuario@dominio.
		 */

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce tu usuario: ");
		String usuario = teclado.next();
		System.out.println("Introduce el dominio: ");
		String dominio = teclado.next();
		
		String email = (usuario + "@" + dominio + ".com").toLowerCase();
		System.out.println("Tu correo es: " + email);
		teclado.close();
		
	}

}
