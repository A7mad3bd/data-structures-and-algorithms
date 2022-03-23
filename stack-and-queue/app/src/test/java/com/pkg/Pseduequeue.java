package com.pkg;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Pseduequeue {
    @Test
    void testEnqueue() throws Exception {
        com.pkg.pseudoqueue test = new com.pkg.pseudoqueue();
        test.enqueue("A");
        assertEquals("[A]", test.First.toString());
    }

    @Test
    void testEnqueues() throws Exception {
        com.pkg.pseudoqueue test = new com.pkg.pseudoqueue();
        test.enqueue("A");
        test.enqueue("B");
        test.enqueue("C");
        assertEquals(" First=[A, B, C] Second=[]", test.toString());
    }

    @Test
    void EnqueueFIFObypeek() throws Exception {
        com.pkg.pseudoqueue test = new com.pkg.pseudoqueue();
        test.enqueue("A");
        test.enqueue("B");
        test.enqueue("C");
        assertEquals(test.First.peek(), "C");
    }

    @Test
    void testDequeue() throws Exception {
        com.pkg.pseudoqueue test = new com.pkg.pseudoqueue();
        test.enqueue("A");
        test.enqueue("B");
        test.enqueue("C");
        test.dequeue();
        assertEquals(test.Secound.peek(), "A");
    }

    @Test
    void testDequeue_S() throws Exception {
        com.pkg.pseudoqueue test = new com.pkg.pseudoqueue();
        test.enqueue("A");
        test.enqueue("B");
        test.enqueue("C");
        test.dequeue();
        test.dequeue();
        test.dequeue();
        assertEquals(test.Secound.toString(), "[C, B, A]");
    }

}
