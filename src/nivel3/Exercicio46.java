package nivel3;

import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 * O programa vai funcionar desta forma:
 * <p>
 * <h4>O programa verifica um número que o usuário digitou e depois, ele retorna <u>se o número é primo
 * ou não.</u></h4>
 * <p><h4>O programa verifica se o número é primo ou não utilizando métodos.</h4></p>
 * @author Miguel Alessi Lenzi
 */

public class Exercicio46 {
	public static void main(String[] args) {
		// Alterando LookAndFell:
		try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
        	System.err.println(ex);
        } catch (InstantiationException ex) {
        	System.err.println(ex);
        } catch (IllegalAccessException ex) {
        	System.err.println(ex);
        } catch (UnsupportedLookAndFeelException ex) {
        	System.err.println(ex);
        }
		String inputNumero = JOptionPane.showInputDialog(null, "Digite um número:", "Programa", JOptionPane.INFORMATION_MESSAGE);
		int numero = Integer.parseInt(inputNumero);
		if (verificarPrimo(numero)) {
			JOptionPane.showMessageDialog(null, "O número " + numero + " é primo!", "Programa", JOptionPane.INFORMATION_MESSAGE, null);
		} else {
			JOptionPane.showMessageDialog(null, "O número " + numero + " não é primo!", "Programa", JOptionPane.WARNING_MESSAGE, null);
		}
	}

	public static boolean verificarPrimo(int numero) {
		boolean ePrimo = true;
		if (numero <= 1) {
			ePrimo = false;
		} else {
			for (int i = 2; i <= Math.sqrt(numero); i++) {
				if (numero % i != 0) {
					ePrimo = true;
					break;
				}
				ePrimo = false;
			}
		}
		return ePrimo;
	}
	
}
