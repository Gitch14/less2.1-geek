package com.company;

public class Swam extends Animal {


    public Swam(float height, float weight, Colors color, String name) {
        super(height, weight, color, name);
    }

    public void makeSound() {
        System.out.println("ssssssssss");
    }

    public void move() {
        System.out.println("Летает");
    }

    public void feed () {
        eat(0.3f);
    }
}


