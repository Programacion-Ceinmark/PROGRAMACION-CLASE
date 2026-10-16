package tema_2;

import java.util.Scanner;

public class Decemil {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		// Pedimos nº y lo guardamos
		System.out.println("Introduce un nº entero entre 0 y 99.999: ");
		int num = teclado.nextInt();
		
		// si el nº está en el rango establecido
		if (num >= 0 && num <= 99999) {
			int decMillar = num / 10000;
			int unMillar = (num % 10000) / 1000;
			int centenas = (num % 1000) / 100;
			int decenas = (num % 100) / 10;
			int unidades = num % 10;
			
			System.out.println("Decenas de millar: " + decMillar);
			System.out.println("Unidades de millar: " + unMillar);
			System.out.println("Centenas: " + centenas);
			System.out.println("Decenas: " + decenas);
			System.out.println("Unidades: " + unidades);
		} else {
			System.out.println("El nº introducido no está dentro del rango establecido [0-99999]");
		}
		teclado.close();
	}

}
