package nivel4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 * A classe {@code AgendaEx67} funciona desta forma:
 * <p>
 * Sua função é simular um pequeno sistema de agenda que funciona utilizando uma <u>ArrayList!</u>
 * <p>
 * Outras classes usadas: {@link java.text.ParseException}, {@link java.text.SimpleDateFormat}, {@link java.util.ArrayList}, {@link java.util.Date}, 
 * {@link javax.swing.JOptionPane}
 * <p>
 * @author Miguel Alessi Lenzi
 * @version 1.0
 */

public class AgendaEx67 {
	public final String tituloPrograma = "Agenda Pessoal";
	private final SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
	private ArrayList<String> listTarefas = new ArrayList<String>();
	private ArrayList<String> listDatas = new ArrayList<String>();
	
	/**
	 * O método {@code addTarefa()} tem como função adicionar uma tarefa para agenda.
	 * <p>
	 * @author Miguel Alessi Lenzi
	 */
	
	public void addTarefa() {
		SimpleDateFormat validarDate = new SimpleDateFormat("dd/MM/yyyy");
		
		String inputTarefa = JOptionPane.showInputDialog(null, "Digite o nome da tarefa:", tituloPrograma, JOptionPane.PLAIN_MESSAGE);
		
		if (inputTarefa.isBlank()) {
			JOptionPane.showMessageDialog(null, "Coloque um nome para sua tarefa!", tituloPrograma, JOptionPane.WARNING_MESSAGE, null);
			return;
		}
		
		String inputData = JOptionPane.showInputDialog(null, "Digite o dia do evento:", tituloPrograma, JOptionPane.PLAIN_MESSAGE);
		
		if (inputData.isBlank()) {
			JOptionPane.showMessageDialog(null, "Coloque uma data para seu evento!", tituloPrograma, JOptionPane.WARNING_MESSAGE, null);
			return;
		}
		
		listTarefas.add(inputTarefa);
		
		Date dateEvento = new Date();
		
		try {
			validarDate.parse(inputData);
		} catch (ParseException e) {
			JOptionPane.showMessageDialog(null, "Coloque um formato de data válida (dd/mm/aaaa)!", tituloPrograma, JOptionPane.WARNING_MESSAGE, null);
			return;
		}
		
		String dataFormatada = validarDate.format(dateEvento);
		
		listDatas.add(dataFormatada);
		
		JOptionPane.showMessageDialog(null, "Evento adicionado com sucesso!", tituloPrograma, JOptionPane.INFORMATION_MESSAGE, null);
		return;
	}
	
	/**
	 * O método {@code getTarefas()} tem como função retornar as tarefas salvas na ArrayList
	 * <p>
	 * @return Tarefas na lista
	 * @author Miguel Alessi Lenzi
	 */
	
	public String getTarefas() {
		if (listTarefas.isEmpty() == false) {
			StringBuilder sb = new StringBuilder("Tarefas:\n\n");
			
			for (int i = 0; i < listTarefas.size(); i++) {
				sb
				.append(i + ": ")
				.append(listTarefas.get(i) + " | ")
				.append(listDatas.get(i))
				.append("\n");
			}
			
			return sb.toString();
		} else {
			return "A lista de tarefas está vazia!";
		}
	}
	
	public void removeTarefa() {
		if (listTarefas.isEmpty() == false) {
			String inputIndice = JOptionPane.showInputDialog(null, getTarefas() + "\nDigite o indíce da tarefa para remover:", tituloPrograma, JOptionPane.PLAIN_MESSAGE);
			
			int indice;
			
			try {
				indice = Integer.parseInt(inputIndice);
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Digite somente números!", tituloPrograma, JOptionPane.WARNING_MESSAGE, null);
				return;
			}
			
			if (indice < 0 || indice > listTarefas.size()) {
				JOptionPane.showMessageDialog(null, "Indíce inválido!", tituloPrograma, JOptionPane.WARNING_MESSAGE, null);
				return;
			} 
			
			listTarefas.remove(indice);
			listDatas.remove(indice);
			
			JOptionPane.showMessageDialog(null, "Evento removido com sucesso!", tituloPrograma, JOptionPane.INFORMATION_MESSAGE, null);
			
		} else {
			JOptionPane.showMessageDialog(null, "Lista de tarefas vazia!", tituloPrograma, JOptionPane.INFORMATION_MESSAGE, null);
		}
		return;
	}
	
	public Integer getOpcao() {
		Date date = new Date();
		
		String dataAtual = formatoData.format(date);
		
		StringBuilder sb = new StringBuilder("Data: " + dataAtual + "\n\nSelecione sua opção:\n\n");
		
		sb
		.append("1 - Adicionar tarefa")
		.append("\n2 - Verificar tarefas")
		.append("\n3 - Remover tarefas")
		.append("\n4 - Sair\n\n");
		
		String inputOpcao = JOptionPane.showInputDialog(null, sb, tituloPrograma, JOptionPane.PLAIN_MESSAGE);
		
		Integer opcao = -1;
		
		try {
			opcao = Integer.parseInt(inputOpcao);
		} catch (NumberFormatException e) {
		}
		
		return opcao;
	}
}
