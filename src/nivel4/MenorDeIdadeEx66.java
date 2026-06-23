package nivel4;

import java.util.Scanner;

public class MenorDeIdadeEx66 extends Exception {
	
	private static final long serialVersionUID = 6801663452083902888L;
	
	public MenorDeIdadeEx66() {
		super();
	}
	
	public MenorDeIdadeEx66(String s) {
		super(s);
	}

	public static void main(String[] args) throws MenorDeIdadeEx66 {
		try (Scanner teclado = new Scanner(System.in)) {
			System.out.print("Digite sua idade: ");
			int idade = teclado.nextInt();
			
			if (idade >= 18) {
				System.out.println("Você pode passar. Você é maior de idade!");
			} else {
				throw new MenorDeIdadeEx66 ("Você não pode passar! Você é menor de idade!");
			}
		}
	}
}
