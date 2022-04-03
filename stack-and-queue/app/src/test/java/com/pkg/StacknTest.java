package com.pkg;

import com.pkg.Stack_queue_node.Queuen;
import com.pkg.Stack_queue_node.StackNode;
import com.pkg.Stack_queue_node.Stackn;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StacknTest {
    Stackn stackn;

    @BeforeEach
    void setUp() {
        this.stackn = new Stackn();
        Stackn stackn = new Stackn();
        Queuen queuen = new Queuen();
    }


    @Test
    public void pushToStacktest() {
        Stackn stackn = new Stackn();
        StackNode expected1 = new StackNode("A", "1");
        stackn.push(expected1);
        System.out.println(stackn.toString());
        assertEquals("Stack{top=StackNode{name='A', number='1'}}", stackn.toString());
    }

    @Test
    public void popStacktest() {
        Stackn stackn1 = new Stackn();
        StackNode expected1 = new StackNode("A", "1");
        StackNode expected2 = new StackNode("B", "2");
        stackn1.push(expected1);
        stackn1.push(expected2);
        System.out.println(stackn1.toString());
        stackn1.pop();
        System.out.println(stackn1.toString());
        assertEquals("Stack{top=StackNode{name='A', number='1'}}", stackn1.toString());

    }

    @Test
    public void emptyStacktest() {
        Stackn stackn1 = new Stackn();
        assertEquals(stackn1.empty(), true);
        StackNode expected1 = new StackNode("A", "1");
        stackn1.push(expected1);
        assertEquals(stackn1.empty(), false);

    }

    @Test
    public void peekStacktest() {
        Stackn stackn1 = new Stackn();
        StackNode expected1 = new StackNode("A", "1");
        stackn1.push(expected1);
        assertEquals(stackn1.peek(), stackn1.getTop());
    }


}
