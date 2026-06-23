package nivel5;

import java.util.Stack;

public class Exercicio69 {
	public static void main(String[] args) {
		Stack<String> st = new Stack<String>();
		
		st.push("Livro 1");
		st.push("Livro 2");
		st.push("Livro 3");
		
		System.out.println(st.toString());
		
		st.pop();
		
		System.out.println(st.toString());
	}
}
