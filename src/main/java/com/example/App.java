package com.example;

import com.example.algorithms.BreadthFirstSearchEngine;
import com.example.structures.graph.Graph;
import com.example.structures.graph.Vertice;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Graph<String> graph = new Graph<>();
        Vertice<String> joao = graph.addVertice("João");
        Vertice<String> antonio = graph.addVertice("Antônio");
        Vertice<String> ana = graph.addVertice("Ana");
        Vertice<String> maria = graph.addVertice("Maria");
        Vertice<String> francisco = graph.addVertice("Francisco");

        graph.addEdge(2.0, joao, antonio);
        graph.addEdge(1.0, joao, maria);
        graph.addEdge(3.0, antonio, ana);
        graph.addEdge(1.0, ana, maria);
        graph.addEdge(3.0, francisco, joao);
        graph.addEdge(2.0, francisco, antonio);

        BreadthFirstSearchEngine<String> searchEngine = new BreadthFirstSearchEngine<>();
        searchEngine.search(graph, 4);
    }
}
