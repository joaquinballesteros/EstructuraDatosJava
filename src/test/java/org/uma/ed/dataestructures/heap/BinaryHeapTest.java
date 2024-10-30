package org.uma.ed.dataestructures.heap;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.Comparator;
import java.util.NoSuchElementException;
import static org.junit.jupiter.api.Assertions.*;
import org.uma.ed.dataestructure.heap.BinaryHeap;
import org.uma.ed.dataestructure.heap.EmptyHeapException;

public class BinaryHeapTest {
    private BinaryHeap<Integer> heap;

    @BeforeEach
    public void setUp() {
        heap = new BinaryHeap<Integer>(Comparator.naturalOrder());
    }

    @Test
    public void testIsEmpty() {
        assertTrue(heap.isEmpty());
        heap.insert(1);
        assertFalse(heap.isEmpty());
    }

    @Test
    public void testSize() {
        assertEquals(0, heap.size());
        heap.insert(1);
        assertEquals(1, heap.size());
        heap.insert(2);
        assertEquals(2, heap.size());
    }

    @Test
    public void testInsert() {
        heap.insert(3);
        heap.insert(1);
        heap.insert(2);
        assertEquals(3, heap.size());
        assertEquals(1, heap.minimum());
    }

    @Test
    public void testMinimum() {
        heap.insert(3);
        heap.insert(1);
        heap.insert(2);
        assertEquals(1, heap.minimum());
    }

    @Test
    public void testDeleteMinimum() {
        heap.insert(3);
        heap.insert(1);
        heap.insert(2);
        heap.deleteMinimum();
        assertEquals(2, heap.size());
        assertEquals(2, heap.minimum());
    }

    @Test
    public void testClear() {
        heap.insert(3);
        heap.insert(1);
        heap.insert(2);
        heap.clear();
        assertTrue(heap.isEmpty());
    }

    @Test
    public void testHeapifyUp() {
        heap.insert(3);
        heap.insert(1);
        heap.insert(2);
        assertEquals(1, heap.minimum());
    }

    @Test
    public void testHeapifyDown() {
        heap.insert(3);
        heap.insert(1);
        heap.insert(2);
        heap.deleteMinimum();
        assertEquals(2, heap.minimum());
    }

    @Test
    public void testEnsureCapacity() {
        for (int i = 0; i < 20; i++) {
            heap.insert(i);
        }
        assertEquals(20, heap.size());
    }


    @Test
    public void testEmptyHeapException() {
        assertThrows(EmptyHeapException.class, () -> heap.minimum());
        assertThrows(EmptyHeapException.class, () -> heap.deleteMinimum());
    }

    @Test
    public void testCopyOf() {
        heap.insert(3);
        heap.insert(1);
        heap.insert(2);
        BinaryHeap<Integer> copy = BinaryHeap.copyOf(heap);
        assertEquals(heap.size(), copy.size());
        assertEquals(heap.minimum(), copy.minimum());
    }

    @Test
    public void testFromIterable() {
        Iterable<Integer> iterable = Arrays.asList(3, 1, 2);
        BinaryHeap<Integer> heapFromIterable = BinaryHeap.from(iterable);
        assertEquals(3, heapFromIterable.size());
        assertEquals(1, heapFromIterable.minimum());
    }

    @Test
    public void testOfElements() {
        BinaryHeap<Integer> heapOfElements = BinaryHeap.of(3, 1, 2);
        assertEquals(3, heapOfElements.size());
        assertEquals(1, heapOfElements.minimum());
    }
}
