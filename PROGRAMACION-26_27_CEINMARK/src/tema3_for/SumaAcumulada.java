package tema3_for;

public class SumaAcumulada {

	public static void main(String[] args) {
		// variable para ir guardando el resultado
		int suma = 0;
		
		for (int i = 1; i <= 5; i++) {
			System.out.println(suma + " + " + i + ": " + (suma+i));
			suma = suma + i;
			
		}
		System.out.println("Suma de los primeros 5 números (1 al 5) es: " + suma);
	}

}
