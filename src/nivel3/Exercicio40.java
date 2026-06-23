package nivel3;

import javax.swing.JOptionPane;
/**
 * O exercicio 40 vai funcionar desta forma:
 * <p>
 * O programa funciona como uma calculadora (+, -, *, /),
 * só que funcionando com métodos, e também, com uma interface!
 */
public class Exercicio40 {
	public static void main(String[] args) {
		long opçao = 0;
		String inputOpçao = "";
		do {
			try {
					inputOpçao = JOptionPane.showInputDialog(null,"Selecione o tipo de operação: \n [1] PARA ADIÇÃO \n [2] PARA SUBTRAÇÃO \n [3] PARA MULTIPLICAÇÃO \n [4] PARA DIVISÃO \n [5] PARA SAIR DA CALCULADORA","Calculadora", JOptionPane.INFORMATION_MESSAGE);
					opçao = Integer.parseInt(inputOpçao);
					if (opçao == 1) {
						funçaoSoma();
					} else if (opçao == 2) {
						funçaoSubtraçao();
					} else if (opçao == 3) {
						funçaoMultiplicaçao();
					} else if (opçao == 4) {
						funçaoDivisao();
					} else if (opçao == 5) {
						JOptionPane.showMessageDialog(null, "Calculadora encerrada!", "Calculadora",JOptionPane.WARNING_MESSAGE, null);
					} else {
						JOptionPane.showMessageDialog(null, "Opção inválida!", "Calculadora", JOptionPane.WARNING_MESSAGE, null);
					} 
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Digite somente números inteiros!", "Calculadora", JOptionPane.WARNING_MESSAGE, null);
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Algo deu errado, tente novamente alguma das opções.", "Calculdora", JOptionPane.WARNING_MESSAGE, null);
			}
		} while (opçao != 5);
	}
	public static void funçaoSoma() {
		long numero1 = 0;
		long numero2 = 0;
		receberNumerosSoma(numero1, numero2);
	}
	public static void funçaoSubtraçao() {
		long numero1 = 0;
		long numero2 = 0;
		receberNumerosSubtraçao(numero1, numero2);
	}
	public static void funçaoMultiplicaçao() {
		long numero1 = 0;
		long numero2 = 0;
		receberNumerosMultiplicaçao(numero1, numero2);
	}
	public static void funçaoDivisao() {
		float numero1 = 0;
		float numero2 = 0;
		receberNumerosDivisao(numero1, numero2);
	}
	public static void receberNumerosSoma(long numero1, long numero2) {
		String inputNumero1 = JOptionPane.showInputDialog(null, "Digite o 1º número:", "Calculadora", JOptionPane.INFORMATION_MESSAGE);
		numero1 = Integer.parseInt(inputNumero1);
		String inputNumero2 = JOptionPane.showInputDialog(null, "Digite o 2º número:", "Calculadora", JOptionPane.INFORMATION_MESSAGE);
		numero2 = Integer.parseInt(inputNumero2);
		JOptionPane.showMessageDialog(null, "Resultado: " + (numero1 + numero2), "Calculadora", JOptionPane.INFORMATION_MESSAGE, null);
	}
	public static void receberNumerosSubtraçao(long numero1, long numero2) {
		String inputNumero1 = JOptionPane.showInputDialog(null, "Digite o 1º número:", "Calculadora", JOptionPane.INFORMATION_MESSAGE);
		numero1 = Integer.parseInt(inputNumero1);
		String inputNumero2 = JOptionPane.showInputDialog(null, "Digite o 2º número:", "Calculadora", JOptionPane.INFORMATION_MESSAGE);
		numero2 = Integer.parseInt(inputNumero2);
		JOptionPane.showMessageDialog(null, "Resultado: " + (numero1 - numero2), "Calculadora", JOptionPane.INFORMATION_MESSAGE, null);
	}
	public static void receberNumerosMultiplicaçao(long numero1, long numero2) {
		String inputNumero1 = JOptionPane.showInputDialog(null, "Digite o 1º número:", "Calculadora", JOptionPane.INFORMATION_MESSAGE);
		numero1 = Integer.parseInt(inputNumero1);
		String inputNumero2 = JOptionPane.showInputDialog(null, "Digite o 2º número:", "Calculadora", JOptionPane.INFORMATION_MESSAGE);
		numero2 = Integer.parseInt(inputNumero2);
		JOptionPane.showMessageDialog(null, "Resultado: " + (numero1 * numero2), "Calculadora", JOptionPane.INFORMATION_MESSAGE, null);
	}
	public static void receberNumerosDivisao(float numero1, float numero2) {
		String inputNumero1 = JOptionPane.showInputDialog(null, "Digite o 1º número:", "Calculadora", JOptionPane.INFORMATION_MESSAGE);
		numero1 = Integer.parseInt(inputNumero1);
		String inputNumero2 = JOptionPane.showInputDialog(null, "Digite o 2º número:", "Calculadora", JOptionPane.INFORMATION_MESSAGE);
		numero2 = Integer.parseInt(inputNumero2);
		if (numero1 == 0 || numero2 == 0) {
			JOptionPane.showMessageDialog(null, "Não é possível dividir por 0!", "Calculadora", JOptionPane.WARNING_MESSAGE, null);
		} else {
			JOptionPane.showMessageDialog(null, "Resultado: " + (numero1 / numero2), "Calculadora", JOptionPane.INFORMATION_MESSAGE, null);
		}
	}
}
