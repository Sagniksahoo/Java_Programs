package com.company;

import java.util.Scanner;

public class ch14_81_specific_exception {
    public static void main(String[] args) {
        int [] marks=new int[3];
        marks[0]=7;
        marks[1]=56;
        marks[2]=6;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array index");
        int ind=sc.nextInt();

        System.out.println("Enter the number you want to dvide thr value with");
        int number=sc.nextInt();
        try {
            System.out.println("The value at array index entered is:"+marks[ind]);
            System.out.println("the value of array value/number is:"+marks[ind]/number);
        }
        catch (ArithmeticException e){
            System.out.println("ArithmeticException execption coccured!");
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException execption coccured!");
            System.out.println(e);
        }
        catch (Exception e){
            System.out.println("Some execption coccured!");
            System.out.println(e);
        }
    }
}
