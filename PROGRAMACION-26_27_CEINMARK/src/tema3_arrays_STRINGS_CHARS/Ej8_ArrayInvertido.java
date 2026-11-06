package tema3_arrays_STRINGS_CHARS;

public class Ej8_ArrayInvertido {
	public static void main(String[] args) {
		char[] palabra = {'E', 'c', 'l', 'i', 'p', 's', 'e'};
		System.out.println("Palabra invertida");
		
		// Recorremos el array de forma invertida
		for (int i = palabra.length - 1; i >= 0; i--) {
			System.out.print(palabra[i]);
		}
	}
}
