package com.company;
import  java.util.Scanner;
public class ch4_18_switchcasecontrol {
    public static void main(String[] args) {
        System.out.println("enter your age: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        switch (age) {
            case 18:
                System.out.println("you are going to be adult!");
                break;
            case 28:
                System.out.println("you are going to join youre job");
                break;
            case 60:
                System.out.println("congratuation! you are going to be a older person");
                break;
            default:
                System.out.println("enjoy your life!");
                break;
        }

    }
}
