package nivel2;

import javax.swing.JOptionPane;

/**
 * O exercicio 35 vai funcionar desta forma:
 * <p>
 * O programa pede um valor decimal ao usuário e depois, ele retorna ao usuário o valor decimal que ele digitou em um
 * valor binario.
 */

public class Exercicio35 {
	public static void main(String[] args) {

		String inputDecimal = JOptionPane.showInputDialog(null,
				"Digite um número em decimal\npara converte-lo em binário:", "Programa",
				JOptionPane.INFORMATION_MESSAGE);
		int decimal = Integer.parseInt(inputDecimal);

		if (decimal == 0) {
			JOptionPane.showMessageDialog(null, "O número 0 em binário é 0.", "Programa",
					JOptionPane.INFORMATION_MESSAGE, null) ;

		} else {
			String binario = "";
			int numero = decimal;

			while (numero > 0) {
				int resto = numero % 2;

				binario = resto + binario;

				numero = numero / 2;

			}
			JOptionPane.showMessageDialog(null, "O número " + decimal + " em binário é " + binario, "Programa",
					JOptionPane.INFORMATION_MESSAGE, null);

		}
	}
}
