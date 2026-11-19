package entradaSalidaDatos;

import java.util.*;

public class LimpiarEspacios {

	public static void main(String[] args) {
		/**
		 * Lee una cadena de texto introducida con espacios sobrantes al principio y al final, y muestra por
		 * pantalla el texto limpio utilizando el método .trim(), 
		 * junto con su longitud original y 
		 * su longitud tras limpiarlo.
		 */

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un texto con espacios: ");
		String texto = teclado.nextLine();
		
		String textoLimpio = texto.trim();
		
		System.out.println("Texto limpio: '"+ textoLimpio + "'");
		System.out.println("Longitud original: " + texto.length());
		System.out.println("Longitud despues de trim: " + textoLimpio.length());
		teclado.close();
	}

}
