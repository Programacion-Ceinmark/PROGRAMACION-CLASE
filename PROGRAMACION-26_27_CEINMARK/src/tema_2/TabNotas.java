package tema_2;

import java.util.Scanner;

public class TabNotas {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		//
		// double nota = teclado.nextDouble();
		boolean notaValida = false;
		double nota = -1;
		
		// El bucle se repite hasta que el usuario introduce un dato correcto
		while(!notaValida) {
			System.out.println("Introduce la nota del alumno (0 a 10): ");
			
			// 1. Comprobamos si lo que mete es un nº 
			if(teclado.hasNextDouble()){
				nota = teclado.nextDouble();
				// 2. Comprobar si el nº esta dentro del rango permitido (de 0 a 10)
				if(nota >= 0 && nota <= 10) {
					notaValida = true; // dato correcto, cambiamos la condicion para salir del bucle.
				}else {
					System.out.println("Error: La nota no está en el rango permitido, INTENTALO DE NUEVO");
				}
			} else {
				// si mete texto, letras, simbolos, algo que no sea numero:
				System.out.println("Error: No has introducido un nº valido. INTENTALO DE NUEVO");
				teclado.next();
			}
		}
		// Una vez asegurado que le metemos un numero correcto:
		// Evaluación por tramos combinando operadores logicos: &&
		if (nota < 3) { // 0, 1, 2.9999...
			System.out.println("Nota: MD (muy deficiente)");
		} else if(nota < 5) { // 3, 4.9999...
			System.out.println("Nota: INS (insuficiente)");
		} else if(nota < 6) { // 5, 5.99999...
			System.out.println("Nota: SUF (suficiente)");
		} else if(nota < 7) { // 6, 6.99999...
			System.out.println("Nota: BIEN");
		} else if(nota < 9) { // 7, 8.9999...
			System.out.println("Nota: NOT (Notable)");
		} else {
			System.out.println("Nota: SOBRE (Sobresaliente)");
		}
		teclado.close();
	}
}
