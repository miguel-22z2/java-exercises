package nivel4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 * A seguinte classe funciona desta forma:
 * <p>
 * Ela funciona como um pequeno <u>Sistema de biblioteca</u>, podendo fazer empréstimos de livros, compra de livros e muitos outros!
 * <p>
 * Outras classes usadas: {@link java.text.ParseException}, {@link java.text.SimpleDateFormat}, {@link java.util.ArrayList}, {@link java.util.Date}, {@link javax.swing.JOptionPane}.
 * <p>
 * Date: validar datas <br>
 * ArrayList: armazenar livros e empréstimos <br>
 * JOptionPane: gerar caixas de diálogos <br>
 * SimpleDateFormat: transformar datas válidas em String <br>
 * ParseException: Exception de validar datas <br>
 * @author Miguel Alessi Lenzi 
 * @version 2.0
 */

public class BibliotecaEx63 {
	private ArrayList<Livro> listLivros = new ArrayList<Livro>();
	private ArrayList<Emprestimos> listEmprestimos = new ArrayList<Emprestimos>();
	
	private Date dataHoje = new Date();
	private SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
	
	public final String titulo = "Biblioteca";
	
	public void addLivro() {
		String inputLivro = JOptionPane.showInputDialog(null, "Digite o nome do livro:", titulo, JOptionPane.PLAIN_MESSAGE);
		
		if (inputLivro.isBlank()) {
			JOptionPane.showMessageDialog(null, "Digite um nome para seu livro!", titulo, JOptionPane.WARNING_MESSAGE, null);
			return;
		}
		
		String inputAutor  = JOptionPane.showInputDialog(null, "Digite o nome do autor do livro:", titulo, JOptionPane.PLAIN_MESSAGE);
		
		if (inputAutor.isBlank()) {
			JOptionPane.showMessageDialog(null, "Digite um nome para o autor do livro!", titulo, JOptionPane.WARNING_MESSAGE, null);
			return;
		}
		
		String inputPreco = JOptionPane.showInputDialog(null, "Digite o valor do livro:", titulo, JOptionPane.PLAIN_MESSAGE);
		
		if (inputPreco.isBlank()) {
			JOptionPane.showMessageDialog(null, "Digite um valor para o livro!", titulo, JOptionPane.WARNING_MESSAGE, null);
			return;
		}
		
		Double valorLivro = 0.0;
		
		try {
			valorLivro = Double.parseDouble(inputPreco);
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Digite somente números!", titulo, JOptionPane.WARNING_MESSAGE, null);
			return;
		}
		
		listLivros.add(new Livro(inputLivro, inputAutor, valorLivro));
		
		JOptionPane.showMessageDialog(null, "Livro adicionado com sucesso!", titulo, JOptionPane.INFORMATION_MESSAGE, null);
		return;
	}
	
	public JScrollPane getLivros() {
		StringBuilder sb = new StringBuilder("Livros disponíveis:\n\n");
		
		JTextArea textArea = new JTextArea();
		
		textArea.setEditable(false); 
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
		
		
		if (listLivros.isEmpty() == false) {
			
			for (int i = 0; i < listLivros.size(); i++) {
				sb
				.append(i + ": ")
				.append(listLivros.get(i).getNome())
				.append(" | ")
				.append(listLivros.get(i).getAutor())
				.append(" | Preço: R$" + listLivros.get(i).getValor())
				.append("\n\n");
			}
			
			textArea.setText(sb.toString());
			
			JScrollPane jsc = new JScrollPane(textArea);
			
			return jsc;
		} else {
			return null;
		}
	}
	
