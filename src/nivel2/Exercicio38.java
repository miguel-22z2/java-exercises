package nivel2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 
 */

public class Exercicio38 {
	public static void main(String[] args) {
		try {
			Scanner teclado = new Scanner(System.in);
			System.out.println("---Caixa Registradora---");
			System.out.println(" ");
			System.out.println("Digite o preço do produto: R$");
			long preçoProduto = teclado.nextLong();
			System.out.println(" ");
			System.out.println("Digite quantos R$ você tem em sua carteira: R$");
			long preçoCliente = teclado.nextLong();
			long troco = preçoCliente - preçoProduto;
			System.out.println(" ");

			if (preçoProduto > preçoCliente) {
				System.out.println("Você não consegue concluir a compra! Falta dinheiro!");
			} else {
				System.out.println("O troco é de R$" + troco);
				System.out.println("Isto é equivalente a:");
				System.out.println(" ");
				troco(preçoCliente, preçoProduto);
			}
			teclado.close();
		} catch (InputMismatchException e) {
			System.out.println(" ");
			System.out.println("Digite somente números inteiros!");
		}
	}
	public static boolean troco(long preçoCliente, long preçoProduto) {
		long troco = 0;
		troco = preçoCliente - preçoProduto;
		troco = buscarTroco(200, troco);
		troco = buscarTroco(100, troco);
		troco = buscarTroco(50, troco);
		troco = buscarTroco(20, troco);
		troco = buscarTroco(10, troco);
		troco = buscarTroco(5, troco);
		troco = buscarTroco(2, troco);
		troco = buscarTroco(1, troco);
		return true;
	}
	public static long buscarTroco(long nota, long troco) {
		long res = troco / nota;
		if (res >= 1) {
			System.out.println(res + " nota(as) de R$" + nota);
		}
		return troco % nota;
	}
}
