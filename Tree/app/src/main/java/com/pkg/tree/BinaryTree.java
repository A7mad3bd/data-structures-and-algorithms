package com.pkg.tree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree {

    Node root;



    public BinaryTree() {
        root = null;
    }

    List<Integer> postOrderList = new ArrayList<>();
    List<Integer> inOrderList = new ArrayList<>();
    List<Integer> preOrderList = new ArrayList<>();


    public void postOrder(Node node) {

        if (node == null) {
            return;
        }

        postOrder(node.getLeft());
        postOrder(node.getRight());
        System.out.print(node.getKey() + " ");
        postOrderList.add(node.getKey());
    }

    public void inOrder(Node node) {

        if (node == null) {
            return;
        }

        inOrder(node.getLeft());

        System.out.print(node.getKey() + " ");
        inOrderList.add(node.getKey());

        inOrder(node.getRight());

    }

    public void preOrder(Node node) {

        if (node == null) {
            return;
        }

        System.out.print(node.getKey() + " ");
        preOrderList.add(node.getKey());

        preOrder(node.getLeft());

        preOrder(node.getRight());
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }
    public List<Integer> getPostOrderList() {
        return postOrderList;
    }

    public void setPostOrderList(List<Integer> postOrderList) {
        this.postOrderList = postOrderList;
    }

    public List<Integer> getInOrderList() {
        return inOrderList;
    }

    public void setInOrderList(List<Integer> inOrderList) {
        this.inOrderList = inOrderList;
    }

    public List<Integer> getPreOrderList() {
        return preOrderList;
    }

    public void setPreOrderList(List<Integer> preOrderList) {
        this.preOrderList = preOrderList;
    }
    @Override
    public String toString() {

        return "BinaryTree{ " +
                " root = " + root.getKey() +
                " left = " + root.getLeft().getKey() +
                " right = " + root.getRight().getKey() +
                " }";
    }

}