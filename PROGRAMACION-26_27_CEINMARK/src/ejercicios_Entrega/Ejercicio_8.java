package ejercicios_Entrega;

import java.util.Scanner;

public class Ejercicio_8 {
	
	public static void main(String[] args) {
		// definimos scanner para meter cosas y que nos lo pida el ordenador
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce la cantidad total de euros");
		
		// definimos la variable euros y guardamos lo que tecleamos
		int euros = teclado.nextInt();
		
		// definimos cada billete y hacemos primero "/" y luego cogemos el resto
		int b_50 = euros / 50; // billetes de 50 que necesitamos
		int resto = euros % 50; // cogemos el dinero restante a repartir
		
		int b_20 = resto / 20; // billetes de 20 que necesitamos
		resto = resto % 20; // cogemos el dinero restante a repartir
	
		int b_10 = resto / 10; // billetes de 10 que necesitamos
		resto = resto % 10; // cogemos el dinero restante a repartir
		
		int b_5 = resto / 5; // billetes de 5 que necesitamos 
		
		// Imprimimos el desglose de billetes
		System.out.println("Desglose para " + euros + "€:");
		System.out.println(b_50 + " billetes de 50€.");
		System.out.println(b_20 + " billetes de 20€.");
		System.out.println(b_10 + " billetes de 10€.");
		System.out.println(b_5  + " billetes de 5€.");
		teclado.close();
	}
}
