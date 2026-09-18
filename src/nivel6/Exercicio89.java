package nivel6;

public class Exercicio89 {
	public static void main(String[] args) {
		
		Thread thread = new Thread(() -> {
			
			for (int i = 1; i <= 5; i++) {
				System.out.println("Valor " + i);
			}
			
		});
		
		thread.start();
		
		Thread thread2 = new Thread(() -> { 
			System.out.println("Outra Thread executando!");
		});
		
		thread2.start();
		
	}
}
