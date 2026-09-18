package nivel6;

public class Produtor extends Thread {

	private Caixa caixa;

	public Produtor(Caixa caixa) {
		this.caixa = caixa;
	}
	
	@Override
	public void run() {
		for (int i = 1; i<= 5; i++) {
			caixa.produzir(i);
		}
	}

}
