package tema_2;

import java.util.Scanner;

public class Ecuacion2grado {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		// pedimos y registramos a, b y c.
		System.out.println("Fórmula a solucionar: 'ax^2 + bx + c = 0' ");
		System.out.println("Introduce el valor de 'a': ");
		double a = teclado.nextDouble();
		System.out.println("Introduce el valor de 'b': ");
		double b = teclado.nextDouble();
		System.out.println("Introduce el valor de 'c': ");
		double c = teclado.nextDouble();

		// cálculo del discriminante (lo de dentro de la raíz)
		double disc = Math.pow(b, 2) - (4*a*c);
		
		// si el disc es negativo, la raíz es irreal y hay nº complejo
		if (disc < 0) {
			System.out.println("Raíz compleja");
		} else {
			// calculamos la ecuación
			double x1 = (-b + Math.sqrt(disc)) / (2*a);
			double x2 = (-b - Math.sqrt(disc)) / (2*a);
			
			// mostramos resultados
			System.out.println("Soluciones:\n\t x1-> " + x1 + "\n\t x2-> " + x2);
		}
		teclado.close();
	}
	

}
