package nivel5;

/**
 * 
 * Exercício 78 <br>
 * 
 * <p>
 * 
 * Classe principal para usar a classe LRU
 * 
 * @author Miguel A. Lenzi
 * 
 */

public class MainLRU {
	public static void main(String[] args) {
		
		LRU<Integer, String> lru = new LRU<>(3);
		
		// Adicionando elementos
		lru.put(1, "A");
		lru.put(2, "B");
		lru.put(3, "C");
		
		System.out.println(lru);
		
		// Pegando elementos para trocar a ordem de elementos na lista
		lru.get(2);
		
		System.out.println(lru);
		
		// Adicionando novo elemento para remover o item menos usado
		lru.put(4, "D");
		
		System.out.println(lru);
	}
}
