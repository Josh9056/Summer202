package com.company;

import java.util.Random;
import java.util.Scanner;

public class Tempature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many days' tempature? ");
        int days = input.nextInt();

        int[] tempatures = new int[days]; //array to store days' tempature
        int sum = 0;
        Random number = new Random();

        for (int i = 0; i < days; i++) {    //store each tempature by day
            tempatures[i] = number.nextInt(85)+25;
            System.out.println("Day" + (i + 1) + "'s high temp: " +tempatures [i]);
            sum += tempatures[i];
        }

        Double average = (double) sum / days;
        int count = 0;                      //see if your number is above average
        for (int i = 0; i < days; i++) {
            if (tempatures[i] > average) {
                count++;
            }
        }

        //End results
        System.out.printf("Average temp = %.1f\n", average);
        System.out.println(count + " days above average");
    }
}

