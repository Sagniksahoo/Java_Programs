package com.company;

import java.util.Scanner;
class customException extends Exception{
    @Override
    public String toString() {
      return  "Error";
    }

    @Override
    public String getMessage() {
       return "Error occured";
    }
}
public class ch14_86_Practice_set {
    public static void getElement() throws customException{
        boolean flag = true;
        int [] marks = new int[3];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;
        Scanner Sc = new Scanner(System.in);
        int index;
        int i = 0;
        while(flag && i<5){
            try {
                System.out.println("Enter the value of index");
                index = Sc.nextInt();
                System.out.println("The value of marks[index] is " + marks[index]);
                break;
            }
            catch (Exception e) {
                System.out.println("Invalid Index");
                i++;
            }
            finally {
                System.out.println("Thanks For Using the program");
            }
            if(i>=5){
                throw new customException();
            }
        }
    }
    public static void main(String[] args) {
        //problem 1
        //int a=7 -->syntax error
//        int age=78;
//        int year_born=2000-78;-->logical error
        //System.out.println(6/0); --> runtime Error
        //problem 2
//        try {
//            int a=666/0;
//        }
//        catch (IllegalArgumentException e){
//            System.out.println("hehehehe");
//        }
//        catch (ArithmeticException e){
//            System.out.println("HAHAHAHAHAHAHAAH");
//        }

        //prooblem no 3
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the lenght of the array:");
//        int n=sc.nextInt();
//        int[]b=new int[n];
//        for(int i=0;i<n;i++){
//            b[i]= sc.nextInt();
//        }
//        boolean flag=true;
//        while (flag){
//            System.out.println("Enter the value of the index:");
//            int ind= sc.nextInt();
//            try {
//                System.out.println("Welcome to the sagnik's code");
//                try {
//                    System.out.println(b[ind]);
//                    flag=false;
//                }
//                catch (ArrayIndexOutOfBoundsException e){
//                    System.out.println("sorry the index cant bre reched");
//                    System.out.println("Welcome in the Exception level 2");
//                }
//            }
//            catch (Exception e){
//                System.out.println("Welcome to the Exception level 1");
//            }
//            finally {
//                System.out.println("We love you sagnik");
//            }
//        }
        //problem 3 by code with harry
//        boolean flag = true;
//        int [] marks = new int[3];
//        marks[0] = 7;
//        marks[1] = 56;
//        marks[2] = 6;
//        Scanner Sc = new Scanner(System.in);
//        int index;
//        int i = 0;
//        while(flag && i<5){
//            try {
//                System.out.println("Enter the value of index");
//                index = Sc.nextInt();
//                System.out.println("The value of marks[index] is " + marks[index]);
//                break;
//            }
//            catch (Exception e) {
//                System.out.println("Invalid Index");
//                i++;
//            }
//            finally {
//                System.out.println("Thanks For Using the program");
//            }
//        }
//        if(i>=5){
//            System.out.println("Error");
//        }
        //problem 4
        try {
            getElement();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
