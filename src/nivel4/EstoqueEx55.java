package nivel4;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import utilitarios.Produto;

/**
 * 	O programa funciona desta forma:
 * <p>
 * <h4>O ele funciona como um <u>Sistema de Estoque simples!</u> 
 * O programa tem métodos como adicionar produto, remover produto e entre outros.</h4>
 * <p>
 * <h4>Para armazenar os produtos, o programa usa uma <u>Array List!</u></h4>
 * <p>
 * Outras classes usadas: {@link java.util.ArrayList}, {@link javax.swing.JOptionPane}, {@link javax.swing.UIManager}, {@link javax.swing.JScrollPane}, {@link javax.swing.JTextArea}.
 * <p>
 *@author Miguel Alessi Lenzi
 */

public class EstoqueEx55 {
	public final String titulo = "Sistema de Estoque";
	
	private String[] categorias = {"Lazer", "Limpeza", "Moradia", "Comida", "Remédios", "Transporte", "Educação", "Outros"};
	private String[] opcoes = {"Adicionar produto", "Verificar produtos", "Buscar produto", "Editar produto", "Remover produto", "Sair"};
	private ArrayList<Produto> listProdutos = new ArrayList<>();
	 
	public void addProduto() {
		String inputNome = JOptionPane.showInputDialog(null, "Digite o nome do produto:", titulo, JOptionPane.PLAIN_MESSAGE);
		
		if (inputNome.isBlank()) {
			JOptionPane.showMessageDialog(null, "É necessário colocar o nome do produto!", titulo, JOptionPane.WARNING_MESSAGE, null);
			return;
		}
		
		String inputCat = (String) JOptionPane.showInputDialog(null, "Selecione a categoria do produto:", titulo, JOptionPane.PLAIN_MESSAGE, null, categorias, categorias[0]);
		
		if (inputCat.isBlank()) {
			JOptionPane.showMessageDialog(null, "É necessário colocar uma categoria do produto!", titulo, JOptionPane.WARNING_MESSAGE, null);
			return;
		}
		
		String inputPreco = JOptionPane.showInputDialog(null, "Digite o preço do produto:", titulo, JOptionPane.PLAIN_MESSAGE);
		
		if (inputPreco.isBlank()) {
			JOptionPane.showMessageDialog(null, "É necessário colocar um preço para o produto!", titulo, JOptionPane.WARNING_MESSAGE, null);
			return;
		}
		
		Double preco = 0.0;
		
		try {
			preco = Double.parseDouble(inputPreco);
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Valor inválido!", titulo, JOptionPane.WARNING_MESSAGE, null);
			return;
		}
		
		StringBuilder sb = new StringBuilder("Resumo do produto:\n\n");
		
		sb
		.append("Nome: " + inputNome)
		.append("\nCategoria: " + inputCat)
		.append("\nValor: R$" + preco)
		.append("\n\nDeseja cadastrar o produto?");
		
		int certezaProduto = JOptionPane.showConfirmDialog(null, sb, titulo, JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, null);
		
		if (certezaProduto == JOptionPane.NO_OPTION) {
			JOptionPane.showMessageDialog(null, "Ação cancelada!", titulo, JOptionPane.INFORMATION_MESSAGE, null);
			return;
		}
		
		listProdutos.add(new Produto(inputNome, inputCat, preco));
		
		JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso!", titulo, JOptionPane.INFORMATION_MESSAGE, null);
		return;
	}
	
	public JScrollPane getProdutos() {
		StringBuilder sb = new StringBuilder("Produtos disponíveis:\n\n");
		
		JTextArea textArea = new JTextArea();
		
		textArea.setEditable(false); 
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        
        if (listProdutos.isEmpty() == false) {
        	for (int i = 0; i < listProdutos.size(); i++) { 
        		sb
        		.append("ID: " + i)
        		.append(" | Nome: " + listProdutos.get(i).getNome())
        		.append(" | Categoria: " + listProdutos.get(i).getCategoria())
        		.append(" | Valor: R$" + listProdutos.get(i).getValor())
        		.append("\n\n");
        	}
        	
        	
        	textArea.setText(sb.toString());
            
            JScrollPane jsc = new JScrollPane(textArea);
    		
    		return jsc;
        } else {
        	textArea.setText("A lista está vazia!");
        	
        	JScrollPane jsc = new JScrollPane(textArea);
    		
    		return jsc;
        }
	}
	
