package nivel6;

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
			} else if (comando.toLowerCase().equals("lambda") || comando.equals("λ")) {
				System.out.println("Lambda is an interpreted language created by miguel-22z2 in 2026.\nThis is a basic comand programming language, so you can make tiny thinghs");
			} else {
				LambdaParser parser = new LambdaParser(lexer.analisarComandos(comando));
				
				parser.analisar();
			}
		}
		
		sc.close();
	}
}
