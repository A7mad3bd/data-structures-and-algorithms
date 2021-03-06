package com.pkg;


public class Node<T> {
    Node<T> next;
    T value;

    public Node(T value){
        this.value = value;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node() {

    }
}