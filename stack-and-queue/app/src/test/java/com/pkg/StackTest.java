package com.pkg;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StackTest {
    Stack stack;

    @BeforeEach
    void setUp() {
        stack = new Stack();
        Stack stack = new Stack();
        Queue queue = new Queue();
    }


    @Test
    public void pushToStacktest() {
        Stack stack = new Stack();
        StackNode expected1 = new StackNode("A", "1");
        stack.push(expected1);
        System.out.println(stack.toString());
        assertEquals("Stack{top=StackNode{name='A', number='1'}}", stack.toString());
    }

    @Test
    public void popStacktest() {
        Stack stack1 = new Stack();
        StackNode expected1 = new StackNode("A", "1");
        StackNode expected2 = new StackNode("B", "2");
        stack1.push(expected1);
        stack1.push(expected2);
        System.out.println(stack1.toString());
        stack1.pop();
        System.out.println(stack1.toString());
        assertEquals("Stack{top=StackNode{name='A', number='1'}}", stack1.toString());

    }

    @Test
    public void emptyStacktest() {
        Stack stack1 = new Stack();
        assertEquals(stack1.empty(), true);
        StackNode expected1 = new StackNode("A", "1");
        stack1.push(expected1);
        assertEquals(stack1.empty(), false);

    }

    @Test
    public void peekStacktest() {
        Stack stack1 = new Stack();
        StackNode expected1 = new StackNode("A", "1");
        stack1.push(expected1);
        assertEquals(stack1.peek(), stack1.getTop());
    }


}
