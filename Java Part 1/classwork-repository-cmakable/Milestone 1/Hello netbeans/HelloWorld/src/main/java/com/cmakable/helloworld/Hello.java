package com.cmakable.helloworld;

import java.util.Random;

/**
 *
 * @author Colin Mak email: cmakable@hotmail.com date: 7/20/2021 purpose: My
 *         first helloworld program in an IDE
 */
public class Hello {
    /*
     * public static void main(String[] args) {
     * System.out.println("Pick your routing protocol" + "\n1. OSPF v2" +
     * "\n2. EIGRP v4"); ;
     * 
     * }
     */
    public static void main(String[] args) {
        Random rng = new Random();
        String[] names = new String[] { "Alice", "Bob", "Clarice", "David", "Elizabeth" };
        int randomIndex = rng.nextInt(names.length);
        String randomName = names[randomIndex];
        System.out.println(randomName);

    }

}