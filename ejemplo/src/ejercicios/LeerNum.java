package ejercicios;

import java.util.Scanner;

public class LeerNum {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un numero entero: ");
		int num = teclado.nextInt();
		System.out.println("El numero introducido es: " + (-num));
		teclado.close();
	}

}
