package tema_2;

import java.util.Scanner;

public class Decemil {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		// Pedimos nº y lo guardamos
		System.out.println("Introduce un nº entero entre 0 y 99.999: ");
		int num = teclado.nextInt();
		
		// condiciones a cumplir
		if(num >= 0 && num <=99999) {
			// Descomposición matemática
			int decenasMillar = num / 10000;
			int unidadesMillar = (num % 10000) / 1000;
			int centenas = (num % 1000) / 100;
			int unidades = num % 10;
			
			
			System.out.println("El nº introducido no está dentro del rango establecido [0-99999]");
		}
		teclado.close();
	}

}
