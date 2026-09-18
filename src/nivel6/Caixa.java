package nivel6;

public class Caixa {
	
	private int quantidadeItem;
	private boolean vazia = true;
	
	public synchronized void produzir(int quantidadeItem) {
        while (vazia == false) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        this.quantidadeItem = quantidadeItem;
        vazia = false;

        System.out.println("Produtor colocou: " + quantidadeItem + " itens");

        notify();
	} 
	
	public synchronized int consumir() {

        while (vazia) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        int quantidadeItem = this.quantidadeItem;
        vazia = true;

        System.out.println("Consumidor pegou: " + quantidadeItem + " itens");

        notify();
        
        return quantidadeItem;
    }
	
}
