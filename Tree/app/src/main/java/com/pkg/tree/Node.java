package com.pkg.tree;

public class Node<T> {

    private  int data ;
    private Node <T> left;
    private Node <T> right;

    public Node(T key) {
        this.data = data;
        left = right = null;
    }

    public Node(int data, Node<T> left, Node<T> right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getdata() {
        return data;
    }

    public Node <T> getLeft() {
        return left;
    }

    public void setLeft(Node <T> left) {
        this.left = left;
    }

    public Node <T> getRight() {
        return right;
    }

    public void setRight(Node <T> right) {
        this.right = right;
    }

}