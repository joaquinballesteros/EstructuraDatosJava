package org.uma.ed.demos.stack;

import org.uma.ed.dataestructure.stack.ArrayStack;
import org.uma.ed.dataestructure.stack.LinkedStack;
import org.uma.ed.dataestructure.stack.Stack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ArrayStackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack1 = ArrayStack.empty();
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);
        stack1.push(4);

        int e1 = stack1.top();
        System.out.println(e1);

        stack1.pop();
        System.out.println(stack1);

        Stack<Integer> stack2 = ArrayStack.empty();
        stack2.push(1);
        stack2.push(2);
        stack2.push(3);

        System.out.println(stack2);


        Stack<Integer> stack3 = ArrayStack.of(1, 2, 3);
        System.out.println(stack3);

        Stack<Integer> copyStk3 = ArrayStack.copyOf(stack3);

        System.out.println(copyStk3);

        System.out.println(stack1.equals(stack2));
        System.out.println(stack1.equals(stack3));
        System.out.println(stack2.equals(stack3));

    }
}
