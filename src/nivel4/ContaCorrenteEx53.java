package nivel4;

import javax.swing.JOptionPane;

/**
 * O exercicio funciona desta forma:
 * <p>
 * <h4>O exercicio tem o foco sobre <u>Herança, </u> onde 2 classes chamada <u>ContaCorrenteEx53 e ContaPoupanca serão as subclasses
 *</u>, e a classe <u>ContaBancariaEx52 será a superclasse!</u></h4>
 *<p>
 *@author Miguel Alessi Lenzi
 */

public class ContaCorrenteEx53 extends ContaBancariaEx52 {

	ContaCorrenteEx53(String identificacao, double saldo) {
		super(identificacao, saldo);
	}

	static private double taxa = 0.3;

	@Override
	double sacar() {
		String input = JOptionPane.showInputDialog(null, "Digite o valor a ser sacado:", "Conta Corrente", JOptionPane.INFORMATION_MESSAGE);
		double valorSacado = 0;
		;
		try {
			valorSacado = Double.parseDouble(input);
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Digite somente números!", "Conta Corrente", JOptionPane.INFORMATION_MESSAGE, null);
		}

		if (valorSacado > 0 && saldo > 0) {
			JOptionPane.showMessageDialog(null, "Ação realizada com sucesso!", "Conta Corrente", JOptionPane.INFORMATION_MESSAGE, null);
			return saldo -= valorSacado * taxa;
		} else {
			JOptionPane.showMessageDialog(null, "Ação cancelada!", "Conat Corrente", JOptionPane.ERROR_MESSAGE, null);
			return saldo;
		}
	}
	
	public static void main(String[] args) {
		ContaPoupanca contaP = new ContaPoupanca("Miguel", 100);
		
		contaP.getDados();
		contaP.getSaldo();
		contaP.depositar();
		contaP.getSaldo();
	}
}

/**
 * <h4>Esta é a classe <u>ContaPoupanca!</u></h4>
 * <p>
 * @author Miguel Alessi Lenzi
 */

class ContaPoupanca extends ContaCorrenteEx53 {

	ContaPoupanca(String identificacao, double saldo) {
		super(identificacao, saldo);
	}
	
	static private double rendimento = 0.3;

	@Override
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
			return saldo += valorDepositado * rendimento;
		} else {
			JOptionPane.showMessageDialog(null, "Depósito cancelado!", "Conta Bancaria", JOptionPane.ERROR_MESSAGE, null);
			return saldo;
		}
	}
	
}
