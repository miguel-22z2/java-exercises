package nivel1;

/**
 * O exercicio 19 vai funcionar desta forma:
 * <p>
 * O programa mostra na tela os 11 primeiros números da sequência Fibonacci.
 * 
 */

public class Exercicio19 {
	public static void main(String[] args) {
		System.out.println("Os 11 primeiros números da sequência Fibonacci é:");
		System.out.println(" ");

		int numeroProximo = 0;
		int numeroAtual = 1;
		int numeroAnterior = 0;

		for (int i = 1; i <= 90; i++) {
			numeroProximo = numeroAtual + numeroAnterior;
			numeroAtual = numeroAnterior;
			numeroAnterior = numeroProximo;
			System.out.print(numeroAtual + ", ");

		}

	}
}
