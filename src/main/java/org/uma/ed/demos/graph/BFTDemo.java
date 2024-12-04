package org.uma.ed.demos.graph;

import org.uma.ed.dataestructure.graph.BreadthFirstTraversal;
import org.uma.ed.dataestructure.graph.DictionaryGraph;

import java.util.List;

public class BFTDemo {
        public static void main(String[] args) {
            // Crear un grafo
            DictionaryGraph<String> graph = DictionaryGraph.empty();
            graph.addVertex("A");
            graph.addVertex("B");
            graph.addVertex("C");
            graph.addVertex("D");
            graph.addEdge("A", "B");
            graph.addEdge("A", "C");
            graph.addEdge("B", "D");

            // BFT
            BreadthFirstTraversal<String> bft = new BreadthFirstTraversal<>(graph,"A");
            List<String> bftResult = bft.traverse();
            System.out.println("BFT: " + bftResult);
            System.out.println("BFT: [A, B, C, D]");
            System.out.println("BFT: [A, C, B, D]");

        }
    }

    /*
    A
   / \
  B   C
   \
    D

 */
