package com.example.structures.graph;

import java.util.ArrayList;
import java.util.List;

public class Vertice<Type> {
    private Type data;
    private List<Edge<Type>> edgesIn = new ArrayList<>();
    private List<Edge<Type>> edgesOut = new ArrayList<>();
    
    public Vertice(Type data) {
        this.data = data;
    }

    public Type getData() {
        return data;
    }

    public void setData(Type data) {
        this.data = data;
    }

    public List<Edge<Type>> getEdgesIn() {
        return edgesIn;
    }

    public List<Edge<Type>> getEdgesOut() {
        return edgesOut;
    }

    public void addEdgeIn(Edge<Type> edge) {
        this.edgesIn.add(edge);
    }

    public void addEdgeOut(Edge<Type> edge) {
        this.edgesOut.add(edge);
    }
}
