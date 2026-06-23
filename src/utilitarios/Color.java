package utilitarios;

/**
 * <h3>A classe Color serve para dar cor aos textos no terminal!</h3>
 * <p>
 * Atributos:
 * <p>
 * <h4>Color.RED = Texto vermelho</h4>
 * <h4>Color.BLUE = Texto azul</h4>
 * <h4>Color.BLACK = Texto preto</h4>
 * <h4>Color.GREEN = Texto verde</h4>
 * <h4>Color.YELLOW = Texto amarelo</h4>
 * <h4>Color.RESET = Texto padrão</h4>
 * <p>
 * @author Miguel Alessi Lenzi
 * @version 1.0
 */

public class Color {
	public final static String RED = "\u001B[31m";
	public final static String BLUE = "\u001B[34m";
	public final static String RESET = "\u001B[0m";
	public final static String BLACK = "\u001B[30m";
	public final static String GREEN = "\\u001B[32m";
	public final static String YELLOW = "\\u001B[33m";
}
