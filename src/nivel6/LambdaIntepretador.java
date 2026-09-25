package nivel6;

import java.util.HashMap;
import java.util.Map;

import utilitarios.Color;

public class LambdaIntepretador {

	private Map<String, Integer> variaveisInteiras = new HashMap<String, Integer>();

	public void print(String mensagem) {
		System.out.println(mensagem);
	}

	public void sum(int numero1, int numero2) {
		int sum = numero1 + numero2;
		System.out.println(sum);
	}
	
	public void mines(int numero1, int numero2) {
		int mines = numero1 - numero2;
		System.out.println(mines);
	}
	
	public void multi(Integer numero1, Integer numero2) {
		Integer multi = numero1 * numero2;
		System.out.println(multi);
	}
	
	public void pow(Integer base, Integer expoente) {
		
		Integer resultado = 1;
		
		for (int i = 1; i <= expoente; i++) {
			resultado *= base;
		}
		
		System.out.println(resultado);
		
	}
	
	public void div(Integer numero1, Integer numero2) {
		Integer div = 0;
		
		try {
			div = numero1 / numero2;
		} catch (Exception e) {
			System.out.println(Color.RED + "Cannot divide by 0" + Color.RESET);
			return;
		}
		
		System.out.println(div);
	}
	
	public void rest(Integer numero1, Integer numero2) {
		Integer rest = 0;
		
		try {
			rest = numero1 % numero2;
		} catch (Exception e) {
			System.out.println(Color.RED + "Cannot divide by 0" + Color.RESET);
			return;
		}
		
		System.out.println(rest);
	}

	public void criarVariavelInteira(String identificador, Integer valor) {
		if (identificador.isBlank() || identificador == null) {
			System.out.println(Color.RED + "The identifier cannot be blank" + Color.RESET);
			return;
		}
		
		if (Character.isDigit(identificador.charAt(0))) {
			System.out.println(Color.RED + "The identifier cannot start with a number" + Color.RESET);
			return;
		}
		
		if (variavelInteiraExiste(identificador)) {
			System.out.println(Color.RED + "Cannot add a duplicate variable" + Color.RESET);
			return;
		}
		
		variaveisInteiras.put(identificador, valor);
	}

	public boolean variavelInteiraExiste(String identificador) {
		return variaveisInteiras.containsKey(identificador);
	}

	public void imprimirVariavelInteira(String identificador) {
		Integer valor = variaveisInteiras.get(identificador);
		
		if (valor == null) {
			System.out.println(Color.RED + "Not a valid type: " + identificador + Color.RESET);
		} else {
			System.out.println(valor);
		}
	}
	
	public Integer getVariavelInteira(String identificador) {
		return variaveisInteiras.get(identificador);
	}

}
