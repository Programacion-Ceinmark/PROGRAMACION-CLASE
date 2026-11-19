package tema3_arrays_NUMERICOS;

public class MayorQue10 {
	public static void main(String[] args) {
		
		// Defino la lista con números que quiero
		int[] numeros = {67, 10, 3, 9, 111, 93, 7, 2};
		int contador = 0;
		
		// Recorremos la lista numérica
		for (int i = 0; i < numeros.length; i++) {
			// Si el número es mayor que 10, sumar 1 al contador
			if (numeros[i] > 10) {
				System.out.println("Posición " + i + ": " + numeros[i]);
				contador++;
			}
		}
		
		// Mostramos resultado
		System.out.println("Cantidad de números mayores que 10: " + contador);
		
	}
}
