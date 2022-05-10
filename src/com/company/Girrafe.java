package com.company;

public class Girrafe extends Animal{


    public Girrafe(float height, float weight, Colors color, String name) {
        super(height, weight, color, name);
    }

    public void makeSound()
    {
        System.out.println ("pheeew pheew");
    }
    public void feed () {
        eat(3);
    }

}
