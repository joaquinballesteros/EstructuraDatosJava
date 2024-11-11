package org.uma.ed.dataestructures.searchtree;

import org.uma.ed.dataestructure.searchtree.BST;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Comparator;
import static org.junit.jupiter.api.Assertions.*;

public class BSTTest {
    private BST<Integer> bst;

    @BeforeEach
    public void setUp() {
        bst = BST.empty();
    }

    @Test
    public void testInsertAndSearch() {
        bst.insert(5);
        bst.insert(3);
        bst.insert(7);

        assertEquals(5, bst.search(5));
        assertEquals(3, bst.search(3));
        assertEquals(7, bst.search(7));
        assertNull(bst.search(10));
    }

    @Test
    public void testDelete() {
        bst.insert(5);
        bst.insert(3);
        bst.insert(7);

        bst.delete(3);
        assertNull(bst.search(3));
        assertEquals(5, bst.search(5));
        assertEquals(7, bst.search(7));

        bst.delete(5);
        assertNull(bst.search(5));
        assertEquals(7, bst.search(7));
    }

    @Test
    public void testMinimum() {
        bst.insert(5);
        bst.insert(3);
        bst.insert(7);

        assertEquals(3, bst.minimum());
    }

    @Test
    public void testMaximum() {
        bst.insert(5);
        bst.insert(3);
        bst.insert(7);

        assertEquals(7, bst.maximum());
    }

    @Test
    public void testIsEmpty() {
        assertTrue(bst.isEmpty());

        bst.insert(5);
        assertFalse(bst.isEmpty());
    }

    @Test
    public void testSize() {
        assertEquals(0, bst.size());

        bst.insert(5);
        assertEquals(1, bst.size());

        bst.insert(3);
        assertEquals(2, bst.size());
    }

    @Test
    public void testHeight() {
        assertEquals(0, bst.height());

        bst.insert(5);
        assertEquals(1, bst.height());

        bst.insert(3);
        bst.insert(7);
        assertEquals(2, bst.height());
    }

    @Test
    public void testInOrderTraversal() {
        bst.insert(5);
        bst.insert(3);
        bst.insert(7);

        Iterable<Integer> inOrder = bst.inOrder();
        Integer[] expected = { 3, 5, 7 };
        int i = 0;
        for (Integer key : inOrder) {
            assertEquals(expected[i++], key);
        }
    }

    @Test
    public void testPreOrderTraversal() {
        bst.insert(5);
        bst.insert(3);
        bst.insert(7);

        Iterable<Integer> preOrder = bst.preOrder();
        Integer[] expected = { 5, 3, 7 };
        int i = 0;
        for (Integer key : preOrder) {
            assertEquals(expected[i++], key);
        }
    }

    @Test
    public void testPostOrderTraversal() {
        bst.insert(5);
        bst.insert(3);
        bst.insert(7);

        Iterable<Integer> postOrder = bst.postOrder();
        Integer[] expected = { 3, 7, 5 };
        int i = 0;
        for (Integer key : postOrder) {
            assertEquals(expected[i++], key);
        }
    }

    @Test
    public void testDeleteMinimum() {
        bst.insert(5);
        bst.insert(3);
        bst.insert(7);

        bst.deleteMinimum();
        assertNull(bst.search(3));
        assertEquals(5, bst.minimum());
    }

    @Test
    public void testDeleteMaximum() {
        bst.insert(5);
        bst.insert(3);
        bst.insert(7);

        bst.deleteMaximum();
        assertNull(bst.search(7));
        assertEquals(5, bst.maximum());
    }
}
