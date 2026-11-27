package tema3_funciones;

import java.util.Scanner;

public class Hipotenusa {
	
	public static double pedirNumero(String mensaje, Scanner t) {
		System.out.print(mensaje);
		return t.nextDouble();
	}
	
	// Calcula el valor de la hipotenusa mediante el Teorema de Pitágoras
	public static double calcHipotenusa(double cateto1, double cateto2) {
		return Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
	}
	
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double c1 = pedirNumero("Introduce el valor del primer cateto: ", teclado);
		double c2 = pedirNumero("Introduce el valor del segundo cateto: ", teclado);
		
		double hipotenusa = calcHipotenusa(c1, c2);
		System.out.printf("La hipotenusa del triángulo es: %.2f", hipotenusa);
		
		teclado.close();
		
	}
}
