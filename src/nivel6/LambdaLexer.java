package nivel6;

import java.util.ArrayList;
import java.util.List;
import utilitarios.Color;

public class LambdaLexer {

	public List<LambdaToken> analisarComandos(String codigo) {

		List<LambdaToken> tokens = new ArrayList<>();

		String[] partesCodigo = codigo.toLowerCase().split(" ");

		if (partesCodigo.length == 4 && partesCodigo[0].equals("int")) {
			tokens.add(new LambdaToken(LambdaTipoToken.INT, "int"));
			tokens.add(new LambdaToken(LambdaTipoToken.IDENTIFIER, partesCodigo[1]));
			tokens.add(new LambdaToken(LambdaTipoToken.EQUALS, partesCodigo[2]));
			tokens.add(new LambdaToken(LambdaTipoToken.NUMBER, partesCodigo[3]));
			tokens.add(new LambdaToken(LambdaTipoToken.END, ""));
			return tokens;
		}

		if (partesCodigo[0].equals("print")) {
			tokens.add(new LambdaToken(LambdaTipoToken.PRINT, "print"));

			String mensagem = "";
			
			try {
				mensagem = codigo.substring(7);
			} catch (Exception e) {
				System.out.println(Color.RED + "Not a valid print command" + Color.RESET);
				return null;
			}

			if (mensagem.indexOf("\"") == -1) {
				LambdaIntepretador interpretador = new LambdaIntepretador();

				interpretador.print(Color.RED + "Not a valid type" + Color.RESET);

				return null;
			}

			mensagem = mensagem.replaceAll("\"", "");

			tokens.add(new LambdaToken(LambdaTipoToken.STRING, mensagem));
		} else if (partesCodigo[0].equals("sum")) {
			tokens.add(new LambdaToken(LambdaTipoToken.SUM, "sum"));
			
			if (partesCodigo.length > 3) {
				System.out.println(Color.RED + "The sum cannot be over than 2 numbers" + Color.RESET);
				return null;
			}
			
			if (partesCodigo.length == 1) {
				System.out.println(Color.RED + "Numbers are missing" + Color.RESET);
				return null;
			}

			String parteValor1 = partesCodigo[1];

			if (Character.isLetter(parteValor1.charAt(0))) {
				tokens.add(new LambdaToken(LambdaTipoToken.IDENTIFIER, parteValor1));
			} else {
				tokens.add(new LambdaToken(LambdaTipoToken.NUMBER, partesCodigo[1]));
			}

			String parteValor2 = partesCodigo[2];

			if (Character.isLetter(parteValor2.charAt(0))) {
				tokens.add(new LambdaToken(LambdaTipoToken.IDENTIFIER, parteValor2));
			} else {
				tokens.add(new LambdaToken(LambdaTipoToken.NUMBER, partesCodigo[2]));
			}
		} else if (partesCodigo[0].equals("mines")) {
			tokens.add(new LambdaToken(LambdaTipoToken.MINES, "mines"));
			
			if (partesCodigo.length > 3) {
				System.out.println(Color.RED + "The mines cannot be over than 2 numbers" + Color.RESET);
				return null;
			}
			
			if (partesCodigo.length == 1) {
				System.out.println(Color.RED + "Numbers are missing" + Color.RESET);
				return null;
			}

			String parteValor1 = partesCodigo[1];

			if (Character.isLetter(parteValor1.charAt(0))) {
				tokens.add(new LambdaToken(LambdaTipoToken.IDENTIFIER, parteValor1));
			} else {
				tokens.add(new LambdaToken(LambdaTipoToken.NUMBER, parteValor1));
			}

			String parteValor2 = partesCodigo[2];

			if (Character.isLetter(parteValor2.charAt(0))) {
				tokens.add(new LambdaToken(LambdaTipoToken.IDENTIFIER, parteValor2));
			} else {
				tokens.add(new LambdaToken(LambdaTipoToken.NUMBER, parteValor2));
			}
		} else if (partesCodigo[0].equals("multi")) {
			tokens.add(new LambdaToken(LambdaTipoToken.MULTI, "multi"));
			
			if (partesCodigo.length > 3) {
				System.out.println(Color.RED + "The multi cannot be over than 2 numbers" + Color.RESET);
				return null;
			}
			
			if (partesCodigo.length == 1) {
				System.out.println(Color.RED + "Numbers are missing" + Color.RESET);
				return null;
			}
			
			String parteValor1 = partesCodigo[1];

			if (Character.isLetter(parteValor1.charAt(0))) {
				tokens.add(new LambdaToken(LambdaTipoToken.IDENTIFIER, parteValor1));
			} else {
				tokens.add(new LambdaToken(LambdaTipoToken.NUMBER, parteValor1));
			}

			String parteValor2 = partesCodigo[2];

			if (Character.isLetter(parteValor2.charAt(0))) {
				tokens.add(new LambdaToken(LambdaTipoToken.IDENTIFIER, parteValor2));
			} else {
				tokens.add(new LambdaToken(LambdaTipoToken.NUMBER, parteValor2));
			} 
		} else if (partesCodigo[0].equals("pow")) {
			tokens.add(new LambdaToken(LambdaTipoToken.POW, "pow"));
			
			if (partesCodigo.length > 3) {
				System.out.println(Color.RED + "The pow cannot be over than 2 numbers, ONLY 2" + Color.RESET);
				return null;
			}
			
			if (partesCodigo.length == 1) {
				System.out.println(Color.RED + "Numbers are missing" + Color.RESET);
				return null;
			}
			
			String parteValor1 = partesCodigo[1];

			if (Character.isLetter(parteValor1.charAt(0))) {
				tokens.add(new LambdaToken(LambdaTipoToken.IDENTIFIER, parteValor1));
			} else {
				tokens.add(new LambdaToken(LambdaTipoToken.NUMBER, parteValor1));
			}

			String parteValor2 = partesCodigo[2];

			if (Character.isLetter(parteValor2.charAt(0))) {
				tokens.add(new LambdaToken(LambdaTipoToken.IDENTIFIER, parteValor2));
			} else {
				tokens.add(new LambdaToken(LambdaTipoToken.NUMBER, parteValor2));
			} 
		} else if (partesCodigo[0].equals("div")) {
			tokens.add(new LambdaToken(LambdaTipoToken.DIV, "div"));
			
			if (partesCodigo.length > 3) {
				System.out.println(Color.RED + "The div cannot be over than 2 numbers" + Color.RESET);
				return null;
			}
			
			if (partesCodigo.length == 1) {
				System.out.println(Color.RED + "Numbers are missing" + Color.RESET);
				return null;
			}
			
			String parteValor1 = partesCodigo[1];

			if (Character.isLetter(parteValor1.charAt(0))) {
				tokens.add(new LambdaToken(LambdaTipoToken.IDENTIFIER, parteValor1));
			} else {
				tokens.add(new LambdaToken(LambdaTipoToken.NUMBER, parteValor1));
			}

			String parteValor2 = partesCodigo[2];

			if (Character.isLetter(parteValor2.charAt(0))) {
				tokens.add(new LambdaToken(LambdaTipoToken.IDENTIFIER, parteValor2));
			} else {
				tokens.add(new LambdaToken(LambdaTipoToken.NUMBER, parteValor2));
			} 
		} else if (partesCodigo[0].equals("rest")) {
			tokens.add(new LambdaToken(LambdaTipoToken.REST, "rest"));
			
			if (partesCodigo.length > 3) {
				System.out.println(Color.RED + "The sum rest be over than 2 numbers" + Color.RESET);
				return null;
			}
			
			if (partesCodigo.length == 1) {
				System.out.println(Color.RED + "Numbers are missing" + Color.RESET);
				return null;
			}
			
			String parteValor1 = partesCodigo[1];

			if (Character.isLetter(parteValor1.charAt(0))) {
				tokens.add(new LambdaToken(LambdaTipoToken.IDENTIFIER, parteValor1));
			} else {
				tokens.add(new LambdaToken(LambdaTipoToken.NUMBER, parteValor1));
			}

			String parteValor2 = partesCodigo[2];

			if (Character.isLetter(parteValor2.charAt(0))) {
				tokens.add(new LambdaToken(LambdaTipoToken.IDENTIFIER, parteValor2));
			} else {
				tokens.add(new LambdaToken(LambdaTipoToken.NUMBER, parteValor2));
			} 
		} else {
			tokens.add(new LambdaToken(LambdaTipoToken.IDENTIFIER, partesCodigo[0]));
		}

		tokens.add(new LambdaToken(LambdaTipoToken.END, ""));

		return tokens;
	}

}
