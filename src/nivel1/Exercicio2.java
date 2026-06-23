package nivel1;

import java.util.Scanner;

/**
 * O exercicio 2 vai funcionar desta forma:
 * <p>
 * O programa pergunta ao usuário seu nome, depois da uma mensagem de
 * boas-vindas. Exemplo:
 * <p>
 * Digite seu nome: Miguel
 * <p>
 * É um prazer te conhecer, Miguel
 * 
 */

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		String nome = teclado.next();
		System.out.println("É um prazer te conhecer, " + nome + '!');
		teclado.close();
	}

}
