package nivel3;

import java.util.Scanner;

public class Exercicio47 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite sua senha: ");
		String senha = teclado.next();
		
		int pontuacao = pontuacaoSenha(senha);
		
		String classificacao = classificacaoSenha(pontuacao);
		
		System.out.println("Resultado:");
		System.out.println(' ');
		System.out.println("Pontacão da senha: " + pontuacao + "/5");
		System.out.println("Classificação da senha: " + classificacao);
		System.out.println(' ');
		System.out.println("Dicas para a senha: ");
		
		dicas(senha);
		
		teclado.close();
	}
	public static int pontuacaoSenha(String senha) {
		int pontos = 0;
		
		if (senha.length() >= 10) {
			pontos++;
		}
		if (senha.matches(".*[A-Z]+.*")) {
			pontos++;
		}
		if (senha.matches(".*[a-z]+.*")) {
			pontos++;
		}
		if (senha.matches(".*\\d+.*")) {
			pontos++;
		}
		if (senha.matches(".*[^a-zA-Z0-9].*")) {
			pontos++;
		}
		return pontos;
	}
	public static String classificacaoSenha(int pontuacao) {
		return switch (pontuacao) {
		case 0 -> "Troque sua senha agora!";
		case 1 -> "Fraca!";
		case 2 -> "Fraca!";
		case 3 -> "Boa!";
		case 4 -> "Muito boa!";
		case 5 -> "Forte!";
		default -> "Erro";
		};
	}
	public static void dicas(String senha) {
		
		if (senha.length() < 10) {
			System.out.println("Aumente o tamanho da senha!");
		}
		
		if (!senha.matches(".*[A-Z]+.*")) {
			System.out.println("Coloque letras maiúsculas na senha!");
		}
		
		if (!senha.matches(".*[a-z]+.*")) {
			System.out.println("Coloque letras minúsculas na senha!");
		}
		
		if (!senha.matches(".*\\d+.*")) {
			System.out.println("Coloque números na senha!");
		}
		
		if (!senha.matches(".*[^a-zA-Z0-9].*")) {
			System.out.println("Coloque caracteres especiais na senha!");
		}
		
		if (senha.matches(".*[A-Z]+.*") && senha.matches(".*[a-z]+.*") && senha.matches(".*\\d+.*") && senha.matches(".*[^a-zA-Z0-9].*")) {
			System.out.println("Nenhuma ação necessária!");
		}
		
	}
}
