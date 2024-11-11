package org.uma.ed.dataestructure.searchtree;


import java.util.*;

/**
 * Search tree implemented using an unbalanced binary search tree. Nodes are sorted according to their keys and keys are
 * sorted using the provided comparator or their natural order if no comparator is provided.
 *
 * @param <K> Type of keys.
 *
 * @author Pepe Gallardo, Data Structures, Grado en Informática. UMA.
 */
public class BST<K> implements SearchTree<K> {
    private static final class Node<K> {
        K key;
        Node<K> left, right;

        Node(K key) {
            this.key = key;
            this.left = null;
            this.right = null;
        }
    }

  /*
   INVARIANT:
   - Keys in left child are smaller than key in node.
   - Keys in right child are greater than key in node.
   - There are no duplicate keys in tree.
   - size is number of nodes in tree.
  */

    private final Comparator<K> comparator;
    private Node<K> root;
    private int size;

    /**
     * Creates an empty unbalanced binary search tree. Keys are sorted according to provided comparator.
     * <p> Time complexity: O(1)
     *
     * @param comparator Comparator defining order of keys in this search tree.
     */
    public BST(Comparator<K> comparator) {
        this(comparator, null, 0);
    }

    private BST(Comparator<K> comparator, Node<K> root, int size) {
        this.comparator = comparator;
        this.root = root;
        this.size = size;
    }

    /**
     * Creates an empty unbalanced binary search tree. Keys are sorted according to their natural order.
     * <p> Time complexity: O(1)
     */
    public static <K extends Comparable<? super K>> BST<K> empty() {
        return new BST<K>(Comparator.naturalOrder());
    }

    /**
     * Creates an empty unbalanced binary search tree. Keys are sorted according to provided comparator.
     * <p> Time complexity: O(1)
     *
     * @param comparator Comparator defining order of keys in this search tree.
     */
    public static <K> BST<K> empty(Comparator<K> comparator) {
        return new BST<>(comparator);
    }

    /**
     * Returns a new binary search tree with same elements and same structure as argument (preorder).
     * <p> Time complexity: O(n²)
     *
     * @param that binary search tree to be copied.
     *
     * @return a new BST with same elements and structure as {@code that}.
     */
    public static <K> BST<K> copyOf(SearchTree<K> that) {
        if (that instanceof BST<K> bst) {
            // use specialized version for BST trees
            return copyOf(bst);
        }
        BST<K> copy = new BST<>(that.comparator());
        for (K key : that.preOrder()) {
            copy.insert(key);
        }
        return copy;
    }

    /**
     * Returns a new unbalanced binary search tree with same elements and same structure as argument.
     * Puedes usar un método estático auxliar que te permita copiar dado un Node<K>  devolver una copia de él de forma recursiva.
     * <p> Time complexity: O(n)
     *
     * @param that binary search tree to be copied.
     *
     * @return a new BST with same elements and structure as {@code that}.
     */
    public static <K> BST<K> copyOf(BST<K> that) {
        return new BST<>(that.comparator, copyOf(that.root), that.size);
    }

    private static <K> Node<K> copyOf(Node<K> node) {
        if (node == null) {
            return null;
        } else {
            Node<K> copy = new Node<>(node.key);
            copy.left = copyOf(node.left);
            copy.right = copyOf(node.right);
            return copy;
        }
    }


    /**
     * {@inheritDoc}
     * <p> Time complexity: O(1)
     */
    @Override
    public void clear() {
        root = null;
        size = 0;
    }

    /**
     * {@inheritDoc}
     * <p> Time complexity: O(1)
     */
    @Override
    public Comparator<K> comparator() {
        return comparator;
    }

    /**
     * {@inheritDoc}
     * <p> Time complexity: O(1)
     */
    @Override
    public boolean isEmpty() {
        return root == null;
    }

    /**
     * {@inheritDoc}
     * <p> Time complexity: O(1)
     */
    @Override
    public int size() {
        return size;
    }

    /**
     * {@inheritDoc}
     * <p> Time complexity: from O(log n) to O(n)
     */
    @Override
    public int height() {
        return height(root);
    }

    private static int height(Node<?> node) {
        return node == null ? 0 : 1 + Math.max(height(node.left), height(node.right));
    }




    //Aquí empieza tu trabajo joven padawan.

    /** Prueba a hacerlo iterativo :). Lleva un anterior (parent) y un actual (node), y recorre izquierda.
     * {@inheritDoc}
     * <p> Time complexity: from O(log n) to O(n)
     */
    @Override
    public void deleteMinimum() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /** Prueba a hacerlo Iterativo.
     * {@inheritDoc}
     * <p> Time complexity: from O(log n) to O(n)
     */
    @Override
    public void deleteMaximum() {
        throw new UnsupportedOperationException("Not implemented yet");
    }



    /** Se recomienda tener un método privado que dada una clave y un Node<T>, lo intente insertar en él, devolviendo el árbol modificado.
     * {@inheritDoc}
     * <p> Time complexity: from O(log n) to O(n)
     */
    @Override
    public void insert(K key) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /** Si no lo encuentra, devuelve null. Puedes usar un método privado
     *  que dada una clave y un Node<K> busque si está o no.
     * {@inheritDoc}
     * <p> Time complexity: from O(log n) to O(n)
     */
    @Override
    public K search(K key) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /** Puedes usar el search :)
     * {@inheritDoc}
     * <p> Time complexity: from O(log n) to O(n)
     */
    @Override
    public boolean contains(K key) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /** Si no está, no hace nada. Sale más rentable buscar para borrar, que mirar primero si está y luego buscarlo.
     * Puedes usar un método privado que dada una clave y un Node<K> localize el nodo. Cuando encuentra el nodo a borrar,
     * puedes tener OTRO método privado, que dado el nodo a borrar, te devuelve el árbol con el nodo borrado (busca los tres casos para borrar).
     * {@inheritDoc}
     * <p> Time complexity: from O(log n) to O(n)
     */
    @Override
    public void delete(K key) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /** Si está vacía lanza la excepción EmptySearchTreeException.
     * {@inheritDoc}
     * <p> Time complexity: from O(log n) to O(n)
     */
    @Override
    public K minimum(){
        throw new UnsupportedOperationException("Not implemented yet");
    }


    /**
     * Si no, busca de forma iterativa y revuelve la clave más grande.
     * {@inheritDoc}
     * <p> Time complexity: from O(log n) to O(n)
     */
    @Override
    public K maximum() {
        throw new UnsupportedOperationException("Not implemented yet");
    }


    /**
     * Un iterador sobre las claves del árbol
     * Prueba a crear un metodo privado recursivo para poder recorrer el árbol y lo agregas a una lista.
     * Luego solo tienes que usar el iterator() de esa lista para poder crear tu propio iterator.
     * Iterable es una interfaz funcional (sólo tiene un método).
     * Puedes crear una clase anónima para crear el objeto iterable:
      return new Iterable<K>() {
                @Override
                public Iterator<K> iterator() {
                  ...
                 }
     * O puedes usar una lambda, si usas una lista ll para almacenar los nodos inOrder, sería:
      return () -> elements.iterator();
     * De esta forma cada vez que se llame al único método que tiene el objeto Iterable<k> (iterator) se está llamando a ll.iterator();

     * {@inheritDoc}
     */
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
        StringJoiner sj = new StringJoiner(", ",className+" {","}");
        Iterator<K> iter = inOrder().iterator();
        while(iter.hasNext()){
            sj.add(iter.next().toString());
        }
        return sj.toString();
    }
}