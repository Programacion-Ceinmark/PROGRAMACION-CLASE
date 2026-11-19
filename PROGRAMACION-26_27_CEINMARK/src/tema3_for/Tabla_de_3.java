package tema3_for;

public class Tabla_de_3 {
	public static void main(String[] args) {
		int num_a_multiplicar = 3;
		System.out.println("Tabla de multiplicar del " + num_a_multiplicar + ":");
		
		// bucle del 1 al 10 y multiplicar cada número
		for (int i = 1; i <= 10; i++) {
			int resultado = i * num_a_multiplicar;
			System.out.println(i + " * " + num_a_multiplicar + ": " + resultado);
		}
	}
}
