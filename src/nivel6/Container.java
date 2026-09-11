package nivel6;

import java.util.HashMap;
import java.util.Map;

public class Container {

	private Map<Class<?>, Object> objetos = new HashMap<>();

	public void adicionar(Class<?> classe, Object objeto) {
		objetos.put(classe, objeto);
	}

	public Object obter(Class<?> classe) {
		return objetos.get(classe);
	}

}
