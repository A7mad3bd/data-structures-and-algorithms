package com.pkg.psedoqueue;

import java.util.Stack;

public class pseudoqueue {
    Stack<String> First = new Stack<>();
    Stack<String> Secound = new Stack<>();

    public void dequeue() {
        if (First.isEmpty() && Secound.isEmpty()) {
            throw new IllegalArgumentException("empty queue");
        } else if (Secound.isEmpty()) {
            while (!First.isEmpty()) {
                String top = First.pop();
                Secound.push(top);
            }}}
    public void enqueue(String value) {
        this.First.push(value);
    }

    public Stack<String> getFirst() {
        return First;
    }

    public Stack<String> getSecound() {
        return Secound;
    }

    public String toString() {
        return " First=" + First +
                " Second=" + Secound;

    }
}

