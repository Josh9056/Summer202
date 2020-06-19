package com.company;

public class kchallenge {
    public static final int SIZE = 4;
    public static void main(String[] args) {
top();
bottom();
    }
        public static void top () {
            char letter = 65;
                    for(byte line = 5; line>=0; line--){
                        for( byte count= 0; count< line; count++ ){
                        System.out.print((char)(letter+count)+" ");
                        }
             System.out.println();
    }
    }
    public static void bottom() {
        char letter = 65;
                for(byte line =0; line<= SIZE; line++){
                    for(byte count = 0; count<= line; count++) {
                        System.out.print((char)(letter+count)+" ");
                    }
                    System.out.println(" ");
                }
    }

}



