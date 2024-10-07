package org.uma.ed.dataestructures.stack;
import org.junit.jupiter.api.Test;
import org.uma.ed.dataestructure.stack.ArrayStack;
import org.uma.ed.dataestructure.stack.EmptyStackException;
import static org.junit.jupiter.api.Assertions.*;

class ArrayStackTest {

        @Test
        public void testPushAndTop() {
            ArrayStack<Integer> stack = new ArrayStack<>();
            stack.push(1);
            stack.push(2);
            stack.push(3);
            assertEquals(3, stack.top());
        }

        @Test
        public void testPop() {
            ArrayStack<Integer> stack = new ArrayStack<>();
            stack.push(1);
            stack.push(2);
            stack.push(3);
            assertEquals(3, stack.top());
            stack.pop();
            assertEquals(2, stack.top());
            stack.pop();
            assertEquals(1, stack.top());
            stack.pop();
            assertTrue(stack.isEmpty());
        }

        @Test
        public void testIsEmpty() {
            ArrayStack<Integer> stack = new ArrayStack<>();
            assertTrue(stack.isEmpty());
            stack.push(1);
            assertFalse(stack.isEmpty());
        }

        @Test
        public void testSize() {
            ArrayStack<Integer> stack = new ArrayStack<>();
            assertEquals(0, stack.size());
            stack.push(1);
            assertEquals(1, stack.size());
            stack.push(2);
            assertEquals(2, stack.size());
            stack.pop();
            assertEquals(1, stack.size());
        }

        @Test
        public void testClear() {
            ArrayStack<Integer> stack = new ArrayStack<>();
            stack.push(1);
            stack.push(2);
            stack.push(3);
            assertFalse(stack.isEmpty());
            stack.clear();
            assertTrue(stack.isEmpty());
        }

        @Test
        public void testTopOnEmptyStack() {
            ArrayStack<Integer> stack = new ArrayStack<>();
            assertThrows(EmptyStackException.class, stack::top);
        }

        @Test
        public void testPopOnEmptyStack() {
            ArrayStack<Integer> stack = new ArrayStack<>();
            assertThrows(EmptyStackException.class, stack::pop);
        }

        @Test
        public void testCopyOf() {
            ArrayStack<Integer> stack = new ArrayStack<>();
            stack.push(1);
            stack.push(2);
            stack.push(3);
            ArrayStack<Integer> copy = ArrayStack.copyOf(stack);
            assertEquals(3, copy.size());
            assertEquals(3, copy.top());
            copy.pop();
            assertEquals(2, copy.top());
            assertEquals(3, stack.top()); // original stack should remain unchanged
        }

        @Test
        public void testFromIterable() {
            java.util.List<Integer> list = java.util.Arrays.asList(1, 2, 3);
            ArrayStack<Integer> stack = ArrayStack.from(list);
            assertEquals(3, stack.size());
            assertEquals(3, stack.top());
        }

        @Test
        public void testOf() {
            ArrayStack<Integer> stack = ArrayStack.of(1, 2, 3);
            assertEquals(3, stack.size());
            assertEquals(3, stack.top());
        }
    }

