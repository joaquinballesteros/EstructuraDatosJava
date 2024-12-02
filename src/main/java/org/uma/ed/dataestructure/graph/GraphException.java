package org.uma.ed.dataestructure.graph;

/**
 * This class represents a custom exception that is thrown when non-valid operations are attempted on a graph.
 *
 * @author Pepe Gallardo, Data Structures, Grado en Informática. UMA.
 */
public class GraphException extends RuntimeException {

    private static final long serialVersionUID = -7807923404308749451L;

    /**
     * Default constructor for the GraphException class.
     */
    public GraphException() {
        super();
    }

    /**
     * Constructor for the GraphException class that accepts a message.
     *
     * @param msg The detailed message about the exception.
     */
    public GraphException(String msg) {
        super(msg);
    }
}