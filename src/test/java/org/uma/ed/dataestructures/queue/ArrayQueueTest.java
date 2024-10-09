package org.uma.ed.dataestructures.queue;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.uma.ed.dataestructure.queue.ArrayQueue;
import org.uma.ed.dataestructure.queue.Queue;
import org.uma.ed.dataestructure.queue.EmptyQueueException;

public class ArrayQueueTest {

    @Test
    public void testEmptyQueue() {
        ArrayQueue<Integer> queue = ArrayQueue.empty();
        assertTrue(queue.isEmpty());
        assertEquals(0, queue.size());
    }

    @Test
    public void testEnqueue() {
        ArrayQueue<Integer> queue = new ArrayQueue<>();
        queue.enqueue(1);
        assertFalse(queue.isEmpty());
        assertEquals(1, queue.size());
        assertEquals(1, queue.first());
    }

    @Test
    public void testDequeue() {
        ArrayQueue<Integer> queue = new ArrayQueue<>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.dequeue();
        assertEquals(1, queue.size());
        assertEquals(2, queue.first());
    }

    @Test
    public void testFirst() {
        ArrayQueue<Integer> queue = new ArrayQueue<>();
        queue.enqueue(1);
        queue.enqueue(2);
        assertEquals(1, queue.first());
    }

    @Test
    public void testClear() {
        ArrayQueue<Integer> queue = new ArrayQueue<>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.clear();
        assertTrue(queue.isEmpty());
        assertEquals(0, queue.size());
    }

    @Test
    public void testWithCapacity() {
        ArrayQueue<Integer> queue = ArrayQueue.withCapacity(10);
        assertTrue(queue.isEmpty());
        assertEquals(0, queue.size());
    }

    @Test
    public void testOf() {
        ArrayQueue<Integer> queue = ArrayQueue.of(1, 2, 3);
        assertFalse(queue.isEmpty());
        assertEquals(3, queue.size());
        assertEquals(1, queue.first());
    }

    @Test
    public void testFrom() {
        java.util.List<Integer> list = java.util.Arrays.asList(1, 2, 3);
        ArrayQueue<Integer> queue = ArrayQueue.from(list);
        assertFalse(queue.isEmpty());
        assertEquals(3, queue.size());
        assertEquals(1, queue.first());
    }

    @Test
    public void testCopyOfArrayQueue() {
        ArrayQueue<Integer> original = ArrayQueue.of(1, 2, 3);
        ArrayQueue<Integer> copy = ArrayQueue.copyOf(original);
        assertFalse(copy.isEmpty());
        assertEquals(3, copy.size());
        assertEquals(1, copy.first());
    }

    @Test
    public void testCopyOfQueue() {
        ArrayQueue<Integer> original = ArrayQueue.of(1, 2, 3);
        ArrayQueue<Integer> copy = ArrayQueue.copyOf((Queue<Integer>) original);
        assertFalse(copy.isEmpty());
        assertEquals(3, copy.size());
        assertEquals(1, copy.first());
    }

    @Test
    public void testEnsureCapacity() {
        ArrayQueue<Integer> queue = new ArrayQueue<>(2);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3); // This should trigger capacity increase
        assertEquals(3, queue.size());
        assertEquals(1, queue.first());
    }

    @Test
    public void testDequeueEmptyQueue() {
        ArrayQueue<Integer> queue = new ArrayQueue<>();
        assertThrows(EmptyQueueException.class, queue::dequeue);
    }

    @Test
    public void testFirstEmptyQueue() {
        ArrayQueue<Integer> queue = new ArrayQueue<>();
        assertThrows(EmptyQueueException.class, queue::first);
    }
}
