package tema_2_estructuras_selectivas;

import java.util.Scanner;

public class Expendedora {

	public static void main(String[] args) {

		// definimos scanner
		Scanner teclado = new Scanner(System.in);
		
		// definimos los precios de los productos en centimos
		// son FINAL porque no cambian en ningún momento
		final int PRECIO_CAFE = 43; // 0,43€
		final int PRECIO_REFRESCO = 111; // 1,11€
		final int PRECIO_AGUA = 36; // 0,36€
		
		// pedimos las monedas (saldo) al usuario
		System.out.println("Introduce tu saldo en euros (ej. 2,50): ");
		double saldo = teclado.nextDouble();
		
		// calculamos los centimos de lo que metemos
		double saldoCentimos = saldo * 100;
		
		// Mostrar el menú con las opciones al usuario
		System.out.println("\n--- MENÚ EXPENDEDORA ---");
		System.out.println("1. Café (0,43€)");
		System.out.println("2. Refresco (1,11€)");
		System.out.println("3. Agua (0,36€)");

		// pedimos la opción y lo guardamos
		System.out.println("Selecciona una opción: ");
		int opcion = teclado.nextInt();
		
		// defino una variable para sobreescribir el precio
		int precioSeleccionado = 0;
		
		// defino la variable para controlar que mete una opción valida
		boolean opcionValida = true;
		
		// definimos el switch
		switch(opcion) {
		case 1:
			precioSeleccionado = PRECIO_CAFE;
			break;
			
		case 2:
			precioSeleccionado = PRECIO_REFRESCO;
			break;
			
		case 3:
			precioSeleccionado = PRECIO_AGUA;
			break;
			
		default:
			opcionValida = false;
			break;
		}
		
		// R1. OPCIÓN INCORRECTA SELECCIONADA
		if (!opcionValida) {
			System.out.println("Opción incorrecta");
			System.out.printf("Se está devolviendo su saldo: %.1f\n", saldo);
		// R2. SALDO INSUFICIENTE	
		}else if(saldoCentimos < precioSeleccionado) {
			System.out.println("Saldo insuficiente");
			System.out.printf("Se está devolviendo su saldo: %.1f\n", saldo);
			
		// CUANDO SE PUEDE COMPRAR
		}else {
			System.out.println("\nSu producto. Gracias");
			
			// Para devolver el cambio hay que calcularlo EN CÉNTIMOS
			System.out.println("SALDO CENTIMOS: " + saldoCentimos + "   -   " + precioSeleccionado);
			// forzamos el saldo a int para saber sus centimos
			int cambio = (int) saldoCentimos - precioSeleccionado;
			System.out.printf("Cambio total a devolver: %.2f €\n\n", cambio / 100.0);
			
			// Realizamos el desglose de las monedas
			int mon_2e = cambio / 200;
			cambio = cambio % 200;
			
			int mon_1e = cambio / 100;
			cambio = cambio % 100;
			
			int mon_50c = cambio / 50;
			cambio = cambio % 50;
			
			int mon_20c = cambio / 20;
			cambio = cambio % 20;
			
			int mon_10c = cambio / 10;
			cambio = cambio % 10;
			
			int mon_5c = cambio / 5;
			cambio = cambio % 5;
			
			int mon_2c = cambio / 2;
			cambio = cambio % 2;
			
			int mon_1c = cambio; // lo que queda son monedas de 1 céntimo
			
			// Imprimimos el desglose
			System.out.println("Desglose del cambio en monedas: ");
			if(mon_2e > 0) System.out.println("- MONEDAS DE 2€: " + mon_2e);
			if(mon_1e > 0) System.out.println("- MONEDAS DE 1€: " + mon_1e);
			if(mon_50c > 0) System.out.println("- MONEDAS DE 0.50€: " + mon_50c);
			if(mon_20c > 0) System.out.println("- MONEDAS DE 0.20€: " + mon_20c);
			if(mon_10c > 0) System.out.println("- MONEDAS DE 0.10€: " + mon_10c);
			if(mon_5c > 0) System.out.println("- MONEDAS DE 0.05€: " + mon_5c);
			if(mon_2c > 0) System.out.println("- MONEDAS DE 0.02€: " + mon_2c);
			if(mon_1c > 0) System.out.println("- MONEDAS DE 0.01€: " + mon_1c);
		}
		teclado.close();
	}

}
