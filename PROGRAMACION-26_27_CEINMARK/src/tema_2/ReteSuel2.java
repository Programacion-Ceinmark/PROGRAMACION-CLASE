package tema_2;

import java.util.Scanner;

public class ReteSuel2 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el sueldo del trabajador: ");
		double sueldo = teclado.nextDouble();
		double porcentajeRetenecion;
		// Evaluacion del sueldo respecto a 1000.00
		if (sueldo < 1000.00) {
			porcentajeRetenecion = 10.0;
		} else if (sueldo == 1000.00) {
			porcentajeRetenecion = 12.0;
		} else if (sueldo < 2000.00){ 
			porcentajeRetenecion = 14.0;
		} else if(sueldo == 2000.00) {
			porcentajeRetenecion = 16.0;
		} else {// sueldo > 2000.00
			porcentajeRetenecion = 18.0;
		}
		double retencionTotal = sueldo * (porcentajeRetenecion / 100.0);
		// SUELDO QUE NOS QUEDA DESPUES DE QUE NOS QUITEN PASTA
		double sueldoFinal = sueldo - retencionTotal;
		System.out.printf("Retención aplicada (%.2f%%) a %.2f "
				+ "nos quitan %.2f € y nos queda %.2f €",
				porcentajeRetenecion, sueldo, retencionTotal, sueldoFinal);
		teclado.close();
	}
}
