//Josh Titens
//Import Scanner
//Write the meal cost using double
//Write the tip percent using integers
//Write a tax percent using integers
//Find the total cost of the whole meal
//Get the output to calculate total cost all together

package com.company;

import java.util.*;
public class OperatorChallenge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
System.out.println("Enter meal cost: ");
double mealCost = input.nextDouble();
System.out.println("Enter tip value: ");
int tipPercent = input.nextInt();
System.out.println("Enter tax value: ");
int taxValue = input.nextInt();
solve(mealCost, tipPercent, taxValue);
    }
    public static void solve(double mealCost,int tipPercent, int taxValue){
        double tip = tipPercent * mealCost/100;
        double tax = taxValue * mealCost/100;
        int TotalCost =(int) Math.round(tip + tax + mealCost);
        System.out.println("Your total cost is: "+ TotalCost) ;

    }
}

