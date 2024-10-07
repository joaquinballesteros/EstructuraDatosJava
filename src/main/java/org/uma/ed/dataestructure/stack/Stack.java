package org.uma.ed.dataestructure.stack;
public interface Stack <T>{
    void push(T element);
    T top();
    void pop();
    boolean isEmpty();
    int size();
    void clear();
}
