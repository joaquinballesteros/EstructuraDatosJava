package org.uma.ed.demos.set;

import org.uma.ed.dataestructure.set.LinkedListSet;
import org.uma.ed.dataestructure.set.Set;

/**
 * Simple Set demo.
 *
 * @author Pepe Gallardo, Data Structures, Grado en Informática. UMA.
 */
public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> set1 = LinkedListSet.empty();
        set1.insert(1);
        set1.insert(5);
        set1.insert(4);
        set1.insert(3);
        set1.insert(2);
        set1.insert(1);

        Set<Integer> set2 = LinkedListSet.of(1, 2, 3, 4, 5, 1, 1, 1);

        System.out.println(set1);
        System.out.println(set2);

        System.out.println(set1.equals(set2));
    }
}
