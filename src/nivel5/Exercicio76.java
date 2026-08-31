package nivel5;

import java.util.ArrayList;
import java.util.List;

public class Exercicio76 {
	public static void main(String[] args) {
		int numeroVertices = 6;
		
		Diakstra dMain = new Diakstra();

        List<List<Aresta>> grafo = new ArrayList<>();
        
        for (int i = 0; i < numeroVertices; i++) {
            grafo.add(new ArrayList<>());
        }

        // adicionarAresta(grafo, origem, destino, peso)
        dMain.adicionarAresta(grafo, 0, 1, 4);
        dMain.adicionarAresta(grafo, 0, 2, 1);
        dMain.adicionarAresta(grafo, 2, 1, 2);
        dMain.adicionarAresta(grafo, 1, 3, 1);
        dMain.adicionarAresta(grafo, 2, 3, 5);
        dMain.adicionarAresta(grafo, 3, 4, 3);
        dMain.adicionarAresta(grafo, 4, 5, 2);
        dMain.adicionarAresta(grafo, 3, 5, 6);

        System.out.println("Grafo:");
        System.out.println("0 --4-- 1 --1-- 3 --3-- 4 --2-- 5");
        System.out.println("|  \\     ^               |");
        System.out.println("1    \\  2               6");
        System.out.println("|     /                  |");
        System.out.println("2 ---       ------------5");
        
        dMain.dijkstra(grafo, 0, numeroVertices);
	}
}
