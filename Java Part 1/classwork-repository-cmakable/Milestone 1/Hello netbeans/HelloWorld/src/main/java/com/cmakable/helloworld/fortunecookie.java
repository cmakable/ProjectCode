package com.cmakable.helloworld;

import java.util.Random;

public class fortunecookie {
    public static void main(String[] args) {
        Random rng = new Random();
        int n = rng.nextInt(3);

        switch (n) {
            case 0:
                System.out.println("Those aren't the droids you're looking for.");
                break;
            case 1:
                System.out.println("Never go in against a Sicilian when death is on the line!");
                break;
            case 2:
                System.out.println("Goonies never say die.");
                break;
        }

    }
}
