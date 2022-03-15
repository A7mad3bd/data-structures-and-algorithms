package com.pkg;

import com.pkg.StackNode;

import java.util.EmptyStackException;

public class Stack {

    private StackNode top;

    public Stack() {
        top = null;
    }

    public boolean empty() {
        return top == null;
    }

    public StackNode push(StackNode stackNode) {
        if (empty()) {
            top = stackNode;
            return stackNode;
        } else {
            // make stack node point to what top is pointing to
            stackNode.setNext(top);
            // make top point to stack node
            top = stackNode;
            return stackNode;
        }
    }

    public StackNode pop() {
        StackNode fronttop = top; // stores the first node in the queue
        if (!empty()) {
            top = top.getNext();
            return fronttop;
        }
        return fronttop;
    }

    public StackNode peek() {
        if (empty()) {
            throw new EmptyStackException();
        }

        return top;
    }

    public StackNode getTop() {
        return top;
    }

    @Override
    public String toString() {
        return "Stack{" +
                "top=" + top +
                '}';
    }
}
