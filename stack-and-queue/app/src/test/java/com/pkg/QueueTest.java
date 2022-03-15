package com.pkg;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class QueueTest {
    @Test
    @DisplayName("testStackPush")
    void testStackPush() {
        Queue queue = new Queue();
        queue.add(new QueueNode("Jason", "555-555-555")); // first in
        queue.add(new QueueNode("Osaid", "666-666-666"));
        queue.add(new QueueNode("Roaa", "777-777-777"));
        queue.peek();
        queue.remove();
        queue.isEmpty();
    }


    @Test
    public void addToQueuetest() {
        Queue queueTest = new Queue();
        queueTest.add(new QueueNode("A", "1"));
        assertEquals("Queue{back=QueueNode{name='A', number='1'}, front=QueueNode{name='A', number='1'}, size=1}", queueTest.toString());
    }

    @Test
    public void removeFromQueuetest() {

        Queue queueTest = new Queue();
        queueTest.add(new QueueNode("A", "1"));
        assertEquals("Queue{back=QueueNode{name='A', number='1'}, front=QueueNode{name='A', number='1'}, size=1}", queueTest.toString());
        queueTest.remove();
        assertEquals("Queue{back=null, front=null, size=0}", queueTest.toString());


    }

    @Test
    public void emptyQueuetest() {
        Queue q1 = new Queue();
        assertEquals(q1.isEmpty(), true);
        QueueNode expected1 = new QueueNode("A", "1");
        q1.add(expected1);
        assertEquals(q1.isEmpty(), false);
    }

    @Test
    public void peekQueuetest() {
        Queue q1 = new Queue();
        assertEquals(q1.peek(), null);
        QueueNode expected1 = new QueueNode("A", "1");
        q1.add(expected1);
        assertEquals(q1.peek(), q1.getFront());
    }
}
