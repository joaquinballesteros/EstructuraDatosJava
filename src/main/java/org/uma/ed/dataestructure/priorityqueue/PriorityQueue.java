package org.uma.ed.dataestructure.priorityqueue;

import java.util.Comparator;

/**
 * This interface represents a PriorityQueue, a data structure where each element has a priority associated with it.
 * Elements with higher priority are dequeued before elements with lower priority.
 *
 * @param <T> The type of elements in the priority queue.
 *
 * @author Pepe Gallardo, Data Structures, Grado en Informática. UMA.
 */
public interface PriorityQueue<T> {
    /**
     * Returns the comparator used by the priority queue to define the order of elements. The element with the smallest
     * value according to the comparator has the highest priority.
     *
     * @return The comparator used for defining the order of elements in the queue.
     */
    Comparator<T> comparator();

    /**
     * Checks if the priority queue is empty.
     *
     * @return {@code true} if the priority queue has no elements, {@code false} otherwise.
     */
    boolean isEmpty();

    /**
     * Removes all elements from the priority queue, making it empty.
     */
    void clear();

    /**
     * Retrieves the total number of elements in the priority queue.
     *
     * @return The size of the priority queue.
     */
    int size();

    /**
     * Inserts a new element into the priority queue. The position of the new element in the queue is determined by its
     * priority.
     *
     * @param element The element to be inserted into the queue.
     */
    void enqueue(T element);

    /**
     * Retrieves, without removing, the first element in the priority queue. The first element is the one with the highest
     * priority (i.e., the smallest value according to the comparator).
     *
     * @return The first element in the priority queue.
     *
     * @throws EmptyPriorityQueueException if the priority queue is empty.
     */
    T first();

    /**
     * Removes the first element from the priority queue. The first element is the one with the highest priority (i.e.,
     * the smallest value according to the comparator).
     *
     * @throws EmptyPriorityQueueException if the priority queue is empty.
     */
    void dequeue();
}