package nivel2;

import java.util.Scanner;

public class Exercicio37 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o tamanho da matriz:");
		int tamanhoMatriz = teclado.nextInt();
		
		int[][] matriz = new int[tamanhoMatriz][tamanhoMatriz];
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if (i == j) {
					matriz[i][i] = 1;
					
				} else {
					matriz[j][i] = 0;
					
				}
			}
		}
		System.out.println("Matriz identidade tamanho " + tamanhoMatriz + "x" + tamanhoMatriz + ":");
		System.out.println(" ");
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println(" ");
		}
		teclado.close();
	}
}
