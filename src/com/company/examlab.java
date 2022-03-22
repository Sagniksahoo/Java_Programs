package com.company;
import java.util.*;
public class examlab {
    static boolean isl(int n){
        boolean arr[]=new boolean[10];
        for (int i=0;i<10;i++)
            arr[i]=false;

        while (n>0){
            int digit =n%10;

            if(arr[digit])
            return false;

            arr[digit]=true;
            n=n/10;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length: ");
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.println("enter the different numbers:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for (int i=0;i<n;i++)
            if (isl(arr[i]))
                System.out.println(arr[i]+ " is lucky \n");
            else
                System.out.println(arr[i]+ " is not lucky \n");
    }
}
