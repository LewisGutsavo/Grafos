package main.java.core.grafo;

public class Main {

	public static void main(String[] args) throws Exception {
		Grafo grafo = new Grafo();
		
		grafo.adicionarVertice("RJ");
		grafo.adicionarVertice("SP");
		grafo.adicionarVertice("BH");
		grafo.adicionarVertice("PT");
		grafo.adicionarVertice("OS");
		grafo.adicionarVertice("SV");
		grafo.adicionarVertice("CR");
		grafo.adicionarVertice("PA");

		System.out.println("O grafo G possui os seguintes vértices");
		System.out.println();
		for(Vertice vertice : grafo.getVertices()) {
			System.out.println("- Vértice " + vertice.getRotulo());
		}
		
	}

}
