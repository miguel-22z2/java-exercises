package utilitarios;

/**
 * <h4>A classe <u>Operacao</u> serve para fazer contas básicas,
 * como adição, subtração, multiplicação, divisão e potência!</h4>
 * <p>
 * @author Miguel Alessi Lenzi
 * @version 1.0
 */

public class Operacao {
	/**
	 * Método que retorna a soma de 2 números.
	 * @param numero1, numero2
	 * @return numero1 + numero2
	 * @throws Error se um dos números atigin o limite do tipo <u>long</u>
	 */
	public long soma(long numero1, long numero2) {
		return (numero1 + numero2);
	}
	/**
	 * Método que retorna a subtração de 2 números.
	 * @param numero1
	 * @param numero2
	 * @return numero1 - numero2
	 * @throws Error se um dos números atigin o limite do tipo <u>long</u>
	 */
	public long subtracao(long numero1, long numero2) {
		return (numero1 - numero2);
	}
	/**
	 * Método que retorna a multiplicação de 2 números.
	 * @param numero1
	 * @param numero2
	 * @return numero1 * numero2
	 * @throws Error se um dos números atigin o limite do tipo <u>long</u>
	 */
	public long multiplicacao(long numero1, long numero2) {
		return (numero1 * numero2);
	}
	
	/**
	 * Método que retorna a divisão de 2 números.
	 * @param numero1
	 * @param numero2
	 * @return numero1 / numero2
	 * @throws ArithmeticException se um dos números for 0
	 */
	public double divisao(double numero1, double numero2) {
		if (numero1 == 0 || numero2 == 0) {
			throw new ArithmeticException ("Não é possível fazer divisão com 0!");
		} else {
			return (numero1 / numero2);
		}
	}
	/**
	 * Método que retorna a potência de 2 números
	 * @param numero1
	 * @param numero2
	 * @return numero1 ^ numero2
	 */
	public double potencia(double numero1, double numero2) {
		return Math.pow(numero1, numero2);
	}
}
