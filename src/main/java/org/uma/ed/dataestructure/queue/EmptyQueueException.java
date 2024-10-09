package org.uma.ed.dataestructure.queue;

import java.io.Serial;

/**
 * This class represents a custom exception that is thrown when non-valid operations are attempted on an empty queue.
 *
 * @author Pepe Gallardo, Data Structures, Grado en Informática. UMA.
 */
public class EmptyQueueException extends RuntimeException {
  @Serial
  private static final long serialVersionUID = -3362713207652643584L;

  /**
   * Default constructor for the EmptyQueueException class.
   */
  public EmptyQueueException() {
    super();
  }

  /**
   * Constructor for the EmptyQueueException class that accepts a message.
   *
   * @param msg The detailed message about the exception.
   */
  public EmptyQueueException(String msg) {
    super(msg);
  }
}
