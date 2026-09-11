package nivel5;

public class Token {
	
	private TipoToken tipo;
	private String valor;
	
	public Token(TipoToken tipo, String valor) {
		super();
		this.tipo = tipo;
		this.valor = valor;
	}

	public TipoToken getTipo() {
		return tipo;
	}

	public void setTipo(TipoToken tipo) {
		this.tipo = tipo;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Token [tipo=" + tipo + ", valor=" + valor + "]";
	}
	
}
