package org.uma.ed.dataestructure.graph;

import org.uma.ed.dataestructure.hashtable.HashTable;

import java.util.*;

/**
 * Class for undirected graphs implemented with a dictionary
 *
 * @param <V> Type for vertices in graph
 *
 * @author Pepe Gallardo, Data Structures, Grado en Informática. UMA.
 */
public class DictionaryGraph<V> implements Graph<V> {
    private final Set<V> vertices;                // set with all vertices in graph
    private final Map<V, Set<V>> diEdges;  // dictionary with sources as keys and Set of destinations as values

    /**
     * Creates an empty graph.
     */
    public DictionaryGraph() {
        vertices = new HashSet<>();
        diEdges = new HashMap<>();
    }

    /**
     * Creates an empty graph.
     *
     * @param <V> Type for vertices in graph.
     *
     * @return An empty DictionaryGraph.
     */
    public static <V> DictionaryGraph<V> empty() {
        return new DictionaryGraph<>();
    }

    /**
     * Creates a graph with given vertices and edges.
     *
     * @param vertices vertices to add to graph.
     * @param edges edges to add to graph.
     * @param <V> Type for vertices in graph.
     *
     * @return A DictionaryGraph with given vertices and edges.
     */
    public static <V> DictionaryGraph<V> of(Set<V> vertices, Set<Edge<V>> edges) {
        throw new UnsupportedOperationException("A implementar!");
    }

    /**
     * Creates a graph with same vertices and edges as given graph.
     *
     * @param graph Graph to copy.
     * @param <V> Type for vertices in graph.
     *
     * @return A DictionaryGraph with same vertices and edges as given graph.
     */
    public static <V> DictionaryGraph<V> copyOf(Graph<V> graph) {
        throw new UnsupportedOperationException("A implementar!");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isEmpty() {
        throw new UnsupportedOperationException("A implementar!");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void addVertex(V vertex) {
        throw new UnsupportedOperationException("A implementar!");
    }

    private void addDiEdge(V source, V destination) {
        if (!vertices.contains(source)) {
            throw new GraphException("vertex " + source + " is not in graph");
        }
        if (!vertices.contains(destination)) {
            throw new GraphException("vertex " + destination + " is not in graph");
        }

        Set<V> destinations = diEdges.getOrDefault(source,null);
        if (destinations == null) {
            destinations = new HashSet<>();
            diEdges.put(source, destinations);
        }
        destinations.add(destination);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void addEdge(V vertex1, V vertex2) {
        throw new UnsupportedOperationException("A implementar!");
    }

    private void deleteDiEdge(V source, V destination) {
        throw new UnsupportedOperationException("A implementar!");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void deleteEdge(V vertex1, V vertex2) {
        throw new UnsupportedOperationException("A implementar!");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void deleteVertex(V vertex) {
        throw new UnsupportedOperationException("A implementar!");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Set<V> vertices() {
        return vertices;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Set<Edge<V>> edges() {
        throw new UnsupportedOperationException("A implementar!");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int numberOfVertices() {
        return vertices.size();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int numberOfEdges() {
        throw new UnsupportedOperationException("A implementar!");
    }

    /**
     * Returns the successors of a vertex in graph (i.e. vertices to which there is an edge from given vertex).
     *
     * @param vertex vertex for which we want to obtain its successors.
     *
     * @return Successors of a vertex.
     */
    @Override
    public Set<V> successors(V vertex) {
        return diEdges.getOrDefault(vertex,new HashSet<>());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int degree(V vertex) {
        return successors(vertex).size();
    }

    @Override
    public String toString() {
        String className = getClass().getSimpleName();

        StringJoiner verticesSJ = new StringJoiner(", ", "vertices(", ")");
        for (V vertex : vertices()) {
            verticesSJ.add(vertex.toString());
        }

        StringJoiner edgesSJ = new StringJoiner(", ", "edges(", ")");
        for (Edge<V> edge : edges()) {
            edgesSJ.add(edge.toString());
        }

        StringJoiner sj = new StringJoiner(", ", className + "(", ")");
        sj.add(verticesSJ.toString());
        sj.add(edgesSJ.toString());
        return sj.toString();
    }
}