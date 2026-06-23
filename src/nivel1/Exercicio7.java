package nivel1;

import java.util.Scanner;

/**
 * O exercicio 7 vai funcionar desta forma:
 * <p>
 * O programa pergunta ao usuário 2 números, e depois, verifica qual é o maior entre eles. Exemplo:
 * <p>
 * Digite o 1º número: 2
 * <p>
 * Digite o 2º número: 4
 * <p>
 * O 2º número é maior.
 * 
 */

public class Exercicio7 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o 1º número:");
		int numero1 = teclado.nextInt();
		System.out.println("Digite o 2º número:");
		int numero2 = teclado.nextInt();

		if (numero1 > numero2) {
			System.out.println("O 1º número é maior.");

		} else {
			System.out.println("O 2º número é maior.");

		}
		teclado.close();
	}
}
