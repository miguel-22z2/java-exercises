package nivel3;

import java.util.Scanner;
import utilitarios.Color;

/**
 * O programa vai funcionar desta maneira:
 * <p>
 * <h4>O programa funciona como um <u>Jogo da Velha!</u></h4>
 * <p>
 * @author Miguel Alessi Lenzi
 */

public class Exercicio50 {
	 static char jogadorAtual = 'X';
	 static int posicao;
	 static char[] tabuleiro = {'0', '1', '2', '3', '4', '5', '6', '7', '8'}; 
	 
	 static String caracterColorido(char c) {
		 if (c == 'X') {
			 return Color.RED + c + Color.RESET;
		 }
		 if (c == 'O') {
			 return Color.BLUE + c + Color.RESET;
		 }
		 return String.valueOf(c);
	 }
	public static void main(String[] args) {
		int tentativas = 0;
		Scanner teclado = new Scanner(System.in);
		
			while (true) {
				mostrarTabuleiro();
				System.out.print("Jogador " + caracterColorido(jogadorAtual) + ", escolha sua posição: ");
				String inputPosicao = teclado.next();
				
				try {
					posicao = Integer.parseInt(inputPosicao);
				} catch (NumberFormatException e) {
					System.out.println();
					System.out.println("Digite apenas posições válidas!");
					System.out.println();
					continue;
				}
				
				try {
					if (tabuleiro[posicao] == 'X' || tabuleiro[posicao] == 'O') {
						System.out.println();
						System.out.println("Posição já selecionada!");
						continue;
					}
				} catch (ArrayIndexOutOfBoundsException e) {
					System.out.println();
					System.out.println("Posição inválida!");
					continue;
				}
				
				tabuleiro[posicao] = jogadorAtual;
				tentativas++;
				
				if (verificarVencedor()) {
					mostrarTabuleiro();
					System.out.println("Jogador " + caracterColorido(jogadorAtual) + " venceu!!!");
					break;
				}
				
				if (tentativas == 9) {
					mostrarTabuleiro();
					System.out.println("Empate!");
					break;
				}
				
				if (jogadorAtual == 'X') {
					jogadorAtual = 'O';
				} else {
					jogadorAtual = 'X';
				} 
			}
			teclado.close();
	}
	public static void mostrarTabuleiro() {
		System.out.println();
		System.out.println(" | " + caracterColorido(tabuleiro[0]) + " | " + caracterColorido(tabuleiro[1]) + " | " +  caracterColorido(tabuleiro[2]) + " | ");
		System.out.println();
		System.out.println(" | " + caracterColorido(tabuleiro[3]) + " | " + caracterColorido(tabuleiro[4]) + " | " + caracterColorido(tabuleiro[5]) + " | ");
		System.out.println();
		System.out.println(" | " + caracterColorido(tabuleiro[6]) + " | " + caracterColorido(tabuleiro[7]) + " | " + caracterColorido(tabuleiro[8]) + " | ");
		System.out.println();
	}
	public static boolean verificarVencedor() {
		int[][] combinacoes = {
				{0, 1, 2}, {3, 4, 5}, {6, 7, 8},
				{0, 3, 6}, {1, 4, 7}, {2, 5, 8},
				{0, 4, 8}, {2, 4, 6}
		};
		
		for (int i = 0; i <= combinacoes.length - 1; i++) {
			int[] posicaoCombinacao = combinacoes[i];
			if (tabuleiro[posicaoCombinacao[0]] == jogadorAtual && tabuleiro[posicaoCombinacao[1]] == jogadorAtual && tabuleiro[posicaoCombinacao[2]] == jogadorAtual) {
				return true;
			}
		}
		return false;
	}
}
