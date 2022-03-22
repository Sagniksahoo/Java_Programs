package com.company;
import java.util.*;
public class ch5_22_do_while_loop {
    public static void main(String[] args) {
//        int i=10;
//        do {
//            System.out.println("i do not love anyone!");
//            i++;
//        }while (i >= 20);

        //question 1
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the limit: ");
        int a =sc.nextInt();
        int i =0;
        do {
            System.out.println(i);
            i++;
        }while (i<=a);


    }
}
