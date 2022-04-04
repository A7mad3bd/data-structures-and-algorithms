package com.pkg.tree;

public class BinaryTreeSearch {

    Node root;


    public BinaryTreeSearch() {
        root = null;
    }

    public void add(int key) {

        if (root == null) {
            root = new Node(key);
        } else {
            Node current = root;
            traverse(current, key);
        }
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    private void traverse(Node current, int key) {

        if (key > current.getKey()) {
            if (current.getRight() == null) {
                current.setRight(new Node(key));
                return;
            }

            current = current.getRight();
        } else {
            if (current.getLeft() == null) {
                current.setLeft(new Node(key));
                return;
            }
            current = current.getLeft();
        }
        traverse(current, key);
    }

    public void inorder() {
        inorderRec(root);
    }

    public void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.getLeft());
            System.out.println(root.getKey());
            inorderRec(root.getRight());
        }
    }

    public boolean ifcontains(int key) {
        while (root != null) {
            if (key > root.getKey())
                root = root.getRight();
            else if (key < root.getKey())
                root = root.getLeft();
            else
                return true;
        }
        return false;
    }


    public int MaxBinarytree(Node node)
    {

        if (node == null)
            return 0;

        int nooddata = node.getData();
        int ld = MaxBinarytree(node.getLeft());
        int rd = MaxBinarytree(node.getRight());

        if (ld > nooddata)
            nooddata = ld;
        if (rd > nooddata)
            nooddata = rd;
        return nooddata;
    }
}
