package nivel2;

import javax.swing.JOptionPane;

/**
 * O exercicio 34 vai funcionar desta forma:
 * <p>
 * O programa pede ao usuário um valor binário e depois, o programa retorna o numero binário em decimal.
 * 
 */

public class Exercicio34 {
	public static void main(String[] args) {
		String binario = JOptionPane.showInputDialog(null, "Digite o valor binário:", "Programa",
				JOptionPane.INFORMATION_MESSAGE);
		int potencia = 0;
		int decimal = 0;

		for (int i = binario.length() - 1; i >= 0; i--) {
			int digito = Character.getNumericValue(binario.charAt(i));

			decimal += digito * Math.pow(2, potencia);

			potencia++;
		}
		JOptionPane.showMessageDialog(null, "O número " + binario + " em decimal é " + decimal, "Programa",
				JOptionPane.INFORMATION_MESSAGE, null);

	}
}
