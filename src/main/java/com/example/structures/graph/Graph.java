package com.example.structures.graph;

import java.util.ArrayList;
import java.util.List;

public class Graph<Type> {
    private List<Vertice<Type>> vertices = new ArrayList<>();
    private List<Edge<Type>> edges = new ArrayList<>();

    public Graph() {
    }

    public List<Vertice<Type>> getVertices() {
        return vertices;
    }

    public void setVertices(List<Vertice<Type>> vertices) {
        this.vertices = vertices;
    }

    public List<Edge<Type>> getEdges() {
        return edges;
    }

    public void setEdges(List<Edge<Type>> edges) {
        this.edges = edges;
    }

    public Vertice<Type> addVertice(Type data) {
        Vertice<Type> vertice = new Vertice<>(data);
        this.vertices.add(vertice);

        return vertice;
    }

    public Edge<Type> addEdge(Double weight, Vertice<Type> origin, Vertice<Type> destiny) {
        Edge<Type> edge = new Edge<>(weight, origin, destiny);
        this.edges.add(edge);

        return edge;
    }
}
