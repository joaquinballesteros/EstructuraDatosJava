package org.uma.ed.dataestructure.heap;

import java.util.Comparator;

public class MaxiphobicHeap<T> implements Heap<T> {
    private static final class Node<E> {
        E element;
        int weight;
        Node<E> left, right;

        Node(E element, int weight, Node<E> left, Node<E> right) {
            this.element = element;
            this.weight = weight;
            this.left = left;
            this.right = right;
        }

        Node(E element) {
            this(element, 1, null, null);
        }
    }

    /*
     * INVARIANT:
     * - The Heap Order Property (HOP) is maintained: each node's value is ≤ its children's values.
     * - The tree is a maxiphobic heap:
     *   - Merging two trees sets the smaller root as the new root.
     *   - Of the three remaining trees, the largest becomes the root's child.
     *   - The other two smaller trees are merged recursively.
     */

    /**
     * Comparator used to order elements in heap.
     */
    private final Comparator<T> comparator;

    /**
     * Reference to root of this heap.
     */
    private Node<T> root;

    private MaxiphobicHeap(Comparator<T> comparator, Node<T> root) {
        this.comparator = comparator;
        this.root = root;
    }

    /**
     * Creates an empty Maxiphobic Heap.
     * <p> Time complexity: O(1)
     */
    public MaxiphobicHeap(Comparator<T> comparator) {
        this(comparator, null);
    }


    /**
     * Creates an empty Maxiphobic Heap with provided comparator.
     * @param comparator comparator to use.
     * @param <T> type of elements.
     *
     * @return empty maxiphobic heap with provided comparator.
     */
    public static <T> MaxiphobicHeap<T> empty(Comparator<T> comparator) {
        return new MaxiphobicHeap<>(comparator);
    }

    /**
     * Creates an empty Maxiphobic Heap with natural order comparator.
     * @param <T> type of elements.
     *
     * @return empty maxiphobic heap with natural order comparator.
     */
    public static <T extends Comparable<? super T>> MaxiphobicHeap<T> empty() {
        return new MaxiphobicHeap<T>(Comparator.naturalOrder());
    }

    /**
     * Constructs a Maxiphobic Heap from a sequence of elements and a comparator.
     * <p>
     * Time complexity: O(n)
     * @param comparator comparator to use
     * @param elements elements to insert in heap
     * @param <T> type of elements
     *
     * @return maxiphobic heap with elements in sequence
     */
    @SafeVarargs
    public static <T> MaxiphobicHeap<T> of(Comparator<T> comparator, T... elements) {
        throw new UnsupportedOperationException("NOt implemented!");
    }

    /**
     * Constructs a Maxiphobic Heap from a sequence of elements and natural order comparator.
     * <p>
     * Time complexity: O(n)
     * @param elements elements to insert in heap
     * @param <T> type of elements
     *
     * @return maxiphobic heap with elements in sequence
     */
    @SafeVarargs
    public static <T extends Comparable<? super T>> MaxiphobicHeap<T> of(T... elements) {
        return of(Comparator.naturalOrder(), elements);
    }

    /**
     * Constructs a Maxiphobic Heap from an iterable of elements and a comparator.
     * <p>
     * Time complexity: O(n)
     * @param comparator comparator to use
     * @param iterable elements to insert in heap
     * @param <T> type of elements
     *
     * @return maxiphobic heap with elements in iterable
     */
    public static <T> MaxiphobicHeap<T> from(Comparator<T> comparator, Iterable<T> iterable) {
        throw new UnsupportedOperationException("NOt implemented!");
    }

    /**
     * <p> Time complexity: O(n)
     */
    public static <T> MaxiphobicHeap<T> copyOf(MaxiphobicHeap<T> that) {
        throw new UnsupportedOperationException("NOt implemented!");
    }




    /**
     * Constructs a Maxiphobic Heap from an iterable of elements and natural order comparator.
     * @param iterable elements to insert in heap
     * @param <T> type of elements
     *
     * @return maxiphobic heap with elements in iterable
     */
    public static <T extends Comparable<? super T>> MaxiphobicHeap<T> from(Iterable<T> iterable) {
        return from(Comparator.naturalOrder(), iterable);
    }


    /**
     * Returns the comparator used by the heap to define the order of elements.
     *
     * @return The comparator used for defining the order of elements in the heap.
     */
    @Override
    public Comparator<T> comparator() {
        return null;
    }

    /**
     * Checks if the heap is empty.
     *
     * @return {@code true} if the heap has no elements, {@code false} otherwise.
     */
    @Override
    public boolean isEmpty() {
        return false;
    }

    /**
     * Retrieves the total number of elements in the heap.
     *
     * @return The number of elements in the heap.
     */
    @Override
    public int size() {
        return 0;
    }

    /**
     * Removes all elements from the heap, making it empty.
     */
    @Override
    public void clear() {

    }

    /**
     * Inserts a new element into the heap. The element is placed in the correct position to maintain the heap property.
     *
     * @param element The element to be inserted.
     */
    @Override
    public void insert(T element) {

    }

    /**
     * Retrieves, without removing, the smallest element in the heap.
     *
     * @return The smallest element in the heap.
     * @throws EmptyHeapException if the heap is empty.
     */
    @Override
    public T minimum() {
        return null;
    }

    /**
     * Removes the smallest element from the heap. After the removal, the heap property is maintained.
     *
     * @throws EmptyHeapException if the heap is empty.
     */
    @Override
    public void deleteMinimum() {

    }
}
