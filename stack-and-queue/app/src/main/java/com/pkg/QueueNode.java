package com.pkg;

public class QueueNode {

    private  String name;
    private  String number;
    private QueueNode next;

    public QueueNode(String name, String number) {
        this.name = name;
        this.number = number;
    }
    public QueueNode(String name) {
        this.name = name;

    }
    public void setNext(QueueNode next) {
        this.next = next;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public QueueNode getNext() {
        return next;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "QueueNode{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
    public String toStringName() {
        return "name";
    }
}
