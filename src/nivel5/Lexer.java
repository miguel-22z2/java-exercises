package nivel5;

import java.util.ArrayList;
import java.util.List;

public class Lexer {

	private String codigo;
	private int posicao = 0;

	public Lexer(String codigo) {
		this.codigo = codigo;
	}

	public List<Token> analisar() {

		List<Token> tokens = new ArrayList<>();

		while (posicao < codigo.length()) {

			char atual = codigo.charAt(posicao);

			if (Character.isWhitespace(atual)) {
				posicao++;
				continue;
			}

			// Identificadores e palavras-chave
			if (Character.isLetter(atual)) {

				String palavra = lerPalavra();

				if (palavra.equals("int")) {
					tokens.add(new Token(TipoToken.INT, palavra));
				} else {
					tokens.add(new Token(TipoToken.IDENTIFICADOR, palavra));
				}

				continue;
			}

			// Números
			if (Character.isDigit(atual)) {

				String numero = lerNumero();

				tokens.add(new Token(TipoToken.NUMERO, numero));

				continue;
			}

			// Atribuição
			if (atual == '=') {

				tokens.add(new Token(TipoToken.IGUAL, "="));

				posicao++;
				continue;
			}

			// Ponto e Vírgula
			if (atual == ';') {

				tokens.add(new Token(TipoToken.PONTO_E_VIRGULA, ";"));

				posicao++;
				continue;
			}

			// Caractere desconhecido
			throw new RuntimeException("Caractere inválido: " + atual);
		}

		tokens.add(new Token(TipoToken.FIM, ""));

		return tokens;
	}

	private String lerPalavra() {

		StringBuilder palavra = new StringBuilder();

		while (posicao < codigo.length() && Character.isLetterOrDigit(codigo.charAt(posicao))) {

			palavra.append(codigo.charAt(posicao));

			posicao++;
		}

		return palavra.toString();
	}

	private String lerNumero() {

		StringBuilder numero = new StringBuilder();

		while (posicao < codigo.length() && Character.isDigit(codigo.charAt(posicao))) {

			numero.append(codigo.charAt(posicao));

			posicao++;
		}

		return numero.toString();
	}
}
