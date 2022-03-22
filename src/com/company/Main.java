package com.company;
//import  java.util.Scanner;
public class Main {

    public static void main(String[] args) {
       /* System.out.println("hello world");
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        System.out.println(a);*/

//        String  a = "Sagnik";
//        int value = a.length();
//        System.out.println(value);
//
//        String b = a.toLowerCase();
//        System.out.println(b);
//
//        String c = a.toUpperCase();
//        System.out.println(c);
//
//        String d = a.trim();
//        System.out.println(d);
//
//        String e =a.substring(2);
//        System.out.println(e);
//
//        String  f = a.substring(2,3);
//        System.out.println(f);
//
//        String g = a.replace('g','r');
//        System.out.println(g);
//
//
//        boolean h = a.startsWith("Sa");
//        System.out.println(h);
//
//        boolean  i  = a.endsWith("ik");
//        System.out.println(i);
        String a = "saggggnikniknik";
        int value = a.length();
        System.out.println(value);
        char l = a.charAt(2);
        System.out.println(l);

        int k = a.indexOf("g");
        System.out.println(k);

        int m = a.indexOf("i",2);
        System.out.println(m);

        int n =a.lastIndexOf("i");
        System.out.println(n);

        int on = a.lastIndexOf("g",6);
        System.out.println(on);


        boolean p= a.equals("Sagnik");
        System.out.println(p);

        System.out.println(a.equals("saggggnikniknik"));


        boolean r=a.equalsIgnoreCase("SAggggnikniknik");
        System.out.println(r);




    }
}
