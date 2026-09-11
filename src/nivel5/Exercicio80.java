package nivel5;

public class Exercicio80 {
	public static void main(String[] args) {

		// Criando lista ligada
		Node primeiroNode = new Node(10);
		Node segundoNode = new Node(20);
		Node terceiroNode = new Node(30);
		Node quartoNode = new Node(40);

		primeiroNode.proximoNode = segundoNode;
		segundoNode.proximoNode = terceiroNode;
		terceiroNode.proximoNode = quartoNode;
 
		// Criando um ciclo:
		quartoNode.proximoNode = segundoNode;

		if (hasCiclo(primeiroNode)) {
			System.out.println("A lista tem um ciclo");
		} else {
			System.out.println("A lista não tem um ciclo");
		}
		
	}
	
	/**
	 * Método que retorna <strong>true ou false</strong> se uma lista ligada tiver um ciclo <br>
	 * 
	 * <p>
	 * 
	 * O método segue como base um algoritimo chamado Floyd, que usa 2 ponteiros, <u>um lento e um rápido.</u> <br>
	 * 
	 * <p>
	 * 
	 * Se um dois 2 ponteiros se encontrarem, quer dizer que a lista tem um ciclo e retorna true. Caso
	 * contrário, retorna false.
	 * 
	 * @param inicio (first Node)
	 * @return true if has a cicle, otherwise, return false.
	 * 
	 * @author Miguel A. Lenzi
	 */

	public static boolean hasCiclo(Node inicio) {

		// Inicializando ponteiros
		Node lento = inicio;
		Node rapido = inicio;

		while (rapido != null && rapido.proximoNode != null) {

			lento = lento.proximoNode;
			rapido = rapido.proximoNode.proximoNode;

			if (lento == rapido) {
				return true;
			}
		}

		return false;
	}
}

	/**
	 * Exercício 80 <br>
	 * 
	 * <p>
	 * 
	 * Classe modelo para crição de Nós
	 * 
	 * @author Miguel A. Lenzi
	 */

class Node {

	int valor;
	Node proximoNode;
	
	public Node(int valor) {
		this.valor = valor;
	}
	
}
