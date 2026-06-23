package nivel2;

import javax.swing.JOptionPane;
import java.util.Arrays;
import java.util.Random;

/**
 * O exercicio 24 vai funcionar desta forma:
 * <p>
 * O programa lê um array e ordena ele, mostrando do menor até o maior. (Bubble
 * sort manual)
 */

public class Exercicio24 {
	public static void main(String[] args) {
		Random numeroAleatorio = new Random();
		int[] listaNumeros = new int[10];
		for (int i = 0; i <= listaNumeros.length - 1; i++) {
			listaNumeros[i] = numeroAleatorio.nextInt(100) + 1;
		}
		int auxiliar;
		
		JOptionPane.showMessageDialog(null, "Lista original: " + Arrays.toString(listaNumeros), "Programa", JOptionPane.INFORMATION_MESSAGE, null);

		for (int i = 0; i < listaNumeros.length; i++) {
			for (int m = 0; m < listaNumeros.length - 1 - i; m++) {
				if (listaNumeros[m] > listaNumeros[m + 1]) {
					auxiliar = listaNumeros[m];
					listaNumeros[m] = listaNumeros[m + 1];
					listaNumeros[m + 1] = auxiliar;

				}
			}
		}
		JOptionPane.showMessageDialog(null, "A lista ordenada do menor para o maior é " + Arrays.toString(listaNumeros),"Mensagem", JOptionPane.INFORMATION_MESSAGE, null);
	}
}
