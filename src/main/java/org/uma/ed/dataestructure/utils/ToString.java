package org.uma.ed.dataestructure.utils;

import java.util.StringJoiner;

/**
 * Utility class with methods to turn collections into strings.
 *
 * @author Pepe Gallardo, Data Structures, Grado en Informática. UMA.
 */
public class ToString {
  /**
   * Returns a string representation of a collection given an iterable for its elements.
   *
   * @param collection collection to be represented
   * @param iterable iterable of elements to be represented
   * @param <T> type of elements in iterable
   *
   * @return string representation of object
   */
  public static <T> String toString(Object collection, Iterable<T> iterable) {
    String className = collection.getClass().getSimpleName();
    StringJoiner sj = new StringJoiner(", ", className + "(", ")");
    for (T element : iterable) {
      sj.add(element.toString());
    }
    return sj.toString();
  }

  /**
   * Returns a string representation of an iterable collection.
   *
   * @param collection collection to be represented
   * @param <T> type of elements in iterable
   *
   * @return string representation of iterable
   */
  public static <T> String toString(Iterable<T> collection) {
    return toString(collection, collection);
  }
}
