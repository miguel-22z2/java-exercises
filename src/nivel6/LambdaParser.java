package nivel6;

import java.util.List;
import utilitarios.Color;

public class LambdaParser {

	private List<LambdaToken> tokens;
	private int posicao = 0;

	public LambdaParser(List<LambdaToken> tokens) {
		super();
		this.tokens = tokens;
	}
	
	public void analisar() {
		LambdaToken comando = tokens.get(posicao);
		
		if (comando.getTipo() == LambdaTipoToken.PRINT) {
			analisarPrint();
		} else if (comando.getTipo() == LambdaTipoToken.SUM) {
			analisarSum();
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
		
		LambdaIntepretador intepretador = new LambdaIntepretador();
		
		intepretador.print(mensagem.getConteudo());
	}
	
	public void analisarSum() {
		posicao++;
		
		LambdaToken numero1 = tokens.get(posicao);
		posicao++;
		
		LambdaToken numero2 = tokens.get(posicao);
		
		if (numero1.getTipo() != LambdaTipoToken.NUMBER || numero2.getTipo() != LambdaTipoToken.NUMBER) {
			throw new RuntimeException("Waiting a number");
		}
		
		int valor1 = Integer.parseInt(numero1.getConteudo());
		int valor2 = Integer.parseInt(numero2.getConteudo());
		
		LambdaIntepretador interpretador = new LambdaIntepretador();
		
		interpretador.sum(valor1, valor2);
	}
	
}
