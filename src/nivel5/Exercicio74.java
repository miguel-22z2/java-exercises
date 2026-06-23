package nivel5;

import java.util.HashMap;

public class Exercicio74 {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		
		map.put("Banana", 50);
		map.put("Morango", 100);
		map.put("Uva", 150);
		
		if (map.containsKey("Morango")) {
			System.out.println("Temos morango no estoque!");
		}
		
		System.out.println();
		
		System.out.println("Quantidade de Banana: " + map.get("Banana"));
		System.out.println("Quantidadae de Morangos: " + map.get("Morango"));
		System.out.println("Quantidade de Uvas: " + map.get("Uva"));
	}
}
