package nivel6;

import java.util.List;
import java.util.Scanner;

public class Exercicio92 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		LambdaLexer lexer = new LambdaLexer();
		
		System.out.println("Welcome to Lambda λ");
		System.out.println("Type 'help' to see the comands");
		System.out.println();
		
		while (true) {
			System.out.print(">>>: ");
			String comando = sc.nextLine().strip().replaceAll("'", "");
			
			if (comando.toLowerCase().equals("help")) {
				System.out.println("print -> to print things in terminal. Example:");
				System.out.println("print \"Hello, World!\"");
				System.out.println("Output: Hello, World!");
				System.out.println();
				System.out.println("sum -> makes the sum of two numbers. Example:");
				System.out.println("sum 1 2");
				System.out.println("Output: 3");
				System.out.println();
				System.out.println("exit -> the Lambda process finishes.");
				System.out.println();
			} else if (comando.toLowerCase().equals("exit")) {
				System.out.println();
				break;
			} else {
				List<LambdaToken> tokens = lexer.analisar(comando);
				
				LambdaParser parser = new LambdaParser(tokens);
				
				parser.analisar();
			}
		}
		
		sc.close();
	}
}
