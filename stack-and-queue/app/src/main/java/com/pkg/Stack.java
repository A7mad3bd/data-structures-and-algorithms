package com.pkg;

public class Stack<T> {
    Node<T> top;
    int size;

    public int getSize() {
        return size;
    }

    public Node<T> getTop() {
        return top;
    }

    public void setTop(Node<T> top) {
        this.top = top;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void push(T data) {
        Node<T> n = new Node<>(data);
        if (top == null) {
            top = n;
        } else {
            Node<T> tempRef = top;
            top = n;
            top.next = tempRef;
        }
        size++;
    }


    public T pop() {
        if (top == null) {
            return null;
        }

        Node<T> tempRef = top;
        top = top.next;
        tempRef.next = null;
        size--;
        return tempRef.value;
    }

    public T peek() throws Exception {
        if (top == null) {
            throw new Exception("Stack is empty");
        }

        return top.value;
    }

    public boolean isEmpty() {
        return top == null;
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "Stack is empty";
        } else {

            Node<T> temp = top;
            String tostring = "Top -> ";
            while (temp.next != null) {
                tostring = tostring + "{" + temp.value + "} -> ";
                temp = temp.next;
            }
            tostring += "{" + temp.value + "} -> null";
            return "Stack{" +
                    "top=" + top +
                    ", size=" + size +
                    '}' + tostring;
        }
    }


//    }
}