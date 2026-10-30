package tema3_arrays;

public class ArrayInverso {
	
	public static void main(String[] args) {
		
		// definimos la lista manualmente
		int[] numeros = { 83, 73, 67, 9, 742001};
		
		// Mostramos el array tal y como está definido (izquierda a derecha)
		System.out.println("Lista con orden original:");
		System.out.print("[ ");
		for (int i = 0; i < numeros.length; i++) {
			if (i != numeros.length - 1) {
				System.out.print(numeros[i] + ", ");	
			}else {
				System.out.print(numeros[i]);
			}
		}
		System.out.println(" ]");
	
		// Recorremos el array de forma inversa (derecha a izquierda)
		System.out.println("Lista con orden invertido:");
		System.out.print("[ ");
		for (int i = numeros.length-1; i >= 0; i--) {
			if (i != 0) {
				System.out.print(numeros[i] + ", ");	
			}else {
				System.out.print(numeros[i]);
			}
		}
		System.out.println(" ]");		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
