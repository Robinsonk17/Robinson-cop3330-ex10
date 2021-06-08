package oop.exercises;
import java.util.Scanner;
/*
 * UCF cop3330 Summer 2021 Assignment 1 solutions
 * Copyright 2021 Keondez Robinson
 */
public class Main
{
    public static void main(String[] args)
    {
        int p1, p2, p3, q1, q2, q3;
        double subtotal, tax, total;
        Scanner input;

        input = new Scanner(System.in);
        System.out.print("Enter the price of item 1: ");
        p1 = input.nextInt();
        System.out.print("Enter the quantity of item 1: ");
        q1 = input.nextInt();
        System.out.print("Enter the price of item 2: ");
        p2 = input.nextInt();
        System.out.print("Enter the quantity of item 2: ");
        q2 = input.nextInt();
        System.out.print("Enter the price of item 3: ");
        p3 = input.nextInt();
        System.out.print("Enter the quantity of item 3: ");
        q3 = input.nextInt();

        subtotal = (p1 * q1) + (p2 * q2) + (p3 * q3);
        tax = subtotal * 0.055;
        total = subtotal + tax;

        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Tax: $" + tax);
        System.out.println("Total: $" + total);
    }

}
