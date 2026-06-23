package nivel1;

import java.util.Scanner;

/**
 * O exercicio 5 vai funcionar desta forma:
 * <p>
 * O programa pergunta ao usuário a temperatura em Cº, e depois, faz a conversão em Fº. Exemplo:
 * <p>
 * Digite a temperatura em Cº: 25
 * <p>
 * Essa temperatura em Fº é 77Fº ((25 * 1.8) + 32)
 * 
 */

public class Exercicio5 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite a temperatura em Cº:");
		int celcius = teclado.nextInt();
		double farenhait = (celcius * 1.8) + 32;
		System.out.println("Essa temperatura em Fº é " + farenhait + "Fº");
		teclado.close();
	}
}
