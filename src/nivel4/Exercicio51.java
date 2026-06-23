package nivel4;

/**
 * A classe vai funcionar desta forma:
 * <p>
 * <h4>A classe tem como atributos as características de uma pessoa comum,
 * como <u>nome, peso, idade e etc.</u> A classe também mostra ao usuário <u>os atributos dela.</u></h4>
 * <p>
 * @author Miguel Alessi Lenzi
 */

public class Exercicio51 {
	static private String nome = "Miguel Alessi Lenzi";
	static private String altura = "1.70";
	static private String idade = "14";
	static private String peso = "60";
	static private String tipoCabelo = "Liso";
	static private String corPele = "Parda";
	static private String corOlhos = "Castanho";
	
	public static void main(String[] args) {
		System.out.println("Nome: " + nome);
		System.out.println("Altura: " + altura);
		System.out.println("Idade: " + idade + " anos");
		System.out.println("Peso: " + peso + "KG");
		System.out.println("Tipo de cabelo: " + tipoCabelo);
		System.out.println("Cor da pele: " + corPele);
		System.out.println("Cor dos olhos: " + corOlhos);
	}
}
