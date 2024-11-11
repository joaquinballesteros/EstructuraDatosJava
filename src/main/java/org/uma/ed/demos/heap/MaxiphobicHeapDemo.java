package org.uma.ed.demos.heap;

import org.uma.ed.dataestructure.heap.MaxiphobicHeap;


public class MaxiphobicHeapDemo {
    public static void main(String[] args) {
        MaxiphobicHeap<Integer> heapMMX = MaxiphobicHeap.of(5, 3, 2, 1, 2, 0, 4, 3, 5, 1, 8);
        System.out.println("heapMMX = " + heapMMX);
        System.out.println("heapMMX.size() = " + heapMMX.size());
        System.out.println("heapMMX.isEmpty() = " + heapMMX.isEmpty());
        System.out.println("heapMMX.minimum() = " + heapMMX.minimum());
        System.out.println("heapMMX highest priority element");
        Integer first = heapMMX.minimum();
        System.out.println("Dequeued " + first);
        heapMMX.deleteMinimum();
        System.out.println("Dequeued = " + heapMMX);
        System.out.println("Dequeueing all elements");
        while(!heapMMX.isEmpty()) {
            Integer elem = heapMMX.minimum();
            heapMMX.deleteMinimum();
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
