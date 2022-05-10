package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	System.out.println("Добро пожаловать в зоопарк!\n");

        ArrayList<Animal> animals = new ArrayList();
    int counter = 0;
    for (int i = 0;i < 4; i++){
        animals.add(new Line(2,50, Animal.Colors.YELLOW,"Line"));
        animals.add(new Girrafe(10,100, Animal.Colors.YELLOW,"Girrafe"));
        animals.add(new Swam(0.3f,5, Animal.Colors.YELLOW,"Swam"));
        animals.add(new Elephant(5,150, Animal.Colors.YELLOW,"Elephant"));
        }


        for (Animal a:animals){
            a.feed();
            System.out.println(a);
        }

        Straus straus = new Straus(1.3f,25.3f, Animal.Colors.BLACK,"Kesha");
        System.out.println(straus);
        straus.feed();
        System.out.println(straus.weight);





    }
}
