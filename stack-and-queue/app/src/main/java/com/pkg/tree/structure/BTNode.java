package com.pkg.tree.structure;

public class BTNode <T> implements Comparable<BTNode> {

    private int data;

    private BTNode <T> left;
    private BTNode <T> right;

    public BTNode(int i) {
        this.data=getData();
        this.left=getLeft();
        this.right=getRight();
    }


    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public BTNode<T> getLeft() {
        return left;
    }

    public void setLeft(BTNode<T> left) {
        this.left = left;
    }

    public BTNode<T> getRight() {
        return right;
    }

    public void setRight(BTNode<T> right) {
        this.right = right;
    }

    @Override
    public int compareTo(BTNode o) {
        return 0;
    }
}
