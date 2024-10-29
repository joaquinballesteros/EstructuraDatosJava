package org.uma.ed.dataestructure.heap;

import org.uma.ed.dataestructure.list.List;
import org.uma.ed.dataestructure.utils.Equals;
import org.uma.ed.dataestructure.utils.HashCode;
import org.uma.ed.dataestructure.utils.ToString;

/**
 * This class provides a skeletal implementation of equals, hashCode and toString methods to minimize the effort
 * required to implement these methods in concrete subclasses of the Heap interface.
 *
 * @param <T> Type of elements in heap.
 *
 * @author Joaquín Ballesteros, Data Structures, Grado en Informática. UMA.
 */
public abstract class AbstractHeap<T> implements Iterable<T> {
  /**
   * This abstract method should be implemented in concrete subclasses to provide the number of elements in the list.
   *
   * @return the number of elements in the list.
   */
  public abstract int size();

  /**
   * Checks whether this List and another List have same elements in same order.
   *
   * @param obj another object to compare to.
   *
   * @return {@code true} if {@code obj} is a List and has same elements as {@code this} in same order.
   */
  @Override
  public boolean equals(Object obj) {
    return this == obj || obj instanceof AbstractHeap<?> list2 && size() == list2.size()
        && Equals.orderDependent(this, list2);
  }

  /**
   * Computes a hash code for this List.
   *
   * @return hash code for this List.
   */
  @Override
  public int hashCode() {
    return HashCode.orderDependent(this);
  }

}
