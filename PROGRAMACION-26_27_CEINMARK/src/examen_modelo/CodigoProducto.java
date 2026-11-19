package examen_modelo;

import java.util.Scanner;

public class CodigoProducto {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		// a)
		System.out.println("=== REGISTRO DE PRODUCTO ===");
		System.out.print("Introduce la categoría (3 letras): ");
		String categoria = teclado.next();

		System.out.println("Introduce el identificador (3 dígitos):");
		int identificador = teclado.nextInt();

		// Conversión a mayúsculas y concatenación
		String categoriaMayus = categoria.toUpperCase();
		String codigoCompleto = categoriaMayus + "-" + identificador;
		System.out.println("Código generado: " + codigoCompleto);
		
		// b)
		char primeraLetra = categoriaMayus.charAt(0);
		String categoriaInvertida = "" + categoria.charAt(2) + categoria.charAt(1) + categoria.charAt(0);
		int longitudCodigo = codigoCompleto.length();
		
		System.out.println("Primera letra categoría: " + primeraLetra);
		System.out.println("Categoría invertida: " + categoriaInvertida);
		System.out.println("Longitud del código completo: " + longitudCodigo);
		
		teclado.close();
	}
}
