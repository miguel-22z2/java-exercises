package nivel3;

/**
 * O exercicio 43 vai funcionar desta forma:
 * <p>
 * O programa mostra o 10º número da sequência Fibonacci, usando métodos recursivos.
 * 
 */

public class Exercicio43 {
	public static void main(String[] args) {
		int numero = 11;
		System.out.print(fib(numero));
	}
	public static int fib(int numero) {
		if (numero <= 1) {
			return numero;
		}
		return fib(numero - 1) + fib(numero - 2);
	}
}
