package com.company;
import  java.util.Scanner;
public class ch4_19_practice_set {
    public static void main(String[] args) {

        //question no 1
//        int a = 10;
//        if (a==11){
//            System.out.println("i am 11");
//        }
//        else {
//            System.out.println("i am not 11");
//        }

        //question 2
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter the mark of a: ");
//        float a = sc.nextFloat();
//        System.out.println("enter the marks of b: ");
//        float b = sc.nextFloat();
//        System.out.println("enter the mark of c: ");
//        float c =sc.nextFloat();
//
//        float per = ((a+b+c)*100f)/300f;
////        System.out.printf("you per is %2f\n",per);
//
//        float d =(a*100f)/100f;
//
//        float e =(b*100f)/100f;
//
//        float f =(c*100)/100f;
//
//        if(per>=40f && d>32f && e>32f && f>32f){
//            System.out.println("you are pass!");
//        }
//        else {
//            System.out.println("you are fail go study!");
//        }

        //question 3
//        Scanner sc =new Scanner(System.in);
//        System.out.println("enter your income in lakhs (like 1/0l):  ");
//        float  a = sc.nextFloat();
//        float tax = 0;
//
//        if (a<2.5f){
//            tax = tax+0;
//            System.out.println(tax);
//        }
//        else if (a>=2.5f && a<5.0f){
//            tax = tax + 0.05f*(a-2.5f);
//            System.out.println(tax);
//        }
//        else if (a>=5.0f && a<10.0f){
//            tax = tax + 0.05f*(5.0f-2.5f);
//            tax = tax +0.20f *(a-5.0f);
//            System.out.println(tax);
//        }
//        else {
//            tax = tax + 0.05f*(5.0f-2.5f);
//            tax = tax +0.20f *(10.0f-5.0f);
//            tax = tax +0.30f*(a-10.0f);
//            System.out.println(tax);
//        }

        //question 4
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the number of week:: ");
//        int a =sc.nextInt();
//
//        switch (a) {
//            case 1 -> System.out.println("this is monday");
//            case 2 -> System.out.println("tjis is tuesday");
//            case 3 -> System.out.println("this is wednesday");
//            case 4 -> System.out.println("this is thursday");
//            case 5 -> System.out.println("this is fiday");
//            case 6 -> System.out.println("this is saturday");
//            case 7 -> System.out.println("this is sunday");
//            default -> System.out.println("wrong input!");
//        }
        //question no 5

//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the year:");
//        int year = sc.nextInt();
//
//        if (((year % 4 ==0 ) && (year % 100 != 0) || (year % 400 == 0))){
//            System.out.println("the year is leap year!");
//        }
//        else {
//            System.out.println("the year is not leap year!");
//        }

        //question no 6
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your website url: ");
        String website = sc.nextLine();

        if (website.endsWith(".com")){
            System.out.println("this is a comercial website");
        }
        else if (website.endsWith(".org")){
            System.out.println("this is an organization website");
        }
        else if (website.endsWith(".in")){
            System.out.println("this is an indian website");
        }


    }


}
