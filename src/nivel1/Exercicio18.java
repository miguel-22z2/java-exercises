package nivel1;

import java.util.Scanner;

public class Exercicio18 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite a base:");
		int base = teclado.nextInt();
		System.out.println("Digite o expoente:");
		int expoente = teclado.nextInt();
		int resultado = 1;
		
		for (int i = 0; i < expoente; i++) {
			resultado = resultado * base;
		}
		System.out.println("O resultado é " + resultado);
		teclado.close();
			
	}
}
