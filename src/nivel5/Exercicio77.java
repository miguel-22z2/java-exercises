package nivel5;

public class Exercicio77 {
	
	public static void hanoi(int numeroDiscos, char origem, char auxiliar, char destino) {
		
		if (numeroDiscos == 1) {
			return;
		}
		
		hanoi(numeroDiscos - 1, origem, auxiliar, destino);
		
		System.out.println("Você deve mover o disco " + numeroDiscos + " de origem " + origem + " para o destino " + destino);
		
		hanoi(numeroDiscos - 1, auxiliar, origem, destino);
	}
	
	public static void main(String[] args) {
		hanoi(4, 'A', 'B', 'C');
	}
}
