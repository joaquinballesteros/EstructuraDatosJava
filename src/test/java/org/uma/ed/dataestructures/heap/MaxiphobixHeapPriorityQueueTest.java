package org.uma.ed.dataestructures.heap;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Comparator;
import java.util.NoSuchElementException;

import org.junit.jupiter.api.Test;
import org.uma.ed.dataestructure.heap.EmptyHeapException;
import org.uma.ed.dataestructure.heap.MaxiphobicHeap;

/**
 * Testing of priority queue implemented using maxiphobic heap-ordered binary
 * trees.
 *
 *
 * @author Joaquín Ballesteros, Data Structures, Grado en Informática. UMA.
 */
public class MaxiphobixHeapPriorityQueueTest {
    Comparator<Integer> cmp = new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o1.compareTo(o2); // 
        }
    };
    
    @Test
    public void testInsertAndminimum() {
        MaxiphobicHeap<Integer> heap = new MaxiphobicHeap<>(cmp);
        heap.insert(5);
        heap.insert(3);
        heap.insert(8);
        assertEquals(3, heap.minimum());
    }

    @Test
    public void testdeleteMinimum() {
        MaxiphobicHeap<Integer> heap = new MaxiphobicHeap<>(cmp);
        heap.insert(5);
        heap.insert(3);
        heap.insert(8);
        assertEquals(3, heap.minimum());
        heap.deleteMinimum();
        assertEquals(5, heap.minimum());
        heap.deleteMinimum();
        assertEquals(8, heap.minimum());
        heap.deleteMinimum();
        assertThrows(EmptyHeapException.class, heap::minimum);
    }

    @Test
    public void testIsEmpty() {
        MaxiphobicHeap<Integer> heap = new MaxiphobicHeap<>(cmp);
        assertTrue(heap.isEmpty());
        heap.insert(1);
        assertFalse(heap.isEmpty());
        heap.deleteMinimum();
        assertTrue(heap.isEmpty());
    }

    @Test
    public void testSize() {
        MaxiphobicHeap<Integer> heap = new MaxiphobicHeap<>(cmp);
        assertEquals(0, heap.size());
        heap.insert(1);
        assertEquals(1, heap.size());
        heap.insert(2);
        assertEquals(2, heap.size());
        heap.deleteMinimum();
        assertEquals(1, heap.size());
    }

    @Test
    public void testClear() {
        MaxiphobicHeap<Integer> heap = new MaxiphobicHeap<>(cmp);
        heap.insert(1);
        heap.insert(2);
        heap.insert(3);
        assertFalse(heap.isEmpty());
        heap.clear();
        assertTrue(heap.isEmpty());
    }

    @Test
    public void testminimumOnEmptyHeap() {
        MaxiphobicHeap<Integer> heap = new MaxiphobicHeap<>(cmp);
        assertThrows(EmptyHeapException.class, heap::minimum);
    }

    @Test
    public void testdeleteMinimumOnEmptyHeap() {
        MaxiphobicHeap<Integer> heap = new MaxiphobicHeap<>(cmp);
        assertThrows(EmptyHeapException.class, heap::deleteMinimum);
    }
}