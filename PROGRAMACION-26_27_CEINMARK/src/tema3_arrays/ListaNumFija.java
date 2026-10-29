package tema3_arrays;

public class ListaNumFija {
	
	public static void main(String[] args) {
	
		// definimos la lista y los valores que tenga
		int[] numeros = {10, 67, 32, 4, 11, 76, 6767};
		
		System.out.println("ELEMENTOS DEL ARRAY");
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Posición " + (i+1) + ": " + numeros[i]);
		}
	}
}
