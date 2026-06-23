package nivel2;

import javax.swing.JOptionPane;

/**
 * O exercicio 22 vai funcionar desta forma:
 * <p>
 * O programa vai mostrar a média dos números dentro do array listaNumeros
 * abaixo.
 */

public class Exercicio22 {
	public static void main(String[] args) {
		int[] listaNumeros = { 1, 5, 3, 15, 5, 12, 3, 7, 34, 9, 11, 55, 17 };

		int soma = listaNumeros[0];

		for (int i = 1; i < listaNumeros.length; i++) {
			soma = soma + listaNumeros[i];

		}
		float media = soma / listaNumeros.length;
		JOptionPane.showMessageDialog(null, "A média desta lista é " + media);
	}
}
