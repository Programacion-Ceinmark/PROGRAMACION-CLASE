package tema3_funciones;

import java.util.Scanner;

public class Maximo3 {

	// método para la pedida de 1 número
	public static int pedirNumero(Scanner teclado) {
		System.out.print("Introduce un número entero: ");
		return teclado.nextInt();
	}
	
	// la clase "maximo2Numeros" equivale a "esMayor" de la clase Mayor.java 

	// método para devolver el máximo de 3 números utilizando "esMayor"
	public static int maximo3Numeros(int a, int b, int c) {
		// 1º sacamos el mayor de los 2 primero números
		int mayor1 = Mayor.esMayor(a, b);
		// 2º comparamos el mayor obtenido con el tercer número
		return Mayor.esMayor(mayor1, c);
	}
	
	public static void main(String[] args) {
	
		Scanner t = new Scanner(System.in);
		
		// definimos los 3 números
		int num1 = pedirNumero(t);
		int num2 = pedirNumero(t);
		int num3 = pedirNumero(t);
		
		System.out.println("El mayor de los 3 números es: " + maximo3Numeros(num1, num2, num3));
		
		t.close();
	}
}
