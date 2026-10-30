package tema3_arrays;

public class Max_y_Min {

	public static void main(String[] args) {

		// definimos la lista manualmente
		int[] numeros = { 1, 3, 67, 6767, 8, 98 };

		// Cogemos el primer elemento cómo máx. y mín. para ir comparando en el for
		int max = numeros[0];
		int min = numeros[0];

		// Recorremos array desde la posición 1 hasta el final
		for (int i = 1; i < numeros.length; i++) {
			// Si encontramos un nº más grande -> actualizamos 'max'
			if (numeros[i] > max) {
				max = numeros[i];
			}
			
			//  Si encontramos un nº más pequeño -> actualizamos 'min'
			if (numeros[i] < min) {
				min = numeros[i];
			}
		}
		// Mostramos el número más alto y el más pequeño
		System.out.println("El número más grande es: " + max);
		System.out.println("El número más pequeño es: " + min);
	}
}
