package org.uma.ed.datastructures.heap;

import java.util.Comparator;

import org.uma.ed.datastructures.heap.EmptyHeapException;

/**
 * This interface represents a Min Heap data structure. A Heap is a specialized tree-based data structure that satisfies
 * the heap property. In a Min Heap, for any given node I, the value of I is greater than or equal to the value of its
 * parent node, as long as the parent exists. This property makes the smallest element to be at the root of the tree,
 * allowing efficient access and removal of the minimum element. The order of elements is determined by a
 * {@code Comparator}.
 *
 * @param <T> The type of elements in the heap.
 *
 * @author Pepe Gallardo, Data Structures, Grado en Informática. UMA.
 */
public interface Heap<T> {
  /**
   * Returns the comparator used by the heap to define the order of elements.
   *
   * @return The comparator used for defining the order of elements in the heap.
   */
  Comparator<T> comparator();

  /**
   * Checks if the heap is empty.
   *
   * @return {@code true} if the heap has no elements, {@code false} otherwise.
   */
  boolean isEmpty();

  /**
   * Retrieves the total number of elements in the heap.
   *
   * @return The number of elements in the heap.
   */
  int size();

  /**
   * Removes all elements from the heap, making it empty.
   */
  void clear();

  /**
   * Inserts a new element into the heap. The element is placed in the correct position to maintain the heap property.
   *
   * @param element The element to be inserted.
   */
  void insert(T element);

  /**
   * Retrieves, without removing, the smallest element in the heap.
   *
   * @return The smallest element in the heap.
   *
   * @throws EmptyHeapException if the heap is empty.
   */
  T minimum();

  /**
   * Removes the smallest element from the heap. After the removal, the heap property is maintained.
   *
   * @throws EmptyHeapException if the heap is empty.
   */
  void deleteMinimum();
}