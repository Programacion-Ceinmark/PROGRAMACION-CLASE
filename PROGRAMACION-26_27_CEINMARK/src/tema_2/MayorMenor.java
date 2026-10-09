package tema_2;

import java.util.Scanner;

public class MayorMenor {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el primer nº (A): ");
		double a = teclado.nextDouble();
		System.out.println("Introduce el primer nº (B): ");
		double b = teclado.nextDouble();
		
		if (a > b) {
			System.out.printf("El primer nº (%.2f) es MAYOR que el segundo (%.2f)", a, b);
		} else if(b > a) {
			System.out.printf("El segundo nº (%.2f) es MAYOR que el primero (%.2f)", b, a);
		} else {
			System.out.println("Ambos nºs son IGUALES.");
		}
		teclado.close();
	}

}
