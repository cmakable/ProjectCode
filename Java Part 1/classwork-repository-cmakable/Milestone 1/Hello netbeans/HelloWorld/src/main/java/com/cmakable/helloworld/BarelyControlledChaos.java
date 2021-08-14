package com.cmakable.helloworld;

import java.util.Random;

/* Questions:
how would i make this more efficient. i have multiple if statements that has similar functions.
*/

public class BarelyControlledChaos {
    public static void main(String[] args) {

        System.out.println("Once, when i was very small..");
        System.out.println("I was chased by a " + color() + ", " + weight() + "lb miniature " + animal() + " for over "
                + random() + " miles!!!");
        System.out.println("I had to hide in a field of over " + random() + " " + color() + " poppies for nearly "
                + random() + " hours until it left me alone");
        System.out.println("\nIT was QUITE the expereince" + " let me tell you!");

    }

    public static int random() {
        Random rng = new Random();
        int random = rng.nextInt(1000);
        return random;
    }

    public static int weight() {
        if (randomNum() == 0) {
            int weight = 100;
            return weight;
        } else if (randomNum() == 1) {
            int weight = 200;
            return weight;
        } else if (randomNum() == 2) {
            int weight = 300;
            return weight;
        } else {
            int weight = 400;
            return weight;
        }
    }

    public static String animal() {
        if (randomNum() == 0) {
            String animal = "bird";
            return animal;
        } else if (randomNum() == 1) {
            String animal = "dog";
            return animal;
        } else if (randomNum() == 2) {
            String animal = "whale";
            return animal;
        } else if (randomNum() == 3) {
            String animal = "cat";
            return animal;
        } else {
            String animal = null;
            return animal;
        }

    }

    public static String color() {
        if (randomNum() == 0) {
            String color = "red";
            return color;
        } else if (randomNum() == 1) {
            String color = "green";
            return color;
        } else if (randomNum() == 2) {
            String color = "blue";
            return color;
        } else {
            String color = "orange";
            return color;
        }

    }

    public static int randomNum() {
        Random rng = new Random();
        int randomNum = rng.nextInt(4);
        return randomNum;
    }

}
