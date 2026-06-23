package nivel2;

import javax.swing.JOptionPane;

/**
 * O exercicio 23 vai funcionar desta forma:
 * <p>
 * O programa vai mostrar ao usuário a quantidade de números pares no array
 * listaNumeros abaixo.
 * 
 */

public class Exercicio23 {
	public static void main(String[] args) {
		int[] listaNumeros = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };

		int contadorPar = 0;
		
		for (int i = 1; i < listaNumeros.length; i++) {
			if (i % 2 == 0) {
				contadorPar++;
				
			}
		}
		
		if (contadorPar == 0) {
			JOptionPane.showMessageDialog(null, "Nesta lista não tem nenhum número par.", "Mensagem", JOptionPane.INFORMATION_MESSAGE, null);
		}
		JOptionPane.showMessageDialog(null, "Nesta lista tem " + contadorPar + " números par.", "Mensagem", JOptionPane.INFORMATION_MESSAGE, null);
		

	}

}
