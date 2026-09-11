package nivel5;

import java.util.Stack;

public class Exercicio81 {
	public static boolean balancearParenteses(String texto) {
		
		Stack<Character> pilha = new Stack<>();
		
		for (char caractere : texto.toCharArray()) {
			
			if (caractere == '(') {
				pilha.push(caractere);
				continue;
			}
			
			if (pilha.isEmpty()) {
				return false;
			}
			
			char topo = pilha.pop();
			
			if (caractere == ')' && topo != '(') {
				return false;
			}
			
			if (caractere == ']' && topo != '[') {
				return false;
			}
			
			if (caractere == '}' && topo != '{') {
				return false;
			}
			
		}
		
		return pilha.isEmpty();
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(balancearParenteses("()"));
		
	}
}
