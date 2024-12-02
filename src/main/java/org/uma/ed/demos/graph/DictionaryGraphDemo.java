package org.uma.ed.demos.graph;

import org.uma.ed.dataestructure.graph.DictionaryGraph;


public class DictionaryGraphDemo {
    public static void main(String[] args) {
        DictionaryGraph<String> graph = new DictionaryGraph<>();

        // Adding vertices
        graph.addVertex("1");
        graph.addVertex("2");
        graph.addVertex("3");
        graph.addVertex("4");

        // Adding edges
        graph.addEdge("1", "2");
        graph.addEdge("1", "3");
        graph.addEdge("1", "4");
        graph.addEdge("3", "4");

        // Display vertices
        System.out.println("Vertices: " + graph.vertices());

        // Display edges
        System.out.println("Edges: " + graph.edges());

        // Check if a vertex exists
        System.out.println("Sucessors of 1: " + graph.successors("1"));

        // Check if an edge exists
        System.out.println("Succesors of 2: " + graph.successors("2"));

        System.out.println("REmove edge 1-2");
        // Remove an edge
        graph.deleteEdge("1", "2");

        // Check if a vertex exists
        System.out.println("Sucessors of 1: " + graph.successors("1"));
    }
}
