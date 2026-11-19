package tema_2;

import java.util.Scanner;

public class Nxn {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un nº: ");
		double numero = teclado.nextDouble();
		
		double cuadrado = numero * numero;
		System.out.println("El cuadrado de " + numero + " es: " + cuadrado);
		
		if (cuadrado > 100) {
			double resultado = cuadrado - 100;
			System.out.println("Como es mayor que 100, se le resta 100: " + resultado);
		} else {
			double restante = 100 - cuadrado;
			System.out.println("Para llegar a 100 le faltan: " + restante);
		}
		
		teclado.close();
		
	}

}
