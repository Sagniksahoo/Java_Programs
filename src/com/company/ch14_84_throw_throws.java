package com.company;

import java.util.Scanner;
class NegativeRadiousException extends Exception{
    @Override
    public String toString() {
        return "Radious cannot be negative";
    }

    @Override
    public String getMessage() {
        return "Radious cannot be negative";
    }
}
class NegativeRadiousCircle extends Exception{
    @Override
    public String getMessage() {
        return "Radious can't be Negative";
    }

    @Override
    public String toString() {
        return "Radious can't be negative";
    }
}
public class ch14_84_throw_throws {
    public static double  area(int r) throws NegativeRadiousException{
        if(r<0){
            throw new NegativeRadiousException();
        }
        double result=Math.PI*r*r;
        return result;
    }
    public static int devide() throws ArithmeticException{
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b=sc.nextInt();
        int result=a/b;
        return result;
    }
    public static double area2() throws NegativeRadiousCircle{
        Scanner sc=new Scanner(System.in);
        int r= sc.nextInt();
        if (r<0){
            throw  new NegativeRadiousCircle();
        }
        double area=Math.PI*r*r;
        return area;
    }
    public static void main(String[] args) {
//        try {
//            int c= devide();
//            System.out.println(c);
//        }
//        catch (Exception e){
//            System.out.println("Exception"+e);
//        }
//        try {
//            double c=area(-3);
//            System.out.println(c);
//        }
//        catch (Exception e){
//            System.out.println(e);
//        }
        try {
            double d=area2();
            System.out.println(d);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
