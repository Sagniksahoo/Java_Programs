package com.company;
import java.util.Locale;
import  java.util.Scanner;
import java.util.Random;

public class ch4_20_rock_paper_sizer {
    public static void main(String[] args) {
        String personplay;
        String computerplay="";
        int computerInt;


        String responce;

        Scanner sc=new Scanner(System.in);
        Random gen=new Random();

        System.out.println("hey, let's play Rock, PAper, SEsiors!\n"+"Please enter a move.\n"+"Rock =R,Paper"+"=P, and Scissors = S.");


        System.out.println();

        computerInt = gen.nextInt(3)+1;



        if (computerInt == 1)
            computerplay= "R";
        else if (computerInt==2)
            computerplay="p";
        else if (computerInt==3)
            computerplay="S";


        System.out.println("enter your choice: ");
        personplay=sc.next();

        personplay=personplay.toUpperCase();

        System.out.println("computer play is: "+ computerplay);


        if ((personplay.equals(computerplay)))
            System.out.println("It is a tie!");
        else if (personplay.equals("R"))
            if (computerplay.equals("S"))
                System.out.println("Rock crushes the sissors ! you win!");
        else if (computerplay.equals("P"))
                System.out.println("Paper eats rocks! you loose");
        else if (personplay.equals("P"))
            if (computerplay.equals("S"))
                System.out.println("sissors cut paper ! you loose");
        else if (computerplay.equals("R"))
                System.out.println("paper eats rock you win");
        else if (personplay.equals("S"))
            if (computerplay.equals("P"))
                System.out.println("sissors cuts paper you win");
        else if (computerplay.equals("R"))
                System.out.println("rock bracks sissors ! you win");

        else
                System.out.println("wrong input!!!!!!!!!!!!!!!!!!!!!!!");


    }
}
