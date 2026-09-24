package nivel6;

import java.util.List;
import utilitarios.Color;

public class LambdaParser {

	private List<LambdaToken> tokens;
	private int posicao = 0;

	private static LambdaIntepretador interpretador = new LambdaIntepretador();

	public LambdaParser(List<LambdaToken> tokens) {
		super();
		this.tokens = tokens;
	}

	public void analisar() {
		if (tokens == null) {
			return;
		}

		LambdaToken token = tokens.get(posicao);

		if (token.getTipo() == LambdaTipoToken.PRINT) {
			analisarPrint();
		} else if (token.getTipo() == LambdaTipoToken.SUM) {
			analisarSum();
		} else if (token.getTipo() == LambdaTipoToken.INT) {
			analisarVariavelInt();
		} else if (token.getTipo() == LambdaTipoToken.MINES) {
			analisarMines();
		} else if (token.getTipo() == LambdaTipoToken.MULTI) {
			analisarMulti();
		} else if (token.getTipo() == LambdaTipoToken.POW) {
			analisarPow();
		} else if (token.getTipo() == LambdaTipoToken.DIV) {
			analisarDiv();
		} else if (token.getTipo() == LambdaTipoToken.REST) {
			analisarRest();
		} else if (token.getTipo() == LambdaTipoToken.IDENTIFIER) {
			Integer valor = interpretador.getVariavelInteira(token.getConteudo());

			if (valor == null) {
				System.out.println(Color.RED + "Not a valid type: " + token.getConteudo() + Color.RESET);
				return;
			}

			System.out.println(valor);
		} else {
			System.out.println(Color.RED + "Not a comand" + Color.RESET);
			return;
		}
	}

	public void analisarPrint() {
		posicao++;

		LambdaToken mensagem = tokens.get(posicao);

		if (mensagem.getTipo() != LambdaTipoToken.STRING) {
			throw new RuntimeException(Color.RED + "Waiting a text" + Color.RESET);
		}

		interpretador.print(mensagem.getConteudo());
	}

	public void analisarSum() {
		posicao++;

		Integer primeiroValor = 0;
		Integer segundoValor = 0;

		LambdaToken token1 = tokens.get(posicao);

		if (token1.getTipo() == LambdaTipoToken.IDENTIFIER) {
			primeiroValor = interpretador.getVariavelInteira(token1.getConteudo());

			if (primeiroValor == null) {
				System.out.println(Color.RED + "Not a valid type: " + token1.getConteudo() + Color.RESET);
				return;
			}
		} else {
			if (token1.getTipo() != LambdaTipoToken.NUMBER) {
				System.out.println(Color.RED + "Not a valid type" + Color.RESET);
				return;
			}

			primeiroValor = Integer.parseInt(token1.getConteudo());
		}
		posicao++;

		LambdaToken token2 = tokens.get(posicao);

		if (token2.getTipo() == LambdaTipoToken.IDENTIFIER) {
			segundoValor = interpretador.getVariavelInteira(token2.getConteudo());

			if (segundoValor == null) {
				System.out.println(Color.RED + "Not a valid type: " + token2.getConteudo() + Color.RESET);
				return;
			}
		} else {
			if (token2.getTipo() != LambdaTipoToken.NUMBER) {
				System.out.println(Color.RED + "Not a valid type" + Color.RESET);
				return;
			}

			segundoValor = Integer.parseInt(token2.getConteudo());
		}

		interpretador.sum(primeiroValor, segundoValor);

	}

	public void analisarMines() {
		posicao++;

		Integer primeiroValor = 0;
		Integer segundoValor = 0;

		LambdaToken token1 = tokens.get(posicao);

		if (token1.getTipo() == LambdaTipoToken.IDENTIFIER) {
			primeiroValor = interpretador.getVariavelInteira(token1.getConteudo());

			if (primeiroValor == null) {
				System.out.println(Color.RED + "Not a valid type: " + token1.getConteudo() + Color.RESET);
				return;
			}
		} else {
			if (token1.getTipo() != LambdaTipoToken.NUMBER) {
				System.out.println(Color.RED + "Not a valid type" + Color.RESET);
				return;
			}

			primeiroValor = Integer.parseInt(token1.getConteudo());
		}

		posicao++;

		LambdaToken token2 = tokens.get(posicao);

		if (token2.getTipo() == LambdaTipoToken.IDENTIFIER) {
			segundoValor = interpretador.getVariavelInteira(token2.getConteudo());

			if (segundoValor == null) {
				System.out.println(Color.RED + "Not a valid type: " + token2.getConteudo() + Color.RESET);
				return;
			}
		} else {
			if (token2.getTipo() != LambdaTipoToken.NUMBER) {
				System.out.println(Color.RED + "Not a valid type" + Color.RESET);
				return;
			}

			segundoValor = Integer.parseInt(token2.getConteudo());
		}

		interpretador.mines(primeiroValor, segundoValor);
	}

