package nivel6;

public class Consumidor extends Thread {
	
	private Caixa caixa;

	public Consumidor(Caixa caixa) {
		super();
		this.caixa = caixa;
	}
	
	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			caixa.consumir();
		}
	}
	
}
