package nivel2;

import javax.swing.JOptionPane;

/**
 * O exercicio 36 vai funcionar desta forma:
 * <p>
 * O programa verifica se a matriz é simétrica ou não.
 * Se ela for simétrica, ele retorna ao usuário que a matriz é simétrica, se não, 
 * ele retorna o oposto.
 */

public class Exercicio36 {
	public static void main(String[] args) {
		int[][] matriz = { 
				{ 4, 4, 3 }, 
				{ 3, 4, 2 }, 
				{ 2, 3, 4 }, 
				}; 
		
		if (simetrico(matriz)) {
			JOptionPane.showMessageDialog(null, "A matriz é simétrica!", "Programa", JOptionPane.INFORMATION_MESSAGE, null);
			
		} else {
			JOptionPane.showMessageDialog(null, "A matriz não é simétrica!", "Programa", JOptionPane.INFORMATION_MESSAGE, null);
			
		}

	}
	public static boolean simetrico(int[][] m) {
		int linhas = m.length;
		int colunas = m[0].length;
		
		if (linhas != colunas) {
			return false;
		}
		
		for (int i = 0; i < linhas; i++) {
			for (int j = i + 1; j < colunas; j++) {
				if (m[i][j] != m[j][i]) {
					return false;
				}
			}
		}
		return true;
	}

}
