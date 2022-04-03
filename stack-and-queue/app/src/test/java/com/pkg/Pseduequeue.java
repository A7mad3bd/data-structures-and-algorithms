package com.pkg;

import com.pkg.psedoqueue.pseudoqueue;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Pseduequeue {
    @Test
    void testEnqueue() throws Exception {
        pseudoqueue test = new pseudoqueue();
        test.enqueue("A");
        assertEquals("[A]", test.getFirst().toString());
    }

    @Test
    void testDequeue() throws Exception {
        pseudoqueue test = new pseudoqueue();
        test.enqueue("A");
        test.enqueue("B");
        test.enqueue("C");
        test.dequeue();
        assertEquals(test.getSecound().peek(), "A");
    }
    @Test
    void testEnqueues() throws Exception {
        pseudoqueue test = new pseudoqueue();
        test.enqueue("A");
        test.enqueue("B");
        test.enqueue("C");
        assertEquals(" First=[A, B, C] Second=[]", test.toString());
    }

    @Test
    void testDequeue_S() throws Exception {
        pseudoqueue test = new pseudoqueue();
        test.enqueue("A");
        test.enqueue("B");
        test.enqueue("C");
        test.dequeue();
        test.dequeue();
        test.dequeue();
        assertEquals(test.getSecound().toString(), "[C, B, A]");
    }
    @Test
    void EnqueueFIFObypeek() throws Exception {
        pseudoqueue test = new pseudoqueue();
        test.enqueue("A");
        test.enqueue("B");
        test.enqueue("C");
        assertEquals(test.getFirst().peek(), "C");
    }




}
