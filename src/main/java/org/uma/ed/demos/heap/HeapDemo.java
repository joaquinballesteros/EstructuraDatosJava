package org.uma.ed.demos.heap;

import java.util.Arrays;
import java.util.Random;
import org.uma.ed.datastructures.heap.BinaryHeap;
import org.uma.ed.datastructures.heap.Heap;
import org.uma.ed.datastructures.heap.MaxiphobicHeap;
import org.uma.ed.datastructures.heap.PairingHeap;
import org.uma.ed.datastructures.heap.SkewHeap;
import org.uma.ed.datastructures.heap.WBLeftistHeap;
import org.uma.ed.datastructures.list.ArrayList;
import org.uma.ed.datastructures.list.List;

/**
 * Simple demo program for testing that elements are extracted in increasing order from a heap.
 *
 * @author Pepe Gallardo, Data Structures, Grado en Informática. UMA.
 */
public class HeapDemo {
  private static void printHeapInOrder(Heap<Integer> heap) {
    while (!heap.isEmpty()) {
      System.out.print(heap.minimum()+ " ");
      heap.deleteMinimum();
    }
    System.out.println();
  }

  public static void main(String[] args) {
    List<Integer> list = ArrayList.of(10, 2, 13, 0, 5, 7, 10, 3, 1, 6);

    Heap<Integer> heap1 = WBLeftistHeap.from(list);
    System.out.println(heap1);
    printHeapInOrder(heap1);
    System.out.println();

    Heap<Integer> heap2 = SkewHeap.from(list);
    System.out.println(heap2);
    printHeapInOrder(heap2);
    System.out.println();

    Heap<Integer> heap3 = MaxiphobicHeap.from(list);
    System.out.println(heap3);
    printHeapInOrder(heap3);
    System.out.println();

    Heap<Integer> heap4 = PairingHeap.from(list);
    System.out.println(heap4);
    printHeapInOrder(heap4);
    System.out.println();

    Heap<Integer> heap5 = BinaryHeap.from(list);
    System.out.println(heap5);
    printHeapInOrder(heap5);
    System.out.println();

    Integer[] array = {10, 2, 13, 0, 5, 7, 10, 3, 1, 6};
    Random rnd = new Random();

    int numberOfTests = 10000;
    for (int test = 0; test < numberOfTests; test++) {
      // shuffle array
      for (int i = 0; i < array.length; i++) {
        int j = i + rnd.nextInt(array.length - i);
        int temp = array[j];
        array[j] = array[i];
        array[i] = temp;
      }

      // System.out.println("Array: " + Arrays.toString(array));
      Heap<Integer> heap = BinaryHeap.from(Arrays.asList(array));
      // System.out.println("Heap: " + heap);

      // check heap elements are extracted in increasing order
      int previous = -1;
      while (!heap.isEmpty()) {
        int next = heap.minimum();
        if (next < previous) {
          System.out.println("Error: " + previous + " >= " + next);
          System.exit(1);
        }
        previous = next;
        heap.deleteMinimum();
      }
    }
    System.out.println("All tests passed");
  }
}
