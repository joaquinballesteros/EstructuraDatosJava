package org.uma.ed.demos.heap;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;
import org.uma.ed.dataestructure.heap.BinaryHeap;
import org.uma.ed.dataestructure.heap.Heap;
import org.uma.ed.dataestructure.list.ArrayList;
import org.uma.ed.dataestructure.list.List;

/**
 * Simple demo program for testing that elements are extracted in increasing order from a heap.
 *
 * @author Pepe Gallardo, Data Structures, Grado en Informática. UMA.
 */
public class HeapDemo {
  private static void printBFT(Heap<Integer> heap) {
    Iterator<Integer> it = heap.iterator();
    while (it.hasNext()) {
      System.out.print(it.next()+ " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    List<Integer> list0 = ArrayList.of(10, 2, 13, 0, 5, 7, 10, 3, 1, 6);
    List<Integer> list1 = ArrayList.of( 2, 10, 13,  7, 10, 3, 0, 5, 1, 6); //Igual que la anterior cambiadas.
    List<Integer> list2 = ArrayList.of(  10, 13,  7, 10, 3, 0, 5, 1, 6);   //Falta un solo elemento.

    //               0
    //        1              7
    //   2        5     13       10
    // 3   10    6

    System.out.println("Heap 0: --");
    Heap<Integer> heap0 = BinaryHeap.from(list0);
    System.out.println(heap0);
    printBFT(heap0);
    System.out.println("--------");

    System.out.println("Heap 1: --");
    Heap<Integer> heap1 = BinaryHeap.from(list1);
    System.out.println(heap1);
    printBFT(heap1);
    System.out.println("--------");

    System.out.println("Heap 2: --");
    Heap<Integer> heap2 = BinaryHeap.from(list2);
    System.out.println(heap2);
    printBFT(heap2);
    System.out.println("--------");

    System.out.println("Elemento mínimo:" + heap0.minimum().toString());
    System.out.println("Iguales heap0 y heap1 (podría ser cierto, o falso :)) "+heap0.equals(heap1));
    System.out.println("Iguales heap0 y heap2 (debería ser falso) "+heap0.equals(heap2));


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
