package org.uma.ed.dataestructure.queue;

/**
 * This class represents a Queue data structure implemented using an array of
 * elements.
 * The size of the array (capacity) is automatically increased when it runs out
 * of capacity.
 *
 * @param <T> Type of elements in queue.
 *
 * @author Pepe Gallardo, Data Structures, Grado en Informática. UMA.
 */

public class ArrayQueue<T> extends AbstractQueue<T> implements Queue<T> {
  /**
   * Default initial capacity for queue.
   */
  private static final int DEFAULT_INITIAL_CAPACITY = 16;

  /**
   * Array of elements in queue.
   */
  private T[] elements;

  /**
   * Index in array of first and last elements in queue.
   */
  private int first;
  private int last;

  /**
   * Number of elements in queue.
   */
  private int size;

  /*
   * INVARIANT:
   * - `size` is number of elements in queue
   * - If queue is empty, `first` is 0 and `last` is `elements.length` - 1.
   * - If queue is not empty:
   * - `first` is index in array of first element in queue.
   * - `last` is index of last element in queue.
   * - Elements in queue are stored in array one after the other starting at index
   * `first` and ending at index `last`.
   * If we reach the end of the array, we continue at the beginning.
   */

  /**
   * Creates an empty ArrayQueue. Initial capacity is {@code initialCapacity}
   * elements. Capacity is automatically
   * increased when needed using a doubling strategy.
   * <p>
   * Time complexity: O(1)
   *
   * @param initialCapacity Initial capacity.
   *
   * @throws IllegalArgumentException if initial capacity is less than 1.
   */
  @SuppressWarnings("unchecked")
  public ArrayQueue(int initialCapacity) {
    if (initialCapacity <= 0) {
      throw new IllegalArgumentException("initial capacity must be greater than 0");
    }
    elements = (T[]) new Object[initialCapacity];
    size = 0;
    first = 0;
    last = initialCapacity - 1; // so that first increment makes it 0
  }

  /**
   * Creates an empty ArrayQueue with default initial capacity. Capacity is
   * automatically increased when needed using a
   * doubling strategy.
   * <p>
   * Time complexity: O(1)
   */
  public ArrayQueue() {
    this(DEFAULT_INITIAL_CAPACITY);
  }

  /**
   * Creates an empty ArrayQueue with default initial capacity. Capacity is
   * automatically increased when needed using a
   * doubling strategy.
   * <p>
   * Time complexity: O(1)
   */
  public static <T> ArrayQueue<T> empty() {
    return new ArrayQueue<>();
  }

  /**
   * Creates an empty ArrayQueue. Initial capacity is {@code initialCapacity}
   * elements. Capacity is automatically
   * increased when needed using a doubling strategy.
   * <p>
   * Time complexity: O(1)
   *
   * @param initialCapacity Initial capacity.
   *
   * @throws IllegalArgumentException if initial capacity is less than 1.
   */
  public static <T> ArrayQueue<T> withCapacity(int initialCapacity) {
    return new ArrayQueue<>(initialCapacity);
  }

  /**
   * Creates a ArrayQueue with given elements.
   * <p>
   * Time complexity: O(n)
   *
   * @param elements elements to be added to queue.
   * @param <T>      Type of elements in queue.
   *
   * @return an ArrayQueue with given elements.
   */
  @SafeVarargs
  public static <T> ArrayQueue<T> of(T... elements) {
    throw new UnsupportedOperationException("Not implemented yet");
  }

  /**
   * Creates an ArrayQueue with elements in given iterable.
   * <p>
   * Time complexity: O(n)
   *
   * @param iterable {@code Iterable} of elements to be added to queue.
   * @param <T>      Type of elements in iterable.
   *
   * @return a ArrayQueue with elements in given iterable.
   */
  public static <T> ArrayQueue<T> from(Iterable<T> iterable) {
    throw new UnsupportedOperationException("Not implemented yet");
  }

  /**
   * Returns a new ArrayQueue with same elements in same order as argument.
   * <p>
   * Time complexity: O(n)
   *
   * @param that ArrayQueue to be copied.
   *
   * @return a new ArrayQueue with same elements and order as {@code that}.
   */
  public static <T> ArrayQueue<T> copyOf(ArrayQueue<T> that) {
    throw new UnsupportedOperationException("Not implemented yet");
  }

  /**
   * Returns a new ArrayQueue with same elements in same order as argument.
   * <p>
   * Time complexity: O(n)
   *
   * @param that Queue to be copied.
   *
   * @return a new ArrayQueue with same elements and order as {@code that}.
   */
  public static <T> ArrayQueue<T> copyOf(Queue<T> that) {
    throw new UnsupportedOperationException("Not implemented yet");
  }

  /**
   * {@inheritDoc}
   * <p>
   * Time complexity: O(1)
   */
  @Override
  public boolean isEmpty() {
    throw new UnsupportedOperationException("Not implemented yet");
  }

  /**
   * {@inheritDoc}
   * <p>
   * Time complexity: O(1)
   */
  @Override
  public int size() {
    throw new UnsupportedOperationException("Not implemented yet");
  }

  /**
   * Returns the index in array of next element after given one. If given index is
   * last one, returns 0.
   * 
   * @param index index of element in array
   *
   * @return index in array of next element after given one.
   */
  private int advance(int index) {
    return (index + 1) % elements.length;
  }

  /**
   * Ensures that the capacity of the ArrayQueue is sufficient to hold a new
   * element.
   * If the current capacity is not enough, it is increased by doubling its size.
   */
  private void ensureCapacity() {
    if (size == elements.length) {
      @SuppressWarnings("unchecked")
      T[] extension = (T[]) new Object[2 * elements.length]; // double size
      for (int i = 0; i < size; i++) { // copy elements to new array from first to last in left to right order
        extension[i] = elements[first];
        first = advance(first);
      }
      elements = extension; // use new array
      first = 0;
      last = size - 1;
    }
  }

  /**
   * {@inheritDoc}
   * <p>
   * Time complexity: mostly O(1). O(n) when queue capacity has to be increased.
   */
  @Override
  public void enqueue(T element) {
    throw new UnsupportedOperationException("Not implemented yet");
  }

  /**
   * {@inheritDoc}
   * <p>
   * Time complexity: O(1)
   *
   * @throws EmptyQueueException {@inheritDoc}
   */
  @Override
  public T first() {
    throw new UnsupportedOperationException("Not implemented yet");
  }

  /**
   * {@inheritDoc}
   * <p>
   * Time complexity: O(1)
   *
   * @throws EmptyQueueException {@inheritDoc}
   */
  @Override
  public void dequeue() {
    throw new UnsupportedOperationException("Not implemented yet");
  }

  /**
   * {@inheritDoc}
   * <p>
   * Time complexity: O(n)
   */
  @Override
  public void clear() {
    throw new UnsupportedOperationException("Not implemented yet");
  }

  /**
   * Returns a protected iterable over elements in queue.
   */
  protected Iterable<T> elements() {
    return () -> new java.util.Iterator<>() {
      int current = first;
      int remaining = size;

      public boolean hasNext() {
        return remaining > 0;
      }

      public T next() {
        if (!hasNext()) {
          throw new java.util.NoSuchElementException();
        }
        T element = elements[current];
        current = advance(current);
        remaining--;
        return element;
      }
    };
  }
}