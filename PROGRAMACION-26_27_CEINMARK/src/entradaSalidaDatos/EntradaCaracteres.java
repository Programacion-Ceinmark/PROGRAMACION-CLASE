package entradaSalidaDatos;

import java.util.Scanner;

public class EntradaCaracteres {

	public static void main(String[] args) {
		/**
		 * Realiza la clase Java Iniciales
		 * Pide al usuario su nombre y su primer apellido por separado (tipo String) 
		 * y muestra por pantalla las iniciales de ambos en mayúsculas, separadas por un punto.
		 * (Pista: Puedes usar sc.next(), .charAt(0) y .toUpperCase()).
		 */
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce tu nombre: ");
		String nombre = teclado.next();
		System.out.println("Introduce tu apellido: ");
		String apellido = teclado.next();
		
		char inNombre = Character.toUpperCase(nombre.charAt(0));
		char inApellido = Character.toUpperCase(apellido.charAt(0));
		
		System.out.println("Tus iniciales son: " + inNombre + "." + inApellido + ".");
		teclado.close();

	}

}
