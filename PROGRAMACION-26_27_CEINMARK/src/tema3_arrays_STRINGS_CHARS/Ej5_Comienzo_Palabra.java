package tema3_arrays_STRINGS_CHARS;

public class Ej5_Comienzo_Palabra {
	public static void main(String[] args) {
		String[] lista = { "Alberto", "Pepe", "Raul", "Kepa", "Jon", "asier" };

		System.out.println("Nombres que empiezan por 'A' o 'a': ");
		for (int i = 0; i < lista.length; i++) {
//			if (lista[i].startsWith("A") || lista[i].startsWith("a")) {
//				System.out.println("- " + lista[i]);
//			}
			// comparo la inicial de cada nombre de la lista con A y a
			if (lista[i].charAt(0) == 'A' || lista[i].charAt(0) == 'a') {
				System.out.println("- " + lista[i]);
			}
		}

	}
}
