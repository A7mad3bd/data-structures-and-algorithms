package com.pkg.tree;

import java.util.*;

import java.util.ArrayList;


public class BinaryTree {

    public Node root;
    static ArrayList<Integer> values = new ArrayList<>();
    int maximumValue;

    public ArrayList<Integer> preOrderTraversal(){
        if (root == null){
            return null;
        }
        values = new ArrayList<>();
        preOrder(this.root);
        return values;
    }


    private void preOrder(Node node) {
        values.add(node.data);
        if (node.left != null){
            preOrder(node.left);
        }
        if (node.right != null){
            preOrder(node.right);
        }
    }

    public ArrayList inOrderTraversal(){
        if (root == null){
            return null;
        }
        values = new ArrayList<>();
        inOrder(this.root);
        return values;
    }


    private void inOrder(Node node) {
        if (node.left != null){
            inOrder(node.left);
        }
        values.add(node.data);
        if (node.right != null){
            inOrder(node.right);
        }
    }

    public ArrayList postOrderTraversal(){
        if (root == null){
            return null;
        }
        values = new ArrayList<>();
        postOrder(this.root);
        return values;
    }

    private void postOrder(Node node) {
        if (node.left != null){
            postOrder(node.left);
        }
        if (node.right != null){
            postOrder(node.right);
        }
        values.add(node.data);
    }

    public void findMaxValue() throws Exception {
        if (root == null) {throw new Exception();}

        int maxValue = root.data;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while(queue.size()!=0){
            Node node = queue.remove();
            if (node.data > maxValue){
                maxValue = node.data;
            }
            if (node.left != null){
                queue.remove(node.left);
            }
            if (node.right != null){
                queue.add(node.right);
            }
        }
        maximumValue = maxValue;
    }




    public int MaxBinarytree(Node node)
    {
        if (node == null)
            return 0;

        int nooddata =  node.data;
        int ld = MaxBinarytree(node.getLeft());
        int rd = MaxBinarytree(node.getRight());

        if (ld > nooddata)
            nooddata = ld;
        if (rd > nooddata)
            nooddata = rd;
        return nooddata;
    }


    public ArrayList breadthFirst(BinaryTree tree) {
        if (tree.root == null) {
            return null;
        }
        LinkedList<Node> allnodes = new LinkedList<>() ;
        ArrayList<Integer> breadthFirstnodes = new ArrayList<>();
        allnodes.add(tree.root);
        while (!allnodes.isEmpty()) {
            Node node = allnodes.remove();
            breadthFirstnodes.add(node.data);
            if (node.getLeft() != null) {
                allnodes.add(node.getLeft());
            }
            if (node.getRight() != null) {
                allnodes.add(node.getRight());
            }
        }
        return breadthFirstnodes;
    }

}

//
//    @Override
//    public String toString() {
//
//        return "BinaryTree{ " +
//                " root = " + root.getdata() +
//                " left = " + root.getLeft().getdata() +
//                " right = " + root.getRight().getdata() +
//                " }";
//    }

