package nivel5;

public class Exercicio72 {
	public static void main(String[] args) {
		No root = new No(20);
		
		root.esquerda = new No(10);
		root.direita = new No(5);
		
		PercorrerAB p = new PercorrerAB();
		
		System.out.println("Em ordem:");
		System.out.println();
		p.emOrdem(root);
		System.out.println();
		System.out.println("Pós-ordem:");
		System.out.println();
		p.posOrdem(root);
		System.out.println();
		System.out.println("Pré-ordem:");
		System.out.println();
		p.preOrdem(root);
		System.out.println();
		System.out.println("Buscando valor 5:");
		System.out.println();
	}
}