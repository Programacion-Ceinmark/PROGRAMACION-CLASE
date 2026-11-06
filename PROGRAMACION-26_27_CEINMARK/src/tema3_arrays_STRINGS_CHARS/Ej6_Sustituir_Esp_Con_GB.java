package tema3_arrays_STRINGS_CHARS;

public class Ej6_Sustituir_Esp_Con_GB {
	public static void main(String[] args) {
		char[] frase = {'H', 'o', 'l', ' ', 'a', ' ', ' ', 'i'};
		
		// Recorro array y cambiamos espacios (' ') por '_'
		for (int i = 0; i < frase.length; i++) {
			if (frase[i] == ' ') {
				frase[i] = '_';
			}
		}
		
		// Mostramos resultado
		System.out.println("Resultado: ");
		for (int i = 0; i < frase.length; i++) {
			System.out.print(frase[i]);
		}
	}
}
