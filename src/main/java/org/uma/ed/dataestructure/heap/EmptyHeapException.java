package org.uma.ed.datastructures.heap;

/**
 * This class represents a custom exception that is thrown when non-valid operations are attempted on an empty heap.
 *
 * @author Pepe Gallardo, Data Structures, Grado en Informática. UMA.
 */
public class EmptyHeapException extends RuntimeException {

  private static final long serialVersionUID = -429627186120663874L;

  /**
   * Default constructor for the EmptyHeapException class.
   */
  public EmptyHeapException() {
    super();
  }

  /**
   * Constructor for the EmptyHeapException class that accepts a message.
   *
   * @param msg The detailed message about the exception.
   */
  public EmptyHeapException(String msg) {
    super(msg);
  }
}