	public void buscarProduto() {
		String inputId = JOptionPane.showInputDialog(null, "Digite o ID do produto:", titulo, JOptionPane.PLAIN_MESSAGE);
		
		if (inputId.isBlank()) {
			JOptionPane.showMessageDialog(null, "É necessário digitar um ID para procurar seu produto!", titulo, JOptionPane.WARNING_MESSAGE, null);
			return;
		}
		
		int idProduto = 0;
		
		try {
			idProduto = Integer.parseInt(inputId);
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "ID inválido!", titulo, JOptionPane.WARNING_MESSAGE, null);
			return;
		}
		
		boolean encontrado = false;
		
		for (int i = 0; i < listProdutos.size(); i++) {
			if (i == idProduto) {
				
				StringBuilder sb = new StringBuilder("Produto encontrado!\n\n");
				
				sb.append("Nome: " + listProdutos.get(idProduto).getNome() + " | Categoria: " + listProdutos.get(idProduto).getCategoria() + " | Valor: R$" + listProdutos.get(idProduto).getValor());
				
				JOptionPane.showMessageDialog(null, sb, titulo, JOptionPane.PLAIN_MESSAGE, null);
				encontrado = true;
				break;
				
			} else {
				encontrado = false;
				continue;
			}
		}
		
		if (encontrado == false) {
			JOptionPane.showMessageDialog(null, "Produto não encontrado!", titulo, JOptionPane.WARNING_MESSAGE, null);
		}
		
