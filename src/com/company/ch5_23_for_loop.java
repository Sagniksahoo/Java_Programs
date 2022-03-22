package com.company;
import java.util.*;
public class ch5_23_for_loop {
    public static void main(String[] args) {
        //question 1
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the limit: ");
        int n =sc.nextInt();
//        for(int i=1;i<=n;i++){
//            if (i%2==0){
//                System.out.printf("\n the number %d is odd",i);
//            }
//        }

        //question 2
        for (int i=n;i>=0;i--){
            System.out.println(i);
        }

    }
}
