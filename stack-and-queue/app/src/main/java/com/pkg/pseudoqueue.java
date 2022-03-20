package com.pkg;

import java.util.Stack;

public class pseudoqueue {
    Stack<String> First = new Stack<>();
    Stack<String> Secound = new Stack<>();

    public void enqueue(String value) {
        this.First.push(value);
    }

    public void dequeue() {
        if (First.isEmpty() && Secound.isEmpty()) {
            throw new IllegalArgumentException("empty queue");
        } else if (Secound.isEmpty()) {
            while (!First.isEmpty()) {
                String top = First.pop();
                Secound.push(top);
            }
        }
    }

    public String toString() {
        return " First=" + First +
                " Second=" + Secound;

    }
}

