package nivel1;

import java.util.Scanner;

/**
 * O exercicio 17 vai funcionar desta forma:
 * <p>
 * O programa pede ao usuário digitar uma palavra, e depois verifica se ele é um palíndromo ou não. Exemplo:
 *<p>
 *Digite uam palavra: Bob
 *<p>
 *A palavra é um palíndromo.
 * 
 */

public class Exercicio17 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite uma palavra:");
		String palavra = teclado.nextLine().toLowerCase();
		
		String inverso = "";
		
		for (int i = palavra.length() - 1; i >= 0; i--) {
			inverso = inverso + palavra.charAt(i);
			
			
		}
		if (inverso.equals(palavra)) {
			System.out.println("A palavra é um palíndromo.");
			
		} else {
			System.out.println("A palavra não é um palíndromo");
			
		}
		teclado.close();
	}
}
