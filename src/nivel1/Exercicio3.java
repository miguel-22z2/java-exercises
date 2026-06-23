package nivel1;

import java.util.Scanner;

/**
 * O exercicio 2 vai funcionar desta forma:
 * <p>
 * O programa pede ao usuário 2 números, depois, faz a soma entre eles. Exemplo:
 * <p>
 * Digite um número: 2
 * Digite outro número: 4
 * <p>
 * A soma entre eles é 6 (2 + 4)
 * 
 */

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um número:");
		int numero1 = teclado.nextInt();
		System.out.println("Digite outro número:");
		int numero2 = teclado.nextInt();
		System.out.println("A soma entre esses 2 números é " + (numero1 + numero2));
		teclado.close();
	}
}
