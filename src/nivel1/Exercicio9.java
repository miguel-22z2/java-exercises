package nivel1;

import java.util.Scanner;

/**
 * O exercicio 9 vai funcionar desta forma:
 * <p>
 * O programa pergunta ao usuário seu peso e altura, depois mostra na tela seu IMC. Exemplo:
 * <p>
 * Digite seu peso: 55
 * <p>
 * Digite sua altura: 1,70
 * <p>
 * PESO NORMAL
 * 
 */

public class Exercicio9 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite seu peso:");
		float peso = teclado.nextFloat();
		System.out.println("Digite sua altura:");
		float altura = teclado.nextFloat();
		float calculoAltura = altura * altura;
		float calculoImc = peso / calculoAltura;

		if (calculoImc < 18.5) {
			System.out.println("ABAIXO DO PESO");

		} else if (calculoImc >= 18.5 && calculoImc <= 24.9) {
			System.out.println("PESO NORMAL");

		} else if (calculoImc >= 25 && calculoImc <= 29.9) {
			System.out.println("SOBREPESO");

		} else if (calculoImc >= 30 && calculoImc <= 34.9) {
			System.out.println("OBESIDADE GRAVE 1");

		} else if (calculoImc >= 35 && calculoImc <= 39.9) {
			System.out.println("OBESIDADE GRAVE 2");

		} else if (calculoImc > 40) {
			System.out.println("OBESIDADE GRAVE 3");

		}
		teclado.close();

	}
}
