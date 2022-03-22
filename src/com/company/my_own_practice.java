//package com.company;
//import java.util.*;
//public class my_own_practice {
//    public static void main(String[] args) {
//        //two add two matrix
////        Scanner sc=new Scanner(System.in);
////        int [][] fla=new int[2][3];
////        int [][] fla1=new int[2][3];
////
////        System.out.println("enter the elements of the 1st matrix: ");
////
////        for (int i=0;i< fla.length;i++){
////            for (int j=0;j<fla[i].length;j++){
////                fla[i][j]=sc.nextInt();
////            }
////        }
////
////        System.out.println("enter the elements of the 2nd matrix: ");
////
////        for (int i=0;i< fla1.length;i++){
////            for (int j=0;j<fla1[i].length;j++){
////                fla1[i][j]=sc.nextInt();
////            }
////        }
////        System.out.println("the new matrix is: ");
////        int [][] array=new int[2][3];
////        for (int i=0;i< array.length;i++){
////            for (int j=0;j<array[i].length;j++){
////                array[i][j]=fla[i][j]+fla1[i][j];
////                System.out.print(array[i][j]);
////                System.out.print(" ");
////            }
////            System.out.println( );
////        }
//
////        //reverse an array
////        Scanner sc=new Scanner(System.in);
////
////        System.out.println("enter the length: ");
////        int n=sc.nextInt();
////        int [] pt=new int[n];
////        System.out.println("enter the elements: ");
////        for (int i=0;i<n;i++){
////            pt[i]=sc.nextInt();
//////            System.out.print(pt[i]);
//////            System.out.print(" ");
////        }
////        System.out.println("the reverse array is: ");
////        for (int i=pt.length-1;i>=0;i--){
////            System.out.print(pt[i]);
////            System.out.print(" ");
////        }
//
//
////        Scanner sc=new Scanner(System.in);
////        System.out.println("enter your length: ");
////        int l=sc.nextInt();
////        int [] arr=new  int[l];
////        System.out.println("enter the elements of the arry: ");
////        for (int i=0;i<l;i++){
////            arr[i]=sc.nextInt();
//////            System.out.println(arr[i] +" ");
////        }
////
////        int n=Math.floorDiv(l, 2);
////        int temp;
////        for (int i=0;i<n;i++){
////            temp=arr[i];
////            arr[i]=arr[l-i-1];
////            arr[l-i-1]=temp;
////
////        }
////        System.out.println("the reversed array is:  ");
////
////        for (int ele:arr){
////            System.out.print(ele+" ");
////        }
//
//        //shorted array
////        Scanner sc= new Scanner(System.in);
////        System.out.println("enter the length: ");
////        int l=sc.nextInt();
////        System.out.println("enter the elements: ");
////        int [] arr=new int[l];
////        for (int i=0;i<l;i++){
////            arr[i]=sc.nextInt();
////        }
////        boolean isSorted=true;
////        for (int i=0;i<l-1;i++){
////            if (arr[i]>arr[i+1]){
////                isSorted=false;
////                break;
////            }
////        }
////        if (isSorted){
////            System.out.println("the array is sorted");
////        }
////        else {
////            System.out.println("the array is not sorted");
////        }
////    }
//}