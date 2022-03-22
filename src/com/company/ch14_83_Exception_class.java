package com.company;

import java.util.Scanner;

class MyException extends Exception{
    public String toString(){
        return  "I am toString()";
    }

    @Override
    public String getMessage() {
        return "I am a getMessage";
    }
}
class MaxAgeException extends Exception{
    public String toString(){
        return  "Aeg can not br greater than 125";
    }

    @Override
    public String getMessage() {
        return "Make sure that the value of the agfe entered is correct";
    }
}
public class ch14_83_Exception_class {
    public static void main(String[] args) {
        int a;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        if(a<125){
            try {
//                throw new MyException();
                //throw new ArithmeticException("This is new Exception");
                throw  new MaxAgeException();
            }
            catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
               e.printStackTrace();
            }
            System.out.println("Finshed");
        }
    }
}