	public void fazerEmprestimo() {
		
		String inputIndice = JOptionPane.showInputDialog(null, getLivros(), "Digite o ID do livro", JOptionPane.PLAIN_MESSAGE);
		
		if (inputIndice.isBlank()) {
			JOptionPane.showMessageDialog(null, "Digite algum indíce!", titulo, JOptionPane.WARNING_MESSAGE, null);
			return;
		}
		
		int indiceFormatado = 0;
		
		try {
			indiceFormatado = Integer.parseInt(inputIndice);
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Digite um número válido!", titulo, JOptionPane.WARNING_MESSAGE, null);
			return;
		}
		
		String inputNomeClient = JOptionPane.showInputDialog(null, "Digite o nome do cliente:", titulo, JOptionPane.PLAIN_MESSAGE);
		
		if (inputNomeClient.isBlank()) {
			JOptionPane.showMessageDialog(null, "Digite o nome do cliente!", titulo, JOptionPane.WARNING_MESSAGE, null);
			return;
		}
		
		String inputCpfClient = JOptionPane.showInputDialog(null, "Digite o CPF do cliente:", titulo, JOptionPane.PLAIN_MESSAGE);
		
		if (inputCpfClient.isBlank()) {
			JOptionPane.showMessageDialog(null, "Digite um CPF para cadastrar o cliente!", titulo, JOptionPane.WARNING_MESSAGE, null);
			return;
		}
		
		if (validarCpf(inputCpfClient) == false) {
			JOptionPane.showMessageDialog(null, "Digite um CPF válido!", titulo, JOptionPane.WARNING_MESSAGE, null);
			return;
		}
		
		String inputDataDevolucao = JOptionPane.showInputDialog(null, "Digite a data de devolução:", titulo, JOptionPane.PLAIN_MESSAGE);
		
		if (inputDataDevolucao.isBlank()) {
			JOptionPane.showMessageDialog(null, "Digite uma data para devolução!", titulo, JOptionPane.WARNING_MESSAGE, null);
			return;
		}
		
		Date dataDevolucao = new Date();
		
		try {
			dataDevolucao = formatoData.parse(inputDataDevolucao);
		} catch (ParseException e) {
			JOptionPane.showMessageDialog(null, "Digite um formato de data válida (dd/mm/aaaa)!", titulo, JOptionPane.ERROR_MESSAGE, null);
			return;
		}
		
		String dataDevolucaoFormatada = formatoData.format(dataDevolucao);
		
		String dataHojeFormatada = formatoData.format(dataHoje);
		
		
		StringBuilder sb = new StringBuilder("Resumo do empréstimo:\n\n");
		
		sb
		.append("Nome do cliente: " + inputNomeClient)
		.append("\nCPF do cliente: " + inputCpfClient)
		.append("\nLivro: " + listLivros.get(indiceFormatado).getNome() + " | Autor: " + listLivros.get(indiceFormatado).getAutor())
		.append("\nData empréstimo: " + dataHojeFormatada)
		.append("\nData devolução: " + dataDevolucaoFormatada)
		.append("\n\nQuer mesmo realizar o empréstimo?");
		
		sb.toString();
		
		int certezaEmprestimo = JOptionPane.showConfirmDialog(null, sb, titulo, JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, null);
		
		if (certezaEmprestimo == JOptionPane.NO_OPTION) {
			JOptionPane.showMessageDialog(null, "Empréstimo cancelado!", titulo, JOptionPane.INFORMATION_MESSAGE, null);
			return;
		}
		
		listEmprestimos.add(new Emprestimos(listLivros.get(indiceFormatado), dataHojeFormatada, dataDevolucaoFormatada, inputNomeClient, inputCpfClient));
		
		listLivros.remove(indiceFormatado);
		
		JOptionPane.showMessageDialog(null, "Empréstimo realizado com sucesso!", titulo, JOptionPane.INFORMATION_MESSAGE, null);
		
		return;
	}
	
