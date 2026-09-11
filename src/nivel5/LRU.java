package nivel5;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Exercício 78 <br>
 * 
 * <p>
 * 
 * Classe modelo para a implementação de <u>LRU Cache</u>
 * 
 * @param <K> Chave
 * @param <V> Valor
 * 
 * @author Miguel A. Lenzi
 */

public class LRU<K, V> extends LinkedHashMap<K, V>{
	
	private static final long serialVersionUID = 1L;
	
	private final int capacidadeLRU;
	
	public LRU(int capacidadeCache) {
		super(capacidadeCache, 0.75f, true);
		this.capacidadeLRU = capacidadeCache;
	}
	
	@Override
	protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
		
		return size() > capacidadeLRU;
		
	}
	
}
