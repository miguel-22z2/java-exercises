package nivel4;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Teste55 {
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
		
		EstoqueEx55 estoque = new EstoqueEx55();
		
		while (true) {
			Integer opcao = estoque.selecionarOpcao();
			
			if (opcao.equals(0)) {
				estoque.addProduto();
				continue;
			} else if (opcao.equals(1)) {
				JOptionPane.showMessageDialog(null, estoque.getProdutos(), estoque.titulo, JOptionPane.PLAIN_MESSAGE, null);
				continue;
			} else if (opcao.equals(2)) {
				estoque.buscarProduto();
				continue;
			} else if (opcao.equals(3)) {
				estoque.editarProduto();
				continue;
			} else if (opcao.equals(4)) {
				estoque.removeProduto();
				continue;
			} else if (opcao.equals(5)) {
				JOptionPane.showMessageDialog(null, "Até logo!", estoque.titulo, JOptionPane.INFORMATION_MESSAGE, null);
				break;
			} else {
				continue;
			}
		}
	}
}
