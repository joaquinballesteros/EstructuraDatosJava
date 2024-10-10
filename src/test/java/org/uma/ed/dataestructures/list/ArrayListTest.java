package org.uma.ed.dataestructures.list;

import org.junit.jupiter.api.Test;
import org.uma.ed.dataestructure.list.ArrayList;
import org.uma.ed.dataestructure.list.List;
import org.uma.ed.dataestructure.list.AbstractList;
import static org.junit.jupiter.api.Assertions.*;

public class ArrayListTest {

    @Test
    public void testEmptyList() {
        List<Integer> list = new ArrayList<>();
        assertTrue(list.isEmpty());
        assertEquals(0, list.size());
    }

    @Test
    public void testAppend() {
        List<Integer> list = new ArrayList<>();
        list.append(1);
        list.append(2);
        list.append(3);
        assertFalse(list.isEmpty());
        assertEquals(3, list.size());
        assertEquals(1, list.get(0));
        assertEquals(2, list.get(1));
        assertEquals(3, list.get(2));
    }

    @Test
    public void testPrepend() {
        List<Integer> list = new ArrayList<>();
        list.prepend(1);
        list.prepend(2);
        list.prepend(3);
        assertFalse(list.isEmpty());
        assertEquals(3, list.size());
        assertEquals(3, list.get(0));
        assertEquals(2, list.get(1));
        assertEquals(1, list.get(2));
    }

    @Test
    public void testInsert() {
        List<Integer> list = new ArrayList<>();
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
        List<Integer> list = new ArrayList<>();
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
        List<Integer> list = new ArrayList<>();
        list.append(1);
        list.append(2);
        list.append(3);
        list.clear();
        assertTrue(list.isEmpty());
        assertEquals(0, list.size());
    }

    @Test
    public void testSet() {
        List<Integer> list = new ArrayList<>();
        list.append(1);
        list.append(2);
        list.append(3);
        list.set(1, 4);
        assertEquals(3, list.size());
        assertEquals(1, list.get(0));
        assertEquals(4, list.get(1));
        assertEquals(3, list.get(2));
    }

    @Test
    public void testGet() {
        List<Integer> list = new ArrayList<>();
        list.append(1);
        list.append(2);
        list.append(3);
        assertEquals(1, list.get(0));
        assertEquals(2, list.get(1));
        assertEquals(3, list.get(2));
    }


    @Test
    public void testCopyOf() {
        ArrayList<Integer> list = new ArrayList<>();
        list.append(1);
        list.append(2);
        list.append(3);
        ArrayList<Integer> copy = ArrayList.copyOf(list);
        assertEquals(list.size(), copy.size());
        for (int i = 0; i < list.size(); i++) {
            assertEquals(list.get(i), copy.get(i));
        }
    }

    @Test
    public void testFromIterable() {
        java.util.List<Integer> iterable = java.util.Arrays.asList(1, 2, 3);
        ArrayList<Integer> list = ArrayList.from(iterable);
        assertEquals(3, list.size());
        assertEquals(1, list.get(0));
        assertEquals(2, list.get(1));
        assertEquals(3, list.get(2));
    }

    @Test
    public void testOf() {
        ArrayList<Integer> list = ArrayList.of(1, 2, 3);
        assertEquals(3, list.size());
        assertEquals(1, list.get(0));
        assertEquals(2, list.get(1));
        assertEquals(3, list.get(2));
    }

}
