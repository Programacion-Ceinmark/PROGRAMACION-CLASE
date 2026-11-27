package tema3_funciones;

import java.util.Scanner;

public class Grados {

	public static double celsiusAFahrenheit(double celsius) {
		return (celsius * 9.0 / 5.0) + 32;
	}

	public static double celsiusAKelvin(double celsius) {
		return celsius + 273.15;
	}

	public static void mostrarConversion(double celsius) {
		double f = celsiusAFahrenheit(celsius);
		double k = celsiusAKelvin(celsius);

		System.out.printf("%.2f ºC equivalen a %.2f ºF y %.2f K.%n", celsius, f, k);

	}

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce la temperatura en grados Celsius: ");
		double temp = teclado.nextDouble();
		mostrarConversion(temp);
		teclado.close();
	}

}
