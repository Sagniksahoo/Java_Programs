package com.company;
import  java.util.*;
public class array_input_example {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of  elements you want to store: ");
        //reading the elements form the that we want to enter
        int n=sc.nextInt();
        //creates an array in the memory of length 10
        int [] array=new int[10];
        System.out.println("enter the elements of the array: ");
        for (int i=0;i<n;i++){
            array[i]= sc.nextInt();
        }
        System.out.println("array elements are: ");
        for (int i=0;i<n;i++){
            System.out.println(array[i]);
        }
    }
}
