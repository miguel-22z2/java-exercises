package utilitarios;

import java.util.Random;

/**
 * <h4>A classe <u>PassWordGenerator</u> gerá uma senha aleatória com <u>números, letras maiúsculas e minúsculas e 
 * caracteres especiais!</u></h4>
 * <p>
 * @author Miguel Alessi Lenzi
 * @version 1.0
 */

public class PasswordGenerator {
	/**
	 * Método que gera senha <u>s</u> e retorna ela!
	 * <p>
	 * @author Miguel Alessi Lenzi
	 * @return s
	 */
	public String gerarSenha() { 
		String letras = "ZAQXSWCDEVFRBGTNHYMJUKILOPqazwsxedcrfvtgbyhnujmikolp";
		String numeros = "4132587609";
		String caracteresEspeciais = "!@#$%¨&*()<>:;/?|{}[]~^´`ºª+-=_";
		
		String senhaGerada = ""; 
		
		Random random = new Random(); 
		
		for (int i = 0; i <= 5; i++) {
			senhaGerada += letras.charAt(random.nextInt(52));
			senhaGerada += caracteresEspeciais.charAt(random.nextInt(31));
			senhaGerada += numeros.charAt(random.nextInt(10));
		}
		
		return senhaGerada;
	}
}
