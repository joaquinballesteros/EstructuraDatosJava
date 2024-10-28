package org.uma.ed.dataestructure.tree;

import org.uma.ed.dataestructure.list.ArrayList;
import org.uma.ed.dataestructure.list.List;
import org.uma.ed.dataestructure.queue.ArrayQueue;
import org.uma.ed.dataestructure.queue.Queue;

import java.util.Comparator;
import java.util.NoSuchElementException;


/**
 * This class defines different methods to process general trees. A tree is represented by a root node. If the tree is
 * empty, this root node is null. Otherwise, the root node contains an element and a list of children nodes.
 *
 * @author Pepe Gallardo, Data Structures, Grado en Informática. UMA.
 */
public class Tree {
    /**
     * This class represents a node in a general tree. Each node contains an element and a list of children nodes.
     *
     * @param <E>
     */
    public static final class Node<E> {
        private final E element;
        private final List<Node<E>> children;

        /**
         * Creates a node with an element and no children.
         *
         * @param element Element in node.
         */
        public Node(E element) {
            this.element = element;
            this.children = ArrayList.empty();
        }

        /**
         * Creates a node with an element and a list of children.
         *
         * @param element The element in the node.
         * @param children The list of children nodes.
         * @param <T> The type of the element in the node.
         *
         * @return A new node with given element and children.
         */
        @SafeVarargs
        public static <T> Node<T> of(T element, Node<T>... children) {
            Node<T> node = new Node<>(element);
            for (Node<T> child : children) {
                node.children.append(child);
            }
            return node;
        }
    }

    /**
     * Returns the number of nodes in a tree.
     *
     * @param root The root node of the tree.
     *
     * @return The number of nodes in the tree.
     */
    public static int size(Node<?> root) {
        throw  new UnsupportedOperationException();
    }

    /**
     * Returns the height of a tree.
     *
     * @param root The root node of the tree.
     *
     * @return The height of the tree.
     */
    public static int height(Node<?> root) {
        throw  new UnsupportedOperationException();
    }

    /**
     * Returns the sum of elements in a tree of integers.
     *
     * @param root The root node of the tree.
     *
     * @return The sum of elements in the tree.
     */
    public static int sum(Node<Integer> root) {
        throw  new UnsupportedOperationException();
    }

    /**
     * Returns the maximum element in a tree.
     *
     * @param root The root node of the tree.
     * @param comparator A comparator to compare elements in the tree.
     * @param <T> The type of elements in the tree.
     *
     * @return The maximum element in the tree according to the comparator.
     */
    public static <T> T maximum(Node<T> root, Comparator<T> comparator) {
        throw  new UnsupportedOperationException();
    }

    /**
     * Returns the number of occurrences of an element in a tree.
     *
     * @param root The root node of the tree.
     * @param element The element to count.
     * @param <T> The type of elements in the tree.
     *
     * @return The number of occurrences of the element in the tree.
     */
    public static <T> int count(Node<T> root, T element) {
        throw  new UnsupportedOperationException();
    }

    /**
     * Returns the leaves of a tree.
     *
     * @param root The root node of the tree.
     * @param <T> The type of elements in the tree.
     *
     * @return A list with the leaves of the tree.
     */
    public static <T> List<T> leaves(Node<T> root) {
        throw  new UnsupportedOperationException();
    }

    /**
     * Returns the preorder traversal of a tree.
     *
     * @param root The root node of the tree.
     * @param <T> The type of elements in the tree.
     *
     * @return A list with the preorder traversal of the tree.
     */
    public static <T> List<T> preorder(Node<T> root) {
        throw  new UnsupportedOperationException();
    }



    /**
     * Returns the postorder traversal of a tree.
     *
     * @param root The root node of the tree.
     * @param <T> The type of elements in the tree.
     *
     * @return A list with the postorder traversal of the tree.
     */
    public static <T> List<T> postorder(Node<T> root) {
        throw  new UnsupportedOperationException();
    }


    /**
     * Returns the breadth-first traversal of a tree.
     *
     * @param root The root node of the tree.
     * @param <T> The type of elements in the tree.
     *
     * @return A list with the breadth-first traversal of the tree.
     */
    public static <T> List<T> breadthFirst(Node<T> root) {
        throw  new UnsupportedOperationException();
    }
}