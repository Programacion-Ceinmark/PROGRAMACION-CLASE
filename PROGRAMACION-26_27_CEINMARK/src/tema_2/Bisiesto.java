package tema_2;

import java.util.Scanner;

public class Bisiesto {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		// pido el año y lo registro
		System.out.println("Introduce un año: ");
		int anyo = teclado.nextInt();
		
		// Condiciones
		if ((anyo % 4 == 0 && anyo % 100 != 0) || (anyo % 400 == 0)) {
			System.out.println("Es bisiesto");
		} else {
			System.out.println("No es bisiesto");
		}
		teclado.close();
	}
}
