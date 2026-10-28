package tema3_for;

import java.util.Iterator;

public class EjemploArrays {
	public static void main(String[] args) {
		// ESTADO INICIAL: FILA DE 5 SITIOS, 2 OCUPADOS
		int[] arrayEnteros = new int[5];
		arrayEnteros[0] = 2;
		arrayEnteros[1] = 4;

		int elementosUtiles = 2; // CANTIDAD DE PERSONAS SENTADAS
		System.out.print("[ ");
		for (int i = 0; i < arrayEnteros.length; i++) {
			System.out.print(arrayEnteros[i] + ", ");
		}
		System.out.print(" ]");

		// 1. AÑADIR AL FINAL
		// Queremos añadir el nº 3 al final
		int nuevoFinal = 3;

		/**
		 * entra en clase y se sienta en el primer sitio libre (elementosUtiles)
		 **/
		arrayEnteros[elementosUtiles] = nuevoFinal;
		elementosUtiles++; // 3 elementos útiles
		System.out.println("\nESTADO DE LA LISTA DESPUÉS DE APLICAR EL MÉTODO 1 ");
		System.out.print("[ ");
		for (int i = 0; i < arrayEnteros.length; i++) {
			if (i != arrayEnteros.length - 1) {
				// escribe ',' para las posiciones 0, 1, 2, 3
				System.out.print(arrayEnteros[i] + ", ");
			} else {
				// solo escribe nº cuando llega al final de la lista
				System.out.print(arrayEnteros[i]);
			}
		}
		System.out.print(" ]");

		// 2. AÑADIR SABIENDO LA POSICIÓN EN LA QUE METER
		// Queremos añadir el nº 6 en la posición 0
		int posicionDestino = 0;
		int numeroAmeter = 6;

		/**
		 * Empujamos a la derecha para hacer hueco (de atrás para alante)
		 **/
		for (int i = elementosUtiles; i > posicionDestino; i--) {
			arrayEnteros[i] = arrayEnteros[i - 1];
		}

		// insertamos el 6 en el hueco libre
		arrayEnteros[posicionDestino] = numeroAmeter;
		elementosUtiles++;

		System.out.println("\nESTADO DE LA LISTA DESPUÉS DE APLICAR EL MÉTODO 2 ");
		System.out.print("[ ");
		for (int i = 0; i < arrayEnteros.length; i++) {
			if (i != arrayEnteros.length - 1) {
				// escribe ',' para las posiciones 0, 1, 2, 3
				System.out.print(arrayEnteros[i] + ", ");
			} else {
				// solo escribe nº cuando llega al final de la lista
				System.out.print(arrayEnteros[i]);
			}
		}
		System.out.print(" ]");

		// 3. AÑADIR DE MANERA ORDENADA
		/**
		 * PARTIMOS DE [2,4,5,0,0]
		 * QUEREMOS METER EL Nº 3 EN ORDEN (entre el 2 y el 4) 
		 */
		int[] arrayOrdenado = new int[5];
		arrayOrdenado[0] = 2;
		arrayOrdenado[1] = 4;
		arrayOrdenado[2] = 5;
		
		int utilesOrdenado = 3;
		
		int valorAmeter = 3;
		
		int j = utilesOrdenado -1; // empezamos a comparar los nº desde el ultimo util
		
		while(j>= 0 && arrayOrdenado[j] > valorAmeter ) {
			arrayOrdenado[j+1] = arrayOrdenado[j];
			j--;
		}
		// insertamos el 3 ordenado
		arrayOrdenado[j+1] = valorAmeter;
		utilesOrdenado++;
		
		System.out.println("\nLISTA ORDENADA");
		System.out.print("[ ");
		for (int i = 0; i < arrayOrdenado.length; i++) {
			if (i != arrayOrdenado.length - 1) {
				// escribe ',' para las posiciones 0, 1, 2, 3
				System.out.print(arrayOrdenado[i] + ", ");
			} else {
				// solo escribe nº cuando llega al final de la lista
				System.out.print(arrayOrdenado[i]);
			}
		}
		System.out.print(" ]");
		
		
	}
}
