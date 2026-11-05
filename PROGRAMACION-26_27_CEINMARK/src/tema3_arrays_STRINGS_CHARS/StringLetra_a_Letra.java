package tema3_arrays_STRINGS_CHARS;

public class StringLetra_a_Letra {

	public static void main(String[] args) {

		// Defino el array de caracteres
		char[] listaChars = { 'K', 'o', 'l', 'd', 'o' };

		System.out.println("Palabra formada: ");

		// Recorro el array mostrando 'letra' + '-'
		for (int i = 0; i < listaChars.length; i++) {

			if (i == listaChars.length - 1) {
				System.out.print(listaChars[i]);
			} else {
				System.out.print(listaChars[i] + "-");
			}
		}
		System.out.println();
	}

}
