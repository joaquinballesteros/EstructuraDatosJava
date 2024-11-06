package org.uma.ed.dataestructure.priorityqueue;

import org.uma.ed.dataestructure.utils.Equals;
import org.uma.ed.dataestructure.utils.HashCode;
import org.uma.ed.dataestructure.utils.ToString;

/**
 * This class provides a skeletal implementation of equals, hashCode and toString methods to minimize the effort
 * required to implement these methods in concrete subclasses of the {@link PriorityQueue} interface.
 *
 * @param <T> Type of elements in priority queue.
 *
 * @author Pepe Gallardo, Data Structures, Grado en Informática. UMA.
 */
public abstract class AbstractPriorityQueue<T> {
    /**
     * This abstract method should be implemented in concrete subclasses to provide an iterable over the elements in the
     * priority queue.
     *
     * @return an iterable over the elements in the priority queue.
     */
    protected abstract Iterable<T> elements();

    /**
     * This abstract method should be implemented in concrete subclasses to provide the number of elements in the priority
     * queue.
     *
     * @return the number of elements in the priority queue.
     */
    public abstract int size();

    /**
     * Checks whether this PriorityQueue and another PriorityQueue have same elements in same order.
     *
     * @param obj another object to compare to.
     *
     * @return {@code true} if {@code obj} is a PriorityQueue and has same elements as {@code this} in same order.
     */
    @Override
    public boolean equals(Object obj) {
        return this == obj || obj instanceof AbstractPriorityQueue<?> priorityQueue2 && size() == priorityQueue2.size()
                && Equals.orderDependent(elements(), priorityQueue2.elements());
    }

    /**
     * Computes a hash code for this PriorityQueue.
     *
     * @return hash code for this PriorityQueue.
     */
    @Override
    public int hashCode() {
        return HashCode.orderDependent(elements());
    }

    /**
     * Returns representation of this PriorityQueue as a String.
     */
    @Override
    public String toString() {
        return ToString.toString(this, elements());
    }
}