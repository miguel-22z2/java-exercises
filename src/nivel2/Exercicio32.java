package nivel2;

import java.util.Random;

public class Exercicio32 {
	public static void main(String[] args) {

		Random dado = new Random();

		for (int i = 1; i <= 100; i++) {
			int valorDado = dado.nextInt(6) + 1;
			System.out.println("Jogada número " + i + " = " + valorDado);

		}

	}
}
