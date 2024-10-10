package org.uma.ed.dataestructure.utils;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Utility class with methods to compare two iterables for equality. Equality can be order dependent or order
 * independent. Two iterables are considered equal if they have the same elements in the same order (order dependent) or
 * if they have the same elements with the same number of occurrences even if they are in different order (order
 * independent).
 *
 * @author Pepe Gallardo, Data Structures, Grado en Informática. UMA.
 */
public class Equals {
  /**
   * Compares two iterables for equality. Two iterables are considered equal if they have the same elements in the same
   * order.
   *
   * @param iterable1 first iterable
   * @param iterable2 second iterable
   * @param <T> type of elements in first iterable
   *
   * @return {@code true} if both iterables are equal, {@code false} otherwise
   */
  public static <T> boolean orderDependent(Iterable<T> iterable1, Iterable<?> iterable2) {
    var iterator1 = iterable1.iterator();
    var iterator2 = iterable2.iterator();
    while (iterator1.hasNext() && iterator2.hasNext()) {
      var element1 = iterator1.next();
      var element2 = iterator2.next();
      if (!Objects.equals(element1, element2)) {
        return false;
      }
    }
    return !iterator1.hasNext() && !iterator2.hasNext();
  }

  private static <T> Map<T, Integer> occurrences(Iterable<T> iterable) {
    Map<T, Integer> map = new HashMap<>();
    for (var element : iterable) {
      map.put(element, map.getOrDefault(element, 0) + 1);
    }
    return map;
  }

  /**
   * Compares two iterables for equality. Two iterables are considered equal if they have the same elements with the
   * same number of occurrences even if they are in different order.
   *
   * @param iterable1 first iterable
   * @param iterable2 second iterable
   * @param <T> type of elements in first iterable
   *
   * @return {@code true} if both iterables are equal, {@code false} otherwise
   */
  public static <T> boolean orderIndependent(Iterable<T> iterable1, Iterable<?> iterable2) {
    return occurrences(iterable1).equals(occurrences(iterable2));
  }
}
