package nivel5;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 * O exercicio 75 tem como função resolver o <u>Algoritimo de anagramas</u>.
 * <p>
 * Outras classes usadas: {@link java.util.Arrays}, {@link javax.swing.JOptionPane}
 * <p>
 * @author Miguel Alessi Lenzi
 * 
 */

public class Exercicio75 {
	
	private static String titulo = "Exercicio 75";
	
	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("Selecione sua opção:\n\n");
		
		sb
		.append("1 - Verificar anagrama\n")
		.append("2 - Verificar quantidade de anagramas sem repetir letra\n")
		.append("3 - Verificar quantidade de anagramas repetindo a palavra\n")
		.append("4 - Sair\n\n");
		
		while (true) {
			
			String inputOpcao = JOptionPane.showInputDialog(null, sb, titulo, JOptionPane.PLAIN_MESSAGE);
			
			if (inputOpcao == null || inputOpcao.isBlank()) {
				JOptionPane.showMessageDialog(null, "Selecione uma opção!", titulo, JOptionPane.ERROR_MESSAGE, null);
				continue;
			}
			
			Integer opcaoSelecionada = 0;
			
			try {
				opcaoSelecionada = Integer.parseInt(inputOpcao);
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Coloque uma opção válida!", titulo, JOptionPane.WARNING_MESSAGE, null);
				continue;
			}
			
			if (opcaoSelecionada.equals(1)) {
				
				String inputPalavra = JOptionPane.showInputDialog(null, "Digite uma palavra:", titulo, JOptionPane.PLAIN_MESSAGE);
				
				String inputAnagrama = JOptionPane.showInputDialog(null, "Digite o anagrama (" + inputPalavra + "):", titulo, JOptionPane.PLAIN_MESSAGE);
				
				boolean ehAnagrama = isAnagrama(inputPalavra, inputAnagrama);
				
				if (ehAnagrama) {
					JOptionPane.showMessageDialog(null, "É um anagrama!", titulo, JOptionPane.INFORMATION_MESSAGE, null);
					continue;
				}
				
				JOptionPane.showMessageDialog(null, "Não é um anagrama!", titulo, JOptionPane.WARNING_MESSAGE, null);
				continue;
				
			} else if (opcaoSelecionada.equals(2)) {
				
				String inputPalavra = JOptionPane.showInputDialog(null, "Digite uma palavra:", titulo, JOptionPane.PLAIN_MESSAGE);
				
				int totalAnagramas = anagramasSemRepetir(inputPalavra);
				
				JOptionPane.showMessageDialog(null, "Total de anagramas da palavra " + inputPalavra + ": " + totalAnagramas, titulo, JOptionPane.INFORMATION_MESSAGE, null);
				
				continue;
				
			} else if (opcaoSelecionada.equals(3)) {
				
				String inputPalavra = JOptionPane.showInputDialog(null, "Digite uma palavra:", titulo, JOptionPane.PLAIN_MESSAGE);
				
				String inputQuantidadeRepetidas = JOptionPane.showInputDialog(null, "Digite a quantidade de letras repetidas (" + inputPalavra + "):", titulo, JOptionPane.PLAIN_MESSAGE);
				
				Integer repetidas = 0;
				
				try {
					repetidas = Integer.parseInt(inputQuantidadeRepetidas);
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Digite somente números!", titulo, JOptionPane.ERROR_MESSAGE, null);
					continue;
				}
				
				int totalAnagramas = anagramasRepetindo(inputPalavra, repetidas);
				
				JOptionPane.showMessageDialog(null, "Total de anagramas da palavra " + inputPalavra + ": " + totalAnagramas, titulo, JOptionPane.INFORMATION_MESSAGE, null);
				
				continue;
				
			} else if (opcaoSelecionada.equals(4)) {
				
				JOptionPane.showMessageDialog(null, "Até logo!", titulo, JOptionPane.INFORMATION_MESSAGE, null);
				break;
				
			} else {
				
				JOptionPane.showMessageDialog(null, "Opção inválida!", titulo, JOptionPane.WARNING_MESSAGE, null);
				continue;
				
			}
		}
	}
	
	public static boolean isAnagrama(String palavra, String anagrama) {
		
		if (palavra.isBlank() || palavra.equals(null)) {
			throw new IllegalArgumentException ("Não é possível passar uma String vazia!");
		}
		
		if (anagrama.isBlank() || anagrama.equals(null)) {
			throw new IllegalArgumentException ("Não é possível passar uma String vazia!");
		}
		
		String palavraFormatada = palavra.replaceAll("[\\s]", "").toLowerCase();
		String anagramaFormatado = anagrama.replaceAll("[\\s]", "").toLowerCase();
		
		if (palavraFormatada.length() != anagramaFormatado.length()) {
			return false;
		}
		
		char[] arrayPalavra = palavraFormatada.toCharArray();
		char[] arrayAnagrama = anagramaFormatado.toCharArray();
		
		Arrays.sort(arrayAnagrama);
		Arrays.sort(arrayPalavra);
		
		return Arrays.equals(arrayPalavra, arrayAnagrama);
	}
	
	public static int anagramasSemRepetir(String palavra) {
		
		if (palavra.isBlank() || palavra.equals(null)) {
			throw new IllegalArgumentException ("Não é possível passar uma String vazia!");
		}
		
		int totalAnagramas = 1;
		
		for (int i = 1; i < palavra.length() + 1; i++) {
			totalAnagramas *= i;
		}
		
		return totalAnagramas; 
	}
	
	public static int anagramasRepetindo(String palavra, int repetidas) {
		
		if (repetidas <= 0) {
			throw new IllegalArgumentException ("Não é possível passar 0 ou menos!");
		}
		
		if (palavra.isBlank() || palavra.equals(null)) {
			throw new IllegalArgumentException ("Não é possível passar uma String vazia!");
		}
		
		int fatorialPalavra = 1;
		
		for (int i = 1; i < palavra.length() + 1; i++) {
			fatorialPalavra *= i;
		}
		
		int fatorialRepetidas = 1;
		
		for (int i = 1; i < repetidas; i++) {
			fatorialRepetidas *= i;
		}
		
		int totalAnagramas = fatorialPalavra / fatorialRepetidas;
		
		return totalAnagramas;
	}
}
