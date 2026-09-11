package nivel5;

public class Exercicio73 {
	public static void main(String[] args) {
		NoArvore root = new NoArvore(20);
		
		root.esquerda = new NoArvore(10);
		root.direita = new NoArvore(5);
		
		PercorrerAB p = new PercorrerAB();
		
		System.out.println("Em ordem:");
		System.out.println();
		p.emOrdem(root);
		System.out.println();
		System.out.println("Pré-Ordem:");
		System.out.println();
		p.preOrdem(root);
		System.out.println();
		System.out.println("Pós-ordem:");
		System.out.println();
		p.posOrdem(root);
		System.out.println();
		System.out.println(p.estaNaArvore(root, 5));
		
	}
}
