package com.example;

import java.util.ArrayList;

public class Basket {
    private static Object removeFruit;
    private int capacity;
    private ArrayList<Fruit> fruits;

    public Basket(int capacity) {
        // TODO: Initialize the attributes (and initialize the fruits list)
        this.capacity = capacity;
    }

    public void addFruit(Fruit fruit) {
        // TODO: Add the fruit to the basket IF THERE IS SPACE!
        double apple;
        double banana;
        apple = 0.2;
        banana = 0.3;
        if (capacity == 0){
            // remove the data
            Basket.remove(fruits);
        }
        else{
            capacity = capacity - 1;
        }
    }

    public void removeFruit(Fruit fruit) {
        // TODO: Remove the fruit from the basket
        Basket.remove(fruit.());
    }

    // TODO: Implement getters, setters, and any other methods you find necessary
}
