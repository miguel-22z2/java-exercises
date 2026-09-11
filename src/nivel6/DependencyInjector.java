package nivel6;

import java.lang.reflect.Constructor;

public class DependencyInjector {

	private Container container;

	public DependencyInjector(Container container) {
		this.container = container;
	}

	@SuppressWarnings("unchecked")
	public <T> T criar(Class<T> classe) {

		try {

			// Verifica se o objeto já existe
			Object objetoExistente = container.obter(classe);

			if (objetoExistente != null) {
				return (T) objetoExistente;
			}

			// Pega o primeiro construtor da classe
			Constructor<?> construtor = classe.getConstructors()[0];

			// Descobre as dependências do construtor
			Class<?>[] tiposDependencias = construtor.getParameterTypes();

			Object[] dependencias = new Object[tiposDependencias.length];

			// Cria as dependências
			for (int i = 0; i < tiposDependencias.length; i++) {

				dependencias[i] = criar(tiposDependencias[i]);
			}

			// Cria o objeto
			T objeto = (T) construtor.newInstance(dependencias);

			// Guarda no container
			container.adicionar(classe, objeto);

			return objeto;

		} catch (Exception e) {

			throw new RuntimeException("Erro ao criar: " + classe.getSimpleName(), e);
		}
	}

}
