package nivel5;

import java.util.Queue;
import java.util.LinkedList;

public class Exercicio70 {
	public static void main(String[] args) {
		Queue<String> clientes = new LinkedList<>();
		
		for (int i = 1; i <= 3; i++) {
			clientes.offer("Cliente " + i);
		}
		
		for (int i = 1; i <= 3; i++) {
			System.out.println("Próximo cliente a ser atendido: " + clientes.peek());
			clientes.remove();
			System.out.println();
			
			if (clientes.isEmpty() == false) {
				System.out.println("Próximos clientes: " + clientes.toString());
				System.out.println();
			} else {
				System.out.println("Todos os clientes foram atendidos!");
				break;
			}
		}
	}
}
