package com.cmakable.helloworld;

import java.util.Scanner;

public class factorizer {
    public static void main(String[] args) {
        int count = 0;
        int perfect = 0;
        // ------------------ ask for input
        // ------------------------------------------------
        System.out.println("What number would you like to factor? ");
        int userInput = num();
        System.out.println("The factors of " + userInput + " are:");

        // ------------------loop input-----------------------------

        for (int i = 1; i <= userInput; i++) {
            if (userInput % i == 0) {
                count++;
                perfect = (perfect + i);
                System.out.print(i + " ");

            }
        }

        // ---------------outside of the
        // loop------------------------------------------------
        System.out.println();
        System.out.println(userInput + " has " + (count) + " factors");

        if (perfect - userInput == 0) {
            System.out.println("This is a Perfect Number");
        }

        if (perfect - userInput != userInput) {
            System.out.println("This is not a Perfect Number");
        }
        if (count == 2) {
            System.out.println("This is a Prime Number");
        }
        if (count != 2) {
            System.out.println("This is not a Prime Number");
        }

    }

    // -------------------------Section for Methods--------------------------------
    public static int num() {
        Scanner scanInput = new Scanner(System.in);
        int scanNum = scanInput.nextInt();
        return (scanNum);
    }

    // -------------------------Question-----------------------------is this even
    // right or logical?

    // public static int count(int factor){
    // for (int i = 1; i <= num(); i++)
    // if (num() % i == 0){
    // factor=i;
    // }
    // return factor;
    // }
}
