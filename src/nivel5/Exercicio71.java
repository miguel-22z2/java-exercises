package nivel5;

import java.util.LinkedList;

public class Exercicio71 {
	public static void main(String[] args) {
		LinkedList<String> elementos = new LinkedList<>();
		
		elementos.addFirst("Elemento A");
		elementos.add(1, "Elemento B");
		elementos.addLast("Elemento C");
		
		System.out.println("Elementos na lista:");
		System.out.println();
		System.out.println("Primeiro elemento: " + elementos.getFirst());
		System.out.println("Segundo elemento: " + elementos.get(1));
		System.out.println("Terceiro elemento: " + elementos.getLast());
		
		System.out.println();
		System.out.println("Elementos na lista: " + elementos.size() + " elementos");
	}
}