	public JScrollPane getEmprestimos() {
		
		JTextArea textArea = new JTextArea();
		
		textArea.setEditable(false); 
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
		
		StringBuilder sb = new StringBuilder("Empréstimos feitos:\n\n");
		
		if (listEmprestimos.isEmpty() == false) {
			
			for (int i = 0; i < listEmprestimos.size(); i++) {
				sb.append("ID: " + i)
				.append("\nCliente: " + listEmprestimos.get(i).getCliente())
				.append("\nCPF do cliente: " + listEmprestimos.get(i).getCpfCliente())
				.append("\nLivro: " + listEmprestimos.get(i).getLivroEmprestado().getNome() + " | Autor: " + listEmprestimos.get(i).getLivroEmprestado().getAutor())
				.append("\nData empréstimo: " + listEmprestimos.get(i).getDataEmprestimo())
				.append("\nData devolução: " + listEmprestimos.get(i).getDataDevolucao()).append("\n\n");
			}
			
			textArea.setText(sb.toString());
			
			JScrollPane jsc = new JScrollPane(textArea);
			
			return jsc;
		} else {
			return null;
		}
	}
	
	public void devolverLivro() {
		if (listEmprestimos.isEmpty() == false) {
			String inputId = JOptionPane.showInputDialog(null, getEmprestimos(), "Digite o ID do empréstimo", JOptionPane.PLAIN_MESSAGE);
			
			if (inputId.isBlank()) {
				JOptionPane.showMessageDialog(null, "Digite um indíce!", titulo, JOptionPane.WARNING_MESSAGE, null);
				return;
			}	
			
			int idEmprestimo = 0;
			
			try {
				idEmprestimo = Integer.parseInt(inputId);
			} catch (NumberFormatException e) { 
				JOptionPane.showMessageDialog(null, "Digite somente números!", titulo, JOptionPane.WARNING_MESSAGE, null);
				return;
			}
			
			if (idEmprestimo < 0 || idEmprestimo > listEmprestimos.size()) {
				JOptionPane.showMessageDialog(null, "ID não encontrado!", titulo, JOptionPane.WARNING_MESSAGE, null);
				return;
			}
			
			int certezaDevolucao = JOptionPane.showConfirmDialog(null, "Você quer mesmo fazer a devolução do livro?", titulo, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null);
			
			if (certezaDevolucao == JOptionPane.NO_OPTION) {
				JOptionPane.showMessageDialog(null, "Devolução cancelada!", titulo, JOptionPane.INFORMATION_MESSAGE, null);
				return;
			}
			
			listLivros.addLast(new Livro(listEmprestimos.get(idEmprestimo).getLivroEmprestado().getNome(), listEmprestimos.get(idEmprestimo).getLivroEmprestado().getAutor(), listEmprestimos.get(idEmprestimo).getLivroEmprestado().getValor()));
			
			listEmprestimos.remove(idEmprestimo);
			
			JOptionPane.showMessageDialog(null, "Devolução de livro feita com sucesso!", titulo, JOptionPane.INFORMATION_MESSAGE, null);
			
			return;
		} else {
			JOptionPane.showMessageDialog(null, "A lista de empréstimos está vazia!", titulo, JOptionPane.WARNING_MESSAGE, null);
			return;
		}
	}
	
	public Integer getOpcao() {
		StringBuilder sb = new StringBuilder("Selecione sua opção:\n\n");
		
		sb
		.append("1 - Adicionar livro\n")
		.append("2 - Verificar livros\n")
		.append("3 - Remover livros\n")
		.append("4 - Atualizar livro\n")
		.append("5 - Comprar livro\n")
		.append("6 - Fazer empréstimo\n")
		.append("7 - Verificar empréstimos\n")
		.append("8 - Devolver livro\n")
		.append("9 - Sair\n\n");
		
		String inputOpcao = JOptionPane.showInputDialog(null, sb.toString(), titulo, JOptionPane.PLAIN_MESSAGE);
		
		Integer opcao  = 0;
		
		try {
			opcao = Integer.parseInt(inputOpcao);
		} catch (NumberFormatException e) {
		}
		
		return opcao;
	}
	
