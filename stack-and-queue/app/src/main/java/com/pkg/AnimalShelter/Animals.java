package com.pkg.AnimalShelter;

public class Animals {
    private String name;

    @Override
    public String toString() {
        return "Animals{" +
                "name='" + name + '\'' +
                '}';
    }

    public Animals() {
    }
    public Animals(String name) {
        this.name = name;
    }

}