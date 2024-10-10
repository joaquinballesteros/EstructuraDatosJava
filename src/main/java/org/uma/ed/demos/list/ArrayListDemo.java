package org.uma.ed.demos.list;

import org.uma.ed.dataestructure.list.ArrayList;
import org.uma.ed.dataestructure.list.LinkedList;
import org.uma.ed.dataestructure.list.List;

/**
 * Simple class to test List implementations.
 *
 * @author Pepe Gallardo, Data Structures, Grado en Informática. UMA.
 */
public class ArrayListDemo {
  public static void main(String[] args) {
    List<Integer> list1 = ArrayList.empty();
    list1.append(1);
    list1.append(2);
    list1.prepend(3);
    list1.insert(1, 4);

    List<Integer> list2 = ArrayList.empty();
    list2.append(1);
    list2.append(2);
    list2.prepend(3);
    list2.insert(1, 4);

    List<Integer> list3 = ArrayList.of(3, 4, 1, 2);

    System.out.println(list1);
    System.out.println(list2);
    System.out.println(list3);

    System.out.println(list1.equals(list2));
    System.out.println(list1.equals(list3));
    System.out.println(list2.equals(list3));
  }
}
