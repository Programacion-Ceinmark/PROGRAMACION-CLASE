package tema_2;

import java.util.Scanner;

public class CalcuIVA {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce la cantidad de EUROS: ");
		double cantidad = teclado.nextDouble();
		double iva;
		
		// Condicion para euros menor que 20.000€
		if(cantidad < 20000) {
			iva = cantidad * 0.07; // 7% IVA
			System.out.println("IVA asignado: 7%");
		} else {
			iva = cantidad * 0.16; // 16% IVA
			System.out.println("IVA asignado: 16%");
		}
		System.out.println("El IVA es: " + iva + " €");
		System.out.println("El total con IVA es: " + (cantidad + iva) + " €");
		teclado.close();		
	}

}
