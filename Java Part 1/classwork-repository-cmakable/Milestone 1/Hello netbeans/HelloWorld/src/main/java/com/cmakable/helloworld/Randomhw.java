package com.cmakable.helloworld;

import java.util.Random;

public class Randomhw {
    public static void main(String[] args) {
        Random rng = new Random();
        System.out.println("Random can make integers: " + rng.nextInt() + "\nor a double:" + rng.nextDouble()
                + "\nor even a boolean:" + rng.nextBoolean());

        int num = rng.nextInt(100);

        System.out.println("You can store a randomized result:" + num + "and use it over and over again:" + num + ","
                + num + "\nor just keep generating new values");

    }
}
