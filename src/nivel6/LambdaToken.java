package nivel6;

public class LambdaToken {

	private LambdaTipoToken tipo;
	private String conteudo;

	public LambdaToken(LambdaTipoToken tipo, String conteudo) {
		super();
		this.tipo = tipo;
		this.conteudo = conteudo;
	}

	public LambdaTipoToken getTipo() {
		return tipo;
	}

	public void setTipo(LambdaTipoToken tipo) {
		this.tipo = tipo;
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

}
