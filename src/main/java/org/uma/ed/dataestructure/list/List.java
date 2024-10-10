package org.uma.ed.dataestructure;

public interface List <T>{
    void append(T element);
    void prepend(T element);
    void insert(int index, T element);
    void delete(int index);
    T get(int index);
    void set(int index, T element);
    boolean isEmpty();
    int size();
    void clear();
    boolean contains(T element);
}
