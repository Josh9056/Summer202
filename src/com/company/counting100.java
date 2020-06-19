package com.company;

public class counting100 {

    public static void main(String[] args) {


        for (int even = 0; even <= 100; even += 2) {
            System.out.print(even+" ");
        }
        System.out.println(" ");
        for (int odd = 1; odd<=99; odd+=2 ) {
        System.out.print(" "+odd);
        }

    }
}