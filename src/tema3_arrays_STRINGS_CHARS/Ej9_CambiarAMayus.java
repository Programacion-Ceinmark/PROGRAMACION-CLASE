package tema3_arrays_STRINGS_CHARS;

public class Ej9_CambiarAMayus {
	public static void main(String[] args) {
		// Defino lista con letras en minúsculas
		char[] listaMinusculas = {'j', 'a', 'v', 'a'};
		
		// Recorrer lista para convertir cada letra en MAYÚCULAS
		for (int i = 0; i < listaMinusculas.length; i++) {
			listaMinusculas[i] = Character.toUpperCase(listaMinusculas[i]);
		}
		
		// Recorremos la lista actualizada
		System.out.println("Lista en MAYÚSCULAS:");
		for (int i = 0; i < listaMinusculas.length; i++) {
			System.out.print(listaMinusculas[i]);
		}
	}
}
