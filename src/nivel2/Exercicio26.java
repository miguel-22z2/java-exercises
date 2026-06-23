package nivel2;

import javax.swing.JOptionPane;

/**
 * O exercicio 26 vai funcionar desta forma:
 * <p>
 * O programa verfica dentro do array listaNumeros qual é o sugundo maior valor
 * dentro dele e retorna ao usuário.
 * 
 */

public class Exercicio26 {
	public static void main(String[] args) {
		int[] listaNumeros = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int segundoMaior = listaNumeros[0];

		for (int i = 0; i < listaNumeros.length; i++) {
			if (segundoMaior < listaNumeros[i]) {
				segundoMaior = listaNumeros[i - 1];

			}

		}
		JOptionPane.showMessageDialog(null, "O segundo maior número da lista é " + segundoMaior, "Programa",
				JOptionPane.INFORMATION_MESSAGE, null);

	}

}
