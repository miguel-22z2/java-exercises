package utilitarios;

import java.awt.Font;
import javax.swing.UIManager;

public class Fonte {
	public void setFont(String nomeFonte, int tamanhoFonte) {
		Font font = new Font(nomeFonte, Font.PLAIN, tamanhoFonte);
		UIManager.put("OptionPane.messageFont", font);
		UIManager.put("OptionPane.buttonFont", new Font(nomeFonte, Font.PLAIN, tamanhoFonte));
		return;
	}
}
