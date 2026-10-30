package tema3_arrays;

import java.util.Iterator;
import java.util.Scanner;

public class Suma_y_Promedio {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		// 1. creamos la lista de 5 números
		int[] numeros = new int[5];
		int suma = 0;

		System.out.println("Introduce los 5 números");
		
		// 2. Pedimos números y los guardamos en el array
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Número " + (i+1) + ": ");
			numeros[i] = teclado.nextInt();
			
			suma += numeros[i];
			
			// for para que nos escriba (cada vez que introducimos un número) la lista
			System.out.print("[ " );
			for (int j = 0; j <= i; j++) {
				if (j != i) {
					System.out.print(numeros[j]+ ", ");	
				}else {
					System.out.print(numeros[j]);
				}
				
			}
			System.out.println(" ]" );
			
		}
		
		// 3. Calculamos la media (convertimos a double 'suma' para no perder decimales)
		double media = (double) suma / numeros.length;
		
		// 4. Mostramos los resultados
		System.out.println("\n --- RESULTADOS ---");
		System.out.println("Suma total: " + suma);
		System.out.println("Promedio: " + media);
		
		teclado.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
