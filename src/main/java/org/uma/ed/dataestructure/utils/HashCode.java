package org.uma.ed.dataestructure.utils;

import java.util.Objects;

/**
 * Utility class with methods to hash iterables. Hashing can be order dependent or order independent. For order
 * dependent hashing, two iterables will have the same hash if they have the same elements in the same order. For order
 * independent hashing, two iterables will have the same hash if they have the same elements with the same number of
 * occurrences even if they are in different order.
 *
 * @author Pepe Gallardo, Data Structures, Grado en Informática. UMA.
 */
public class HashCode {
  /**
   * Hashes an iterable. Hashing is order dependent. Two iterables will have the same hash if they have the same
   * elements in the same order.
   *
   * @param iterable iterable to be hashed
   * @param <T> type of elements in iterable
   *
   * @return hash code of iterable
   */
  public static <T> int orderDependent(Iterable<T> iterable) {
    int hash = 1;
    for (var element : iterable) {
      hash = 31 * hash + Objects.hashCode(element);
    }
    return hash;
  }

  /**
   * Hashes an iterable. Hashing is order independent. Two iterables will have the same hash if they have the same
   * elements with the same number of occurrences even if elements are in different order.
   *
   * @param iterable iterable to be hashed
   * @param <T> type of elements in iterable
   *
   * @return hash code of iterable
   */
  public static <T> int orderIndependent(Iterable<T> iterable) {
    int hash = 0;
    for (var element : iterable) {
      hash = hash + Objects.hashCode(element);
    }
    return hash;
  }
}
