package entradaSalidaDatos;

import java.util.Scanner;

public class TarjetaOculta {

	public static void main(String[] args) {
		/**
		 * Lee por teclado un número de tarjeta bancaria de 16 dígitos como una cadena de texto (String) y 
		 * muestra por pantalla solo los últimos 4 dígitos precedidos por asteriscos para ocultar el resto.
		 * (Ejemplo: Entra "1234567890123456", muestra "************3456").
		 */
		
		Scanner teclado = new Scanner(System.in);		
		System.out.println("Introduce el numero de tarjeta: ");
		String tarjeta = teclado.next();
		
		String ultCuatro = tarjeta.substring(13);
		System.out.println("Tarjeta: ************" + ultCuatro);
		teclado.close();
	}

}
