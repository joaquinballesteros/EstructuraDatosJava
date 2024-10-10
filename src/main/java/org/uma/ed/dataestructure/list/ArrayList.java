package org.uma.ed.dataestructure.list;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * ArrayList is a class that implements a List interface using an array to store elements. The size of the array
 * (capacity) is automatically increased when needed.
 *
 * @param <T> The type of elements in list.
 *
 * @author Pepe Gallardo, Data Structures, Grado en Informática. UMA.
 */
public class ArrayList<T> extends AbstractList<T> implements List<T> {
  /**
   * Default initial capacity for list.
   */
  private static final int DEFAULT_INITIAL_CAPACITY = 16;

  /**
   * Array of elements in list.
   */
  private T[] elements;

  /**
   * Number of elements in list.
   */
  private int size;

  /*
   * INVARIANT:
   * - `size` is number of elements in list.
   * - `elements` contains elements in list in first to last order.
   * - First element in list is stored at index 0 in array `elements`.
   */

  /**
   * Constructs an empty ArrayList with the specified initial capacity.
   * The capacity is the size of the array used to store the elements in the list. It is always at least as large as the
   * list size. As elements are added to an ArrayList, its capacity grows automatically.
   * <p> Time complexity: O(1)
   *
   * @param initialCapacity the initial capacity of the list
   * @throws IllegalArgumentException if the specified initial capacity is negative
   */
  @SuppressWarnings("unchecked")
  public ArrayList(int initialCapacity) {
    if (initialCapacity <= 0) {
      throw new IllegalArgumentException("initial capacity must be greater than 0");
    }
    elements = (T[]) new Object[initialCapacity];
    size = 0;
  }

  /**
   * Constructs an empty ArrayList with default initial capacity.
   * The capacity is the size of the array used to store the elements in the list. It is always at least as large as the
   * list size. As elements are added to an ArrayList, its capacity grows automatically.
   * <p> Time complexity: O(1)
   *
   */
  public ArrayList() {
    this(DEFAULT_INITIAL_CAPACITY);
  }

  /**
   * Constructs an empty ArrayList with default initial capacity.
   * The capacity is the size of the array used to store the elements in the list. It is always at least as large as the
   * list size. As elements are added to an ArrayList, its capacity grows automatically.
   * <p> Time complexity: O(1)
   *
   */
  public static <T> ArrayList<T> empty() {
    return new ArrayList<>();
  }

  /**
   * Constructs an empty ArrayList with the specified initial capacity.
   * The capacity is the size of the array used to store the elements in the list. It is always at least as large as the
   * list size. As elements are added to an ArrayList, its capacity grows automatically.
   * <p> Time complexity: O(1)
   *
   * @param initialCapacity the initial capacity of the list
   * @throws IllegalArgumentException if the specified initial capacity is negative
   */
  public static <T> ArrayList<T> withCapacity(int initialCapacity) {
    return new ArrayList<>(initialCapacity);
  }

  /**
   * Returns a new ArrayList with given elements.
   * <p> Time complexity: O(n)
   *
   * @param elements Elements to append to new list.
   * @param <T> Type of elements in set.
   *
   * @return a new ArrayList with given elements.
   */
  @SafeVarargs
  public static <T> ArrayList<T> of(T... elements) {
    ArrayList<T> list = new ArrayList<>(elements.length);
    int size = 0;
    for (T element : elements) {
      list.elements[size] = element;
      size++;
    }
    list.size = size;
    return list;
  }

  /**
   * Creates an ArrayList with elements in given iterable.
   * <p> Time complexity: O(n)
   *
   * @param iterable {@code Iterable} of elements to be added to list.
   * @param <T> Type of elements in iterable.
   *
   * @return an ArrayList with elements in given iterable.
   */
  public static <T> ArrayList<T> from(Iterable<T> iterable) {
    ArrayList<T> list = new ArrayList<>();
    for (T element : iterable) {
      list.append(element);
    }
    return list;
  }

  /**
   * Returns a new ArrayList with same elements in same order as argument.
   * <p> Time complexity: O(n)
   *
   * @param that ArrayList to be copied.
   *
   * @return a new ArrayList with same elements and order as {@code that}.
   */
  public static <T> ArrayList<T> copyOf(ArrayList<T> that) {
    throw new UnsupportedOperationException("Not implemented yet");
  }

