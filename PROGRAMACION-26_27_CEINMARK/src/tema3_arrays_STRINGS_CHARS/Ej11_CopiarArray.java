package tema3_arrays_STRINGS_CHARS;

public class Ej11_CopiarArray {
	public static void main(String[] args) {
		// Defino ambos arrays, uno con valores y el segundo con el mismo tamaño al
		// lleno
		String[] palabras = { "Sol", "Casa", "Elefante", "Mar", "Ordenador" };
		String[] palabrasCortas = new String[palabras.length];
		
		// For para copiar las palabras de 4 o menos letras en el 2do array
		for (int i = 0; i < palabras.length; i++) {
			if (palabras[i].length() <= 4) {
				palabrasCortas[i] = palabras[i];
			}
		}
		
		System.out.println("Palabras cortas copiadas en el nuevo array: ");
		for (int i = 0; i < palabrasCortas.length; i++) {
			if (palabrasCortas[i] != null) {
				System.out.println("- " + palabrasCortas[i]);	
			}
			
		}
		
	}
}
