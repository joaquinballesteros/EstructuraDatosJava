package org.uma.ed.dataestructure.queue;

/**
 * This interface represents a Queue, a First In First Out (FIFO) data
 * structure.
 *
 * @param <T> The type of elements in the queue.
 *
 * @author Pepe Gallardo, Data Structures, Grado en Informática. UMA.
 */
public interface Queue<T> {
  /**
   * Checks if the queue is empty.
   *
   * @return {@code true} if the queue has no elements, {@code false} otherwise.
   */
  boolean isEmpty();

  /**
   * Retrieves the total number of elements in the queue.
   *
   * @return The size of the queue.
   */
  int size();

  /**
   * Inserts a new element at the end (rear) of the queue.
   *
   * @param element The element to be inserted into the queue.
   */
  void enqueue(T element);

  /**
   * Retrieves, without removing, the first element in the queue.
   *
   * @return The first element in the queue.
   * @throws EmptyQueueException if the queue is empty.
   */
  T first();

  /**
   * Removes the first element from the queue.
   *
   * @throws EmptyQueueException if the queue is empty.
   */
  void dequeue();

  /**
   * Removes all elements from the queue, making it empty.
   */
  void clear();
}