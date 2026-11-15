package ejercicios_Entrega;

import java.util.Scanner;

public class Ejercicio_6 {

	public static void main(String[] args) {
		// Definimos scanner para meter cosas y que nos lo pida el ordenador
		Scanner teclado = new Scanner(System.in);
		// Pedimos A y la guardamos
		System.out.println("Introduce el valor de A: ");
		int A = teclado.nextInt();

		// Pedimos B y la guardamos
		System.out.println("Introduce el valor de B: ");
		int B = teclado.nextInt();

		// Imprimimos estado inicial de las variables
		System.out.println("Valores iniciales -> A = " + A + ", B = " + B);
		
		// Definir variable temporal
		int aux = A;
		A = B;
		B = aux;

		// Imprimimos estado despues de intercambiar las variables
		System.out.println("Valores finales -> A = " + A + ", B = " + B);

		teclado.close();
	}

}
