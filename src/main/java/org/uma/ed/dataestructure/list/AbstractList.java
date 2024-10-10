package org.uma.ed.datastructures.list;

import org.uma.ed.datastructures.utils.equals.Equals;
import org.uma.ed.datastructures.utils.hashCode.HashCode;
import org.uma.ed.datastructures.utils.toString.ToString;

/**
 * This class provides a skeletal implementation of equals, hashCode and toString methods to minimize the effort
 * required to implement these methods in concrete subclasses of the {@link List} interface.
 *
 * @param <T> Type of elements in list.
 *
 * @author Pepe Gallardo, Data Structures, Grado en Informática. UMA.
 */
public abstract class AbstractList<T> implements Iterable<T> {
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
    return this == obj || obj instanceof AbstractList<?> list2 && size() == list2.size()
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

  /**
   * Returns representation of this List as a String.
   */
  @Override
  public String toString() {
    return ToString.toString(this);
  }
}
