package com.company;

public class Loopworkchallenge2 {
    public static void main(String[] args) {

        Line();
        TOP();
       Bottom();
        Line();
        Bottom();
        TOP();
        Line();
    }
// this created the line with the + and the dashes
    public static void Line() {
        System.out.print("+");
        for (int dash = 0; dash < 9; dash++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
//This creates the cone shaped piece at the top and is in a forloop
    public static void TOP() {
        for (int line = 2; line <= 5; line++) {
            System.out.print("|");
//first step of forloop is to declare and initialize forloop
            for (int space = 1; space <= -1 * line + 6; space++) {
                System.out.print(" ");
            }
            for (int forwardslash = 1; forwardslash < line - 1; forwardslash++) {
                System.out.print("/");
            }
            System.out.print("*");
            for (int backslash = 1; backslash < line - 1; backslash++) {
                System.out.print("\\");
            }
            for (int space = 1; space <= -1 * line + 6; space++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }
    //This creates the bottom part whcih is just the top part upside down written in a forloop
    public static void Bottom() {
        for (int line = 1; line < 5; line++) {
System.out.print("|");
            for (int space = 1; space <=  line ; space++) {
                System.out.print(" ");
            }

            for (int backslash = 1; backslash <= -1 * line +4; backslash++) {
                System.out.print("\\");
            }
            System.out.print("*");
            for (int forwardslash = 1; forwardslash <= -1* line + 4; forwardslash++) {
                System.out.print("/");

            }
            for (int space = 1; space <= line ; space++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }}