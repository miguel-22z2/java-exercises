package nivel3;

import javax.swing.JOptionPane;

/**
 * O exercicio 42 vai funcionar desta forma:
 * <p>
 * O programa faz o fatorial do número que o usuário digitar,
 *  utilizando método recursivo.
 * 
 */
public class Exercicio42 {
	public static void main(String[] args) {
		try {
			String numeroInput = JOptionPane.showInputDialog(null, "Digite um número para fazer seu fatorial:", "Programa", JOptionPane.INFORMATION_MESSAGE);
			long numero = Long.parseLong(numeroInput);
			JOptionPane.showMessageDialog(null, "O fatorial é " + fatorial(numero) + '.', "Programa", JOptionPane.INFORMATION_MESSAGE);
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Digite somente números inteiros!", "Programa", JOptionPane.INFORMATION_MESSAGE, null);
		}
	}
	static long fatorial(long numeroFatorial) {
		long resultado = numeroFatorial;
		if (numeroFatorial > 1) {
			resultado *= fatorial(numeroFatorial - 1);
		}
		return resultado;
	}
}
