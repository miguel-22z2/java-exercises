package nivel2;

import javax.swing.JOptionPane;
import java.util.Arrays;

public class Exercicio28 {
	public static void main(String[] args) {
		int[] lista = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int auxiliar = 0;

		for (int i = 0; i < lista.length; i++) {
			for (int m = 0; m < lista.length - 1 - i; m++) {
				if (lista[m] < lista[m + 1]) {
					auxiliar = lista[m];
					lista[m] = lista[m + 1];
					lista[m + 1] = auxiliar;

				}
			}
		}
		JOptionPane.showMessageDialog(null, "Lista rotacionada: " + Arrays.toString(lista), "Programa",
				JOptionPane.INFORMATION_MESSAGE, null);
	}
}
