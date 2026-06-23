package nivel4;

public class AnimalEx54 {
	void dormir() {
		System.out.println("O animal está dormindo!");
	}

	void comer() {
		System.out.println("O animal está comendo!");
	}

	public static void main(String[] args) {
		AnimalEx54 doguinho = new Cachorro();

		doguinho.dormir();
		doguinho.comer();
		
		AnimalEx54 gato = new Gato();
		
		gato.comer();
		gato.dormir();
	}
}

class Cachorro extends AnimalEx54 {
	@Override
	void dormir() {
		System.out.println("O cachorro está dormindo!");
	}

	@Override
	void comer() {
		System.out.println("O cachorro está comendo!");
	}
}

class Gato extends AnimalEx54 {
	@Override
	void dormir() {
		System.out.println("O gato está dormindo!");
	}
	
	@Override
	void comer() {
		System.out.println("O gato está comendo!");
	}
}