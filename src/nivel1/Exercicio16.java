package nivel1;

import java.util.Scanner;

/**
 * O exercicio 16 vai funcionar desta forma:
 * <p>
 * O programa pede ao usuário digitar uma palavra, depois, ele inverte a palavra
 * e mostra na tela. Exemplo:
 * <p>
 * Digite uma palavra: Banana
 * <p>
 * Essa palavra invertida é ananab
 * 
 */

public class Exercicio16 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite uma palavra:");
		String palavra = teclado.nextLine().toLowerCase();

		String inverso = "";

		for (int i = palavra.length() - 1; i >= 0; i--) {
			inverso = inverso + palavra.charAt(i);

		}
		System.out.println("Essa palavra invertida é " + inverso);
		teclado.close();
	}
}
