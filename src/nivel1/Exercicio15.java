package nivel1;

import java.util.Scanner;

/**
 * O exercicio 15 vai funcionar desta forma:
 * <p>
 * O programa pede ao usuário digitar uma palavra, depois, ele checa quantas
 * vogais tem. Exemplo:
 * <p>
 * Digite uma palavra: Banana
 * <p>
 * A palavra tem 3 vogais.
 * 
 */

public class Exercicio15 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite uma palavra:");
		String palavra = teclado.nextLine().toLowerCase();

		int vogais = 0;

		for (int i = 0; i < palavra.length(); i++) {
			char letra = palavra.charAt(i);

			if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
				vogais++;

			}

		}
		if (vogais == 0) {
			System.out.println("A palavra não tem nenhuma vogal.");

		} else {
			System.out.println("A palavra tem " + vogais + " vogais.");
		}
		teclado.close();
	}
}
