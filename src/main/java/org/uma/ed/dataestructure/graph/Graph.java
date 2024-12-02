package org.uma.ed.dataestructure.graph;

import java.util.Set;

/**
 * This interface represents an undirected graph. A graph is a collection of vertices and edges where each edge connects
 * a pair of vertices. Vertices are unique within a graph. An edge is defined by a pair of vertices.
 *
 * @param <V> The type of the vertices in the graph.
 *
 * @author Pepe Gallardo, Data Structures, Grado en Informática. UMA.
 */
public interface Graph<V> extends Traversable<V> {

    /**
     * Checks if the graph is empty.
     *
     * @return {@code true} if the graph contains no vertices, {@code false} otherwise.
     */
    boolean isEmpty();

    /**
     * Adds a vertex to the graph. Vertices must be added to the graph before adding edges that are incident to them.
     *
     * @param vertex The vertex to be added to the graph.
     */
    void addVertex(V vertex);

    /**
     * Removes a vertex from the graph. This operation also removes all edges that are incident to the removed vertex.
     *
     * @param vertex The vertex to be removed.
     */
    void deleteVertex(V vertex);

    /**
     * Adds an edge to the graph or replaces an existing edge that connects the same vertices.
     *
     * @param vertex1 One vertex of the edge.
     * @param vertex2 The other vertex of the edge.
     *
     * @throws GraphException if one of the vertices hasn't been previously added to the graph.
     */
    void addEdge(V vertex1, V vertex2);

    /**
     * Removes an edge from the graph.
     *
     * @param vertex1 One vertex of the edge.
     * @param vertex2 The other vertex of the edge.
     */
    void deleteEdge(V vertex1, V vertex2);

    /**
     * Returns the number of vertices in the graph.
     *
     * @return The number of vertices in the graph.
     */
    int numberOfVertices();

    /**
     * Returns the number of edges in the graph.
     *
     * @return The number of edges in the graph.
     */
    int numberOfEdges();

    /**
     * Returns a set of all vertices in the graph.
     *
     * @return A set of all vertices in the graph.
     */
    Set<V> vertices();

    /**
     * Returns a set of all edges in the graph.
     *
     * @return A set of all edges in the graph.
     */
    Set<Edge<V>> edges();

    /**
     * Returns the degree of a vertex in the graph. The degree of a vertex is the number of edges incident to it.
     *
     * @param vertex The vertex whose degree is to be returned.
     *
     * @return The degree of the specified vertex.
     */
    int degree(V vertex);
}