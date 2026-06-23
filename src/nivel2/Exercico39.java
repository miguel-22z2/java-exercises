package nivel2;

import java.util.Scanner;

public class Exercico39 {
	static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		int opçao = 0;

		do {
			System.out.println(" ");
			System.out.println("Digite sua opção:");
			System.out.println(" ");
			System.out.println("[1] para somar dois números");
			System.out.println("[2] para uma mensagem de saudação");
			System.out.println("[3] para mostrar média de 3 números");
			System.out.println("[4] para fazer potência");
			System.out.println(" ");
			System.out.println("[5] para sair do programa");
			System.out.println(" ");
			System.out.println("Digite sua opção:");
			opçao = teclado.nextInt();
			System.out.println(" ");

			if (opçao == 1) {
				soma();
			} else if (opçao == 2) {
				saudaçao();
			} else if (opçao == 3) {
				media();
			} else if (opçao == 4) {
				potencia();
			} else if (opçao == 5) {
				System.out.println("Programa encerrado!");
			} else {
				System.out.println("Opção inválida, tente novamente.");
			}

		} while (opçao != 5);
		teclado.close();
	}

	static void saudaçao() {
		System.out.println("Digite seu nome:");
		String nome = teclado.nextLine().strip();
		System.out.println(" ");
		System.out.println("É um prazer te conhecer, " + nome + "!");

	}

	static void soma() {
		System.out.println("Digite o 1º número:");
		float numero1 = teclado.nextInt();
		System.out.println(" ");
		System.out.println("Digite o 2º número:");
		float numero2 = teclado.nextInt();
		System.out.println(" ");
		System.out.println("O resultado da soma é " + (numero1 + numero2));
	}

	static void media() {
		System.out.println("Digite o 1º número:");
		float numero1 = teclado.nextFloat();
		System.out.println(" ");
		System.out.println("Digite o 2º número:");
		float numero2 = teclado.nextFloat();
		System.out.println(" ");
		System.out.println("Digite o 3º número:");
		float numero3 = teclado.nextFloat();
		System.out.println(" ");
		System.out.println("A média desses números é " + ((numero1 + numero2 + numero3) / 3));
	}

	static void potencia() {
		System.out.println("Digite o número da base:");
		int numeroBase = teclado.nextInt();
		System.out.println(" ");
		System.out.println("Digite o número do expoente:");
		int numeroExpoente = teclado.nextInt();
		System.out.println(" ");
		System.out.println("O resultado da potência é " + Math.pow(numeroBase, numeroExpoente));
	}

}