  /**
   * Returns a new ArrayList with same elements in same order as argument.
   * <p> Time complexity: O(n)
   *
   * @param that List to be copied.
   *
   * @return a new ArrayList with same elements and order as {@code that}.
   */
  public static <T> ArrayList<T> copyOf(List<T> that) {
    throw new UnsupportedOperationException("Not implemented yet");
  }

  /**
   * {@inheritDoc}
   * <p> Time complexity: O(1)
   */
  @Override
  public boolean isEmpty() {
    throw new UnsupportedOperationException("Not implemented yet");
  }

  /**
   * {@inheritDoc}
   * <p> Time complexity: O(1)
   */
  @Override
  public int size() {
    throw new UnsupportedOperationException("Not implemented yet");
  }

  /**
   * Ensures that the capacity of the ArrayList is sufficient to hold a new element.
   * If the current capacity is not enough, it is increased by doubling its size.
   */
  private void ensureCapacity() {
    if (size >= elements.length) {
      elements = Arrays.copyOf(elements, 2 * elements.length);
    }
  }

  /**
   * Checks if the given index is in the range of valid indices for the ArrayList.
   * @param index the index to check
   * @throws ListException if the index is out of range (index < 0 || index >= size())
   */
  private void validateIndex(int index) {
    if (index < 0 || index >= size()) {
      throw new ListException("Invalid index " + index);
    }
  }

  /**
   * {@inheritDoc}
   * <p> Time complexity: O(1)
   *
   * @throws ListException {@inheritDoc}
   */
  @Override
  public T get(int index) {
    throw new UnsupportedOperationException("Not implemented yet");
  }

  /**
   * {@inheritDoc}
   * <p> Time complexity: O(1)
   *
   * @throws ListException {@inheritDoc}
   */
  @Override
  public void set(int index, T element) {
    throw new UnsupportedOperationException("Not implemented yet");
  }

  /**
   * {@inheritDoc}
   * <p> Time complexity: mostly O(1). O(n) when list capacity has to be increased.
   */
  @Override
  public void append(T element) {
    throw new UnsupportedOperationException("Not implemented yet");
  }

  /**
   * {@inheritDoc}
   * <p> Time complexity: O(n)
   */
  @Override
  public void prepend(T element) {
    throw new UnsupportedOperationException("Not implemented yet");
  }

  /**
   * {@inheritDoc}
   * <p> Time complexity: O(n)
   *
   * @throws ListException {@inheritDoc}
   */
  @Override
  public void insert(int index, T element) {
    throw new UnsupportedOperationException("Not implemented yet");
  }

  /**
   * {@inheritDoc}
   * <p> Time complexity: O(n)
   *
   * @throws ListException {@inheritDoc}
   */
  @Override
  public void delete(int index) {
    throw new UnsupportedOperationException("Not implemented yet");
  }

  /**
   * Removes all elements from list
   * <p> Time complexity: O(n)
   */
  @Override
  public void clear() {
    throw new UnsupportedOperationException("Not implemented yet");
  }

  /**
   * Returns an iterator over elements in this ArrayList. Notice that, if the list is structurally modified in any way
   * while the iterator is being used, the iterator state will become inconsistent and will not behave as expected.
   *
   * @see java.lang.Iterable#iterator()
   *
   * @return an iterator over the elements in this list from first to last.
   */
  @Override
  public Iterator<T> iterator() {
    return new ArrayListIterator();
  }

  /**
   * This class implements an iterator over elements in this ArrayList.
   * INVARIANT:
   *  - `current` is index of next element to be returned by next().
   *  - if `current` >= `size`, then there are no more elements to be returned.
   */
  private final class ArrayListIterator implements Iterator<T> {
    int current;

    ArrayListIterator() {
      current = 0;
    }

    public boolean hasNext() {
      return current < size;
    }

    public T next() {
      if (!hasNext()) {
        throw new NoSuchElementException();
      }

      T element = elements[current];
      current = current + 1;
      return element;
    }
  }
}