		return;
	}
	
	public void removeProduto() {
		String inputId = JOptionPane.showInputDialog(null, getProdutos(), "Digite o ID do produto:", JOptionPane.PLAIN_MESSAGE);
		
		if (inputId.isBlank()) {
			JOptionPane.showMessageDialog(null, "É necessário digitar o ID do produto!", titulo, JOptionPane.WARNING_MESSAGE, null);
			return;
		}
		
		int idProduto = 0;
		
		try {
			idProduto = Integer.parseInt(inputId);
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "ID inválido!", titulo, JOptionPane.WARNING_MESSAGE, null);
			return;
		}
		
		if (idProduto < 0 || idProduto > listProdutos.size()) {
			JOptionPane.showMessageDialog(null, "Produto não encontrado!", titulo, JOptionPane.WARNING_MESSAGE, null);
		}
		
		int certezaDelete = JOptionPane.showConfirmDialog(null, "Deseja remover o produto " + listProdutos.get(idProduto).getNome() + '?', titulo, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null);
		 
		if (certezaDelete == JOptionPane.NO_OPTION) {
			JOptionPane.showMessageDialog(null, "Ação cancelada!", titulo, JOptionPane.INFORMATION_MESSAGE, null);
			return;
		}
		
		listProdutos.remove(idProduto);
		
		JOptionPane.showMessageDialog(null, "Produto excluido com sucesso!", titulo, JOptionPane.INFORMATION_MESSAGE, null);
		
		return;
		}
	
	public void editarProduto() {
		String inputId = JOptionPane.showInputDialog(null, "Digite o ID do produto", titulo, JOptionPane.PLAIN_MESSAGE);
		
		if (inputId.isBlank()) {
			JOptionPane.showMessageDialog(null, "É necessário digitar o ID do produto!", titulo, JOptionPane.WARNING_MESSAGE, null);
			return;
		}
		
		int idProduto = 0;
		
		try {
			idProduto = Integer.parseInt(inputId);
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "ID inválido!", titulo, JOptionPane.WARNING_MESSAGE, null);
			return;
		}
		
		if (idProduto < 0 || idProduto > listProdutos.size()) {
			JOptionPane.showMessageDialog(null, "Produto não encontrado!", titulo, JOptionPane.WARNING_MESSAGE, null);
			return;
		}
		
		StringBuilder sb = new StringBuilder("Selecione uma das opções:\n\n");
		
		sb
		.append("1 - Renomear produto\n")
		.append("2 - Trocar categoria do produto\n")
		.append("3 - Atualizar preço do produto\n\n");
		
		String inputOpcao = JOptionPane.showInputDialog(null, sb, titulo, JOptionPane.PLAIN_MESSAGE);
		
		if (inputOpcao.isBlank()) {
			JOptionPane.showMessageDialog(null, "É necessário digitar um ID!", titulo, JOptionPane.WARNING_MESSAGE, null);
			return;
		}
		
		int opcaoSelecionada = 0;
		
		try {
			opcaoSelecionada = Integer.parseInt(inputOpcao);
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "ID inválido!", titulo, JOptionPane.WARNING_MESSAGE, null);
			return;
		}
		
		if (opcaoSelecionada == 1) {
			String inputNome = JOptionPane.showInputDialog(null, "Digite o novo nome do produto:", titulo, JOptionPane.PLAIN_MESSAGE);
			
			if (inputNome.isBlank()) {
				JOptionPane.showMessageDialog(null, "É necessário colocar um novo nome!", titulo, JOptionPane.WARNING_MESSAGE, null);
				return;
			}
			
			listProdutos.set(idProduto, new Produto(inputNome, listProdutos.get(idProduto).getCategoria(), listProdutos.get(idProduto).getValor()));
			
			JOptionPane.showMessageDialog(null, "Produto renomeado com sucesso!", titulo, JOptionPane.INFORMATION_MESSAGE, null);
			
			return;
			
		} else if (opcaoSelecionada == 2) {
			String inputCat =  (String) JOptionPane.showInputDialog(null, "Selecione a nova categoria do produto:", titulo, JOptionPane.PLAIN_MESSAGE, null, categorias, categorias[0]);
			
			listProdutos.set(idProduto,  new Produto(listProdutos.get(idProduto).getNome(), inputCat, listProdutos.get(idProduto).getValor()));
			
			JOptionPane.showMessageDialog(null, "Categoria alterada com sucesso!", titulo, JOptionPane.INFORMATION_MESSAGE, null);
			
			return;
		} else if (opcaoSelecionada == 3) {
			
			String inputValor = JOptionPane.showInputDialog(null, "Digite o novo valor do produto:", titulo, JOptionPane.PLAIN_MESSAGE);
			
			if (inputValor.isBlank()) {
				JOptionPane.showMessageDialog(null, "É necessário digitar um valor novo!", titulo, JOptionPane.WARNING_MESSAGE, null);
				return;
			}
			
			Double valorNovo = 0.0;
			
			try {
				valorNovo = Double.parseDouble(inputValor);
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Valor inválido!", titulo, JOptionPane.WARNING_MESSAGE, null);
				return;
			}
			
			listProdutos.set(idProduto,  new Produto(listProdutos.get(idProduto).getNome(), listProdutos.get(idProduto).getCategoria(), valorNovo));
			
			JOptionPane.showMessageDialog(null, "Preço do produto alterado com sucesso!", titulo, JOptionPane.INFORMATION_MESSAGE, null);
			
			return;
			
		} else {
			JOptionPane.showMessageDialog(null, "Opção inválida!", titulo, JOptionPane.WARNING_MESSAGE, null);
			
			return;
		}
	}
	
	public Integer selecionarOpcao() {
		
		Integer opcaoSelecionada = JOptionPane.showOptionDialog(null, "Selecione sua opcção\n\n", titulo, JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcoes, opcoes);
		
		return opcaoSelecionada;
	}
	}
