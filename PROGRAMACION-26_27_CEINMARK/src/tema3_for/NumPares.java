package tema3_for;

public class NumPares {
	public static void main(String[] args) {
		System.out.println("Números pares del 2 al 10: ");
		for (int i = 2; i <= 10; i+=2) {
			if (i != 10) {
				System.out.print(i + ", ");	
			}else {
				System.out.println(i);
			}
			
		}
	}
}
