package nivel4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 * A classe {@code LeituraEx68} funciona desta forma:
 * <p>
 * A função dela é ajudar na leitura de arquivo com a extensão <u>txt</u>. Ele mostra 
 * várias informações do arquivo, como nome do arquivo, total de linhas no arquivo, total de caracteres e entre outros!
 * <p>
 * Ao adicionar o arquivo ao Constructor, <u>é necessário que você coloque a extensão .txt ao nome do arquivo de texto!</u>
 * <p>
 * Outras classes usadas: {@link java.io.FileReader}, {@link java.io.BufferedReader}, {@link java.io.IOException}, {@link javax.swing.JOptionPane}, {@link java.io.File}
 * {@link javax.swing.JFileChooser}, {@link javax.swing.filechooser.FileNameExtensionFilter}.
 * <p>
 * @author Miguel Alessi Lenzi
 * @version 1.0
 */

public class LeituraEx68 {
	public final String tituloPrograma = "Leitura de Arquivos";
	private String conteudoLinha;
	private File arquivoPrincipal;
	
	private JFileChooser escolherArquivo = new JFileChooser();
	
	/**
	 * Constructor
	 * 
	 * @author Miguel Alessi Lenzi
	 */
	
	public LeituraEx68(String arquivo) {
		this.arquivoPrincipal = new File(arquivo);
	}

	/**
	 * 
	 * Getter do arquivo principal
	 * 
	 * @return Arquivo atual selecionado
	 */
	
	public String getArquivoPrincipal() {
		return arquivoPrincipal.getName();
	}
	
	/**
	 * Setter do arquivo principal
	 * 
	 * @param novoArquivo
	 */
	
	private void setArquivoPrincipal(File novoArquivo) {
		this.arquivoPrincipal = novoArquivo;
	}
	
	/**
	 * O método {@code getConteudo} mostra ao usuário o conteúdo de um
	 * arquivo <u>.txt!</u>
	 * <p>
	 * @author Miguel Alessi Lenzi
	 */
	
	public void getConteudo() {
		StringBuilder sb = new StringBuilder("Conteúdo no arquivo:\n\n");
		
		try (BufferedReader br = new BufferedReader(new FileReader(arquivoPrincipal))) {
            int linhaAtual = 1;
            
            while ((conteudoLinha = br.readLine()) != null) {
               sb
               .append(linhaAtual)
               .append(": ")
               .append(conteudoLinha)
               .append("\n");
               linhaAtual++;
            }
            
            sb.toString();
            
            JOptionPane.showMessageDialog(null, sb, tituloPrograma, JOptionPane.PLAIN_MESSAGE, null);
            return;
            
        } catch (IOException e) {
        	JOptionPane.showMessageDialog(null, "Erro ao ler o arquivo!", tituloPrograma, JOptionPane.ERROR_MESSAGE, null);
        	return;
        }
	}
	
	/**
	 * O método <u>{@code getInfo}</u> mostra ao usuário as informações de um
	 * arquivo <u>txt.</u> Ele mostra as seguintes informações: <u>Total de palavras, linhas, caracteres, nome do arquivo, tamanho em Bytes e o caminho do arquivo.</u>
	 * <p>
	 * @author Miguel Alessi Lenzi
	 */
	
