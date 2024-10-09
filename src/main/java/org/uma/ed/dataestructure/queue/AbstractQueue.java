package org.uma.ed.dataestructure.queue;

import java.util.Objects;
import java.util.Queue;
import java.util.StringJoiner;

/**
 * This class provides a skeletal implementation of equals, hashCode and
 * toString methods to minimize the effort
 * required to implement these methods in concrete subclasses of the
 * {@link Queue} interface.
 *
 * @param <T> Type of elements in queue.
 *
 * @author Pepe Gallardo, Data Structures, Grado en Informática. UMA.
 */
public abstract class AbstractQueue<T> {
    /**
     * This abstract method should be implemented in concrete subclasses to provide
     * an iterable over the elements in the
     * queue.
     *
     * @return an iterable over the elements in the queue.
     */
    protected abstract Iterable<T> elements();

    /**
     * This abstract method should be implemented in concrete subclasses to provide
     * the number of elements in the queue.
     *
     * @return the number of elements in the queue.
     */
    public abstract int size();

    private boolean equals(Iterable<T> it1, Iterable<?> it2) { // recomendación para facilitar el equals
        return false;

    }

    /**
     * Checks whether this Queue and another Queue have same elements in same order.
     *
     * @param obj another object to compare to.
     *
     * @return {@code true} if {@code obj} is a Queue and has same elements as
     *         {@code this} in same order.
     */
    @Override
    public boolean equals(Object obj) { // Comprueba si son el mismo, o si es instanca de Abstract class, tiene el mismo
                                        // tamaño y son iguales
        return false;
    }

    /**
     * Computes a hash code for this Queue.
     *
     * @return hash code for this Queue.
     */
    @Override
    public int hashCode() { // Itera sobre los elementos
        int hc = 1;
        return hc;
    }

    /**
     * Returns representation of this Queue as a String.
     */
    @Override
    public String toString() { // Usa el StringJoiner y el this.getClass().getSimpleName() para poner el nombre
                               // de la clase primero
        return null;
    }
}