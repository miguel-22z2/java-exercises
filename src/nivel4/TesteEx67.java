package nivel4;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class TesteEx67 {
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

		AgendaEx67 agenda = new AgendaEx67();

		while (true) {
			
			Integer opcaoSelecionada = agenda.getOpcao();
			
			if (opcaoSelecionada.equals(4) || opcaoSelecionada.equals(0)) {
				JOptionPane.showMessageDialog(null, "Até logo!", agenda.tituloPrograma, JOptionPane.INFORMATION_MESSAGE, null);
				break;
			}
			
			if (opcaoSelecionada.equals(1)) {
				agenda.addTarefa();
				continue;
			} else if (opcaoSelecionada.equals(2)) {
				JOptionPane.showMessageDialog(null, agenda.getTarefas(), agenda.tituloPrograma, JOptionPane.PLAIN_MESSAGE, null);
				continue;
			} else if (opcaoSelecionada.equals(3)) {
				agenda.removeTarefa();
				continue;
			} else {
				JOptionPane.showMessageDialog(null, "Opção inválida!", agenda.tituloPrograma, JOptionPane.WARNING_MESSAGE, null);
				continue;
			}
		}
	}
}
