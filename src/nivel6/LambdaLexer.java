package nivel6;

import java.util.ArrayList;
import java.util.List;
import utilitarios.Color;

public class LambdaLexer {

	public List<LambdaToken> analisarComandos(String codigo) {

		List<LambdaToken> tokens = new ArrayList<>();

		String[] partesCodigo = codigo.split(" ");

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

			String mensagem = codigo.substring(7);

			if (mensagem.indexOf("\"") == -1) {
				LambdaIntepretador interpretador = new LambdaIntepretador();

				interpretador.print(Color.RED + "Not a valid type" + Color.RESET);

				return null;
			}

			mensagem = mensagem.replaceAll("\"", "");

			tokens.add(new LambdaToken(LambdaTipoToken.STRING, mensagem));
		} else if (partesCodigo[0].equals("sum")) {
			tokens.add(new LambdaToken(LambdaTipoToken.SUM, "sum"));

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
