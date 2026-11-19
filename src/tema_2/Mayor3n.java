package tema_2;

import java.util.Scanner;

public class Mayor3n {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		// Pedimos 1er nº
		System.out.println("Introduce el 1er nº: ");
		double n1 = teclado.nextDouble();

		// Pedimos el 2do nº
		System.out.println("Introduce el 2do nº: ");
		double n2 = teclado.nextDouble();

		// Pedimos 3er nº
		System.out.println("Introduce el 3er nº: ");
		double n3 = teclado.nextDouble();
		
		// Determinamos qué nº es el máximo
		double mayor = n1;
		if(n2 > mayor) {
			mayor = n2;
		}
		if(n3 > mayor) {
			mayor = n3;
		}
		System.out.println("El valor máximo es " + mayor + " y corresponde a: ");
		
		// Indicamos cuál o cuáles coinciden con el valor máximo
		if (n1 == mayor) {
			System.out.println("[Primer nº]");
		}
		if (n2 == mayor) {
			System.out.println("[Segundo nº]");
		}
		if (n3 == mayor) {
			System.out.println("[Tercer nº]");
		}
		teclado.close();
	}

}
