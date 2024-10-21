package org.uma.ed.datastructures.set;

import org.uma.ed.datastructures.utils.equals.Equals;
import org.uma.ed.datastructures.utils.hashCode.HashCode;
import org.uma.ed.datastructures.utils.toString.ToString;

/**
 * This class provides a skeletal implementation of equals, hashCode and toString methods to minimize the effort
 * required to implement these methods in concrete subclasses of the {@link Set} interface.
 *
 * @param <T> Type of elements in set.
 *
 * @author Pepe Gallardo, Data Structures, Grado en Informática. UMA.
 */
public abstract class AbstractSet<T> implements Iterable<T> {
  /**
   * This abstract method should be implemented in concrete subclasses to provide the number of elements in the set.
   *
   * @return the number of elements in the set.
   */
  public abstract int size();

  /**
   * Checks whether this Set and another Set have same elements in same order.
   *
   * @param obj another object to compare to.
   *
   * @return {@code true} if {@code obj} is a Set and has same elements as {@code this} in same order.
   */
  @Override
  public boolean equals(Object obj) {
    return this == obj || obj instanceof AbstractSet<?> set2 && size() == set2.size()
        && Equals.orderIndependent(this, set2);
  }

  /**
   * Computes a hash code for this Set.
   *
   * @return hash code for this Set.
   */
  @Override
  public int hashCode() {
    return HashCode.orderIndependent(this);
  }

  /**
   * Returns representation of this Set as a String.
   */
  @Override
  public String toString() {
    return ToString.toString(this);
  }
}
