package org.uma.ed.demos.priorityqueue;

import org.uma.ed.dataestructure.priorityqueue.MaxiphobicHeapPriorityQueue;
import org.uma.ed.dataestructure.priorityqueue.PriorityQueue;

public class MaxiphobicHeapPriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> pQueue = MaxiphobicHeapPriorityQueue.of(5, 3, 2, 1, 2, 0, 4, 3, 5, 1, 8);
        System.out.println("pQueue = " + pQueue);
        System.out.println("pQueue.size() = " + pQueue.size());
        System.out.println("pQueue.isEmpty() = " + pQueue.isEmpty());
        System.out.println("pQueue.first() = " + pQueue.first());
        System.out.println("Dequeueing highest priority element");
        Integer first = pQueue.first();
        System.out.println("Dequeued " + first);
        pQueue.dequeue();
        System.out.println("pQueue = " + pQueue);
        System.out.println("Dequeueing all elements");
        while(!pQueue.isEmpty()) {
            Integer elem = pQueue.first();
            pQueue.dequeue();
            System.out.println("Dequeued " + elem);
        }
    }
}
/* Salida esperada:
pQueue = MaxiphobicHeapPriorityQueue(0, 1, 1, 2, 2, 3, 3, 4, 5, 5, 8)
pQueue.size() = 11
pQueue.isEmpty() = false
pQueue.first() = 0
Dequeueing highest priority element
Dequeued 0
pQueue = MaxiphobicHeapPriorityQueue(1, 1, 2, 2, 3, 3, 4, 5, 5, 8)
Dequeueing all elements
Dequeued 1
Dequeued 1
Dequeued 2
Dequeued 2
Dequeued 3
Dequeued 3
Dequeued 4
Dequeued 5
Dequeued 5
Dequeued 8
 */
