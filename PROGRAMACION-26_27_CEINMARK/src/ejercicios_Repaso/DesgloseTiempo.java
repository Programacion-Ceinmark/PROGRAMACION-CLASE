package ejercicios_Repaso;

import java.util.Scanner;

public class DesgloseTiempo {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce la cantidad total de segundos: ");
		int totalSeg = teclado.nextInt();
		
		int horas = totalSeg / 3600;
		int resto = totalSeg % 3600;
		int minutos = resto / 60;
		int segundos = resto % 60;
		
		System.out.println(totalSeg + " segundos -> " + horas + " horas, " + minutos + "minutos, " + segundos + " segundos");
	}

}
