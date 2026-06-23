package nivel1;

import java.util.Scanner;

/**
 * O exercicio 12 vai funcionar desta forma:
 * <p>
 * O programa pede ao usuário um número para fazer a soma de 1 até o número que o usuário digitou. Exemplo:
 * <p>
 * Digite um número para a soma: 10
 * <p>
 * O resultado é: 45
 * 
 */

public class Exercicio12 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um número para a soma:");
		int numero = teclado.nextInt();
		int valor = 0;

		for (int i = 1; i < numero; i++) {
			valor += i;
			
		}
		System.out.println("O resultado é " + valor);
		teclado.close();
	}
}
