package nivel1;

import java.util.Scanner;

/**
 * O exercicio 4 vai funcionar desta forma:
 * <p>
 * O programa pede ao usuário 3 números, e depois, mostra a média entre eles. Exemplo:
 * <p>
 * Digite o 1º número: 2
 * <p>
 * Digite o 2º número: 4
 *<p>
 * Digite o 3º número: 6
 * <p>
 * A média desses 3 números é 6 (2 + 4 + 6) / 2
 * 
 */

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o 1º número:");
		int numero1 = teclado.nextInt();
		System.out.println("Digite o 2º número:");
		int numero2 = teclado.nextInt();
		System.out.println("Digite o 3º número:");
		int numero3 = teclado.nextInt();
		int media = (numero1 + numero2 + numero3) / 3;
		System.out.println("A média desses 3 números é " + media);
		teclado.close();
	}
}
