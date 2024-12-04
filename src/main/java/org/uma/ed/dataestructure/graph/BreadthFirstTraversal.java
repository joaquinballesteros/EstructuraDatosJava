package org.uma.ed.dataestructure.graph;

import java.util.*;


public class BreadthFirstTraversal<V> {
    private final Traversable<V> traversable; // The data structure to be traversed
    private final V source;                   // The starting point for the traversal

    public BreadthFirstTraversal(Traversable<V> traversable, V source) {
        this.traversable = traversable;
        this.source = source;
    }

    /**
     * Performs a Breadth-First Traversal starting from the given start element.
     * @return A List of elements visited during the traversal.
     */
    public List<V> traverse() {
        throw new UnsupportedOperationException("A implementar!");
    }
}
