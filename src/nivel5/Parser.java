package nivel5;

import java.util.List;

public class Parser {

	private List<Token> tokens;
	private int posicao = 0;

	public Parser(List<Token> tokens) {
		this.tokens = tokens;
	}

	public void analisar() {

		while (verificar(TipoToken.FIM) == false) {
			declaracao();
		}
		
		System.out.println("Código válido!");
	}

	private void declaracao() {

		consumir(TipoToken.INT, "Esperado 'int'");

		consumir(TipoToken.IDENTIFICADOR, "Esperado nome da variável");

		consumir(TipoToken.IGUAL, "Esperado '='");

		consumir(TipoToken.NUMERO, "Esperado um número");

		consumir(TipoToken.PONTO_E_VIRGULA, "Esperado ';'");
	}

	private boolean verificar(TipoToken tipo) {

		return tokens.get(posicao).getTipo() == tipo;
	}

	private void consumir(TipoToken tipo, String mensagemErro) {

		if (verificar(tipo)) {

			posicao++;

		} else {

			throw new RuntimeException(mensagemErro + ". Encontrado: " + tokens.get(posicao));
		}
	}
}