package org.uma.ed.datastructures.set;

/**
 * This interface represents a Set, a collection of non-repeated elements.
 * Non-repetition is ensured by using the {@code equals} method on elements.
 *
 * @param <T> The type of elements in the set.
 *
 * @author Pepe Gallardo, Data Structures, Grado en Informática. UMA.
 */
public interface Set<T> extends Iterable<T> {
  /**
   * Checks if the set is empty.
   *
   * @return {@code true} if the set has no elements, {@code false} otherwise.
   */
  boolean isEmpty();

  /**
   * Retrieves number of elements in the set (its cardinal).
   *
   * @return Number of elements in the set.
   */
  int size();

  /**
   * Inserts a new element into the set. If the element already exists, the set remains unchanged.
   *
   * @param element The element to be inserted.
   */
  void insert(T element);

  /**
   * Inserts a sequence of elements into the set. If an element already exists in the set, it is not inserted again.
   *
   * @param elements The elements to be inserted into the set.
   */
  default void insert(T... elements) {
    for (T element : elements) {
      insert(element);
    }
  }

  /**
   * Checks if an element is present in the set.
   *
   * @param element The element to check for.
   * @return {@code true} if the element is in the set, {@code false} otherwise.
   */
  boolean contains(T element);

  /**
   * Removes an element from the set. If the element is not present, the set remains unchanged.
   *
   * @param element The element to be removed.
   */
  void delete(T element);

  /**
   * Removes all elements from the set, making it empty.
   */
  void clear();
}
