package tema3_arrays;

public class ArrayDuplicado {
	public static void main(String[] args) {

		// Creo los dos arrays (1 con núm. fijos y la 2 con mismo tamaño que 1)
		int[] lista1 = { 2, 3, 4, 5, 6, 5 };
		int[] lista2 = new int[lista1.length];

		// Llenado de lista2
		for (int i = 0; i < lista1.length; i++) {
			lista2[i] = lista1[i] * 2;
		}
		
		// Recorremos lista1 para mostrar su contenido
		System.out.print("Array original: ");
		for (int i = 0; i < lista1.length; i++) {
			System.out.print(lista1[i] + " ");
		}
		
		// Recorremos lista1 para mostrar su contenido
		System.out.print("\nArray duplicado: ");
		for (int i = 0; i < lista2.length; i++) {
			System.out.print(lista2[i] + " ");
		}
	}
}
