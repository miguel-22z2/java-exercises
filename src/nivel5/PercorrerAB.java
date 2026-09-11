package nivel5;

public class PercorrerAB {
	public void emOrdem(NoArvore noArvore) {
		if (noArvore != null) {
			emOrdem(noArvore.esquerda);
			System.out.print(noArvore.valor + " ");
			emOrdem(noArvore.direita);
		}
	}
	
	public void preOrdem(NoArvore noArvore) {
		if (noArvore != null) {
			System.out.print(noArvore.valor + " ");
			preOrdem(noArvore.esquerda);
			preOrdem(noArvore.direita);
		}
	}
	
	public void posOrdem(NoArvore noArvore) {
		if (noArvore != null) {
			posOrdem(noArvore.esquerda);
			posOrdem(noArvore.direita);
			System.out.print(noArvore.valor + " ");
		}
	}
	
	public Integer estaNaArvore(NoArvore root, Integer valor) {
		if (root != null && root.valor == valor) {
			return root.valor;
		} else if (root != null && root.valor < valor) {
			return estaNaArvore(root.esquerda, valor);
		} else if (root != null && root.valor > valor) {
			return estaNaArvore(root.direita, valor);
		} else {
			return null;
		}
	}
}
