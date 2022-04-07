package com.pkg.tree;

public class BinaryTreeSearch extends BinaryTree{


    public void add(Node inputdata){
        if (root == null) {
            root = inputdata;
        } else {
            boolean flag = true;
            Node n1 = root;
            while (flag){
                if (inputdata.data > n1.data){
                    if(n1.right != null){
                        n1 = n1.right;
                    } else {
                        n1.setRight(inputdata);
                        flag = false;
                    }
                }
                if (inputdata.data < n1.data){
                    if (n1.left != null){
                        n1 = n1.left;
                    } else {
                        n1.setLeft(inputdata);
                        flag = false;
                    }}}}}


    public boolean ifcontains(int data) {
        while (root != null) {
            if (data > root.getData())
                root = root.getRight();
            else if (data < root.getData())
                root = root.getLeft();
            else
                return true;
        }
        return false;
    }

}
