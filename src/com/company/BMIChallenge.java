package com.company;
import java.util.*;
public class BMIChallenge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter persons height and weight");
        Double height1 = input.nextDouble();
        Double weight1 = input.nextDouble();
        Double BMI1 = weight1 / Math.pow(height1, 2) * 703;
        System.out.print("Enter next persons height and weight");
        Double height2 = input.nextDouble();
        Double weight2 = input.nextDouble();
        Double BMI2 = weight2 / Math.pow(height2, 2) * 703;
        if (BMI1 >= 30.0) {
            System.out.print("obese");
        } else if (BMI1 <= 25.0) {
            System.out.print("overweight");
        } else if (BMI1 <= 18.5) {
            System.out.print("normal");
        } else {
            System.out.print("underweight");

        }
        if (BMI2 >= 30.0) {
            System.out.print("obese");
        } else if (BMI2 <= 25.0) {
            System.out.print("overweight");
        } else if (BMI2 <= 18.5) {
            System.out.print("normal");
        } else {
            System.out.print("underweight");

    }
    }
}
