package nivel6;

import java.util.Scanner;
import utilitarios.SimulaBanco;
import utilitarios.Usuario;

public class Exercicio87 {
	
	static Scanner sc = new Scanner(System.in);
	static SimulaBanco banco = new SimulaBanco();
	
	public static void main(String[] args) {
		
		System.out.println("Mini ORM");
		System.out.println();
		
		StringBuilder sb = new StringBuilder("Escolha sua opção:\n\n");
		
		sb.append("1 - Carregar usuários iniciais\n")
		.append("2 - Buscar usuário por id\n")
		.append("3 - Deletar usuário por id\n")
		.append("4 - Adicionar usuário\n")
		.append("5 - Selecionar todos\n")
		.append("6 - Sair\n\n")
		.append("Digite sua opção: ");
		
		while (true) {
			
			System.out.println();
			System.out.print(sb.toString());
			
			int opcaoSelecionada = sc.nextInt();
			System.out.println();
			
			if (opcaoSelecionada == 1) {
				
				banco.carregarUsuarios(6);
				System.out.println("Usuários carregados");
				
			} else if (opcaoSelecionada == 2) {
				
				if (banco.isVazio()) {
					System.out.println("Banco vazio");
					continue;
				}
				
				buscarPorId();
				
			} else if (opcaoSelecionada == 3) {
				
				if (banco.isVazio()) {
					System.out.println("Banco vazio");
					continue;
				}
				
				removerPorId();
				
			} else if (opcaoSelecionada == 4) {
				adicionarUsuario();
			} else if (opcaoSelecionada == 5) {
				banco.mostarTabela();
			} else if (opcaoSelecionada == 6) {
				
				System.out.println("Sessão acabada");
				break;
				
			} else {
				System.out.println("Opção inválida!");
			} 
			
		}
		
		sc.close();
		
	}
	
	public static void buscarPorId() {
		System.out.print("Digite o id do usuário: ");
		int idUsuario = sc.nextInt();
		System.out.println();
		
		Usuario usuario = banco.buscarPorId(idUsuario);
		
		System.out.println("Informações do usuário com o id " + idUsuario + ':');
		System.out.println("Nome: " + usuario.getNome());
		System.out.println("Gênero: " + usuario.getGenero());
		System.out.println("Idade: " + usuario.getIdade());
	}
	
	public static void removerPorId() {
		System.out.print("Digite o id do usuário: ");
		int idUsuario = sc.nextInt();
		System.out.println();
		
		Usuario usuario = banco.removerPorId(idUsuario);
		
		System.out.println("Usuário " + usuario.getNome() + " foi removido");
	}
	
	public static void adicionarUsuario() {
		System.out.print("Digite o nome do usuário: ");
		String nome = sc.next();
		System.out.println();
		
		System.out.print("Digite o gênero do usuário (1 - Masculino | 2 - Feminino): ");
		int generoEscolhido = sc.nextInt();
		System.out.println();
		
		if (generoEscolhido <= 0 || generoEscolhido > 2) {
			throw new IllegalArgumentException("Para o banco reconhecer o gênero do usuário, digite somente os números 1 ou 2");
		}
		
		String genero = (generoEscolhido == 1) ? "Masculino" : "Feminino";
		
		System.out.print("Digite a idade do usuário: ");
		int idade = sc.nextInt();
		System.out.println();
		
		Usuario usuario = new Usuario(nome, idade, genero);
		
		if (banco.adicionarUsuario(usuario)) {
			System.out.println("Usuário adicionado com sucesso");
		} else {
			System.out.println("Erro ao adicionar o usuário");
		}
	}
	
}
