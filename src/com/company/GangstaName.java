package com.company;
import java.util.Scanner;

public class GangstaName {

    public static void main(String[] args) {

        String name;

        Scanner input = new Scanner(System.in);
        System.out.print("Type your name:  ");

        String fName= input.nextLine();
        int indexOf= fName.indexOf(" ");
        String Lname = fName.substring(indexOf+1);
        fName = fName.substring(0, indexOf);

        System.out.print("Your gansta name is:  ");
        System.out.print(fName.charAt(0)+". " + "Diddy " + Lname.toUpperCase() + " " + fName + "-izzle");

    }
}
