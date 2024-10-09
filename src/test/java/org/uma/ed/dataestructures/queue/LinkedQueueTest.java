package org.uma.ed.dataestructures.queue;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.uma.ed.dataestructure.queue.LinkedQueue;
import org.uma.ed.dataestructure.queue.EmptyQueueException;

public class LinkedQueueTest {


        @Test
        public void testEmptyQueue() {
            LinkedQueue<Integer> queue = LinkedQueue.empty();
            assertTrue(queue.isEmpty());
            assertEquals(0, queue.size());
        }

        @Test
        public void testEnqueue() {
            LinkedQueue<Integer> queue = LinkedQueue.empty();
            queue.enqueue(1);
            assertFalse(queue.isEmpty());
            assertEquals(1, queue.size());
            assertEquals(1, queue.first());
        }

        @Test
        public void testDequeue() {
            LinkedQueue<Integer> queue = LinkedQueue.empty();
            queue.enqueue(1);
            queue.enqueue(2);
            assertEquals(1, queue.first());
            queue.dequeue();
            assertEquals(2, queue.first());
            assertEquals(1, queue.size());
        }

        @Test
        public void testFirst() {
            LinkedQueue<Integer> queue = LinkedQueue.empty();
            queue.enqueue(1);
            queue.enqueue(2);
            assertEquals(1, queue.first());
        }

        @Test
        public void testClear() {
            LinkedQueue<Integer> queue = LinkedQueue.empty();
            queue.enqueue(1);
            queue.enqueue(2);
            queue.clear();
            assertTrue(queue.isEmpty());
            assertEquals(0, queue.size());
        }

        @Test
        public void testCopyOf() {
            LinkedQueue<Integer> queue = LinkedQueue.of(1, 2, 3);
            LinkedQueue<Integer> copy = LinkedQueue.copyOf(queue);
            assertEquals(queue.size(), copy.size());
            while (!queue.isEmpty()) {
                assertEquals(queue.first(), copy.first());
                queue.dequeue();
                copy.dequeue();
            }
        }

        @Test
        public void testFromIterable() {
            java.util.List<Integer> list = java.util.Arrays.asList(1, 2, 3);
            LinkedQueue<Integer> queue = LinkedQueue.from(list);
            assertEquals(3, queue.size());
            assertEquals(1, queue.first());
        }

        @Test
        public void testOfVarargs() {
            LinkedQueue<Integer> queue = LinkedQueue.of(1, 2, 3);
            assertEquals(3, queue.size());
            assertEquals(1, queue.first());
        }

        @Test
        public void testDequeueEmptyQueue() {
            LinkedQueue<Integer> queue = LinkedQueue.empty();
            assertThrows(EmptyQueueException.class, queue::dequeue);
        }

        @Test
        public void testFirstEmptyQueue() {
            LinkedQueue<Integer> queue = LinkedQueue.empty();
            assertThrows(EmptyQueueException.class, queue::first);
        }
    }