	public void removeLivro() {
		if (listLivros.isEmpty() == false) {
			String inputIndice = JOptionPane.showInputDialog(null, getLivros(), "Digite o ID do livro para remover", JOptionPane.PLAIN_MESSAGE);
			
			int indice = 0;
			
			try {
				indice = Integer.parseInt(inputIndice);
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Indíce inválido!", titulo, JOptionPane.WARNING_MESSAGE, null);
				return;
			}
			
			if (indice < 0 || indice > listLivros.size()) {
				JOptionPane.showMessageDialog(null, "Indíce não encontrado!", titulo, JOptionPane.WARNING_MESSAGE, null);
				return;
			}
			
			int certeza = JOptionPane.showConfirmDialog(null, "Você quer mesmo remover o livro " + listLivros.get(indice).getNome() + '?', titulo, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null);
			
			if (certeza == JOptionPane.NO_OPTION) {
				JOptionPane.showMessageDialog(null, "Ação cancelada!", titulo, JOptionPane.INFORMATION_MESSAGE, null);
				return;
			}
			
			listLivros.remove(indice);
			JOptionPane.showMessageDialog(null, "Livro removido com sucesso!", titulo, JOptionPane.INFORMATION_MESSAGE, null);
			
			return;
		} else {
			JOptionPane.showMessageDialog(null, "A lista de livros está vazia!", titulo, JOptionPane.WARNING_MESSAGE, null);
			return;
		}
	}
	
	public void carregarLivrosIniciais() {
		listLivros.add(new Livro("Dom Casmurro", "Machado de Assis", 35.00));
		listLivros.add(new Livro("Vidas Secas", "Graciliano Ramos", 35.00));
		listLivros.add(new Livro("O Cortiço", "Aluísio Azevedo", 35.00));
		listLivros.add(new Livro("Memórias Póstumas de Brás Cubas", "Machado de Assis", 35.00));
		listLivros.add(new Livro("Grande Sertão: Veredas", "João Guimarães Rosa", 35.00));
	}
	
	public void comprarLivro() {
		String inputIndice = JOptionPane.showInputDialog(null, getLivros(), "Digite o ID do livro", JOptionPane.PLAIN_MESSAGE);
		
		int indice = 0;
		
		try {
			indice = Integer.parseInt(inputIndice);
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Digite um indíce válido!", titulo, JOptionPane.WARNING_MESSAGE, null);
			return;
		}
		
		if (indice < 0 || indice > listLivros.size()) {
			JOptionPane.showMessageDialog(null, "Indíce inválido!", titulo, JOptionPane.WARNING_MESSAGE, null);
			return;
		}
		
		StringBuilder sb = new StringBuilder("Informações do livro:\n\n");
		
		sb
		.append("Nome: " + listLivros.get(indice).getNome())
		.append("\nAutor: " + listLivros.get(indice).getAutor())
		.append("\nPreço: R$" + listLivros.get(indice).getValor())
		.append("\n\nConfirmar compra?");
		
		int certezaCompra = JOptionPane.showConfirmDialog(null, sb.toString(), titulo, JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, null);
		
		if (certezaCompra == JOptionPane.NO_OPTION) {
			JOptionPane.showMessageDialog(null, "Ação cancelada!", titulo, JOptionPane.INFORMATION_MESSAGE, null);
			return;
		}
		
		listLivros.remove(indice);
		
		JOptionPane.showMessageDialog(null, "Compra efetuada com sucesso!", titulo, JOptionPane.INFORMATION_MESSAGE, null);
		return;
	}
	
	public void atualizarLivro() {
		String inputIndice = JOptionPane.showInputDialog(null, getLivros(), "Digite o ID do livro", JOptionPane.PLAIN_MESSAGE);
		
		int indice = 0;
		
		try {
			indice = Integer.parseInt(inputIndice);
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "indíce inválido!", titulo, JOptionPane.WARNING_MESSAGE, null);
			return;
		}
		
		if (indice < 0 || indice > listLivros.size()) {
			JOptionPane.showMessageDialog(null, "Livro não encontrado!", titulo, JOptionPane.INFORMATION_MESSAGE, null);
			return;
		}
		
