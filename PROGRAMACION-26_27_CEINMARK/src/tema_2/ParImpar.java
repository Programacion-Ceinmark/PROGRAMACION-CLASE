package tema_2;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un numero entero: ");
		int num = teclado.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("El nº es par!!");
		} else {
			System.out.println("El nº es impar!!");
		}
		
		teclado.close();
	}

}
