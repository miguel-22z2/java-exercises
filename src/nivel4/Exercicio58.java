package nivel4;

import java.lang.Object;

public class Exercicio58 {
	String nome;
	
	Exercicio58(String nome){
		this.nome = nome;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof Exercicio58)) {
			return false;
		}
		
		Exercicio58 pessoa = (Exercicio58) o;
		return pessoa.equals(pessoa.nome);
	}
	
	public int hashCode() {
		return nome.hashCode();
	}
}
