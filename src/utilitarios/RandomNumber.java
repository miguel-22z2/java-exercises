package utilitarios;

import java.util.Random;

/**
 * <h4>A classe <u>RandomNumber</u> retorna um número aleatório do tipo Long!</h4>
 * <p>
 * @author Miguel Alessi Lenzi
 * @version 1.0
 */

public class RandomNumber {
	private Random random = new Random();
	/**
	 * O método <u>number()</u> gera um número aleatório do tipo Long e retorna ele!
	 * <p>
	 * @return Retorna um número aleatório do tipo Long!
	 * @author Miguel Alessi Lenzi
	 */
	public long number() {
		long randomNumber = random.nextLong(1000000000) + 1;
		
		return randomNumber;
	}
}
