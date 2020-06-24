package com.company;
//Josh Titens
//create random amount of numbers
//create variables
//print random numbers
//create 2 of the those random numbers to switch
//create return to show the two numbers that switched

import java.util.*;
import java.util.Arrays;
import java.util.Random;

public class ArrayClassWork {
        public static void main(String[] args){
            Random randy = new Random();
            int size = randy.nextInt(5)+5;
            int [] numbers = new int[size];
            for (int i=0; i<size; i++){
                numbers[i] = randy.nextInt(100);
            }
            int l;
            int c;
            do {
                l = randy.nextInt(size);
                c = randy.nextInt(size);
            } while (l==c);
            System.out.println(Arrays.toString(numbers));
            numbers = reverse(numbers,l,c);
            System.out.println(Arrays.toString(numbers));
        }
        public static int [] reverse (int [] num, int a, int b){
            int temp = num [a];
            num[a] = num [b];
            num[b]= temp;
            return num;
        }
    }




