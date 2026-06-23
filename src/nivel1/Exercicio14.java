package nivel1;

import java.util.Scanner;

/**
 * O exercicio 14 vai funcionar desta forma:
 * <p>
 * O programa pede ao usuário para digitar um número, depois, ele verifica se
 * ele é primo ou não. Exemplo:
 * <p>
 * Digite um número: 3
 * <p>
 * O número 3 é PRIMO.
 * 
 */

public class Exercicio14 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um número:");
		int numero = teclado.nextInt();

		if (numero % 2 != 0) {
			System.out.println("O número é primo!");
		} else {
			System.out.println("O número não é primo!");
		}
		
		teclado.close();
	}
}
