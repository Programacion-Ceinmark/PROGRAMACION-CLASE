package tema3_arrays_STRINGS_CHARS;

public class Ej4_Contar_Vocales {
	public static void main(String[] args) {
		// Defino la lista con 8 caracteres
		char[] caracteres = { 'a', 'z', 'm', 'o', 'p', 'u', 'x' };
		int contador = 0;

		// Recorro la lista buscando vocales minúsculas
		for (int i = 0; i < caracteres.length; i++) {
			char letra = caracteres[i];
			// Comprobamos si la letra actual es alguna de las vocales
			if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
				contador++;
			}
		}
		// Mostramos resultado
		System.out.println("Total de vocales encontradas: " + contador);
	}
}
