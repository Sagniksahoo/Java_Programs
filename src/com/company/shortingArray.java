package com.company;
import java.lang.reflect.Array;
import  java.util.*;
//class test111{
//    static void display(){
//        System.out.println("hi i am sagnik sahoo");
//    }
//}
public class shortingArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        short[] arr=new short[n];

        for (int i=0;i<n;i++){
            arr[i]=sc.nextShort();
        }
        for (short number: arr) {
            System.out.println("number:"+number);
        }
        Arrays.sort(arr);
        System.out.println("the shorted arrays are");
        for (short number: arr) {
            System.out.println("number"+number);
        }
//       test111.display();
    }
}
