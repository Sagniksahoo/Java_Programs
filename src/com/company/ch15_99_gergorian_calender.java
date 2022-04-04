package com.company;

import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.TimeZone;

public class ch15_99_gergorian_calender {
    public static void main(String[] args) {
//        Calendar c=Calendar.getInstance();
//        System.out.println(c.getTime());
//        System.out.println(c.get(Calendar.DATE));
//        System.out.println(c.get(Calendar.SECOND));
//        System.out.println(c.get(Calendar.MINUTE));
//        System.out.println(c.get(Calendar.HOUR));
//        System.out.println(c.get(Calendar.HOUR_OF_DAY));
//        System.out.println(c.get(Calendar.HOUR_OF_DAY) + "  " + c.get(Calendar.MINUTE) + "  " + c.get(Calendar.SECOND));


        GregorianCalendar cal=new GregorianCalendar();
//        System.out.println( cal.isLeapYear(2020));
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(cal.isLeapYear(a)==true){
            System.out.println("Leap year");
        }
        else {
            System.out.println("Not a Leap year");
        }
        System.out.println(TimeZone.getAvailableIDs()[1]);

    }
}
