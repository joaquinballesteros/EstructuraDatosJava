package org.uma.ed.demos.graph;

import org.uma.ed.dataestructure.graph.BreadthFirstTraversal;
import org.uma.ed.dataestructure.graph.DepthFirstTraversal;
import org.uma.ed.dataestructure.graph.DictionaryGraph;

import java.util.List;

public class DFTDemo {
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
            DepthFirstTraversal<String> dft = new DepthFirstTraversal<>(graph,"A");
            List<String> dftResult = dft.traverse();
            System.out.println("DFT: " + dftResult);
            System.out.println("DFT: [A, C, B, D]");
            System.out.println("DFT: [A, B, D, c]");

        }
    }

/*
    A
   / \
  B   C
   \
    D

 */