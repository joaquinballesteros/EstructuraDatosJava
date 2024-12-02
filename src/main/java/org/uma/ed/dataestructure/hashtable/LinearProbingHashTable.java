package org.uma.ed.dataestructure.hashtable;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

import org.uma.ed.dataestructure.utils.ToString;

/**
 * Hash tables whose entries are unique keys implemented using open addressing (linear probing). Notice that keys should
 * define {@link Object#equals(Object)} and {@link Object#hashCode} methods properly.
 *
 * @param <K> Type of keys.
 *
 * @author Pepe Gallardo, Data Structures, Grado en Informática. UMA.
 */
public class LinearProbingHashTable<K> implements HashTable<K> {
    private static final int DEFAULT_NUM_CELLS = HashPrimes.primeGreaterThan(32);
    private static final double DEFAULT_MAX_LOAD_FACTOR = 0.5;

    private K[] keys;
    private int size; // number of keys inserted in table
    private final double maxLoadFactor;

    /**
     * Creates an empty linear probing hash table.
     * <p> Time complexity: O(1)
     *
     * @param numCells Initial number of cells in table (should be a prime number).
     * @param maxLoadFactor Maximum load factor to tolerate. If exceeded, rehashing is performed automatically.
     *
     * @throws IllegalArgumentException if numChains is less than 1.
     */
    @SuppressWarnings("unchecked")
    public LinearProbingHashTable(int numCells, double maxLoadFactor) {
        if (numCells <= 0) {
            throw new IllegalArgumentException("initial number of cells must be greater than 0");
        }
        keys = (K[]) new Object[numCells];
        size = 0;
        this.maxLoadFactor = maxLoadFactor;
    }

    /**
     * Creates an empty linear probing hash table.
     * <p> Time complexity: O(1)
     */
    public LinearProbingHashTable() {
        this(DEFAULT_NUM_CELLS, DEFAULT_MAX_LOAD_FACTOR);
    }

    /**
     * Creates an empty linear probing hash table.
     *
     * @return a new LinearProbingHashTable with given capacity.
     * <p> Time complexity: O(1)
     */
    public static <K> LinearProbingHashTable<K> empty() {
        return new LinearProbingHashTable<>();
    }

    /**
     * Creates an empty linear probing hash table for accommodating size elements so that no rehashing is initially done.
     *
     * @param size number of elements to accommodate.
     *
     * @return a new LinearProbingHashTable with given capacity.
     *
     * @throws IllegalArgumentException if initial capacity (size) is less than 1.
     * <p> Time complexity: O(1)
     */
    public static <K> LinearProbingHashTable<K> withCapacity(int size) {
        if (size <= 0) {
            throw new IllegalArgumentException("initial capacity must be greater than 0");
        }
        return new LinearProbingHashTable<>(HashPrimes.primeGreaterThan((int) (size / DEFAULT_MAX_LOAD_FACTOR)),
                DEFAULT_MAX_LOAD_FACTOR);
    }

    /**
     * Returns a new hash table with same elements as argument.
     * <p> Time complexity: O(n)
     *
     * @param that LinearProbingHashTable to be copied.
     *
     * @return a new LinearProbingHashTable with same elements as {@code that}.
     */
    public static <K> LinearProbingHashTable<K> copyOf(LinearProbingHashTable<K> that) {
        throw new UnsupportedOperationException("Implementa!");
    }

    /**
     * Returns a new hash table with same elements as argument.
     * <p> Time complexity: near O(n)
     *
     * @param that HashTable to be copied.
     *
     * @return a new LinearProbingHashTable with same elements as {@code that}.
     */
    public static <K> LinearProbingHashTable<K> copyOf(HashTable<K> that) {
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
        return (key.hashCode() & 0x7fffffff) % keys.length;
    }

    private double loadFactor() {
        return (double) size / (double) keys.length;
    }

    // circular index increment
    private int advance(int index) {
        return (index + 1) % keys.length;
    }

    private int searchIndex(K key) {
        int index = hash(key);
        while ((keys[index] != null) && (!keys[index].equals(key))) {
            index = advance(index);
        }
        return index;
    }

    /**
     * {@inheritDoc}
     * <p> Time complexity: near O(1)
     */
    @Override
    public void insert(K key) {
        if (loadFactor() > maxLoadFactor) {
            rehashing();
        }

        //Completar
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
     * <p> Time complexity: near O(n)
     */
    @Override
    public void clear() {
        Arrays.fill(keys, null);
        size = 0;
    }

    @SuppressWarnings("unchecked")
    private void rehashing() {
        // compute new table size
        int newCapacity = HashPrimes.primeDoubleThan(keys.length);

        K[] oldKeys = keys;

        keys = (K[]) new Object[newCapacity];

        // reinsert elements in new table
        for (K oldKey : oldKeys) {
            if (oldKey != null) {
                int newIndex = searchIndex(oldKey);
                keys[newIndex] = oldKey;
            }
        }
    }

    // An iterator on keys stored in hash table
    private final class LinearProbingHashTableIterator implements Iterator<K> {
        int yielded; // number of elements already yielded by this iterator
        int nextIndex; // index of next element to be yielded by this iterator

        public LinearProbingHashTableIterator() {
            yielded = 0;
            nextIndex = -1; // so that after first increment it becomes 0
        }

        // advance nextIndex to index of next to be yielded element
        public void moveForward() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }

            do {
                nextIndex = advance(nextIndex);
            }
            while (keys[nextIndex] == null);

            yielded++;
        }

        public boolean hasNext() {
            return yielded < size;
        }

        public K next() {
            moveForward();
            return keys[nextIndex];
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
        return new LinearProbingHashTableIterator();
    }

    /**
     * Returns representation of hash table as a String.
     */
    @Override
    public String toString() {
        return ToString.toString(this);
    }
}