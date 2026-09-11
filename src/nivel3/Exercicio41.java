package nivel3;

import javax.swing.JOptionPane;

/**
 * O exercicio 41 vai funcionar desta forma:
 * <p>
 * O programa pede ao usuário digitar um CPF, e depois, o programa verifica se o CPF
 * digitado é válido ou não, e depois, retorna ao usuário.
 */

public class Exercicio41 {
	public static void main(String[] args) {
		String inputCpf  = JOptionPane.showInputDialog(null, "Digite o CPF:", "Programa",
				JOptionPane.INFORMATION_MESSAGE);

		if (validarCpf(inputCpf)) {
			JOptionPane.showMessageDialog(null, "O CPF é válido.", "Programa", JOptionPane.INFORMATION_MESSAGE, null);
		} else {
			JOptionPane.showMessageDialog(null, "O CPF é inválido.", "Programa", JOptionPane.WARNING_MESSAGE, null);
		}
	}

	public static boolean validarCpf(String cpf) {
		cpf = cpf.replaceAll("\\D", "");
		
		if (cpf.length() != 11) {
			return false;
		}
		
		int soma = 0;
		
		for (int i = 0; i < 9; i++) {
			soma += (cpf.charAt(i) - '0') * (10 - i);
		}
		
		int digitoVerificador1 = (soma * 10) % 11;
		
		if (digitoVerificador1 == 10) {
			digitoVerificador1 = 0;
		}
		
		soma = 0;
		
		for (int i = 0; i < 10; i++) {
			soma += (cpf.charAt(i) - '0') * (11 - i);
		}
		
		int digitoVerificador2 = (soma * 10) % 11;
		
		if (digitoVerificador2 == 10) {
			digitoVerificador2 = 0;
		}
		
		return digitoVerificador1 == (cpf.charAt(9) - '0') && digitoVerificador2 == (cpf.charAt(10) - '0');
	}
}
