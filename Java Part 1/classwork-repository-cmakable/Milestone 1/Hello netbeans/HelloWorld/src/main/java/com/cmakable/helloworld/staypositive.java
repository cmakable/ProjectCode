package com.cmakable.helloworld;

public class staypositive {
    public static void main(String[] args) {

        int starting = 10;
        final int finish = -1;
        System.out.println("Counting down");

        while (starting != finish) {
            System.out.println(starting);
            starting--;
        }
        System.out.println("Blast off!");
    }

}
