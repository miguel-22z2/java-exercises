package nivel1;

import java.util.Scanner;

/**
 * O exercicio 6 vai funcionar desta forma:
 * <p>
 * O programa pergunta ao usuário um número, e depois, ele verifica se ele é par ou ímpar. Exemplo:
 * <p>
 * Digite um número: 2
 * <p>
 * O número é PAR.
 * 
 */

public class Exercicio6 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um número:");
		int numero = teclado.nextInt();

		if (numero % 2 == 0) {
			System.out.println("O número é PAR.");

		} else {
			System.out.println("O número é ÍMPAR.");

		}
		teclado.close();
	}
}
