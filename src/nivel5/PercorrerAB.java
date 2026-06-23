package nivel5;

public class PercorrerAB {
	public void emOrdem(No no) {
		if (no != null) {
			emOrdem(no.esquerda);
			System.out.print(no.valor + " ");
			emOrdem(no.direita);
		}
	}
	
	public void preOrdem(No no) {
		if (no != null) {
			System.out.print(no.valor + " ");
			preOrdem(no.esquerda);
			preOrdem(no.direita);
		}
	}
	
	public void posOrdem(No no) {
		if (no != null) {
			posOrdem(no.esquerda);
			posOrdem(no.direita);
			System.out.print(no.valor + " ");
		}
	}
	
	public Integer estaNaArvore(No root, Integer valor) {
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
