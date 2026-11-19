package tema_2_estructuras_selectivas;

import java.util.Scanner;

public class Romanos {

	public static void main(String[] args) {

		// definimos el scanner y pedimos un nº entre 1-99
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un nº entero entre 1 y 99: ");

		// Comprobamos si el usuario ha metido un entero
		if (teclado.hasNextInt()) {
			// registramos el nº introducido
			int num = teclado.nextInt();

			// Validamos que num está dentro del rango definido (del 1 al 99)

			if (num >= 1 && num <= 99) {

				// descomponemos el nº en 2
				int decenas = num / 10;
				int unidades = num % 10;

				// definir dos variables para cada dígito romano
				String romano_DEC = "";
				String romano_UN = "";

				// 1. obtenemos las decenas en romano
				switch (decenas) {
					case 1: romano_DEC = "X"; break;
					case 2: romano_DEC = "XX"; break;
					case 3: romano_DEC = "XXX"; break;
					case 4: romano_DEC = "XL"; break;
	                case 5: romano_DEC = "L"; break;
	                case 6: romano_DEC = "LX"; break;
	                case 7: romano_DEC = "LXX"; break;
	                case 8: romano_DEC = "LXXX"; break;
	                case 9: romano_DEC = "XC"; break;
	                default: romano_DEC = ""; break; // Caso decenas == 0
				}
				// 2. Obtención de las unidades en romano
                switch (unidades) {
                	case 1: romano_UN = "I"; break;
                    case 2: romano_UN = "II"; break;
                    case 3: romano_UN = "III"; break;
                    case 4: romano_UN = "IV"; break;
                    case 5: romano_UN = "V"; break;
                    case 6: romano_UN = "VI"; break;
                    case 7: romano_UN = "VII"; break;
                    case 8: romano_UN = "VIII"; break;
                    case 9: romano_UN = "IX"; break;
                    default: romano_UN = ""; break; // Caso unidades == 0
                }
                // Juntar ambos digitos romanos y devolver el resultado
                System.out.println("El número " + num + " en romano es: " + romano_DEC + romano_UN);                
			} else {
				System.out.println("Número introducido fuera del rango");
			}
		}else {
			System.out.println("No has introducido un número!!");
		}
		teclado.close();
	}
}
