package nivel3;

import java.util.Arrays;

import javax.swing.JOptionPane;

/**
 * O exercicio 44 vai funcionar desta forma:
 * <p>
 * O exercicio vai procurar um elemento no array, usando busca binária.
 * Se o elemento for encontrado, o programa retorna ao usuário que ele foi encontrado
 * e também, sua posição no array. Caso não encontrar o elemento, o programa retorna
 * ao usuário que o elemento não foi encontrado.
 * 
 */

public class Exercicio44 {
	public static void main(String[] args) {
		int[] arrayNumeros = { 2, 1, 7, 5, 10, 16 };
		Arrays.sort(arrayNumeros);
		int numeroEscolhido = 2;
		int posiçaoNumero = buscaBinaria(arrayNumeros, numeroEscolhido);

		if (posiçaoNumero != -1) {
			JOptionPane.showMessageDialog(null, "Número encontrado na posição " + posiçaoNumero + '.', "Programa", JOptionPane.INFORMATION_MESSAGE, null);
		} else {
			JOptionPane.showMessageDialog(null, "Número não encontrado!", "Programa", JOptionPane.WARNING_MESSAGE, null);
		}
	}

	public static int buscaBinaria(int[] arrayNumeros, int numero) {
		int inicio = 0; int fim = arrayNumeros.length - 1;
		
		while (inicio <= fim) { 
			int meio = (inicio + fim) / 2;
			if (arrayNumeros[meio] == numero) {
				return meio;
			} else if (arrayNumeros[meio] < numero) {
				inicio = meio + 1;
			} else {
				fim = meio - 1;
			}
		}
		return -1;
	}
}
