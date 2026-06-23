package nivel4;

import javax.swing.JOptionPane;

/**
 * O classe funciona desta forma:
 * <p>
 * <h4>A classe funciona mostrando as funções de uma <u>Conta bancária</u>, como
 * extrato, identificação e etc...</h4>
 * <p>
 * 
 * @author Miguel Alessi Lenzi
 */

public class ContaBancariaEx52 {
	static private String identificacao;
	protected static double saldo;

	ContaBancariaEx52(String identificacao, double saldo) {
		ContaBancariaEx52.identificacao = identificacao;
		ContaBancariaEx52.saldo = saldo;
	}

	void getSaldo() {
		JOptionPane.showMessageDialog(null, "Saldo atual: " + saldo, "Conta Bancaria", JOptionPane.INFORMATION_MESSAGE, null);
	}

	double depositar() {
		double valorDepositado = 0;
		String inputValor = JOptionPane.showInputDialog(null, "Digite o valor a ser depositado:", "Conta Bancaria", JOptionPane.INFORMATION_MESSAGE);
		try {
			valorDepositado = Double.parseDouble(inputValor);
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Coloque somente números válidos", "Conta Bancaria", JOptionPane.ERROR_MESSAGE, null);
		}

		if (valorDepositado > 0) {
			JOptionPane.showMessageDialog(null, "Depósito de R$" + valorDepositado + " feito com sucesso!", "Conta Bancaria", JOptionPane.INFORMATION_MESSAGE, null);
			return saldo += valorDepositado;
		} else {
			JOptionPane.showMessageDialog(null, "Depósito cancelado!", "Conta Bancaria", JOptionPane.ERROR_MESSAGE, null);
			return saldo;
		}
	}

	void getDados() {
		JOptionPane.showMessageDialog(null,
				"Identificação: " + identificacao + "\nNúmero da conta: 1324574834722\nNúmero da agência: 225",
				"Conta Bancaria", JOptionPane.INFORMATION_MESSAGE, null);
	}

	double sacar() {
		double valorSacado = 0;
		String inputSacar = JOptionPane.showInputDialog(null, "Digite o valor a ser sacado: ", "Conta Bancaria", JOptionPane.INFORMATION_MESSAGE);
		try {
			valorSacado = Double.parseDouble(inputSacar);
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Coloque somente números válidos!", "Conta Bancaria", JOptionPane.ERROR_MESSAGE, null);
		}
		System.out.println();
		if (valorSacado > 0 && saldo > 0) {
			JOptionPane.showMessageDialog(null, "Saque de R$" + valorSacado + " realizado com sucesso!", "Conta Bancaria", JOptionPane.INFORMATION_MESSAGE, null);
			return saldo -= valorSacado;
		} else {
			JOptionPane.showMessageDialog(null, "Saque cancelado!", "Conta Bancaria", JOptionPane.ERROR_MESSAGE, null);
			return saldo;
		}
	}

	void getCartoes() {
		JOptionPane.showMessageDialog(null, "Cartões da conta: \nMasterCard\nVisa\nCartão Sicoob", "Conta Bancaria", JOptionPane.INFORMATION_MESSAGE, null);
	}

}
