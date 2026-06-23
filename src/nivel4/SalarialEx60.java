package nivel4;

import java.util.Random;

public class SalarialEx60 {
	private Random random = new Random();
	private String nomeFuncionario;
	private Integer horasTrabalhadas;
	private Integer idFuncionario = random.nextInt(500) + 1;
	
	SalarialEx60(String nome, Integer horas) {
		this.nomeFuncionario = nome;
		this.horasTrabalhadas = horas;
	}
	
	public void getSalario() {
		System.out.println("--- Folha Salarial ---");
		System.out.println("Nome funcionario: " + nomeFuncionario);
		System.out.println("Horas trabalhadas: " + horasTrabalhadas);
		System.out.println("ID: " + idFuncionario);
		
		if (horasTrabalhadas >= 0 && horasTrabalhadas <= 24) {
			System.out.println("VOCÊ NÃO VAI GANHAR SALÁRIO! VOCÊ NÃO TRABALHOU NADA!");
		} else if (horasTrabalhadas >= 25 && horasTrabalhadas <= 60) {
			System.out.println("Salário: R$" + (horasTrabalhadas * 2));
		} else if (horasTrabalhadas >= 61 && horasTrabalhadas <= 80) {
			System.out.println("Salário: R$" + (horasTrabalhadas * 4));
		} else if (horasTrabalhadas >= 81) {
			System.out.println("Salário: R$" + (horasTrabalhadas * 6));
		}
		
		System.out.println("-------------------------");
	}
	
	public static void main(String[] args) {
		SalarialEx60 salarial = new SalarialEx60("Miguel", 200);
		
		salarial.getSalario();
	}
}
