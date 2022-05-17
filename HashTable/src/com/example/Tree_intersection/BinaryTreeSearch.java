package com.example.Tree_intersection;

public class BinaryTreeSearch<T> extends BinaryTree {

    public void add(T value) {
        try {
            Node newNode = new Node(value);

            if (getRoot() == null) {
                setRoot(newNode);
                return;
            } else {
                Node current = getRoot();

                while (current != null) {
                    if ((int) current.data > (int) value) {
                        if (current.left == null) {
                            current.left = newNode;
                            return;
                        }
                        current = current.left;

                    } else {
                        if (current.right == null) {
                            current.right = newNode;
                            return;
                        }
                        current = current.right;
                    }
                }


            }
        } catch (Exception e) {

        }

    }


    public boolean Contains(T value) {
        try {
            Node current = getRoot();
            if (getRoot() == null) {
                return false;
            }

            while (current != null) {
                if (current.data == value) {
                    return true;
                } else if ((Integer) current.data > (Integer) value) {
                    if (current.left == null) {
                        return false;
                    }
                    current = current.left;

                } else {
                    if (current.right == null) {
                        return true;
                    }
                    current = current.right;
                }
            }

        } catch (Exception e) {

        }
        return false;

    }


}
