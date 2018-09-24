package me.samuel;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("What is your name?");
        Scanner keyboard = new Scanner(System.in);
        String firstName = keyboard.next();
        String lastName = keyboard.next();

        //The two ways to print a string do the same thing. Try %s.
        System.out.println("Hello " +firstName+ " " +lastName);
        System.out.printf("Hello %s %s", firstName, lastName);

        //When formatting an integer, use '%d'
        System.out.println("How old are you?");
        int age = keyboard.nextInt();
        System.out.printf("Your age is %d", age);
        System.out.printf("Hello %s, your last name is %s and your age is %d", firstName, lastName, age);

        //'%f' is used for floats. '.2%f' modifies it to cite only 2 decimal places after the point.
        System.out.println("How tall are you?");
        double height = keyboard.nextDouble();
        System.out.printf("You are %.2f inches tall", height);

        System.out.printf("Hello, your first name is %s. \nYour last name is %s. \nYou are %d years old, and you are .2%f inches tall.");
    }
}
