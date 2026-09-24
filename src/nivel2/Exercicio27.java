package nivel2;

import java.util.Arrays;

import javax.swing.JOptionPane;

/**
 * O exercicio 27 vai funcionar desta forma:
 * <p>
 * O programa ordena o array listaNumeros usando o algoritimo Bubble Sort,
 * depois, verifica quantos valores duplicados tem dentro dele e retorna ao
 * usuário a lista sem os valores duplicados.
 */

public class Exercicio27 {
	public static void main(String[] args) {
		int[] listaNumeros = { 2, 2, 2, 2, 4, 4, 6, 5, 7, 8, 1 };
		int auxiliar;

		for (int i = 0; i < listaNumeros.length; i++) {
			for (int m = 0; m < listaNumeros.length - 1 - i; m++) {
				if (listaNumeros[m] > listaNumeros[m + 1]) {
					auxiliar = listaNumeros[m];
					listaNumeros[m] = listaNumeros[m + 1];
					listaNumeros[m + 1] = auxiliar;
				}
			}
		}
		
		JOptionPane.showMessageDialog(null, "Lista original ordenada: " + Arrays.toString(listaNumeros), "Programa",
				JOptionPane.INFORMATION_MESSAGE, null);

		int[] temporario = new int[listaNumeros.length];
		int auxiliar2 = 0;

		for (int i = 0; i < listaNumeros.length - 1; i++) {
			if (listaNumeros[i] != listaNumeros[i + 1]) {
				temporario[auxiliar2++] = listaNumeros[i];
 
			}
		}
		
		temporario[auxiliar2++] = listaNumeros[listaNumeros.length - 1];

		int[] resultadoFinal = Arrays.copyOf(temporario, auxiliar2);

		JOptionPane.showMessageDialog(null, "Lista sem valores duplicados: " + Arrays.toString(resultadoFinal), null,
				JOptionPane.INFORMATION_MESSAGE, null);

	}
}