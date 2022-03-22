package com.company;

import java.util.*;

public class ufff {
    public static void hmmm(String a){
        int integer=0,string=1;
        int Double=0;
        for(int i=0;i<a.length();i++){
            char ch=a.charAt(i);
            if (ch >= '0' && ch <= '9'){
                integer++;
            }
        }
        for(int i=0;i<a.length()-1;i++){
            if ((a.charAt(i) == ' ') && (a.charAt(i + 1) != ' '))
            {
                string++;
            }
        }
        System.out.println("Strings : " + string);
        System.out.println("Integer : " + integer);
        System.out.println("Doubles: "+ Double);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String a=sc.nextLine();
        hmmm(a);
    }
}
