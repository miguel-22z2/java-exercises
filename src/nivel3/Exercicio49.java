package nivel3;

import javax.swing.JOptionPane;

public class Exercicio49 {
	public static void main(String[] args) {
		
		int tentativas = 0;
		
		do {
			
			String nomeUsuario = JOptionPane.showInputDialog(null, "Digite o nome do usuário:", "Login", JOptionPane.INFORMATION_MESSAGE);
			
			String senhaUsuario = JOptionPane.showInputDialog(null, "Digite a senha:", "Login", JOptionPane.INFORMATION_MESSAGE);
			
			if (validarLogin(nomeUsuario, senhaUsuario)) {
				JOptionPane.showMessageDialog(null, "Login efetuado com sucesso!", "Login", JOptionPane.INFORMATION_MESSAGE, null);
				break;
			} else {
				tentativas++;
			}
			
			if (tentativas == 3) {
				JOptionPane.showMessageDialog(null, "Acesso negado! Tente fazer o login novamente mais tarde!", "Login", JOptionPane.ERROR_MESSAGE, null);
			}
			
		} while (tentativas != 3);
	}
	public static boolean validarLogin(String usuario, String senha) {
		
		boolean loginValido = true;
		
		if (usuario.equals("Miguel") && senha.equals("arroz-com-feijoada123$")) {
			return loginValido;
		} else {
			loginValido = false;
		}
		
		return loginValido;
				
	}
}
