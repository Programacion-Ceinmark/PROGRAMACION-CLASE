package tema_2;

import java.util.Scanner;

public class CalcHoras {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce las horas: ");
		int h = sc.nextInt();
		System.out.print("Introduce los minutos: ");
		int m = sc.nextInt();
		System.out.print("Introduce los segundos: ");
		int s = sc.nextInt();

		// Incrementamos un segundo
		s++;

		// Manejo de acarreos (si se alcanzan 60 segundos o minutos)
		if (s == 60) {
			s = 0;
			m++; // Incrementamos un minuto
			if (m == 60) {
				m = 0;
				h++; // Incrementamos una hora
			}
		}

		System.out.println("Hora incrementada: " + h + "h " + m + "m " + s + "s");
		sc.close();
	}
}