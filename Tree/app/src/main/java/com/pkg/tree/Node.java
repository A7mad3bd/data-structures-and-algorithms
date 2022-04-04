package com.pkg.tree;

public class Node<T> {

    private  int data;
    public Node  left;
    public Node  right;

    public Node(int data) {
        this.data = data;
        left = right = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getKey() {
        return data;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node <T> right) {
        this.right = right;
    }

}