package nivel2;

import javax.swing.JOptionPane;

/**
 * O exercicio 25 vai funcionar desta forma:
 * <p>
 * O programa pede ao usuário um número, depois, ele verifica se o número está
 * na lista e retorna ao usuário seu endereçamento, caso ao contrário, o
 * programa retorna que o número não está na lista.
 * 
 */

public class Exercicio25 {
	public static void main(String[] args) {
		int[] listaNumeros = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		String numero = JOptionPane.showInputDialog(null, "Digite o número que você quer encontrar:", "Programa",
				JOptionPane.INFORMATION_MESSAGE);
		int valor = Integer.parseInt(numero);

		boolean encontrado = false;

		for (int i = 0; i < listaNumeros.length; i++) {
			if (listaNumeros[i] == valor) {
				JOptionPane.showMessageDialog(null, "O número " + valor + " está na lista. Ele está no endereço " + i,
						"Programa", JOptionPane.INFORMATION_MESSAGE, null);
				encontrado = true;
				break;
			}
			encontrado = false;
		}
		if (encontrado == false) {
			JOptionPane.showMessageDialog(null, "Número não encontrado!", "Programa", JOptionPane.INFORMATION_MESSAGE, null);
		}
	}
}
