package com.pkg.tree.fizzBuzz;


import java.util.ArrayList;

public class KNode<T> {
    public T data;
    public KNode parent;
    ArrayList<KNode> children = new ArrayList<>();
    int kMaxChildren;


    public KNode(T data, int kMaxChildren) {
        this.data = data;
        this.kMaxChildren = kMaxChildren;
    }

    public void addChild(KNode childNode) {
        if (children.size() < kMaxChildren) {
            children.add(childNode);
        }
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public KNode getParent() {
        return parent;
    }

    public void setParent(KNode parent) {
        this.parent = parent;
    }

    public ArrayList<KNode> getChildren() {
        return children;
    }

    public void setChildren(ArrayList<KNode> children) {
        this.children = children;
    }

    public int getkMaxChildren() {
        return kMaxChildren;
    }

    public void setkMaxChildren(int kMaxChildren) {
        this.kMaxChildren = kMaxChildren;
    }
}