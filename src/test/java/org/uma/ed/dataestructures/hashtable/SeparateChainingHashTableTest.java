package org.uma.ed.dataestructures.hashtable;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.uma.ed.dataestructure.hashtable.SeparateChainingHashTable;

import java.util.Iterator;
import java.util.NoSuchElementException;
import static org.junit.jupiter.api.Assertions.*;




    public class SeparateChainingHashTableTest {
        private SeparateChainingHashTable<String> table;

        @BeforeEach
        public void setUp() {
            table = new SeparateChainingHashTable<>();
        }

        @Test
        public void testIsEmpty() {
            assertTrue(table.isEmpty());
            table.insert("key1");
            assertFalse(table.isEmpty());
        }

        @Test
        public void testSize() {
            assertEquals(0, table.size());
            table.insert("key1");
            assertEquals(1, table.size());
            table.insert("key2");
            assertEquals(2, table.size());
            table.insert("key2"); //Duplicado, debe actualiar, no volver a insertar.
            assertEquals(2, table.size());
        }

        @Test
        public void testInsert() {
            table.insert("key1");
            assertTrue(table.contains("key1"));
            table.insert("key2");
            assertTrue(table.contains("key2"));
        }

        @Test
        public void testSearch() {
            table.insert("key1");
            assertEquals("key1", table.search("key1"));
            assertNull(table.search("key2"));
        }

        @Test
        public void testContains() {
            table.insert("key1");
            assertTrue(table.contains("key1"));
            assertFalse(table.contains("key2"));
        }

        @Test
        public void testDelete() {
            table.insert("key1");
            table.delete("key1");
            assertFalse(table.contains("key1"));
        }

        @Test
        public void testClear() {
            table.insert("key1");
            table.insert("key2");
            table.clear();
            assertTrue(table.isEmpty());
        }

        @Test
        public void testIterator() {
            table.insert("key1");
            table.insert("key2");
            Iterator<String> iterator = table.iterator();
            assertTrue(iterator.hasNext());
            assertNotNull(iterator.next());
            assertTrue(iterator.hasNext());
            assertNotNull(iterator.next());
            assertFalse(iterator.hasNext());
        }

        @Test
        public void testIteratorNoSuchElementException() {
            Iterator<String> iterator = table.iterator();
            assertThrows(NoSuchElementException.class, iterator::next);
        }

        @Test
        public void testCopyOf() {
            table.insert("key1");
            table.insert("key2");

            SeparateChainingHashTable<String> copy = SeparateChainingHashTable.copyOf(table);
            assertTrue(copy.contains("key1"));
            assertTrue(copy.contains("key2"));
            assertEquals(table.size(), copy.size());
        }
    }
