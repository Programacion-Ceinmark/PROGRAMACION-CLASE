package tema3_funciones;

import java.util.Scanner;

public class Mayor {

	public static int esMayor(int a, int b) {
		if (a > b) {
			return a;
		}else {
			return b;
		}
	}
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Introduce el primer número: ");
		int num1 = teclado.nextInt();
		System.out.print("Introduce el segundo número: ");
		int num2 = teclado.nextInt();
		
		int mayor = esMayor(num1, num2);
		System.out.println("El mayor es: " + mayor);
		teclado.close();
	}

}
