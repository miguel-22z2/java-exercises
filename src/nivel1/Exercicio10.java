package nivel1;

import java.util.Scanner;

/**
 * O exercicio 10 vai funcionar desta forma:
 * <p>
 * O programa pergunta ao usuário um número, depois, ele verifica se ele é positivo, zero ou negativo. Exemplo:
 * <p>
 * Digite um número: 14
 * <p>
 * POSITIVO
 * 
 */

public class Exercicio10 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um número:");
		int numero = teclado.nextInt();

		if (numero < -1) {
			System.out.println("NEGATIVO");

		} else if (numero == 0) {
			System.out.println("ZERO");

		} else if (numero > 1) {
			System.out.println("POSITIVO");

		}
		teclado.close();
	}
}
