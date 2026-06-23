package nivel4;

import java.util.Random;

public class Exercicio59 {
	Random numeroAleatorio = new Random();
	String nomeFuncionario;
	int idFuncionario = numeroAleatorio.nextInt(1000) + 500;
	String areaFuncionario;
	
	Exercicio59(String nome, String area){
		this.nomeFuncionario = nome;
		this.areaFuncionario = area;
	}
	
	void getNome() {
		System.out.println("Nome do funcionário: " + nomeFuncionario);
	}
	
	void getId() {
		System.out.println("ID do funcionário: " + idFuncionario);
	}
	
	void getArea() {
		System.out.println("Área: Desenvolvimento");
	}
	
	public static void main(String[] args) {
		Exercicio59 funcionario = new Exercicio59("Miguel", "Desenvolvedor Full-Stack");
		
		funcionario.getNome();
		funcionario.getArea();
		funcionario.getId();
	}
}
