package org.uma.ed.dataestructure.hashtable;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Function;
import java.util.function.Predicate;
import org.uma.ed.dataestructure.utils.ToString;

/**
 * Hash tables whose entries are unique keys implemented using separate chaining. Notice that keys should define
 * {@link Object#equals(Object)} and {@link Object#hashCode} methods properly.
 *
 * @param <K> Type of keys.
 *
 * @author Pepe Gallardo, Data Structures, Grado en Informática. UMA.
 */
public class SeparateChainingHashTable<K> implements HashTable<K> {
    private static final class Node<K> {
        K key;
        Node<K> next;

        Node(K key, Node<K> next) {
            this.key = key;
            this.next = next;
        }
    }

    private static final int DEFAULT_NUM_CHAINS = HashPrimes.primeGreaterThan(32); //M, número de celdas.
    private static final double DEFAULT_MAX_LOAD_FACTOR = 5;

    private Node<K>[] table;
    private int size; // number of keys inserted in table
    private final double maxLoadFactor;

    /**
     * Creates an empty separate chaining hash table.
     * <p> Time complexity: O(1)
     *
     * @param numChains Number of separate chains (linked lists). Should be a prime number.
     * @param maxLoadFactor Maximum load factor to tolerate. If exceeded, rehashing is performed automatically.
     *
     * @throws IllegalArgumentException if numChains is less than 1.
     */
    @SuppressWarnings("unchecked")
    public SeparateChainingHashTable(int numChains, double maxLoadFactor) {
        if (numChains <= 0) {
            throw new IllegalArgumentException("initial number of chains must be greater than 0");
        }
        this.table = (Node<K>[]) new Node[numChains];   //Array con numChains listas enlazadas en las que se gestionarán las colisiones.
        this.size = 0;                                  //Número de elementos insertados.
        this.maxLoadFactor = maxLoadFactor;             //FActor máximo a partir del cual se hace el rehasing.
    }

    /**
     * Creates an empty separate chaining hash table.
     * <p> Time complexity: O(1)
     */
    public SeparateChainingHashTable() {
        this(DEFAULT_NUM_CHAINS, DEFAULT_MAX_LOAD_FACTOR);
    }

    /**
     * Creates an empty separate chaining hash table.
     *
     * @return a new SeparateChainingHashTable with given capacity.
     * <p> Time complexity: O(1)
     */
    public static <K> SeparateChainingHashTable<K> empty() {
        return new SeparateChainingHashTable<>();
    }

    /**
     * Creates an empty separate chaining hash table for accommodating size elements so that no rehashing is initially
     * done.
     *
     * @param size number of elements to accommodate.
     *
     * @return a new SeparateChainingHashTable with given capacity.
     *
     * @throws IllegalArgumentException if initial capacity (size) is less than 1.
     * <p> Time complexity: O(1)
     */
    public static <K> SeparateChainingHashTable<K> withCapacity(int size) {
        if (size <= 0) {
            throw new IllegalArgumentException("initial capacity must be greater than 0");
        }
        return new SeparateChainingHashTable<>(HashPrimes.primeGreaterThan((int) (size / DEFAULT_MAX_LOAD_FACTOR)),
                DEFAULT_MAX_LOAD_FACTOR);
    }

    /**
     * Returns a new hash table with same elements as argument.
     * <p> Time complexity: O(n)
     *
     * @param that SeparateChainingHashTable to be copied.
     *
     * @return a new SeparateChainingHashTable with same elements as {@code that}.
     */
    public static <K> SeparateChainingHashTable<K> copyOf(SeparateChainingHashTable<K> that) {
        throw new UnsupportedOperationException("Implementa!");
    }

    /**
     * Returns a new hash table with same elements as argument.
     * <p> Time complexity: O(n)
     *
     * @param that HashTable to be copied.
     *
     * @return a new SeparateChainingHashTable with same elements as {@code that}.
     */
    public static <K> SeparateChainingHashTable<K> copyOf(HashTable<K> that) {
        throw new UnsupportedOperationException("Implementa!");
    }

    /**
     * {@inheritDoc}
     * <p> Time complexity: near O(1)
     */
    @Override
    public boolean isEmpty() {
        throw new UnsupportedOperationException("Implementa!");
    }

    /**
     * {@inheritDoc}
     * <p> Time complexity: near O(1)
     */
    @Override
    public int size() {
        throw new UnsupportedOperationException("Implementa!");
    }

    private int hash(K key) {
        return (key.hashCode() & 0x7fffffff) % table.length;
    }

    private double loadFactor() {
        return (double) size / (double) table.length;
    }

    /**
     * Searches for a key in table and returns information about key location:
     * current will be a reference to node containing key or null if key is not in table,
     * prev will be a reference to previous node in chain or null if key is first in chain,
     * index will be the index of chain where key is or should be.
     */
    private final class Finder {
        int index;
        Node<K> previous, current;

        Finder(K key) {
            index = hash(key);
            previous = null;
            current = table[index];

            while ((current != null) && (!current.key.equals(key))) {
                previous = current;
                current = current.next;
            }
        }
    }

    /** Update if the key already exists.
     * {@inheritDoc}
     * <p> Time complexity: near O(1)
     */
    @Override
    public void insert(K key) {
        if (loadFactor() > maxLoadFactor) {
            rehashing();
        }

        //¡¡¡Completar!!!
        throw new UnsupportedOperationException("Implementa!");
    }

    /**
     * {@inheritDoc}
     * <p> Time complexity: near O(1)
     */
    @Override
    public K search(K key) {
        throw new UnsupportedOperationException("Implementa!");
    }

    /**
     * {@inheritDoc}
     * <p> Time complexity: near O(1)
     */
    @Override
    public boolean contains(K key) {
        throw new UnsupportedOperationException("Implementa!");
    }
    /**
     * {@inheritDoc}
     * <p> Time complexity: near O(1)
     */
    @Override
    public void delete(K key) {
        throw new UnsupportedOperationException("Implementa!");
    }

    /**
     * {@inheritDoc}
     * <p> Time complexity: O(1)
     */
    @Override
    public void clear() {
        Arrays.fill(table, null);
        size = 0;
    }

    @SuppressWarnings("unchecked")
    private void rehashing() {
        // compute new table size
        int newCapacity = HashPrimes.primeDoubleThan(table.length);

        Node<K>[] oldTable = table;
        table = (Node<K>[]) new Node[newCapacity];

       //Completar
        throw new UnsupportedOperationException("Implementa!");
    }

    private final class SeparateChainingHashTableIterator implements Iterator<K> {
        int index; // index of chain being traversed
        Node<K> current; // current node in chain being traversed

        public SeparateChainingHashTableIterator() {
            index = 0;
            current = table[index];

            // locate first element
            advance();
        }

        private void advance() {
            while ((current == null) && (index < table.length - 1)) {
                index++;
                current = table[index];
            }
        }

        public boolean hasNext() {
            return (current != null);
        }

        public K next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }

            K key = current.key;
            // advance for next invocation
            current = current.next;
            advance();

            return key;
        }
    }

    /**
     * Iterator over elements in set. Notice that {@code remove} method is not supported. Note also that hash table should
     * not be modified during iteration as iterator state may become inconsistent.
     *
     * @see java.lang.Iterable#iterator()
     */
    @Override
    public Iterator<K> iterator() {
        return new SeparateChainingHashTableIterator();
    }

    /**
     * Returns representation of hash table as a String.
     */
    @Override
    public String toString() {
        return ToString.toString(this);
    }
}