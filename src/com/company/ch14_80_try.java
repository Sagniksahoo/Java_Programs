package com.company;

public class ch14_80_try {
    public static void main(String[] args) {
        int a=6000;
        int b=0;
        //without  try0
//        int c=a/b;
//        System.out.println("the result is :"+c);
        //with try
        try {
            int c=a/b;
            System.out.println("the result is :"+c);
        }
       catch (Exception e){
           System.out.println("We faild to devide . Reason");
           System.out.println(e);
       }
        System.out.println("end of the program");
    }
}
