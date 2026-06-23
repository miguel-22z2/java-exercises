package nivel4;

public class Livro {
	private String nome;
	private String autor;
	private Double valor;
	
	Livro(String nomeLivro, String autorLivro, Double valorLivro) {
		this.nome = nomeLivro;
		this.autor = autorLivro;
		this.valor = valorLivro;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public Double getValor() {
		return valor;
	}
	
	public void setValor(Double valor) {
		this.valor = valor;
	}
}
