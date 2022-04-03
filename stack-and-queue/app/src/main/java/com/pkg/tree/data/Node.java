package com.pkg.tree.data;

public abstract class Node<T extends Comparable<T>> implements Comparable<Node<T>> {

    private final T value;
    private Node<T> leftNode;
    private Node<T> rightNode;
    private Node<T> next;

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public Node(T data) {
        this.value = data;
    }

    public T getValue() {
        return value;
    }

    public Node<T> getLeftNode() {
        return leftNode;
    }

    public Node<T> getRightNode() {
        return rightNode;
    }

    public void setLeftNode(Node<T> leftNode) {
        this.leftNode = leftNode;
    }

    public void setRightNode(Node<T> rightNode) {
        this.rightNode = rightNode;
    }
}
