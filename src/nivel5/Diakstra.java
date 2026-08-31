package nivel5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

public class Diakstra {

	private void imprimirResultados(int[] distanciaGrafo, int[] valorAnterior, int valorOrigem, int numeroVertices) {
		System.out.println("\n=== Resultado do   ===");
		System.out.printf("Origem: vértice %d%n%n", valorOrigem);
		System.out.printf("%-10s %-12s %s%n", "Destino", "Distância", "Caminho");
		System.out.println("-".repeat(40));

		for (int i = 0; i < numeroVertices; i++) { 
			
			if (distanciaGrafo[i] == Integer.MAX_VALUE) {
				
				System.out.println(i + " ∞ Inacessível");
				
			} else {
				
				List<Integer> caminho = reconstruirCaminho(valorAnterior, i);
				System.out.printf("%-10d %-12d %s%n", i, distanciaGrafo[i], caminho);
				
			}
		}
	}

	public List<Integer> reconstruirCaminho(int[] anterior, int destino) {
		List<Integer> caminho = new LinkedList<>();
		
		for (int i = destino; i != -1; i = anterior[i]) {
			caminho.addFirst(i);
		}
		
		return caminho;
	}

	public int[] dijkstra(List<List<Aresta>> grafo, int origem, int numVertices) {
		
		// 1 - Inicializando os caminhos do grafo (como não sabemos as distâncias, inicializamos as distâncias como ''infinito''):
		
		int[] distancia = new int[numVertices];
		
		Arrays.fill(distancia, Integer.MAX_VALUE);
		
		distancia[origem] = 0;

		int[] valorAnterior = new int[numVertices];
		
		Arrays.fill(valorAnterior, -1);

		// 2 - Criando fila de prioridade, para saber qual caminho tem o menor peso:
		
		PriorityQueue<int[]> filaPrioridade = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
		filaPrioridade.offer(new int[] { 0, origem });

		boolean[] visitado = new boolean[numVertices];
		
		// 3 - Visitando os caminhos do grafo:
		
		while (filaPrioridade.isEmpty() == false) {
			
			int[] grafoAtual = filaPrioridade.poll();
			int auxiliar = grafoAtual[1];

			if (visitado[auxiliar]) {
				continue;
			}
			
			visitado[auxiliar] = true;
			
			for (Aresta arestaAtual : grafo.get(auxiliar)) {
				
				int destinoAresta = arestaAtual.getDestino();
				int pesoAresta = arestaAtual.getPeso();

				if (visitado[destinoAresta] && distancia[auxiliar] != Integer.MAX_VALUE && distancia[auxiliar] + pesoAresta < distancia[destinoAresta]) {
					
					distancia[destinoAresta] = distancia[auxiliar] + pesoAresta;
					
					valorAnterior[destinoAresta] = auxiliar;
					
					filaPrioridade.offer(new int[] { distancia[destinoAresta], destinoAresta });
				}
			}
		}
		
		// 4 - Imprimindo os resultados das distâncias:

		imprimirResultados(distancia, valorAnterior, origem, numVertices);
		
		// 5 - Retornando o array de distâncias do grafo:
		
		return distancia;
	}

	public void adicionarAresta(List<List<Aresta>> grafo, int origem, int destino, int peso) {
		grafo.get(origem).add(new Aresta(destino, peso));
		grafo.get(destino).add(new Aresta(origem, peso)); 
	}
}
