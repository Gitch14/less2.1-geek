package com.company;

public class Straus extends Animal implements Animal1{


    public Straus(float height, float weight, Colors color, String name) {
        super(height, weight, color, name);
    }



    @Override
    public void weight(int weight) {
        System.out.println(weight);
    }

    @Override
    public void feed () {
        eat(5);
    }


    @Override
    public void walk() {
        System.out.println("Страс ходит");
    }

    @Override
    public void run() {
        System.out.println("Страс бегает");
    }

}
