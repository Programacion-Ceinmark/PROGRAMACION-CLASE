package tema3_for;

import java.util.Iterator;
import java.util.Scanner;

public class NumVeces {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int[] veces = new int[10];

		System.out.println(
				"INTRODUCE NUMEROS ENTEROS DEL 0 AL 9, y para terminar o salir del ejercicio mete un nº negativo");
		int num = teclado.nextInt();

		while (num >= 0) {

			if (num >= 0 && num <= 9) {
				veces[num]++;
			} else {
				System.out.println("num fuera de lo permitido");
			}
			num = teclado.nextInt();
		}
		System.out.println("\n Frecuencia de cada numero introducido: ");
		for (int i = 0; i < veces.length; i++) {
			System.out.println("El nº " + i + " se ha introducido " + veces[i] + " veces.");
		}
		teclado.close();
	}
}
