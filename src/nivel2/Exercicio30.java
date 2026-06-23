package nivel2;

import javax.swing.JOptionPane;

public class Exercicio30 {
	public static void main(String[] args) {
		int[][] matriz = {
				{2, 4, 5},	
				{6, 8, 6},
				{5, 2, 1},
		};
		
		int[][] resultado = new int[3][3];
		
		int soma = 0;
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				for (int k = 0; k < matriz.length; k++) {
					soma += resultado[i][j] + resultado[j][i];
				}
			}
		}
		JOptionPane.showMessageDialog(null, "Resultado: " + soma, "Programa", JOptionPane.INFORMATION_MESSAGE, null);
	}
}
