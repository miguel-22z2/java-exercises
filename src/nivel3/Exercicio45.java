package nivel3;

import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import java.util.Random;

/**
 * O programa funciona desta forma:
 * <p>
 * <h4>O programa funciona como um <u>Gerador de Senha</u>. O programa
 * gera um senha aleatória de acordo com as preferências que o usuário seleciona.</h4>
 * <p>
 * @author Miguel Alessi Lenzi
 */

public class Exercicio45 {
	public static void main(String[] args) {
		try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) { 
        	System.err.println(ex);
        } catch (InstantiationException ex) { 
        	System.err.println(ex);
        } catch (IllegalAccessException ex) {
        	System.err.println(ex);
        } catch (UnsupportedLookAndFeelException ex) { 
        	System.err.println(ex);
        }
		JOptionPane.showMessageDialog(null, "Por segurança, sua senha será gerada no console!", "Gerador de Senha", JOptionPane.WARNING_MESSAGE, null);
		gerarSenha(); 
	}
	public static void gerarSenha() { 
		String letras = "ZAQXSWCDEVFRBGTNHYMJUKILOPqazwsxedcrfvtgbyhnujmikolp";
		String numeros = "4132587609";
		String caracteresEspeciais = "!@#$%¨&*()<>:;/?|{}[]~^´`ºª+-=_";
		
		String senhaGerada = ""; 
		
		Random ordemSenha = new Random(); 
		
		while (true) {
			int senhaComNumero = JOptionPane.showConfirmDialog(null, "Você quer que a senha tenha números?","Gerador de Senha", 0, JOptionPane.QUESTION_MESSAGE, null);
			int senhaComEspecial = JOptionPane.showConfirmDialog(null,"Você quer que a senha tenha caracteres especiais?", "Gerador de Senha", 0,JOptionPane.QUESTION_MESSAGE, null);
			
			if (senhaComNumero == JOptionPane.YES_OPTION && senhaComEspecial == JOptionPane.YES_OPTION) {
				for (int i = 0; i <= 5; i++) {
					senhaGerada += letras.charAt(ordemSenha.nextInt(52));
					senhaGerada += caracteresEspeciais.charAt(ordemSenha.nextInt(31));
					senhaGerada += numeros.charAt(ordemSenha.nextInt(10));
				}
				break;
			} else if (senhaComNumero == JOptionPane.YES_OPTION && senhaComEspecial == JOptionPane.NO_OPTION) {
				for (int i = 0; i <= 5; i++) {
					senhaGerada += letras.charAt(ordemSenha.nextInt(52));
					senhaGerada += numeros.charAt(ordemSenha.nextInt(10));
					senhaGerada += numeros.charAt(ordemSenha.nextInt(10));
				}
				break;
			} else if (senhaComNumero == JOptionPane.NO_OPTION && senhaComEspecial == JOptionPane.YES_OPTION) {
				for (int i = 0; i <= 5; i++) {
					senhaGerada += letras.charAt(ordemSenha.nextInt(52));
					senhaGerada += caracteresEspeciais.charAt(ordemSenha.nextInt(31));
					senhaGerada += caracteresEspeciais.charAt(ordemSenha.nextInt(31));
				}
				break;
			} else {
				int senhaComLetra = JOptionPane.showConfirmDialog(null, "A senha vai ter somente letras, você quer isso mesmo?", "Gerador de Senha", 0, JOptionPane.WARNING_MESSAGE, null);
				if (senhaComLetra == JOptionPane.YES_OPTION) {
					for (int i = 0; i <= 5; i++) {
						senhaGerada += letras.charAt(ordemSenha.nextInt(52));
						senhaGerada += letras.charAt(ordemSenha.nextInt(52));
						senhaGerada += letras.charAt(ordemSenha.nextInt(52));
					}
					break;
				}
			} 
		}
		System.out.println("Senha gerada: " + senhaGerada);
	}
}
