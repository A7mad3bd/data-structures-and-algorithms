package com.pkg.tree;

import java.util.ArrayList;
import java.util.LinkedList;
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
        System.out.print(node.getdata() + " ");
        postOrderList.add(node.getdata());
    }

    public void inOrder(Node node) {

        if (node == null) {
            return;
        }

        inOrder(node.getLeft());

        System.out.print(node.getdata() + " ");
        inOrderList.add(node.getdata());

        inOrder(node.getRight());

    }

    public void preOrder(Node node) {

        if (node == null) {
            return;
        }

        System.out.print(node.getdata() + " ");
        preOrderList.add(node.getdata());

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


    public int MaxBinarytree(Node node)
    {
        if (node == null)
            return 0;

        int nooddata =  node.getdata();
        int ld = MaxBinarytree(node.getLeft());
        int rd = MaxBinarytree(node.getRight());

        if (ld > nooddata)
            nooddata = ld;
        if (rd > nooddata)
            nooddata = rd;
        return nooddata;
    }

    public ArrayList breadthFirst(BinaryTree tree) {
        if (tree.getRoot() == null) {
            return null;
        }
        LinkedList<Node> allnodes = new LinkedList<>() ;
        ArrayList<Integer> breadthFirstnodes = new ArrayList<>();
        allnodes.add(tree.getRoot());
        while (!allnodes.isEmpty()) {
            Node node = allnodes.remove();
            breadthFirstnodes.add(node.getdata());
            if (node.getLeft() != null) {
                allnodes.add(node.getLeft());
            }
            if (node.getRight() != null) {
                allnodes.add(node.getRight());
            }
        }
        return breadthFirstnodes;
    }

    @Override
    public String toString() {

        return "BinaryTree{ " +
                " root = " + root.getdata() +
                " left = " + root.getLeft().getdata() +
                " right = " + root.getRight().getdata() +
                " }";
    }

}