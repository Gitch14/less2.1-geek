package com.company;

public class Animal {


    public enum Colors{
        RED,
        BLACK,
        YELLOW,
        GREY,
        WHITE;
    }

    protected float height;
    protected float weight;
    protected Colors color;

    public float getHeight() {
        return height;
    }

    public float getWeight() {
        return weight;
    }

    public Colors getColor() {
        return color;
    }

    public void setColor(Colors color) {
        this.color = color;
    }


    protected String name;


    public Animal(float height, float weight, Colors color, String name) {
        this.height = height;
        this.weight = weight;
        this.color = color;
        this.name = name;

    }

    public void makeSound(){
        System.out.println("...");
    }


    public void move(){}

    public void eat(float food){
        weight+=food;
    }

    public void feed () {}

    public String toString ()
    {
        return "I am " + name +" (height:" + height +", weight: " + weight +", color:" + color +")";
    }
}
