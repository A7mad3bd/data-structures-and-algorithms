package com.pkg;

import java.util.NoSuchElementException;

public class Queue {

    private static final int QUEUE_SIZE = 10;

    private QueueNode back;
    private QueueNode front;

    private int size;

    public Queue() { // default constructor
        size = 0;
    }

    public boolean add(QueueNode data) {
        if (isEmpty()) {
            front = data;
            back = data;
            size++;
            return true;
        } else {
            if (size < QUEUE_SIZE) {
                data.setNext(back);
                back = data;
                size++;
                return true;
            }
        }

        return false;
    }

    public QueueNode peek() {
        if (isEmpty()) {
            return null;
        } else {
            return front;
        }
    }

    public QueueNode remove() {
        QueueNode frontTemp;
        if (isEmpty()) {
            throw new NoSuchElementException("The queue is empty");
        } else {
            frontTemp = front; // stores the first node in the queue
            front = front.getNext(); // removes the first node
            size--;
            if (size == 0) {
                front = null;
                back = null;
            }
        }
        return frontTemp;
    }

    public QueueNode poll() {
        return null;
    }

    public QueueNode element() {
        return null;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public QueueNode getBack() {
        return back;
    }

    public QueueNode getFront() {
        return front;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Queue{" +
                "back=" + back +
                ", front=" + front +
                ", size=" + size +
                '}';
    }
}
