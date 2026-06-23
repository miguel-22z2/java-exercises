package nivel2;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * O exercicio 21 vai funcionar desta forma:
 * <p>
 * O programa pede ao usuário 10 números, e depois, o programa retorna o maior
 * número da lista.
 * 
 * 
 */

public class Exercicio21 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int[] listaNumeros = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		int maior = listaNumeros[0];
		for (int i = 1; i < listaNumeros.length; i++) {
			if (maior < listaNumeros[i]) {
				maior = listaNumeros[i];
			}
		}
		// System.out.println("O maior número desta lista é o número " + maior);
		JOptionPane.showMessageDialog(null, "O maior números desta lista é " + maior);
		teclado.close();

	}
}
