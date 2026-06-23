package nivel4;

public class Emprestimos {
	private Livro livroEmprestado;
	private String dataEmprestimo;
	private String dataDevolucao;
	private String cliente;
	private String cpfCliente;
	
	Emprestimos(Livro livroEmprestado, String dataEmprestimo, String dataDevolucao, String cliente, String cpfCliente) {
		this.livroEmprestado = livroEmprestado;
		this.dataEmprestimo = dataEmprestimo;
		this.dataDevolucao = dataDevolucao;
		this.cliente = cliente;
		this.cpfCliente = cpfCliente;
	}

	public Livro getLivroEmprestado() {
		return livroEmprestado;
	}

	public void setLivroEmprestado(Livro livroEmprestado) {
		this.livroEmprestado = livroEmprestado;
	}

	public String getDataEmprestimo() {
		return dataEmprestimo;
	}

	public void setDataEmprestimo(String dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	}

	public String getDataDevolucao() {
		return dataDevolucao;
	}

	public void setDataDevolucao(String dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getCpfCliente() {
		return cpfCliente;
	}

	public void setCpfCliente(String cpfCliente) {
		this.cpfCliente = cpfCliente;
	}
}
