package com.cmakable.helloworld;

import java.util.Scanner;

public class countdown {
    public static void main(String[] args) {

        Scanner count = new Scanner(System.in);

        System.out.println("what number should i count from?");
        int num = count.nextInt();
        final int tenPerLine = 10;
        System.out.println("Here goes!");

        while (num > 0) {

            System.out.print(--num + 1 + " ");
            if (num % tenPerLine == 0) {
                System.out.println();

            }

        }
        count.close();
    }
}
