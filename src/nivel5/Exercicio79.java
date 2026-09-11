package nivel5;

/**
 * 
 * Exercício 79 <br>
 * 
 * <p>
 * 
 * <u>Calcular troco mínimo</u>
 * 
 * @author Miguel A. Lenzi
 * 
 */

public class Exercicio79 {

	/**
	 * Calcula o troco mínimo
	 * 
	 * @param moedas (array de moedas)
	 * @param valor 
	 * @return troco
	 */
	
	public static int calculatTrocoMinimo(int[] moedas, int valor) {

		int[] menorQuantidadeMoedas = new int[valor + 1];

		for (int i = 1; i <= valor; i++) {
			menorQuantidadeMoedas[i] = valor + 1;
		}

		menorQuantidadeMoedas[0] = 0;

		for (int i = 1; i <= valor; i++) {
			
			for (int moeda : moedas) {
				
				if (moeda <= i) {
					menorQuantidadeMoedas[i] = Math.min(menorQuantidadeMoedas[i], menorQuantidadeMoedas[i - moeda] + 1);
				}
				
			}
			
		}
		
		if (menorQuantidadeMoedas[valor] > valor) {
			return -1;
		}
		
		return menorQuantidadeMoedas[valor];
		
	}
	
	public static void main(String[] args) {
		
		int[] moedas = {1, 5, 10, 25};
		
		int valorPreco = 45;
		
		int resultado = calculatTrocoMinimo(moedas, valorPreco);
		
		System.out.println("Menor quantidade de moedas necessária: " + resultado);
		
	}
	
}
