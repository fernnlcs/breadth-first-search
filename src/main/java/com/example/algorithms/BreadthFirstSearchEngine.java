package com.example.algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

import com.example.structures.graph.Edge;
import com.example.structures.graph.Graph;
import com.example.structures.graph.Vertice;

public class BreadthFirstSearchEngine<Type> {
    public void search(Graph<Type> graph) {
        this.search(graph, 0);
    }

    public void search(Graph<Type> graph, int start) {
        List<Vertice<Type>> visited = new ArrayList<>();
        Queue<Vertice<Type>> sequence = new ConcurrentLinkedQueue<>();
        Vertice<Type> first = graph.getVertices().get(start);

        visited.add(first);
        System.out.println(first.getData());

        sequence.add(first);

        while (sequence.size() > 0) {
            Vertice<Type> current = sequence.poll();
            for (Edge<Type> edge : current.getEdgesOut()) {
                Vertice<Type> candidate = edge.getDestiny();
                if (!visited.contains(candidate)) {
                    sequence.add(candidate);
                    visited.add(candidate);
                    System.out.println(candidate.getData());
                }
            }
        }
    }
}
