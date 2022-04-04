package com.company;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;

public class ch15_102_advanced_java_ps {
    public static void main(String[] args) {
         //problem1
//        ArrayList<String> li=new ArrayList<>();
//        li.add("Sagnik");
//        li.add("Priyanka");
//        li.add("Student 1");
//        li.add("Student 2");
//        li.add("Student 3");
//        li.add("Student 4");
//        li.add("Student 5");
//        li.add("Student 6");
//        li.add("Student 7");
//        li.add("Student 8");
//
//        for (String a:li) {
//            System.out.println(a);
//        }
//
//        for (int i=0;i<li.size();i++){
//            System.out.print(li.get(i));
//            System.out.print(", ");
//        }
//        for (Object o:li) {
//            System.out.println(o);
//        }
//
//        //problem 5
//        HashSet<Integer> s=new HashSet<>();
//        s.add(5);
//        s.add(6);
//        s.add(46);
//        s.add(60);
//        s.add(9);
//        s.add(6);
//        System.out.println(s);

     //problem 2
        Date d=new Date();
        System.out.println(d.getHours()+"-"+d.getMinutes()+"-"+d.getSeconds());

        //problrm 3
        Calendar c=Calendar.getInstance();
        System.out.println(c.get(Calendar.HOUR_OF_DAY)+"-"+c.get(Calendar.MINUTE)+"-"+c.get(Calendar.SECOND));

        //problem 4

//        LocalDateTime dt=LocalDateTime.now();
//        DateTimeFormatter df = DateTimeFormatter.ofPattern("H-m-s");//this is the format
//        String myDate =dt.format(df);//Creating date string using date and format
//        System.out.println(myDate);


        LocalDateTime dt=LocalDateTime.now();
        DateTimeFormatter df=DateTimeFormatter.ofPattern("H-m-s");
        String mydate=dt.format(df);
        System.out.println(mydate);
    }
}
