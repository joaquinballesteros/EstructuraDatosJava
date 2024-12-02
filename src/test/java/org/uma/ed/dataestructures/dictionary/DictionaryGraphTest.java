package org.uma.ed.dataestructures.dictionary;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.uma.ed.dataestructure.graph.DictionaryGraph;
import org.uma.ed.dataestructure.graph.Edge;
import org.uma.ed.dataestructure.graph.GraphException;
import java.util.HashSet;
import java.util.Set;



public class DictionaryGraphTest {
    private DictionaryGraph<String> graph;

    @BeforeEach
    public void setUp() {
        graph = new DictionaryGraph<>();
    }

    @Test
    public void testEmptyGraph() {
        assertTrue(graph.isEmpty());
        assertEquals(0, graph.numberOfVertices());
        assertEquals(0, graph.numberOfEdges());
    }

    @Test
    public void testAddVertex() {
        graph.addVertex("A");
        assertFalse(graph.isEmpty());
        assertEquals(1, graph.numberOfVertices());
        assertTrue(graph.vertices().contains("A"));
    }

    @Test
    public void testAddEdge() {
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addEdge("A", "B");
        assertEquals(1, graph.numberOfEdges());
        assertTrue(graph.successors("A").contains("B"));
        assertTrue(graph.successors("B").contains("A"));
    }

    @Test
    public void testDeleteEdge() {
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addEdge("A", "B");
        graph.deleteEdge("A", "B");
        assertEquals(0, graph.numberOfEdges());
        assertFalse(graph.successors("A").contains("B"));
        assertFalse(graph.successors("B").contains("A"));
    }

    @Test
    public void testDeleteVertex() {
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addEdge("A", "B");
        graph.deleteVertex("A");
        assertEquals(1, graph.numberOfVertices());
        assertFalse(graph.vertices().contains("A"));
        assertEquals(0, graph.numberOfEdges());
    }

    @Test
    public void testDegree() {
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addEdge("A", "B");
        graph.addEdge("A", "C");
        assertEquals(2, graph.degree("A"));
        assertEquals(1, graph.degree("B"));
        assertEquals(1, graph.degree("C"));
    }

    @Test
    public void testEdges() {
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addEdge("A", "B");
        graph.addEdge("A", "C");
        Set<Edge<String>> expectedEdges = new HashSet<>();
        expectedEdges.add(Edge.of("A", "B"));
        expectedEdges.add(Edge.of("A", "C"));
        assertEquals(expectedEdges, graph.edges());
    }

    @Test
    public void testCopyOf() {
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addEdge("A", "B");
        DictionaryGraph<String> copy = DictionaryGraph.copyOf(graph);
        assertEquals(graph.vertices(), copy.vertices());
        assertEquals(graph.edges(), copy.edges());
    }

    @Test
    public void testGraphException() {
        graph.addVertex("A");
        Exception exception = assertThrows(GraphException.class, () -> {
            graph.addEdge("A", "B");
        });
        assertEquals("vertex B is not in graph", exception.getMessage());
    }

    @Test
    public void testAddMultipleVertices() {
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        assertEquals(3, graph.numberOfVertices());
        assertTrue(graph.vertices().contains("A"));
        assertTrue(graph.vertices().contains("B"));
        assertTrue(graph.vertices().contains("C"));
    }

    @Test
    public void testAddDuplicateVertex() {
        graph.addVertex("A");
        graph.addVertex("A");
        assertEquals(1, graph.numberOfVertices());
    }


    @Test
    public void testDeleteNonExistentEdge() {
        graph.addVertex("A");
        graph.addVertex("B");
        graph.deleteEdge("A", "B");
        assertEquals(0, graph.numberOfEdges());
    }

    @Test
    public void testDeleteNonExistentVertex() {
        graph.addVertex("A");
        graph.deleteVertex("B");
        assertEquals(1, graph.numberOfVertices());
        assertTrue(graph.vertices().contains("A"));
    }

    @Test
    public void testGraphToString() {
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addEdge("A", "B");
        String expected = "DictionaryGraph(vertices(A, B), edges(Edge(A, B)))";
        assertEquals(expected, graph.toString());
    }

    @Test
    public void testEmptyGraphToString() {
        String expected = "DictionaryGraph(vertices(), edges())";
        assertEquals(expected, graph.toString());
    }
}
