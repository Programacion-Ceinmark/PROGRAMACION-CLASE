package tema3_arrays_STRINGS_CHARS;

public class Ej1_Colores {
	public static void main(String[] args) {

		// Defino el array con 4 colores
		String[] listaColores = { "Rojo", "Amarillo", "Verde", "Azul" };

		// Mostramos el primer color
		System.out.println("El primer color es: " + listaColores[0]);
		System.out.println("----------------------------------------");
		
		// Recorro la lista y muestro la posición junto a cada color
		for (int i = 0; i < listaColores.length; i++) {
			System.out.println("Posición " + i + ": " + listaColores[i]);
		}
		System.out.println("----------------------------------------");
		// Recorro la lista de atras para alante y muestro la posición junto a cada color
		for (int i = 3; i >= 0; i--) {
			System.out.println("Posición " + i + ": " + listaColores[i]);
		}
	}
}
