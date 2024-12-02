package org.uma.ed.dataestructure.graph ;

import java.util.Set;

/**
 * This interface represents a data structure that can be traversed. It provides a method to get all successors of a
 * given element. A successor of an element is defined as an element that can be reached directly from the given
 * element. The type of the elements stored in the data structure is generic.
 *
 * @param <T> The type of the elements stored in the data structure.
 *
 * @author Pepe Gallardo, Data Structures, Grado en Informática. UMA.
 */
public interface Traversable<T> {

    /**
     * Returns all successor elements for a given element in the data structure. A successor of an element is defined as
     * an element that can be reached directly from the given element.
     *
     * @param element The element for which the successors are to be returned.
     *
     * @return A set of all successor elements for the given element.
     */
    Set<T> successors(T element);
}