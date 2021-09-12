package org.example;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Christian Williams
 */

public class App
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        final double conversion = 0.09290304;

        System.out.println("How many people? ");
        int people = input.nextInt();
        System.out.println("How many pizzas do you have? ");
        int pizzas = input.nextInt();
        System.out.println("How many slices do you have? ");
        int slices = input.nextInt();

        System.out.println(people + " people with " + pizzas + " pizzas (" + (slices * pizzas) + " slices)\n" +
                "Each person gets " + ((slices * pizzas) / people) + " pieces of pizza.");
        int remainder = (slices * pizzas) % people;
        System.out.println("There are " + remainder + " leftover pieces.");
    }
}