	public void getInfo() {
		
		SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
		
		int totalPalavras = 0;
		int totalLinhas = 0;
		int totalCaracteres = 0;
		
		File informacoesArquivo = arquivoPrincipal;
		
		long bytesArquivo = informacoesArquivo.length();
		
		String caminhoArquivo = informacoesArquivo.getAbsolutePath();
		
		long numeroModificacao = informacoesArquivo.lastModified();
		
		Date dateModificacao = new Date(numeroModificacao);
		
		String dateFormatada = formatoData.format(dateModificacao);
		
		try (BufferedReader br = new BufferedReader(new FileReader(informacoesArquivo))) {
            
            while ((conteudoLinha = br.readLine()) != null) {
               totalLinhas++;
            }
            
        } catch (IOException e) {
        	JOptionPane.showMessageDialog(null, "Erro ao ler o arquivo!", tituloPrograma, JOptionPane.ERROR_MESSAGE, null);
        	return;
        }
		
		try (BufferedReader br = new BufferedReader(new FileReader(arquivoPrincipal))) {
            String linha;
            
            while ((linha = br.readLine()) != null) {
            	linha = linha.trim();
            	
            	if (linha.isEmpty() == false) {
            		String[] palavras = linha.split("\\s");
            		totalPalavras += palavras.length;
            	}
            }
            
        } catch (IOException e) {
        	JOptionPane.showMessageDialog(null, "Erro ao ler o arquivo!", tituloPrograma, JOptionPane.ERROR_MESSAGE, null);
        	return;
        } 
		
		try (BufferedReader br = new BufferedReader(new FileReader(arquivoPrincipal))) {
            String linhaAtual;
            
            while ((linhaAtual = br.readLine()) != null) {
            	linhaAtual = linhaAtual.trim();
            	
            	if (linhaAtual.isBlank() == false) {
            		String[] caracteres = linhaAtual.split("");
            		totalCaracteres += caracteres.length;
            	}
            }
            
        } catch (IOException e) {
        	JOptionPane.showMessageDialog(null, "Erro ao ler arquivo!", tituloPrograma, JOptionPane.INFORMATION_MESSAGE, null);
        	return;
        }
		
		StringBuilder sb = new StringBuilder("Informações do arquivo:\n\n");
		
		sb
		.append("Nome do arquivo: " + informacoesArquivo.getName())
		.append("\nTotal de linhas: " + totalLinhas)
		.append("\nTotal de palavras: " + totalPalavras)
		.append("\nTotal de caracteres: " + totalCaracteres)
		.append("\nTamanho em Bytes: " + bytesArquivo + " Bytes")
		.append("\nÚltima data de modificação: " + dateFormatada)
		.append("\nCaminho do arquivo: " + caminhoArquivo);
		
		sb.toString();
		
		JOptionPane.showMessageDialog(null, sb, tituloPrograma, JOptionPane.PLAIN_MESSAGE, null);
		return;
	}
	
	/**
	 * O método {@code trocarArquivo} tem como função de trocar o arquivo de texto atual para um outro
	 * arquivo de texto!
	 * <p>
	 * @author Miguel Alessi Lenzi
	 */
	
	public void trocarArquivo() {
		FileNameExtensionFilter filtro = new FileNameExtensionFilter("Arquivos de Texto", "txt");
		escolherArquivo.setFileFilter(filtro);
		
		int escolha = escolherArquivo.showOpenDialog(null);
		
		if (escolha == JFileChooser.APPROVE_OPTION) {
			File novoArquivo = new File(escolherArquivo.getSelectedFile().getAbsolutePath());
			setArquivoPrincipal(novoArquivo);
			JOptionPane.showMessageDialog(null, "Arquivo alterado com sucesso!", tituloPrograma, JOptionPane.INFORMATION_MESSAGE, null);
		}
		
		return;
	}
	
	/**
	 * O método mostra ao usuário as opções disponíveis, e também, retorna, a opção selecionada.
	 * @return A opcão selecionada do usuário
	 */

	public Integer mostrarOpcoes() {
		StringBuilder sb = new StringBuilder("Selecione	sua opção:\n\n");
		
		sb
		.append("1 - Verificar conteúdo no arquivo\n")
		.append("2 - Verificar informações\n")
		.append("3 - Verificar arquivo atual\n")
		.append("4 - Trocar de arquivo\n")
		.append("5 - Sair\n\n");
		
		sb.toString();
		
		String inputOpcao = JOptionPane.showInputDialog(null, sb, tituloPrograma, JOptionPane.PLAIN_MESSAGE);
		
		Integer opcaoSelecionada = 0;

		try {
			opcaoSelecionada = Integer.parseInt(inputOpcao);
		} catch (NumberFormatException e) {
		}
		
		return opcaoSelecionada;
	}
}
