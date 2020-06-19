package com.company;
//Josh Titens
//import Scanner
// print line that declares amount of strings to be used in code
//split the words up by every other letter
import java.util.Scanner;

public class StringChallenge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a word: ");
        String phrase = input.nextLine();
        String evens = "";
        String odds = "";

        for (int i = 0; i < phrase.length(); i+=2) {
                evens = evens + phrase.charAt(i);
            }
        for (int i = 1; i < phrase.length(); i+=2) {
            odds = odds + phrase.charAt(i);
            }
                String answer = evens +" " +odds;
        System.out.print(answer);
    }
}


