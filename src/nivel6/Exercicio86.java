package nivel6;

import java.lang.reflect.Method;
import utilitarios.PasswordGenerator;

public class Exercicio86 {
	public static void main(String[] args) throws Exception{
		
		PasswordGenerator pg = new PasswordGenerator();
		
		Method metodo = PasswordGenerator.class.getMethod("gerarSenha");
		
		System.out.println(metodo.invoke(pg));
		
	}
}
