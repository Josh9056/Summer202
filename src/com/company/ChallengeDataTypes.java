
//Import Scanner
       // Set int = 10
        //Set double = 5
      //  Set String =  Stingem
       // Print the sum of int
       // Print the double
      //  Print my string


// \n = break in the line
// %(spaces) indicates how many spaces
// .(number) is like how many decimal points ig
// need to attach corresponding letter to value, i.e. .#f (*note the f) 
package com.company;
import java.util.*;
public class ChallengeDataTypes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 10;
double d = 5;
String s  = "Stinger";
System.out.print("Enter your integer: ");
Integer int1 = input.nextInt();
System.out.print("Enter your double: ");
Double doub1 = input.nextDouble();
input.nextLine();
System.out.print("Enter your String: ");
String Str1 = input.nextLine();
int sumInt = i+int1;
double sumDoub = d+doub1;
String sumStr = s +Str1;
System.out.printf("%d\n%.if\n%s\n",sumInt,sumDoub,sumStr);

    }
}

