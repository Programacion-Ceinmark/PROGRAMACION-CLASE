package ejercicios_Repaso;

import java.util.Scanner;

public class CuadradoNum {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un numero entero: ");
		
		int numero = teclado.nextInt();
		
		int cuadrado = numero * numero;
		//int cuadrado1 = (int) Math.pow(numero, 2);
		System.out.println("El cuadrado de " + numero + " es: " + cuadrado);
		teclado.close();
	}
	
	
}
