package com.company;

public class modifyprogram {
    public static void main(String[] args) {
        Subtotal();
        Tax();
        Tip();
        Total();
    }









    private static void Subtotal() {
        System.out.println("Subtotal:");
        System.out.println(38 + 40 + 30);
    }
    private static void Tax() {
        System.out.println("Tax:");
        System.out.println((38 + 40 + 30) * .08);
    }
    private static void Tip() {
        System.out.println("Tip:");
        System.out.println((38 + 40 + 30) * .15);
        System.out.println(38 + 40 + 30 +

                (38 + 40 + 30) * .15 +

                (38 + 40 + 30) * .08);
    }
    private static void Total() {
        System.out.println("Subtotal:");
        System.out.println(38 + 40 + 30);
    }
}



