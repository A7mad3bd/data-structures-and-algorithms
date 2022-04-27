package com.pkg.AnimalShelter;

import com.pkg.Stack_queue_node.Queuen;
import com.pkg.Stack_queue_node.QueueNode;

public class AnimalShelter {
    Queuen cats = new Queuen();
    Queuen dogs = new Queuen();
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

    public Queuen getCats() {
        return cats;
    }

    public void setCats(Queuen cats) {
        this.cats = cats;
    }

    public Queuen getDogs() {
        return dogs;
    }

    public void setDogs(Queuen dogs) {
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