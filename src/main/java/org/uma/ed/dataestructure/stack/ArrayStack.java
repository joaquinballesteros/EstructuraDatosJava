package org.uma.ed.dataestructure.stack;

import java.util.Arrays;

public class ArrayStack<T> extends AbstractStack<T> implements Stack<T> {

    private static final int DEFAULT_INITIAL_CAPACITY = 16;
    private T[] elements;
    private int size;


    @SuppressWarnings("unchecked")
    public ArrayStack(int initialCapacity) {
        if (initialCapacity <= 0) {
            throw new IllegalArgumentException("initial capacity must be greater than 0");
        }
        elements = (T[]) new Object[initialCapacity];
        size = 0;
    }

    public ArrayStack() {
        this(DEFAULT_INITIAL_CAPACITY);
    }

    public static <T> ArrayStack<T> empty() {
        return new ArrayStack<>();
    }

    public static <T> ArrayStack<T> withCapacity(int initialCapacity) {
        return new ArrayStack<>(initialCapacity);
    }


    @SafeVarargs
    public static <T> ArrayStack<T> of(T... elements) {
        ArrayStack<T> stack = null;
       //
        return null;
    }

    public static <T> ArrayStack<T> from(Iterable<T> iterable) {
        ArrayStack<T> stack = null;
        //
        return null;
    }


    public static <T> ArrayStack<T> copyOf(ArrayStack<T> that) {
        ArrayStack<T> stack = null;
        //
        return null;
    }

    public static <T> ArrayStack<T> copyOf(Stack<T> that) {
        ArrayStack<T> stack = null;
        //
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }


    @Override
    public int size() {
        return -1;
    }


    @Override
    public void push(T element) {
        //
    }

    @Override
    public T top() {
        //
        return null;
    }
    
    @Override
    public void pop() {
       //
    }


    @Override
    public void clear() {
       //
    }


    protected Iterable<T> elements() {
        return () -> new java.util.Iterator<>() {
            int actual = size - 1;

            public boolean hasNext() {
                return actual >= 0;
            }

            public T next() {
                if (!hasNext()) {
                    throw new java.util.NoSuchElementException();
                }
                T element = elements[actual];
                actual--;
                return element;
            }
        };
    }
}
