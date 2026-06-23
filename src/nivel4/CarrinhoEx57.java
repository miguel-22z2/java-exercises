package nivel4;

import javax.swing.JOptionPane;
import javax.swing.UIManager;
import java.util.Arrays;

public class CarrinhoEx57 {
	static protected String titulo = "Carrinho de Compras";
	static protected final String[] catLimpeza = {"Vassoura", "Detergente", "Amaciante", "Rodo", "Sabão"};
	static protected final String[] catComida = {"Carne", "Arroz", "Farofa", "Frango", "Pastel", "Pão"};
	static protected final String[] catTech = {"Celular", "PC", "Notebook", "Mouse", "Teclado", "RTX 5090"};
	static public Integer quantLimpeza = 0;
	static public Integer quantComida = 0;
	static public Integer quantTech = 0;
	
	void addProduto() {
		StringBuilder sb = new StringBuilder("Selecione a categoria:\n");
		sb.append("1 - Limpeza\n").append("2 - Comida\n").append("3 - Tecnologia\n");
		String inputCat = JOptionPane.showInputDialog(null, sb, titulo, JOptionPane.PLAIN_MESSAGE);
		
		Integer catSelecionada = Integer.parseInt(inputCat);
		
		if (catSelecionada == 1) {
			StringBuilder sLimpeza = new StringBuilder("Categoria Limpeza:\n");
			sLimpeza.append(Arrays.deepToString(catLimpeza) + "\n\n").append("Digite quantos itens dessa categoria você deseja:");
			
			String inputLimpeza = JOptionPane.showInputDialog(null, sLimpeza, titulo, JOptionPane.PLAIN_MESSAGE);
			Integer inputFormatado = Integer.parseInt(inputLimpeza);
			
			quantLimpeza = quantLimpeza + inputFormatado;
			JOptionPane.showMessageDialog(null, "Itens adicionado com sucesso!", titulo, JOptionPane.INFORMATION_MESSAGE, null);
			
		} else if (catSelecionada == 2) {
			StringBuilder sComida = new StringBuilder("Categoria Comida:\n");
			sComida.append(Arrays.deepToString(catComida) + "\n\n").append("Digite quantos itens dessa categoria você deseja:");
			
			String inputComida = JOptionPane.showInputDialog(null, sComida, titulo, JOptionPane.PLAIN_MESSAGE);
			Integer inputFormatado = Integer.parseInt(inputComida);
			
			quantComida = quantComida + inputFormatado;
			JOptionPane.showMessageDialog(null, "Itens adicionado com sucesso!", titulo, JOptionPane.INFORMATION_MESSAGE, null);
			
		} else if (catSelecionada == 3) {
			StringBuilder sTech = new StringBuilder("Categoria Tech:\n");
			sTech.append(Arrays.deepToString(catTech) + "\n\n").append("Digite quantos itens dessa categoria você deseja:");
			
			String inputTech = JOptionPane.showInputDialog(null, sTech, titulo, JOptionPane.PLAIN_MESSAGE);
			Integer inputFormatado = Integer.parseInt(inputTech);
			
			quantTech = quantTech + inputFormatado;
			JOptionPane.showMessageDialog(null, "Itens adicionado com sucesso!", titulo, JOptionPane.INFORMATION_MESSAGE, null);
			
		} else {
			JOptionPane.showMessageDialog(null, "Categoria inválida!", titulo, JOptionPane.WARNING_MESSAGE, null);
		}
	}
	
	void getQuantidade() {
		StringBuilder sb = new StringBuilder("Quantidade de Itens:\n");
		sb.append("Limpeza: " + quantLimpeza + " itens\n").append("Comida: " + quantComida + " itens\n").append("Tecnologia: " + quantTech + " itens\n");
		JOptionPane.showMessageDialog(null, sb, titulo, JOptionPane.PLAIN_MESSAGE, null);
	}
	
