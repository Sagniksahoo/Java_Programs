package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ch15_101_Formatter {
    public static void main(String[] args) {
        LocalDateTime dt=LocalDateTime.now();//this is the date
        System.out.println(dt);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-mm-yyyy");//this is the format

        String myDate =dt.format(df);//Creating date string using date and format
        System.out.println(myDate);

        DateTimeFormatter df2=DateTimeFormatter.ofPattern("yyyy-dd-mm|| --E");//this is the format

        String mydate2=dt.format(df2);//Creating date string using date and format
        System.out.println(mydate2);

        DateTimeFormatter df3=DateTimeFormatter.ISO_LOCAL_DATE;
        String my=dt.format(df3);
        System.out.println(my);
    }
}
