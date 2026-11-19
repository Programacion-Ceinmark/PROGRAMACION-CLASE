package tema_2;

import java.util.Scanner;

public class ValorAbsoluto {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un nº entero: ");
		
		int num = teclado.nextInt();
		int valorABS;
		 
		// si es negativo niega el valor
		if (num < 0) {
			valorABS = - num;
		} else {
			valorABS = num;
		}
		
		System.out.println("El valor absoluto es: " + valorABS);
		teclado.close();
	}

}
