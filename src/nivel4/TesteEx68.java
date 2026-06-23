package nivel4;


import javax.swing.JOptionPane;
import javax.swing.UIManager;

import utilitarios.Fonte;

/**
 * Essa é a classe de teste do exercicio LeituraEx68!!!
 * <p>
 * 
 * @author Miguel Alessi Lenzi
 * @version 1.0
 */

public class TesteEx68 {
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
		
		Fonte fonte = new Fonte();

		fonte.setFont("Times New Roman", 15);

		LeituraEx68 arquivo = new LeituraEx68("leitura.txt");

		while (true) {
			Integer opcaoSelecionada = arquivo.mostrarOpcoes();

			if (opcaoSelecionada.equals(5) || opcaoSelecionada.equals(0)) {
				JOptionPane.showMessageDialog(null, "Até logo!", arquivo.tituloPrograma,
				JOptionPane.INFORMATION_MESSAGE, null);
				break;
			}

			if (opcaoSelecionada.equals(1)) {
				arquivo.getConteudo();
				continue;
			} else if (opcaoSelecionada.equals(2)) {
				arquivo.getInfo();
				continue;
			} else if (opcaoSelecionada.equals(3)) {
				JOptionPane.showMessageDialog(null, "Arquivo atual: " + arquivo.getArquivoPrincipal(),
				arquivo.tituloPrograma, JOptionPane.INFORMATION_MESSAGE, null);
				continue;
			} else if (opcaoSelecionada.equals(4)) {
				arquivo.trocarArquivo();
				continue;
			} else {
				JOptionPane.showMessageDialog(null, "Opção inválida!", arquivo.tituloPrograma,
				JOptionPane.WARNING_MESSAGE, null);
				continue;
			}
		}
	}
}
