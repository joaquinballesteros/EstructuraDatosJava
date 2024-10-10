package org.uma.ed.dataestructure.list;

import java.util.Objects;

/**
 * This interface represents a List, a linear collection of elements. Each element in a list has an index, which is a
 * non-negative integer (0 for the first element, 1 for the second element, etc.).
 *
 * @param <T> The type of elements in the list.
 *
 * @author Pepe Gallardo, Data Structures, Grado en Informática. UMA.
 */
public interface List<T> extends Iterable<T> {
    /**
     * Checks if the list is empty.
     *
     * @return {@code true} if the list has no elements, {@code false} otherwise.
     */
    boolean isEmpty();

    /**
     * Retrieves the total number of elements in the list.
     *
     * @return The size of the list.
     */
    int size();

    /**
     * Inserts a new element at the specified position in the list. All elements at or after the specified position are
     * shifted to the right.
     *
     * @param index Index at which the new element is to be inserted.
     * @param element The element to be inserted.
     *
     * @throws ListException if the index is out of range.
     */
    void insert(int index, T element);

    /**
     * Checks if the list contains the specified element.
     *
     * @param element The element whose presence in the list is to be tested.
     *
     * @return {@code true} if the list contains the specified element, {@code false} otherwise.
     */
    default boolean contains(T element) {
        for (T elem : this) {
            if (Objects.equals(elem, element)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Removes the element at the specified position in the list. All elements to the right of the specified position are
     * shifted to the left.
     *
     * @param index The index of the element to be removed.
     *
     * @throws ListException if the index is out of range.
     */
    void delete(int index);

    /**
     * Removes all elements from the list, making it empty.
     */
    void clear();

    /**
     * Retrieves the element at the specified position in the list.
     *
     * @param index The index of the element to be retrieved.
     *
     * @return The element at the specified position in the list.
     *
     * @throws ListException if the index is out of range.
     */
    T get(int index);

    /**
     * Replaces the element at the specified position in the list with the specified element.
     *
     * @param index The index of the element to replace.
     * @param element The element to be stored at the specified position.
     *
     * @throws ListException if the index is out of range.
     */
    void set(int index, T element);

    /**
     * Appends the specified element to the end of the list.
     *
     * @param element The element to be appended to the list.
     */
    void append(T element);

    /**
     * Inserts the specified element at the beginning of the list. All elements are shifted to the right.
     *
     * @param element The element to be inserted at the beginning of the list.
     */
    void prepend(T element);

    /**
     * Appends all the elements in the specified array to the end of the list.
     *
     * @param elements The elements to be appended to the list.
     */
    default void append(T... elements) {
        for (T element : elements) {
            append(element);
        }
    }
}