package tema3_funciones;

public class EjemploMetodos {
	
	public static void holaMundo() {
		System.out.println("Hola");
	}
	
	public static int suma(int a, int b) {
	    int resultado = a + b;
	    return resultado;  // Entrega el valor y sale
	}
	
	public static void main(String[] args) {
		holaMundo();
		int resultado = suma(10, 20);
		System.out.println(resultado);
		
	}
}
