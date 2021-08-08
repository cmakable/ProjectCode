package com.cmakable.helloworld;

import java.util.Scanner;

public class Multiplication {

    public static void main(String[] args) {

        int count = 16;
        Scanner timesTable = new Scanner(System.in);
        Scanner yourAnswer = new Scanner(System.in);

        System.out.println(" Which times table sould we use?");
        int tableNumber = timesTable.nextInt();

        for (int i = 1; i < count; i++) {

            while (count < 16)
                ;

            {
                System.out.println("what is " + tableNumber + " * " + i);
                int input = yourAnswer.nextInt();
                int answer = (i * tableNumber);

                if ((input) == (answer))
                    System.out.println("Correct!");

                else {
                    System.out.println("Wrong! try again");
                }

            }
        }
        timesTable.close();
        yourAnswer.close();
    }

}
