package nivel5;

import java.util.List;

public class Exercicio82 {
	public static void main(String[] args) {

		String codigo = "int idade = 14;";

		Lexer lexer = new Lexer(codigo);

		List<Token> tokens = lexer.analisar();

		System.out.println("TOKENS:");

		for (Token token : tokens) {
			System.out.println(token);
		}

		Parser parser = new Parser(tokens);

		parser.analisar();

	}
}
