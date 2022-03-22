package com.company;
import  java.util.Scanner;
public class ch4_15_conditionals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your age: ");
        int a= sc.nextInt();
        if (a>18){
            System.out.println("you are eligible to drive");
        }
        else {
            System.out.println("no you are not eligble not yet!");
        }


    }
}
