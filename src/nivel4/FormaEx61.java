
package nivel4;


public abstract class FormaEx61 {
	abstract void getForma();
	
	public static void main(String[] args) {
		Quadrado q = new Quadrado();
		
		q.getForma();
		
		Triangulo t = new Triangulo();
		
		t.getForma();
	}
}

class Quadrado extends FormaEx61 {
	@Override
	void getForma() {
		System.out.println("Quadrado");
	}
}

class Triangulo extends FormaEx61 {
	@Override
	void getForma() {
		System.out.println("Triângulo");
	}
}

abstract class Circulo extends FormaEx61 {
	
}