package com.cmakable.helloworld;

import java.util.Scanner;

public class timestable {
    public static void main(String[] args) {

        int count = 16;
        Scanner timesTable = new Scanner(System.in);

        System.out.println(" Which times table sould we use?");
        int tableNumber = timesTable.nextInt();

        for (int i = 0; i < count; i++) {
            System.out.println(i + " * " + tableNumber + " is:" + i * tableNumber);

        }
        timesTable.close();
    }

}