		StringBuilder sb = new StringBuilder("O que você deseja fazer com o livro " + listLivros.get(indice).getNome() + "?\n\n");
		
		sb
		.append("1 - Renomear livro\n")
		.append("2 - Renomear autor\n")
		.append("3 - Atualizar preço\n\n");
		
		String inputOpcao = JOptionPane.showInputDialog(null, sb.toString(), titulo, JOptionPane.PLAIN_MESSAGE);
		
		int opcao = 0;
		
		try {
			opcao = Integer.parseInt(inputOpcao);
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Digite somente números!", titulo, JOptionPane.WARNING_MESSAGE, null);
			return;
		}
		
		if (opcao < 1 || opcao > 3) {
			JOptionPane.showMessageDialog(null, "Opção inválida!", titulo, JOptionPane.WARNING_MESSAGE, null);
			return;
		}
		
		if (opcao == 1) {
			String inputNome = JOptionPane.showInputDialog(null, "Digite o novo nome do livro:", titulo, JOptionPane.PLAIN_MESSAGE);
			
			if (inputNome.isBlank()) {
				JOptionPane.showMessageDialog(null, "Digite um novo nome do livro!", titulo, JOptionPane.WARNING_MESSAGE, null);
				return;
			}
			
			listLivros.set(indice, new Livro(inputNome, listLivros.get(indice).getAutor(), listLivros.get(indice).getValor()));
			
			JOptionPane.showMessageDialog(null, "Livro renomeado com sucesso!", titulo, JOptionPane.INFORMATION_MESSAGE, null);
			return;
		} else if (opcao == 2) {
			String inputAutor = JOptionPane.showInputDialog(null, "Digite o nome do autor:", titulo, JOptionPane.PLAIN_MESSAGE);
			
			if (inputAutor.isBlank()) {
				JOptionPane.showMessageDialog(null, "Digite o nome do autor!", titulo, JOptionPane.WARNING_MESSAGE, null);
				return;
			}
			
			listLivros.set(indice, new Livro(listLivros.get(indice).getNome(), inputAutor, listLivros.get(indice).getValor()));
			
			JOptionPane.showMessageDialog(null, "Autor atualizado!", titulo, JOptionPane.INFORMATION_MESSAGE, null);
			
			return;
		} else if (opcao == 3) {
			String inputPreco = JOptionPane.showInputDialog(null, "Digite o novo valor:", titulo, JOptionPane.PLAIN_MESSAGE);
			
			Double preco = 0.0;
			
			try {
				preco = Double.parseDouble(inputPreco);
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Digite somente números!", titulo, JOptionPane.WARNING_MESSAGE, null);
				return;
			}
			
			listLivros.set(indice, new Livro(listLivros.get(indice).getNome(), listLivros.get(indice).getAutor(), preco));
			
			JOptionPane.showMessageDialog(null, "Preço atualizado com sucesso!", titulo, JOptionPane.INFORMATION_MESSAGE, null);
			
			return;
		}
	}
	
	private static boolean validarCpf(String cpf) {
		cpf = cpf.replaceAll("\\D", "");
		
		if (cpf.length() != 11) {
			return false;
		}
		
		int soma = 0;
		
		for (int i = 0; i < 9; i++) {
			soma += (cpf.charAt(i) - '0') * (10 - i);
		}
		
		int digitoVerificador1 = (soma * 10) % 11;
		
		if (digitoVerificador1 == 10) {
			digitoVerificador1 = 0;
		}
		
		soma = 0;
		
		for (int i = 0; i < 10; i++) {
			soma += (cpf.charAt(i) - '0') * (11 - i); 
		}
		
		int digitoVerificador2 = (soma * 10) % 11;
		
		if (digitoVerificador2 == 10) {
			digitoVerificador2 = 0;
		}
		
		return digitoVerificador1 == (cpf.charAt(9) - '0') && digitoVerificador2 == (cpf.charAt(10) - '0');
	}
}
