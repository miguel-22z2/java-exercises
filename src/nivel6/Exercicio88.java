package nivel6;

import java.util.Scanner;

import utilitarios.Usuario;

public class Exercicio88 {
	
	public static String serializar(Usuario usuario) {
		return usuario.getNome() + ";" + usuario.getIdade() + ";" + usuario.getGenero();
	}
	
	public static Usuario desserializar(String dados) {
		String[] partesDados = dados.split(";");
		
		if (partesDados[0].equals(null) || partesDados[0].isBlank()) {
			throw new IllegalArgumentException("Não é possível passar um nome vazio");
		}
		
		String nome = partesDados[0];
		int idade = Integer.parseInt(partesDados[1]);
		String genero = partesDados[2];
		
		return new Usuario(nome, idade, genero);
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		StringBuilder sb = new StringBuilder();
		Scanner sc = new Scanner(System.in);
		
		sb
		.append("1 - Criar objeto para serializar\n")
		.append("2 - Desserializar último objeto serializado\n")
		.append("3 - Encerrar sessão\n\n")
		.append("Digite sua opção: ");
		
		Usuario usuario = null;
		String objetoSerializado = "";
		
		while (true) {
			
			System.out.println();
			System.out.print(sb.toString());
			int opcaoEscolhida = sc.nextInt();
			System.out.println();
			
			if (opcaoEscolhida <= 0 || opcaoEscolhida > 3) {
				System.out.println("Opção inválida");
				continue;
			}
			
			if (opcaoEscolhida == 1) {
				System.out.print("Digite o nome do usuário: ");
				String nome = sc.next();
				
				System.out.print("Digite a idade do usuário: ");
				int idade = sc.nextInt();
				
				System.out.print("Digite o gênero do usuário (1 - Masculino | 2 - Feminino): ");
				int generoEscolhido = sc.nextInt();
				System.out.println();
				System.out.println("Serializando objeto...");
				Thread.sleep(2000);
				
				if (generoEscolhido <= 0 || generoEscolhido > 2) {
					throw new IllegalArgumentException("Para o programa reconhecer o gênero, digite somente 1 ou 2");
				}
				
				String genero = (generoEscolhido == 1) ? "Masculino" : "Feminino";
				
				usuario = new Usuario(nome, idade, genero);
				objetoSerializado = serializar(usuario);
				
				System.out.println();
				System.out.println("Objeto serializado: " + objetoSerializado);
				Thread.sleep(2000);
			} else if (opcaoEscolhida == 2) {
				System.out.println("Desserializando objeto...");
				Thread.sleep(2000);
				System.out.println();
				
				usuario = desserializar(objetoSerializado);
				
				System.out.println("Objeto desserializado:");
				System.out.println("Nome: " + usuario.getNome());
				System.out.println("Idade: " + usuario.getIdade());
				System.out.println("Gênero: " + usuario.getGenero());
				Thread.sleep(2000);
			} else {
				System.out.println("Sessão encerrada");
				break;
			}
			
		}
		
		sc.close();
		
	}
}
