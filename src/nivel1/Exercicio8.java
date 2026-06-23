package nivel1;

import java.util.Scanner;

/**
 * O exercicio 8 vai funcionar desta forma:
 * <p>
 * O programa vai perguntar ao usuário 3 números, e depois, ele verifica qual é o maior entre eles. Exemplo:
 * <p>
 * Digite o 1º número: 2
 * <p>
 * Digite o 2º número: 4
 * <p>
 * Digite o 3º número: 6
 * <p>
 * O 3º número é maior.
 * 
 */

public class Exercicio8 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o 1º número:");
		int numero1 = teclado.nextInt();
		System.out.println("Digite o 2º número:");
		int numero2 = teclado.nextInt();
		System.out.println("Digite o 3º número:");
		int numero3 = teclado.nextInt();

		if (numero1 > numero2 && numero1 > numero3) {
			System.out.println("O 1º número é maior.");

		} else if (numero2 > numero1 && numero2 > numero3) {
			System.out.println("O 2º número é maior.");

		} else if (numero3 > numero1 && numero3 > numero2) {
			System.out.println("O 3º número é maior.");

		}
		teclado.close();
	}
}
