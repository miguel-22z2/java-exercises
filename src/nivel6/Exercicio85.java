package nivel6;

import java.lang.reflect.Method;

import utilitarios.Operacao;

public class Exercicio85 {
	public static void main(String[] args) {
		
		Method[] metodos = Operacao.class.getDeclaredMethods();
		
		
		System.out.println("Métodos da classe Operacao:");
		System.out.println();
		
		for (Method metodo : metodos) {
			System.out.println(metodo.getName() + " -> retorna " + metodo.getReturnType());
		}
		
	}
}
