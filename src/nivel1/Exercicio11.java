package nivel1;

import java.util.Scanner;

/**
 * O exercicio 11 vai funcionar desta forma:
 * <p>
 * O programa pede ao usuário um número, depois, ele mostra sua tabuada. Exemplo:
 * <p>
 * Digite um número para ver sua tabuada: 2
 * <p>
 * Programa retorna ao usuário a tabuada do número 2.
 * 
 */

public class Exercicio11 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um número para ver sua tabuada:");
		int numero = teclado.nextInt();
		System.out.println(" ");

		for (int i = 1; i <= 10; i++)
			System.out.println(numero + " x " + i + " = " + (numero * i));
			teclado.close();
	}

}
