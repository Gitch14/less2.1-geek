package com.company;

public class Line extends Animal {

    public Line(float height, float weight, Colors color, String name) {
        super(height, weight, color, name);
    }

    public void makeSound(){
        System.out.println("G-R-R-R!!!");
    }

    public void feed () {
        eat(7);
    }


}
