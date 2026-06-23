package nivel3;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 * O programa funciona desta forma:
 * <p>
 * <h4>O programa funciona como um <u>Parser de expressão matemática
 * simples!</u> O programa consegue fazer expressões com os operadores +, -, *,
 * /, ^!</h4>
 * <p>
 * <h4>O programa lê a expressão da esquerda para a dire8ita!</h4>
 * <p>
 * 
 * @author Miguel Alessi Lenzi
 */

public class Exercicio48 {
	public static void main(String[] args) {
		try {
			for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (Exception ex) {
			System.err.println(ex);
		}

		String expressao = JOptionPane.showInputDialog(null, "Digite a expressão: ", "Expressão Matemática",
				JOptionPane.PLAIN_MESSAGE);

		double resultadoExpressao = calcularExpressao(expressao);

		JOptionPane.showMessageDialog(null, "Resultado: " + resultadoExpressao, "Expressão Matemática",
				JOptionPane.INFORMATION_MESSAGE, null);
	}

	public static double calcularExpressao(String expressao) {
		
		double resultado = 0;
		String valoresDentro = "";
		
		while (expressao.contains("(")) {

			int inicio = expressao.lastIndexOf("(");
			int fim = expressao.indexOf(")", inicio);

			valoresDentro = expressao.substring(inicio + 1, fim);
			resultado = calcularExpressao(valoresDentro);
			expressao = expressao.substring(0, inicio) + resultado + expressao.substring(fim + 1);
		}
		return calcularExpressaoNormal(expressao);
	}
	
	public static double calcularExpressaoNormal(String expressao) {

		String[] valores = expressao.trim().split(" ");

		double resultadoFinal = 0;

		for (int i = 0; i < valores.length; i++) {

			if (valores[i].equals("*") || valores[i].equals("/")) {

				double resultado;
				
				double numeroAnterior = Double.parseDouble(valores[i - 1]);
				double numeroProximo = Double.parseDouble(valores[i + 1]);

				String operador = valores[i];

				if (operador.equals("*")) {
					resultado = numeroAnterior * numeroProximo;
				} else if (operador.equals("/")) {
					resultado = numeroAnterior / numeroProximo;
				} else {
					continue;
				}
				
				valores[i - 1] = String.valueOf(resultado);
				valores[i] = "";
				valores[i + 1] = "";
			}
		}
		
		for (int i = 0; i < valores.length; i++) {

			if (valores[i].equals("")) {
				continue;
			} 

			if (valores[i].equals("+")) {
				double numeroAnterior = Double.parseDouble(valores[i - 1]);
				double numeroProximo = Double.parseDouble(valores[i + 1]);

				double resultado = numeroAnterior + numeroProximo;

				resultadoFinal = resultado;
				
				valores[i - 1] = String.valueOf(resultadoFinal);
				valores[i] = "";
				valores[i + 1] = "";
				
			} else if (valores[i].equals("-")) {
				double numeroAnterior = Double.parseDouble(valores[i - 1]);
				double numeroProximo = Double.parseDouble(valores[i + 1]);

				double resultado = numeroAnterior - numeroProximo;

				resultadoFinal = resultado;
				
				valores[i - 1] = String.valueOf(resultadoFinal);
				valores[i] = "";
				valores[i + 1] = "";
			} else {
				resultadoFinal = Double.parseDouble(valores[i]);
			}
		}
		
		return resultadoFinal;
	}

}