	void removeProduto() {
		if (quantLimpeza > 0 || quantComida > 0 || quantTech > 0) {
			StringBuilder sb = new StringBuilder("Selecione a categoria do produto para remover:\n");
			sb.append("1 - Limpeza\n").append("2 - Comida\n").append("3 - Tecnologia\n\n");
			String inputCat = JOptionPane.showInputDialog(null, sb, titulo, JOptionPane.PLAIN_MESSAGE);
			Integer inputFormatado = Integer.parseInt(inputCat);
			if (inputFormatado == 1) {
				String inputQuant = JOptionPane.showInputDialog(null,
						"Você tem " + quantLimpeza + " produtos desta categoria.\nQuatos itens você quer remover?",
						titulo, JOptionPane.PLAIN_MESSAGE);
				Integer quantFormatado = Integer.parseInt(inputQuant);

				quantLimpeza = Math.max(0, quantLimpeza - quantFormatado);
				JOptionPane.showMessageDialog(null, "Iten(s) removido com sucesso!", titulo,
						JOptionPane.INFORMATION_MESSAGE, null);

			} else if (inputFormatado == 2) {
				String inputQuant = JOptionPane.showInputDialog(null,
						"Você tem " + quantComida + " produtos desta categoria.\nQuatos itens você quer remover?",
						titulo, JOptionPane.PLAIN_MESSAGE);
				Integer quantFormatado = Integer.parseInt(inputQuant);

				quantComida = Math.max(0, quantComida - quantFormatado);
				JOptionPane.showMessageDialog(null, "Iten(s) removido com sucesso!", titulo,
						JOptionPane.INFORMATION_MESSAGE, null);

			} else if (inputFormatado == 3) {
				String inputQuant = JOptionPane.showInputDialog(null,
						"Você tem " + quantTech + " produtos desta categoria.\nQuatos itens você quer remover?", titulo,
						JOptionPane.PLAIN_MESSAGE);
				Integer quantFormatado = Integer.parseInt(inputQuant);

				quantTech = Math.max(0, quantTech - quantFormatado);
				JOptionPane.showMessageDialog(null, "Iten(s) removido com sucesso!", titulo,
						JOptionPane.INFORMATION_MESSAGE, null);

			} else {
				JOptionPane.showMessageDialog(null, "Categoria inválida!", titulo, JOptionPane.WARNING_MESSAGE, null);
			} 
		} else {
			JOptionPane.showMessageDialog(null, "Você não tem nenhum item no carrinho!", titulo, JOptionPane.WARNING_MESSAGE, null);
		}
	}
	
	void getCategorias() {
		JOptionPane.showMessageDialog(null, catFormatada(), titulo, JOptionPane.PLAIN_MESSAGE, null);
	}
	
	String catFormatada() {
		StringBuilder sb = new StringBuilder("Categorias de Produtos:\n\n");
		sb.append("Limpeza: " + Arrays.deepToString(catLimpeza) + "\n").append("Comida: " + Arrays.deepToString(catComida) + "\n").append("Tecnologia: " + Arrays.deepToString(catTech) + "\n");
		return sb.toString();
	}
	
	Integer opcoes() {
		StringBuilder sb = new StringBuilder("Escolha uma das opções:\n");
		sb.append("1 - Adicionar Produto ao carrinho\n").append("2 - Remover produto do Carrinho\n").append("3 - Ver quantidade de itens no carrinho\n").append("4 - Ver Categorias\n").append("5 - Sair\n\n");
		String inputOp = JOptionPane.showInputDialog(null, sb, titulo, JOptionPane.PLAIN_MESSAGE);
		Integer op = Integer.parseInt(inputOp);
		
		return op;
	}
	
	public static void main(String[] args) {
		try {
			for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (Exception ex) {
			System.err.println(ex);
		} 
		
		CarrinhoEx57 carrinho = new CarrinhoEx57();
		
		while (true) {
			Integer opcaoSelecionada = carrinho.opcoes();
			
			if (opcaoSelecionada == 1) {
				carrinho.addProduto();
			} else if (opcaoSelecionada == 2) {
				carrinho.removeProduto();
			} else if (opcaoSelecionada == 3) {
				carrinho.getQuantidade();
			} else if (opcaoSelecionada == 4) {
				carrinho.getCategorias();
			} else if (opcaoSelecionada == 5) {
				if (quantLimpeza > 0 || quantComida > 0 || quantTech > 0) {
					JOptionPane.showMessageDialog(null, "Não me esqueça de me pagar depois!", titulo, JOptionPane.INFORMATION_MESSAGE, null);
					break;
				} else {
					JOptionPane.showMessageDialog(null, "Obrigado pela visita!", titulo, JOptionPane.INFORMATION_MESSAGE, null);
					break;
				}
			} else {
				JOptionPane.showMessageDialog(null, "Opção inválida!", titulo, JOptionPane.WARNING_MESSAGE, null);
			}
		}
	}
}
