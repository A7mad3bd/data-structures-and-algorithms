package com.pkg;


public class Queue<T> {
    private Node<T> front;
    private Node<T> back;
    private int size = 0;

    public int getSize() {
        return size;
    }

    public void enqueue(T value) {
        Node<T> node = new Node<>(value);
        if (isEmpty()) {
            front = node;
        } else {
            back.next = node;
        }
        back = node;
        size++;
    }

    public T dequeue() throws Exception {
        if (front == null) {
            throw new Exception("queue is empty!");
        }
        Node<T> tempRef = front;
        front = front.next;
        tempRef.next = null;
        size--;
        return tempRef.value;

    }

    public T peek() throws Exception {
        if (front == null) {
            throw new Exception("queue is empty!");
        }

        return front.value;
    }

    public boolean isEmpty() {
        return front == null;
    }

    @Override
    public String toString() {
        return "Queue{" +
                "front=" + front +
                ", back=" + back +
                ", size=" + size +
                '}';
    }
}