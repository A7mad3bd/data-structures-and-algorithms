package com.pkg.tree.structure;

import com.pkg.Queue;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree {
/*
Create a Binary Tree class
Define a method for each of the depth first traversals:
pre order
in order
post order which returns an array of the values, ordered appropriately.
* */
    private BTNode root;

    public BTNode getRoot() {
        return root;
    }

    public void setRoot(BTNode root) {
        this.root = root;
    }



    public BinaryTree() {
        root = null;
    }

    public  List<Integer> postOrderList = new ArrayList<>();
    public List<Integer> inOrderList = new ArrayList<>();
    public List<Integer> preOrderList = new ArrayList<>();


    public void postOrder(BTNode node){

        if(node == null){
            return;
        }

        // recur left
        postOrder(node.getLeft());

        // recur right
        postOrder(node.getRight());

        //  print the value
        System.out.print(node.getData() + " ");
        postOrderList.add(node.getData());
    }

    public void inOrder(BTNode node ){

        if(node == null){
            return;
        }

        inOrder(node.getLeft());

        System.out.print(node.getData()+" ");
        inOrderList.add(node.getData());

        inOrder(node.getRight());

    }

    public void preOrder(BTNode node){

        if(node == null){
            return;
        }

        System.out.print(node.getData() + " ");
        preOrderList.add(node.getData());

        preOrder(node.getLeft());

        preOrder(node.getRight());
    }


    @Override
    public String toString() {
        return "BinaryTree{" +
                "root=" + root +
                " left = " + root.getLeft().getData()+
                " right = " + root.getRight().getData()+
                ", postOrderList=" + postOrderList +
                ", inOrderList=" + inOrderList +
                ", preOrderList=" + preOrderList +
                '}';


    }

    public void levelOderTraversalLoop() throws Exception {
        if (root != null) {
            Queue<BTNode> queue = new Queue<>();
            queue.enqueue(root);
            BTNode node;
            while (!queue.isEmpty()) {
                node = queue.dequeue();
                System.out.print(node.getData() + " => ");
                if (node.getLeft() != null) {
                    queue.enqueue(node.getLeft());
                }

                if (node.getRight() != null) {
                    queue.enqueue(node.getRight());
                }
            }
        } else {
            System.out.println("Tree empty");
        }
    }

    public void levelOrderTraversalRecursive() {
        if (root != null) {
            Queue<BTNode> queue = new Queue<>();
            queue.enqueue(root);
            levelOrderTraversalRecursive(queue);
        } else {
            System.out.println("Tree is empty");
        }
    }

    private void levelOrderTraversalRecursive(Queue<BTNode> queue) {
        // implemnt this
    }

}
