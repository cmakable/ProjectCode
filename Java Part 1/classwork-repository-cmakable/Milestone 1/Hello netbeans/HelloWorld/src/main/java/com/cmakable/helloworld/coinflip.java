package com.cmakable.helloworld;

import java.util.Random;

public class coinflip {
    public static void main(String[] args) {
        Random coinflip = new Random();

        boolean flip = coinflip.nextBoolean();

        if (flip == true) {
            System.out.println(" You flipped heads!");
        } else {
            System.out.println(" You flipped tails!");
        }

    }
}
