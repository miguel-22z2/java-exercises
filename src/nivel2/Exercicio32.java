package nivel2;

import java.util.Random;

public class Exercicio32 {
	public static void main(String[] args) {
		Random r = new Random();
		int numero = r.nextInt(100);

		System.out.println("=".repeat(40));
		System.out.println("Sorteio de números");
		System.out.println("=".repeat(40));
		System.out.println("Sorteando um número de 0 a 99...");
		System.out.println();
		System.out.println("--".repeat(20));

		System.out.println("Número sorteado: " + numero);
	}
}
