package org.uma.ed.dataestructures.heap;

import org.uma.ed.dataestructure.heap.WBLeftistHeap;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.uma.ed.dataestructure.heap.BinaryHeap;
import org.uma.ed.dataestructure.heap.EmptyHeapException;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

public class WBLeftistHeapTest {
    private WBLeftistHeap<Integer> heap;

    @BeforeEach
    public void setUp() {
        heap = WBLeftistHeap.empty();
    }

    @Test
    public void testIsEmpty() {
        assertTrue(heap.isEmpty());
        heap.insert(1);
        assertFalse(heap.isEmpty());
    }

    @Test
    public void testInsert() {
        heap.insert(10);
        assertFalse(heap.isEmpty());
        assertEquals(1, heap.size());
        assertEquals(10, heap.minimum());
    }

    @Test
    public void testMinimum() {
        heap.insert(20);
        heap.insert(15);
        heap.insert(30);
        assertEquals(15, heap.minimum());
    }

    @Test
    public void testDeleteMinimum() {
        heap.insert(20);
        heap.insert(15);
        heap.insert(30);
        heap.deleteMinimum();
        assertEquals(20, heap.minimum());
        heap.deleteMinimum();
        assertEquals(30, heap.minimum());
    }

    @Test
    public void testClear() {
        heap.insert(10);
        heap.insert(20);
        heap.clear();
        assertTrue(heap.isEmpty());
    }

    @Test
    public void testCopyOf() {
        heap.insert(10);
        heap.insert(20);
        WBLeftistHeap<Integer> copy = WBLeftistHeap.copyOf(heap);
        assertEquals(heap.size(), copy.size());
        assertEquals(heap.minimum(), copy.minimum());
    }

    @Test
    public void testFromIterable() {
        WBLeftistHeap<Integer> heapFromIterable = WBLeftistHeap.from(Comparator.naturalOrder(),
                Arrays.asList(5, 3, 8, 1));
        assertEquals(1, heapFromIterable.minimum());
    }

    @Test
    public void testEmptyHeapException() {
        assertThrows(EmptyHeapException.class, () -> heap.minimum());
        assertThrows(EmptyHeapException.class, () -> heap.deleteMinimum());
    }

}
