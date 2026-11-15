package ejercicios;

import java.util.Scanner;

public class LonCircu {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Intrudce el radio: ");
		double radio = teclado.nextDouble();
		double longitud = 2*Math.PI * radio;
		double area = Math.PI * radio*radio;
		double cubo = Math.PI * Math.pow(radio, 3);		
		
		System.out.println("La longitud es: " + longitud);
		System.out.printf("La longitud redondeada es: %.2f", longitud);
		System.out.printf("%nEl area es: %.2f", area);
		System.out.printf("%nEl area es: %.2f", cubo);
		
		System.out.println("Intrudce la cantidad en euros: ");
		double cantidad = teclado.nextDouble();
		System.out.println("Intrudce el interes ej(5,5): ");
		double tipoInteres = teclado.nextDouble();
		System.out.println("Intrudce el tiempo en dias: ");
		int tiempo = teclado.nextInt();
		double interes = (cantidad * tipoInteres * tiempo)/(360*100);
		System.out.printf("El interes producido con un tipo del %.2f%% es: %.2f euros", tipoInteres, interes );
		
		System.out.println("Introduce un numero: ");
		double numIntroducido = teclado.nextDouble();
		long parteEntera = (long) numIntroducido;
		double parteDecimal = numIntroducido - parteEntera;
		
		System.out.println("El numero es: " + numIntroducido);
		System.out.println("Parte entera: "+ parteEntera);
		System.out.printf("Parte decimal: %.2f", parteDecimal);
		
		
		System.out.println("Introduce una cantidad en euros: ");
		double cantidadEuros = teclado.nextDouble();
		int euros = (int) cantidadEuros;
		int centimos = (int) Math.round((cantidadEuros-euros)*100);
		System.out.println("Euros: " + euros);
		System.out.println("Centimos: " + centimos);
		
		
		teclado.close();
	}

}
