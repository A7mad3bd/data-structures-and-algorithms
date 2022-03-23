package com.pkg.AnimalShelter;

import com.pkg.Queue;
import com.pkg.QueueNode;

public class AnimalShelter {
    Queue cats = new Queue();
    Queue dogs = new Queue();
    QueueNode cat;
    QueueNode dog;

    public AnimalShelter() {

    }

    public void enqueue(String animal) {
        try {
            if (animal == "cat") {
                cat = new QueueNode("cat");
                cats.enqueue(cat);
            }
            if (animal == "dog") {
                dog = new QueueNode("dog");
                dogs.enqueue(dog);
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public void dequeue(String pref) {
        try {
            if (pref == "cat") {
                if (!cats.isEmpty())
                     cats.dequeue();
            } else if (pref == "dog") {
                if (!dogs.isEmpty())
                     dogs.dequeue();
            }
        } catch (NullPointerException ex) {
            System.out.println(ex);
        }
    }

    public Queue getCats() {
        return cats;
    }

    public void setCats(Queue cats) {
        this.cats = cats;
    }

    public Queue getDogs() {
        return dogs;
    }

    public void setDogs(Queue dogs) {
        this.dogs = dogs;
    }

    @Override
    public String toString() {
        return "Animal Shelter => { " +
                "cats = " + cats + " " +
                ", dogs = " + dogs + " " +
                '}';
    }
}