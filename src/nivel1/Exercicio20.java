package nivel1;

import java.util.Scanner;

/**
 * O exercicio 20 vai funcionar desta forma:
 * <p>
 * O programa funciona como uma calculadora mais simples, podendo fazer adição,
 * subtração, multiplicação e divisão (+, -, * e /)
 * <p>
 * 
 */

public class Exercicio20 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		byte opçao = 0;
		do {
			float numero1 = 0;
			float numero2 = 0;
			System.out.println("Selecione o tipo de operação:");
			System.out.println(" ");
			System.out.println("[1] PARA ADIÇÃO");
			System.out.println("[2] PARA SUBTRAÇÃO");
			System.out.println("[3] PARA MULTIPLICAÇÃO");
			System.out.println("[4] PARA DIVISÃO");
			System.out.println(" ");
			System.out.println("[5] PARA SAIR DA CALCULADORA");
			System.out.println(" ");
			System.out.println("Digite sua opção:");
			opçao = teclado.nextByte();
			System.out.println(" ");

			if (opçao >= 1 && opçao <= 4) {
				System.out.println("Digite o primeiro número:");
				numero1 = teclado.nextFloat();
				System.out.println(" ");
				System.out.println("Digite o segundo número:");
				numero2 = teclado.nextFloat();
				System.out.println(" ");

			}
			
			switch (opçao) {
			
			case 1:
				System.out.println("A adição desses números é igual a: " + (numero1 + numero2));
				System.out.println(" ");
				break;
			case 2:
				System.out.println("A subtração desses números é igual a: " + (numero1 - numero2));
				System.out.println(" ");
				break;
			case 3:
				System.out.println("A multiplicação desses números é igual a: " + (numero1 * numero2));
				System.out.println(" ");
				break;
			case 4:
				if (numero1 == 0 || numero2 == 0) {
					System.out.println("ERRO: não é possível fazer divisão com zero.");
					System.out.println(" ");
				} else {
					System.out.println("A divisão desses números é igual a: " + (numero1 / numero2));
					System.out.println(" ");
				}
			}

		} while (opçao != 5);
		{
			System.out.println("Calculadora encerrada.");
			teclado.close();
		}
	}
}
