package org.uma.ed.dataestructure.stack;

public class LinkedStack<T> extends AbstractStack<T> implements Stack<T> {

    private static final class Node<E> {
        E element;
        Node<E> next;

        Node(E element, Node<E> next) {
            this.element = element;
            this.next = next;
        }
    }

    private Node<T> top;
    private int size;

    public LinkedStack() {
        top = null;
        size = 0;
    }

    public static <T> LinkedStack<T> empty() {
        return new LinkedStack<>();
    }

    @SafeVarargs
    public static <T> LinkedStack<T> of(T... elements) {
        LinkedStack<T> stack = null;
        //
        return stack;
    }


    public static <T> LinkedStack<T> from(Iterable<T> iterable) {
        LinkedStack<T> stack = null;
        //
        return stack;
    }


    public static <T> LinkedStack<T> copyOf(LinkedStack<T> that) {
        LinkedStack<T> stack = null;
        //
        return stack;
    }


    public static <T> LinkedStack<T> copyOf(Stack<T> that) {
        LinkedStack<T> stack = null;
        //
        return stack;
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
    public T top() {
        return null;
    }

    @Override
    public void pop() {
        //
    }

    @Override
    public void push(T element) {

    }

    @Override
    public void clear() {

    }


    protected Iterable<T> elements() {
        return () -> new java.util.Iterator<>() {
            Node<T> actual = top;

            public boolean hasNext() {
                return actual != null;
            }

            public T next() {
                if (!hasNext()) {
                    throw new java.util.NoSuchElementException();
                }
                T element = actual.element;
                actual = actual.next;
                return element;
            }
        };
    }
}
