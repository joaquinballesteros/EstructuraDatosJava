package org.uma.ed.dataestructure.graph;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;


public class DepthFirstTraversal<V> {
    private final Traversable<V> traversable; // The data structure to be traversed
    private final V source;

    public DepthFirstTraversal(Traversable<V> traversable, V source) {
        this.traversable = traversable;
        this.source = source;
    }

    /**
     * Performs a Depth-First Traversal starting from the given start element.
     * @return A set of elements visited during the traversal.
     */
    public List<V> traverse() {
        throw new UnsupportedOperationException("A implementar!");
    }
}
