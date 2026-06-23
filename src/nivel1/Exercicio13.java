package nivel1;

import java.util.Scanner;

/**
 * O exercicio 13 vai funcionar desta forma:
 * <p>
 * O programam pede ao usuário um número para fazer seu fatorial. Exemplo:
 * <p>
 * Digite um número para fazer o fatorial: 5
 * <p>
 * O resultado é 120
 * 
 */

public class Exercicio13 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um número para fazer o fatorial: ");
		long numero = teclado.nextLong();
		long valor = 1;
		
		for (int i = 1; i < numero; i++) {
			valor *= i;
			
		}
		System.out.println("O resultado é " + valor);
		teclado.close();
	}
}
