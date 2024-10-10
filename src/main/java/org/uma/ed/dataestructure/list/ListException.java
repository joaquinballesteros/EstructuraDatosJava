package org.uma.ed.dataestructure.list;

import java.io.Serial;

/**
 * This class represents a custom exception that is thrown when non-valid operations are attempted on a list.
 *
 * @author Pepe Gallardo, Data Structures, Grado en Informática. UMA.
 */
public class ListException extends RuntimeException {
  @Serial
  private static final long serialVersionUID = -743311599113782047L;

  /**
   * Default constructor for the ListException class.
   */
  public ListException() {
    super();
  }

  /**
   * Constructor for the ListException class that accepts a message.
   *
   * @param msg The detailed message about the exception.
   */
  public ListException(String msg) {
    super(msg);
  }
}
