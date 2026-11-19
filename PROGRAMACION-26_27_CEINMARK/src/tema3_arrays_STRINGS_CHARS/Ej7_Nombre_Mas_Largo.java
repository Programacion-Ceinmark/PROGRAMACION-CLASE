package tema3_arrays_STRINGS_CHARS;

public class Ej7_Nombre_Mas_Largo {
	public static void main(String[] args) {
		String[] ciudades = { "Barcelona", "Madrid", "Manchester", "Sevilla", "Dortmund" };

		// Cogemos el primer nombre como el más largo
		String ciudadMasLarga = ciudades[0];

		for (int i = 1; i < ciudades.length; i++) {
			if (ciudades[i].length() > ciudadMasLarga.length()) {
				ciudadMasLarga = ciudades[i];
			}
		}

		// Mostramos resultado
		System.out.println("La ciudad con el nombre más largo es: " + ciudadMasLarga);

	}
}
