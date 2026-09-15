package nivel6;

import java.lang.reflect.Field;

public class Exercicio84 {
	public static void main(String[] args) throws NoSuchFieldException, SecurityException {
		
		Field campo = PessoaNottation.class.getDeclaredField("nome");
		
		if (campo.isAnnotationPresent(Notacao.class)) {
			
			Notacao notacao = campo.getAnnotation(Notacao.class);
			
			System.out.println(notacao.valor());
			
		}
		
	}
}
