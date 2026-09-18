package utilitarios;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SimulaBanco {

	public SimulaBanco() {}
	
	private List<Usuario> listUsuarios = new ArrayList<>();
	
	public void carregarUsuarios(int quantidade) {
		
		String[] nomes = {"Miguel", "Victor", "Gabrielly", "Carlos", "Thaís", "Fernando"};
		int[] idades = {22, 14, 99, 42, 30, 60, 23, 49, 17};
		String[] generos = {"Masculino", "Feminino"};
		
		Random random = new Random();
		
		for (int i = 1; i <= quantidade; i++) { 
			String nome = nomes[random.nextInt(nomes.length - 1)];
			int idade = idades[random.nextInt(idades.length - 1)];
			String genero = generos[random.nextInt(2)];
   			Usuario usuario = new Usuario(nome, idade, genero);
			 
			this.listUsuarios.add(usuario);
		}
		
		return;
		
	}
	
	public Usuario buscarPorId(int id) {
		
		if (id < 0 || id > this.listUsuarios.size()) {
			throw new IndexOutOfBoundsException("Não é possível passar um id menor que 0 ou um maior que a lista");
		}
		
		return this.listUsuarios.get(id);
		
	}
	
	public Usuario removerPorId(int id) {
		
		if (id < 0 || id > this.listUsuarios.size()) {
			throw new IndexOutOfBoundsException("Não é possível passar um id menor que 0 ou um maior que a lista");
		}
		
		return this.listUsuarios.remove(id);
		
	}
	
	public void mostarTabela() {
		
		System.out.println();
		System.out.println("|   id   |   nome   |   idade   |   genero   |");
		
		System.out.println();
		
		for (int i = 0; i < this.listUsuarios.size(); i++) {
			
			System.out.println("|  " + i + "  |  " + this.listUsuarios.get(i).getNome() + "     |  " + this.listUsuarios.get(i).getIdade() + "  |  " + this.listUsuarios.get(i).getGenero() + "  |");
			
		}
		
		return;
		
	}
	
	public boolean adicionarUsuario(Usuario usuario) {
		
		if (usuario.equals(null)) {
			throw new IllegalArgumentException("Não é possível adicionar um objeto null");
		}
		
		return this.listUsuarios.add(usuario);
		
	}
	
	public boolean isVazio() {
		return this.listUsuarios.isEmpty();
	}
	 
}
