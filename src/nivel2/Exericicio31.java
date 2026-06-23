package nivel2;

import javax.swing.JOptionPane;
import java.util.Random;

/**
 * O exercicio 31 vai funcionar desta forma:
 * <p>
 * O programa pensa em um número e pede para o usuário digitar um número
 * <p>
 * Se o usuário acertar o número que o computador pensou, ele retorna que o usuário acertou,
 * caso contrário, ele fala que o usuário errou.
 */

public class Exericicio31 {
	public static void main(String[] args) {

		while (true) {
			Random geradorAleatorio = new Random();
			JOptionPane.showMessageDialog(null, "Pensei em um número entre 0 e 10...", "Programa",
					JOptionPane.INFORMATION_MESSAGE, null);
			String numero = JOptionPane.showInputDialog(null, "Que número eu pensei?", "Programa",
					JOptionPane.QUESTION_MESSAGE);
			int valor = Integer.parseInt(numero);
			int valorSorteado = geradorAleatorio.nextInt(10) + 0;

			if (valor > 11) {
				JOptionPane.showMessageDialog(null, "Eu pensei em número entre 0 e 10, e não acima de 10!", "Programa",
						JOptionPane.INFORMATION_MESSAGE, null);
				continue;
			}

			if (valor == valorSorteado) {
				JOptionPane.showMessageDialog(null, "Boa! Você acertou!", "Programa", JOptionPane.INFORMATION_MESSAGE,
						null);
				break;
			}

			if (valor != valorSorteado) {
				JOptionPane.showMessageDialog(null, "Vish... Você errou!", "Programa", JOptionPane.INFORMATION_MESSAGE,
						null);
				continue;
			}
		}

	}
}
