package tema3_funciones;

import java.util.Iterator;
import java.util.Scanner;

public class Cuadrani {

	public static int pedirNumero(Scanner t) {
		int n;
		do {
				System.out.print("Introduce un número entero mayor que 0: ");
				n = t.nextInt();
				if (n <= 0) {
					System.out.println("ERROR: no has leido lo que pide, mete bien el nº!!");
				}
			} while (n<=0);
			return n;
	}
	
	public static void mostrarCuadrado(int n){
		for (int i = 1; i <= n; i++) { // recorro filas
			for (int j = 1; j <= n; j++) { // recorro columnas
				// en la fila i, los 0s van hasta la columna n-i
				if(j <= n - i) {
					System.out.print("0 ");
				}else {
					System.out.print(j + " ");
				}
			}
			// por cada fila, metemos un salto para diferenciarlas
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		Scanner t = new Scanner(System.in);
		int num = pedirNumero(t);
		mostrarCuadrado(num);
		t.close();
	}

}
