package nivel4;

import utilitarios.*;

public class Exercicio62 {
	public static void main(String[] args) {
		
		System.out.println(Color.RED + "Texto em vermelho!" + Color.RESET);
		System.out.println(Color.BLUE + "Texto em azul!" + Color.RESET);
		System.out.println(Color.BLACK + "Texto preto!" + Color.RESET);
		
		PasswordGenerator senha = new PasswordGenerator();
		
		String senhaGerada = senha.gerarSenha();
		
		System.out.println("Senha gerada: " + senhaGerada);
		
		RandomNumber r = new RandomNumber();
		
		Long numeroGerado = r.number();
		
		System.out.println("Número gerado: " + numeroGerado);
		
		Operacao op = new Operacao();
		
		long n1 = 1;
		long n2 = 2;
		long soma = op.soma(n1, n2);
		
		System.out.println(soma);
		
		double potencia = op.potencia(4, 2);
		System.out.println(potencia);
		
		double divisao = op.divisao(2, 2);
		System.out.println(divisao);
	}
}
