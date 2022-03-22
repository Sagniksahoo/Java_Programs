package com.company;
import java.util.*;
public class ch14_79_Errors_demo {
    public static void main(String[] args) {
        //Syntax Error demo
//        int a=6//-->semicolon not here
//        b=0;//-->variable not decleard
//        System.out.println(a);
        //logical numbers demo
        //write a program to print all numbers between 1 to 10
//    for (int i=1;i<5;i++){
//        System.out.println(2*i+1);
//    }

    //Runtime Error Demo
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int l=sc.nextInt();
//        System.out.println("Integer part of 1000 divided by k is"+1000/k);
        System.out.println(k+l);
    }
}
