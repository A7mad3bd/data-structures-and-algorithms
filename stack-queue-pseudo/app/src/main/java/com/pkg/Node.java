package com.pkg;

public class Node<T> {
private T value;
private Node next;

    public void Value(T value) {
        this.value = value;
    }

    public void Next(Node next) {
        this.next = next;
    }
}
