package com.company;
import  java.util.Scanner;
public class ch4_17_elseif {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age:   ");
        int age =sc.nextInt();
        if (age>56){
            System.out.println("you are experced");

        }
        else if (age>46){
            System.out.println("you are semi-experienced");
        }
        else if (age>36){
            System.out.println("you are semi semi experienced");
        }
        else {
            System.out.println("you arev not exprenced enough");
        }
    }
}
