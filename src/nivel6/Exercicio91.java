package nivel6;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Exercicio91 {
	public static void main(String[] args) {
		
		ExecutorService pool = Executors.newFixedThreadPool(3);
		
		pool.submit(() -> {
			System.out.println("Tarefa nº 1");
		});
		
		pool.submit(() -> {
			System.out.println("Tarefa nº 2");
		});
		
		pool.submit(() -> {
			System.out.println("Tarefa nº 3");
		});
		
		pool.submit(() -> {
			System.out.println("Tarefa nº 4");
		});
		
		pool.submit(() -> {
			System.out.println("Tarefa nº 5");
		});
		
		pool.shutdown();
		
	}
}
