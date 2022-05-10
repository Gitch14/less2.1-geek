package com.company;

public class Elephant extends Animal{

    public Elephant(float height, float weight, Colors color, String name) {
        super(height, weight, color, name);
    }

    public void makeSound(){
        System.out.println("E-U-U-M!!!");
    }

    public void feed () {
        eat(10);
    }
}
