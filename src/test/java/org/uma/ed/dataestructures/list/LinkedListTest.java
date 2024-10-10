package org.uma.ed.dataestructures.list;

import org.junit.jupiter.api.Test;
import org.uma.ed.dataestructure.list.LinkedList;
import org.uma.ed.dataestructure.list.List;
import org.uma.ed.dataestructure.list.AbstractList;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Iterator;

public class LinkedListTest {
    @Test
    public void testEmptyList() {
        LinkedList<Integer> list = LinkedList.empty();
        assertTrue(list.isEmpty());
        assertEquals(0, list.size());
    }

    @Test
    public void testAppend() {
        LinkedList<Integer> list = LinkedList.empty();
        list.append(1);
        assertFalse(list.isEmpty());
        assertEquals(1, list.size());
        assertEquals(1, list.get(0));
    }

    @Test
    public void testPrepend() {
        LinkedList<Integer> list = LinkedList.empty();
        list.prepend(1);
        assertFalse(list.isEmpty());
        assertEquals(1, list.size());
        assertEquals(1, list.get(0));
    }

    @Test
    public void testInsert() {
        LinkedList<Integer> list = LinkedList.empty();
        list.append(1);
        list.append(3);
        list.insert(1, 2);
        assertEquals(3, list.size());
        assertEquals(1, list.get(0));
        assertEquals(2, list.get(1));
        assertEquals(3, list.get(2));
    }

    @Test
    public void testDelete() {
        LinkedList<Integer> list = LinkedList.empty();
        list.append(1);
        list.append(2);
        list.append(3);
        list.delete(1);
        assertEquals(2, list.size());
        assertEquals(1, list.get(0));
        assertEquals(3, list.get(1));
    }

    @Test
    public void testClear() {
        LinkedList<Integer> list = LinkedList.empty();
        list.append(1);
        list.append(2);
        list.clear();
        assertTrue(list.isEmpty());
        assertEquals(0, list.size());
    }

    @Test
    public void testGet() {
        LinkedList<Integer> list = LinkedList.empty();
        list.append(1);
        list.append(2);
        assertEquals(1, list.get(0));
        assertEquals(2, list.get(1));
    }

    @Test
    public void testSet() {
        LinkedList<Integer> list = LinkedList.empty();
        list.append(1);
        list.append(2);
        list.set(1, 3);
        assertEquals(1, list.get(0));
        assertEquals(3, list.get(1));
    }

    @Test
    public void testFromIterable() {
        LinkedList<Integer> list = LinkedList.from(java.util.List.of(1,2,3));
        assertEquals(3, list.size());
        assertEquals(1, list.get(0));
        assertEquals(2, list.get(1));
        assertEquals(3, list.get(2));
    }

    @Test
    public void testOf() {
        LinkedList<Integer> list = LinkedList.of(1, 2, 3);
        assertEquals(3, list.size());
        assertEquals(1, list.get(0));
        assertEquals(2, list.get(1));
        assertEquals(3, list.get(2));
    }

    @Test
    public void testCopyOf() {
        LinkedList<Integer> original = LinkedList.of(1, 2, 3);
        LinkedList<Integer> copy = LinkedList.copyOf(original);
        assertEquals(3, copy.size());
        assertEquals(1, copy.get(0));
        assertEquals(2, copy.get(1));
        assertEquals(3, copy.get(2));
    }

}
