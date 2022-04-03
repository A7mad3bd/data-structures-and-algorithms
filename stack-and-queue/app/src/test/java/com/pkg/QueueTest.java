package com.pkg;

import com.pkg.Stack_queue_node.QueueNode;
import com.pkg.Stack_queue_node.Queuen;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class QueueTest {
    @Test
    @DisplayName("testStackPush")
    void testStackPush() {
        Queuen queuen = new Queuen();
        queuen.enqueue(new QueueNode("Jason", "555-555-555")); // first in
        queuen.enqueue(new QueueNode("Osaid", "666-666-666"));
        queuen.enqueue(new QueueNode("Roaa", "777-777-777"));
        queuen.peek();
        queuen.dequeue();
        queuen.isEmpty();
    }


    @Test
    public void addToQueuetest() {
        Queuen queuenTest = new Queuen();
        queuenTest.enqueue(new QueueNode("A", "1"));
        assertEquals("Queue{back=QueueNode{name='A', number='1'}, front=QueueNode{name='A', number='1'}, size=1}", queuenTest.toString());
    }

    @Test
    public void removeFromQueuetest() {

        Queuen queuenTest = new Queuen();
        queuenTest.enqueue(new QueueNode("A", "1"));
        assertEquals("Queue{back=QueueNode{name='A', number='1'}, front=QueueNode{name='A', number='1'}, size=1}", queuenTest.toString());
        queuenTest.dequeue();
        assertEquals("Queue{back=null, front=null, size=0}", queuenTest.toString());


    }

    @Test
    public void emptyQueuetest() {
        Queuen q1 = new Queuen();
        assertEquals(q1.isEmpty(), true);
        QueueNode expected1 = new QueueNode("A", "1");
        q1.enqueue(expected1);
        assertEquals(q1.isEmpty(), false);
    }

    @Test
    public void peekQueuetest() {
        Queuen q1 = new Queuen();
        assertEquals(q1.peek(), null);
        QueueNode expected1 = new QueueNode("A", "1");
        q1.enqueue(expected1);
        assertEquals(q1.peek(), q1.getFront());
    }
}
