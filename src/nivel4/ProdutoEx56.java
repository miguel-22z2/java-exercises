package nivel4;

public class ProdutoEx56 {
	static public double precoProduto;
	
	ProdutoEx56(double precoProduto) {
		ProdutoEx56.precoProduto = precoProduto;
	}

	public double getPrecoProduto() {
		System.out.println(precoProduto);
		return precoProduto;
	}

	public void setPrecoProduto(double precoProduto) {
		ProdutoEx56.precoProduto = precoProduto;
		System.out.println(precoProduto);
	}
	
	public static void main(String[] args) {
		ProdutoEx56 bola = new ProdutoEx56(50);
		
		bola.setPrecoProduto(20);
		bola.getPrecoProduto();
	}

}
