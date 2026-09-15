package utilitarios;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SimulaBanco {

	public SimulaBanco() {}
	
	private List<Usuario> listUsers = new ArrayList<>();
	
	public void carregarUsuarios(int quantidade) {
		
		String[] nomes = {"Miguel", "Cute Cute", "Mayara", "Carlos", "Thaís", "Fernando"};
		String[] idades = {"22", "14", "99", "42", "30", "60", "23", "49", "17"};
		String[] generos = {"Masculino", "Feminino"};
		
		Random random = new Random();
		
		for (int i = 1; i <= quantidade; i++) { 
			String nome = nomes[random.nextInt(nomes.length - 1)];
			String idade = idades[random.nextInt(idades.length)];
			String genero = generos[random.nextInt(generos.length -1)];
   			Usuario user = new Usuario(nome, idade, genero);
			 
			this.listUsers.add(user);
		}
		
		return;
		
	}
	
	public Usuario buscarPorId(int id) {
		
		if (id < 0 || id > this.listUsers.size()) {
			throw new IndexOutOfBoundsException("Não é possível passar um id menor que 0 e um maior que a lista");
		}
		
		return this.listUsers.get(id);
		
	}
	
	public Usuario removerPorId(int id) {
		
		if (id < 0 || id > this.listUsers.size()) {
			throw new IndexOutOfBoundsException("Não é possível passar um id menor que 0 e um maior que a lista");
		}
		
		return this.listUsers.remove(id);
		
	}
	
	public void mostarTabela() {
		
		System.out.println("|   id   |   nome   |   idade   |   genero   |");
		
		System.out.println();
		
		for (int i = 0; i < this.listUsers.size(); i++) {
			
			System.out.println("|  " + i + "  |  " + this.listUsers.get(i).getNome() + "  |  " + this.listUsers.get(i).getIdade() + "  |  " + this.listUsers.get(i).getGenero() + "  |");
			
		}
		
		return;
		
	}
	
	public boolean adicionarUsuario(Usuario usuario) {
		
		if (usuario.equals(null)) {
			throw new IllegalArgumentException("Não é possível adicionar um objeto null");
		}
		
		return this.listUsers.add(usuario);
		
	}
	 
}
