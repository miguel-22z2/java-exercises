package nivel2;

import java.util.Arrays;

import javax.swing.JOptionPane;

/**
 * O exercicio 29 vai funcionar desta forma:
 * <p>
 * O programa vai multiplicar uma matriz 2x2 e retorna ao usuário o resultado.
 * 
 */

@SuppressWarnings("unused")
public class Exericicio29 {
	public static void main(String[] args) {
		int[][] primeiraMatriz = { 
				{ 2, 2 }, 
				{ 2, 2 } 
			};
 
		int[][] segundaMatriz = { 
				{ 2, 2 },
				{ 2, 2 } 
			};

		int[][] resultado = new int[2][2];

		for (int i = 0; i < primeiraMatriz.length; i++) {
			for (int j = 0; j < segundaMatriz.length; j++) {
				for (int k = 0; k < 2; k++) {
					resultado[i][j] += primeiraMatriz[i][j] * segundaMatriz[i][j];
				}
			}
		}
		
		System.out.println("Resultado:");
		System.out.println();
		
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(resultado[i][j] + " ");
			}
			System.out.println();
		}
	}

}
