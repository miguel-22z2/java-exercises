package nivel6;

public class Exercicio90 {
	public static void main(String[] args) {
		
		Caixa caixa = new Caixa();
		
		Produtor produtor = new Produtor(caixa);
		Consumidor consumidor = new Consumidor(caixa);
		
		produtor.start();
		consumidor.start();
		
	}
}
