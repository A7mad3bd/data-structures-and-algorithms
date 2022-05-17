package com.example.Tree_intersection;

public class Node<T> {
    T data;
    Node right;
    Node left;

    public Node(T data) {
        this.data = data;
        this.right = null;
        this.left = null;
    }


    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }}