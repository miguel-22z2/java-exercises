package nivel2;

import java.util.Scanner;

/**
 * O exercicio 33 vai funcionar desta forma:
 * <p>
 * O programa vai pedir ao usuário digitar um texto e daí
 * ele retorna ao usuário a quantidade de letras que tem no texto e quantas vezes
 * a letra apareceu.
 */

public class Exericicio33 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite uma palavra:");
		String texto = teclado.nextLine().toLowerCase();

		int[] contagem = new int[26];

		for (int i = 0; i < texto.length(); i++) {
			char caractere = texto.charAt(i);

			if (caractere >= 'a' && caractere <= 'z') {
				contagem[caractere - 'a']++;

			}
		}
		System.out.println("Frequência de caracteres:");
		System.out.println("");

		for (int i = 0; i < 26; i++) {
			if (contagem[i] > 0) {
				char letra = (char) (i + 'a');
				System.out.println("Letra " + letra + ": " + contagem[i] + " vez(es)");

			}

		}
		teclado.close();
	}
}
