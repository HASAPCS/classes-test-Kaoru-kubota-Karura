package com.example;

import java.util.ArrayList;

public class Basket {
    private int capacity;
    private ArrayList<Fruit> fruitList;

    public Basket(int capacity) {
        this.capacity=capacity;
        fruitList= new ArrayList <Fruit>();
    }

    public int getCapacity() {
        return this.capacity;
    }

    public ArrayList<Fruit> getFruits() {
        return fruitList;
    }

    public void setCapacity(int newcapacity) {
        this.capacity=newcapacity;
    }

    public void setFruits(ArrayList<Fruit> newfruit) {
        this.fruitList=newfruit;
    }

    public void addFruit(Fruit fruit) {
        // TODO: Add the fruit to the basket IF THERE IS SPACE!
        if (fruitList.size()<this.capacity) {
            fruitList.add(fruit);
        }
    }

    public void removeFruit(Fruit fruit) {
        fruitList.remove(fruit);
    }

    // TODO: Implement getters, setters, and any other methods you find necessary
}