	public void analisarMulti() {
		posicao++;

		Integer primeiroValor = 0;
		Integer segundoValor = 0;

		LambdaToken token1 = tokens.get(posicao);

		if (token1.getTipo() == LambdaTipoToken.IDENTIFIER) {
			primeiroValor = interpretador.getVariavelInteira(token1.getConteudo());

			if (primeiroValor == null) {
				System.out.println(Color.RED + "Not a valid type" + token1.getConteudo() + Color.RESET);
				return;
			}
		} else {
			if (token1.getTipo() != LambdaTipoToken.NUMBER) {
				System.out.println(Color.RED + "Not a valid type" + Color.RESET);
				return;
			}

			primeiroValor = Integer.parseInt(token1.getConteudo());
		}
		posicao++;

		LambdaToken token2 = tokens.get(posicao);

		if (token2.getTipo() == LambdaTipoToken.IDENTIFIER) {
			segundoValor = interpretador.getVariavelInteira(token2.getConteudo());

			if (segundoValor == null) {
				System.out.println(Color.RED + "Not a valid type: " + token2.getConteudo() + Color.RESET);
				return;
			}
		} else {
			if (token2.getTipo() != LambdaTipoToken.NUMBER) {
				System.out.println(Color.RED + "Not a valid type" + Color.RESET);
				return;
			}

			segundoValor = Integer.parseInt(token2.getConteudo());
		}

		interpretador.multi(primeiroValor, segundoValor);
	}

	public void analisarPow() {
		posicao++;

		Integer primeiroValor = 0;
		Integer segundoValor = 0;

		LambdaToken token1 = tokens.get(posicao);

		if (token1.getTipo() == LambdaTipoToken.IDENTIFIER) {
			primeiroValor = interpretador.getVariavelInteira(token1.getConteudo());

			if (primeiroValor == null) {
				System.out.println(Color.RED + "Not a valid type" + token1.getConteudo() + Color.RESET);
				return;
			}
		} else {
			if (token1.getTipo() != LambdaTipoToken.NUMBER) {
				System.out.println(Color.RED + "Not a valid type" + Color.RESET);
				return;
			}

			primeiroValor = Integer.parseInt(token1.getConteudo());
		}
		posicao++;

		LambdaToken token2 = tokens.get(posicao);

		if (token2.getTipo() == LambdaTipoToken.IDENTIFIER) {
			segundoValor = interpretador.getVariavelInteira(token2.getConteudo());

			if (segundoValor == null) {
				System.out.println(Color.RED + "Not a valid type: " + token2.getConteudo() + Color.RESET);
				return;
			}
		} else {
			if (token2.getTipo() != LambdaTipoToken.NUMBER) {
				System.out.println(Color.RED + "Not a valid type" + Color.RESET);
				return;
			}

			segundoValor = Integer.parseInt(token2.getConteudo());
		}

		interpretador.pow(primeiroValor, segundoValor);
	}

	public void analisarDiv() {
		posicao++;

		Integer primeiroValor = 0;
		Integer segundoValor = 0;

		LambdaToken token1 = tokens.get(posicao);

		if (token1.getTipo() == LambdaTipoToken.IDENTIFIER) {
			primeiroValor = interpretador.getVariavelInteira(token1.getConteudo());

			if (primeiroValor == null) {
				System.out.println(Color.RED + "Not a valid type" + token1.getConteudo() + Color.RESET);
				return;
			}
		} else {
			if (token1.getTipo() != LambdaTipoToken.NUMBER) {
				System.out.println(Color.RED + "Not a valid type" + Color.RESET);
				return;
			}

			primeiroValor = Integer.parseInt(token1.getConteudo());
		}
		posicao++;

		LambdaToken token2 = tokens.get(posicao);

		if (token2.getTipo() == LambdaTipoToken.IDENTIFIER) {
			segundoValor = interpretador.getVariavelInteira(token2.getConteudo());

			if (segundoValor == null) {
				System.out.println(Color.RED + "Not a valid type: " + token2.getConteudo() + Color.RESET);
				return;
			}
		} else {
			if (token2.getTipo() != LambdaTipoToken.NUMBER) {
				System.out.println(Color.RED + "Not a valid type" + Color.RESET);
				return;
			}

			segundoValor = Integer.parseInt(token2.getConteudo());
		}

		interpretador.div(primeiroValor, segundoValor);
	}

	public void analisarRest() {
		posicao++;

		Integer primeiroValor = 0;
		Integer segundoValor = 0;

		LambdaToken token1 = tokens.get(posicao);

		if (token1.getTipo() == LambdaTipoToken.IDENTIFIER) {
			primeiroValor = interpretador.getVariavelInteira(token1.getConteudo());

			if (primeiroValor == null) {
				System.out.println(Color.RED + "Not a valid type" + token1.getConteudo() + Color.RESET);
				return;
			}
		} else {
			if (token1.getTipo() != LambdaTipoToken.NUMBER) {
				System.out.println(Color.RED + "Not a valid type" + Color.RESET);
				return;
			}

			primeiroValor = Integer.parseInt(token1.getConteudo());
		}
		posicao++;

		LambdaToken token2 = tokens.get(posicao);

		if (token2.getTipo() == LambdaTipoToken.IDENTIFIER) {
			segundoValor = interpretador.getVariavelInteira(token2.getConteudo());

			if (segundoValor == null) {
				System.out.println(Color.RED + "Not a valid type: " + token2.getConteudo() + Color.RESET);
				return;
			}
		} else {
			if (token2.getTipo() != LambdaTipoToken.NUMBER) {
				System.out.println(Color.RED + "Not a valid type" + Color.RESET);
				return;
			}

			segundoValor = Integer.parseInt(token2.getConteudo());
		}
		
		interpretador.rest(primeiroValor, segundoValor);
	}

	public void analisarVariavelInt() {
		posicao++;

		String identificador = this.tokens.get(posicao).getConteudo();
		posicao++;

		LambdaToken igual = this.tokens.get(posicao);

		if (igual.getConteudo().equals("=") == false) {
			System.out.println(Color.RED + "Waiting =" + Color.RESET);
			return;
		}
		posicao++;

		Integer valor = Integer.parseInt(this.tokens.get(posicao).getConteudo());

		interpretador.criarVariavelInteira(identificador, valor);
	}

}
