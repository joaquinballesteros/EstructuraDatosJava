package org.uma.ed.dataestructure.searchtree;

import java.util.Comparator;


/**
 * Search tree implemented using a balanced AVL tree. Nodes are sorted according to their keys and keys are sorted using
 * the provided comparator or their natural order if no comparator is provided.
 *
 * @param <K> Type of keys.
 *
 * @author Pepe Gallardo (modified by Joaquín Ballesteros). Data Structures, Grado en Informática. UMA.
 * 
 */
public class AVL<K> implements SearchTree<K> {

    //This class implements the Node and also the rotations.
    private static final class Node<K> {
        K key;
        int height;
        Node<K> left, right;

        Node(K key) {
            this.key = key;
            this.height = 1;
            this.left = null;
            this.right = null;
        }

        // Returns height of node
        static int height(Node<?> node) {
            return node == null ? 0 : node.height;
        }

        // Sets height of node
        void setHeight() {
            height = 1 + Math.max(height(left), height(right));
        }

        // Returns balance factor of node. Negative if node is right leaning, positive if node is left leaning
        static int balance(Node<?> node) {
            return node == null ? 0 : height(node.left) - height(node.right);
        }


        Node<K> rightRotated() { // Rotates receiving node to the right. Returns new root of rotated tree. Use set height!
            throw new UnsupportedOperationException("Not implemented yet");
        }

        Node<K> leftRotated() { // Rotates receiving node to the left. Returns new root of rotated tree. Use set height!
            throw new UnsupportedOperationException("Not implemented yet");
        }

        // Balances receiving node and sets new height. Returns node already balanced
        Node<K> balanced() {
            int balance = balance(this);
            Node<K> balanced;

            if (balance > 1) { // left leaning
                if (balance(left) < 0) { // left child is right leaning
                    left = left.leftRotated();
                }
                balanced = this.rightRotated();
            } else if (balance < -1) { // right leaning
                if (balance(right) > 0) { // right child is left leaning
                    right = right.rightRotated();
                }
                balanced = this.leftRotated();
            } else {
                balanced = this; // no rotation needed
                balanced.setHeight();
            }
            return balanced;
        }
    }

    private final Comparator<K> comparator;
    private Node<K> root;
    private int size;

    private AVL(Comparator<K> comparator, Node<K> root, int size) {
        this.comparator = comparator;
        this.root = root;
        this.size = size;
    }

    /**
     * Creates an empty balanced binary search tree. Keys are sorted according to provided comparator.
     * <p> Time complexity: O(1)
     *
     * @param comparator Comparator defining order of keys in this search tree.
     */
    public AVL(Comparator<K> comparator) {
        this(comparator, null, 0);
    }

    /**
     * Creates an empty balanced binary search tree. Keys are sorted according to their natural order.
     * <p> Time complexity: O(1)
     */
    public static <K extends Comparable<? super K>> AVL<K> empty() {
        return new AVL<K>(Comparator.naturalOrder());
    }

    /**
     * Creates an empty balanced binary search tree. Keys are sorted according to provided comparator.
     * <p> Time complexity: O(1)
     *
     * @param comparator Comparator defining order of keys in this search tree.
     */
    public static <K> AVL<K> empty(Comparator<K> comparator) {
        return new AVL<>(comparator);
    }

    /**
     * Returns a new balanced binary search tree with same elements and same structure as argument.
     * <p> Time complexity: O(n x log n)
     *
     * @param that binary search tree to be copied.
     *
     * @return a new AVL with same elements and structure as {@code that}.
     */
    public static <K> AVL<K> copyOf(SearchTree<K> that) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Returns a new balanced binary search tree with same elements and same structure as argument.
     * <p> Time complexity: O(n)
     *
     * @param that AVL binary search tree to be copied.
     *
     * @return a new AVL with same elements and structure as {@code that}.
     */
    public static <K> AVL<K> copyOf(AVL<K> that) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    //Recurvive method to return a copy of the node with the same height, left and right side.
    private static <K> Node<K> copyOf(Node<K> node) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * {@inheritDoc}
     * <p> Time complexity: O(1)
     */
    @Override
    public void clear() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * {@inheritDoc}
     * <p> Time complexity: O(1)
     */
    @Override
    public Comparator<K> comparator() {
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
     * {@inheritDoc}
     * <p> Time complexity: O(log n)
     */
    @Override
    public int height() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * {@inheritDoc}
     * <p> Time complexity: O(log n)
     */
    @Override
    public void insert(K key) {
        throw new UnsupportedOperationException("Not implemented yet");
    }


    // Sugerencia si lo quieres hacer recursivo.  private Node<K> insert(Node<K> node, K key)

    /**
     * {@inheritDoc}
     * <p> Time complexity: O(log n)
     */
    @Override
    public K search(K key) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    // Sugerencia si lo quieres hacer recursivo.  private K search(Node<K> node, K key)

    /**
     * {@inheritDoc}
     * <p> Time complexity: O(log n)
     */
    @Override
    public boolean contains(K key) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * {@inheritDoc}
     * <p> Time complexity: O(log n)
     */
    @Override
    public void delete(K key) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    // Sugerencia si lo quieres hacer recursivo. uno para recorrer y otro para eliminar.   private Node<K> delete(Node<K> node, K key)     private Node<K> delete(Node<K> node)

    /**
     * {@inheritDoc}
     * <p> Time complexity: from O(log n)
     */
    @Override
    public K minimum() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * {@inheritDoc}
     * <p> Time complexity: from O(log n)
     */
    @Override
    public K maximum() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * {@inheritDoc}
     * <p> Time complexity: from O(log n)
     */
    @Override
    public void deleteMinimum() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    // Sugerencia si lo quieres hacer recursivo  private static <K> Node<K> deleteMinimum(Node<K> node) {

    /**
     * {@inheritDoc}
     * <p> Time complexity: from O(log n)
     */
    @Override
    public void deleteMaximum() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    // Sugerencia si lo quieres hacer recursivo private static <K> Node<K> deleteMaximum(Node<K> node) {


    @Override
    public Iterable<K> inOrder() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Iterable<K> preOrder() {
        throw new UnsupportedOperationException("Not implemented yet");
    }



    /**
     * {@inheritDoc}
     */
    @Override
    public Iterable<K> postOrder() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Returns representation of this search tree as a String.
     */
    @Override
    public String toString() {
        String className = getClass().getSimpleName();
        StringBuilder sb = new StringBuilder(className).append("(");
        toString(sb, root);
        sb.append(")");

        return sb.toString();
    }

    private static void toString(StringBuilder sb, Node<?> node) {
        if (node == null) {
            sb.append("null");
        } else {
            String className = node.getClass().getSimpleName();
            sb.append(className).append("(");
            toString(sb, node.left);
            sb.append(", ");
            sb.append(node.key);
            sb.append(", ");
            toString(sb, node.right);
            sb.append(")");
        }
    }
}