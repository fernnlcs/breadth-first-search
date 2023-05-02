package com.example.structures.graph;

public class Edge<Type> {
    private Double weight;
    private Vertice<Type> origin;
    private Vertice<Type> destiny;
    
    public Edge(Double weight, Vertice<Type> origin, Vertice<Type> destiny) {
        this.weight = weight;
        this.origin = origin;
        this.destiny = destiny;

        origin.addEdgeOut(this);
        destiny.addEdgeIn(this);
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Vertice<Type> getOrigin() {
        return origin;
    }

    public Vertice<Type> getDestiny() {
        return destiny;
    }
}
