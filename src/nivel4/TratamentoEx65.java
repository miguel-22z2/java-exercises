package nivel4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TratamentoEx65 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		Integer numero = null;
		
		try {
			System.out.print("Digite um número: ");
			numero = teclado.nextInt();
			System.out.println();
		} catch (InputMismatchException e) {
			System.out.println("Digite somente números do tipo Integer!");
		}
		
		System.out.println(numero);
		
		teclado.close();
	}
}
