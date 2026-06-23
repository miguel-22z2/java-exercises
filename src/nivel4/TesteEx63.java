package nivel4;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class TesteEx63 {
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
		BibliotecaEx63 biblioteca = new BibliotecaEx63();
		
		biblioteca.carregarLivrosIniciais();
		
		while (true) {
			Integer opcao = biblioteca.getOpcao();
			
			if (opcao.equals(9) || opcao.equals(0)) {
				JOptionPane.showMessageDialog(null, "Até logo!", biblioteca.titulo, JOptionPane.INFORMATION_MESSAGE, null);
				break;
			}
			
			switch (opcao) {
			
			case 1:
				biblioteca.addLivro();
				break;
			case 2:
				JOptionPane.showMessageDialog(null, biblioteca.getLivros(), biblioteca.titulo, JOptionPane.PLAIN_MESSAGE, null);
				break;
			case 3:
				biblioteca.removeLivro();
				break;
			case 4:
				biblioteca.atualizarLivro();
				break;
			case 5:
				biblioteca.comprarLivro();
				break;
			case 6:
				biblioteca.fazerEmprestimo();
				break;
			case 7:
				JOptionPane.showMessageDialog(null, biblioteca.getEmprestimos(), biblioteca.titulo, JOptionPane.PLAIN_MESSAGE, null);
				break;
			case 8:
				biblioteca.devolverLivro();
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção inválida!", biblioteca.titulo, JOptionPane.WARNING_MESSAGE, null);
				break;
			}
		}
	}
}
