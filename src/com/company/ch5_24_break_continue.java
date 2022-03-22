package com.company;

public class ch5_24_break_continue {
    public static void main(String[] args) {
        //break and continue in loops
        //for loop
//        for (int i=0;i<=5;i++){
//            System.out.println(i);
//            System.out.println("hi boka");
//            if (i==3){
//                System.out.println("this is the ending of the loop");
//                break;
//            }
//        }
        //while loop
//        int i = 0;
//        while (i<=5){
//            System.out.println(i);
//            System.out.println("hi babe");
//            if (i==3){
//                System.out.println("this is the ending of the loop");
//                break;
//            }
//            i++;
//        }
        //do-while loop
        int i = 0;
        do {
            System.out.println(i);
            System.out.println("hi babe");
            if (i==3){
                System.out.println("this is the endiong of the loop");
                break;
            }
            i++;
        }while (i<=5);
    }
}
