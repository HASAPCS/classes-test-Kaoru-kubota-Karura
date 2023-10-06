package com.example;

public class Fruit {
    private String name;
    private String color;
    private String taste;
    private double weight;

    public Fruit(String name, String color, String taste, double weight) {
        this.name=name;
        this.color=color;
        this.taste=taste;
        this.weight=weight;
    }

    public String getName() {
        return this.name;
    }
    
    public String getColor() {
        return this.color;
    }

    public String getTaste() {
        return this.taste;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setName(String newname) {
        this.name=newname;
    }

    public void setColor(String newcolor) {
        this.color=newcolor;
    }

    public void setTaste(String newtaste) {
        this.taste=newtaste;
    }

    public void setWeight(double new_weight) {
        this.weight=new_weight;
    }

    // TODO: Implement getters, setters, and any other methods you find necessary
}