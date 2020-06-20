package com.company;
//Import Scanner
       // Get user input for numbers
        //Create while loop
       // If n is odd print weird
       // If n is even and between 0-32 print not weird
      //  If n is even and in the range of 6 to 20 print weird
       // If n is even and greater then 20 print not weird
      //  1<=n=>137
//Josh Titens

import jdk.nashorn.internal.ir.WhileNode;

import java.util.*;
public class ConditionalStatementsChallenge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Do you want to play the game (yes or no): ");
        String play = input.next();
        input.nextLine();
        while (play.toUpperCase().contains("y")) {
            System.out.print("Do you want to play the game(yes or no): ");
            play = input.next();
            }


            System.out.println("please enter a number between 1 and 137: ");
            int n = input.nextInt();
            if (n < 1 || n > 137) {
                System.out.println("Please run again and enter a number between 1 and 137");
            } else if (n % 2 != 0) {
                System.out.println("Weird");
            } else {
                if (n >= 2 && n <= 5) {
                    System.out.println("Not Weird");
                } else if (n >= 6 && n <= 20) {
                    System.out.println("Weird");
                } else {
                    System.out.println("Not Weird");
                }
            }
            System.out.println("Adios");
        }
    }


