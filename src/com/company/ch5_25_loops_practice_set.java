package com.company;
import java.util.*;
public class ch5_25_loops_practice_set {
    public static void main(String[] args) {
//        question no 1
//       ****
//        ***
//        **
//        *
//        int n = 5;
//        for (int i=n; i>0; i--){
//            for(int j=0;j<i;j++){
//                System.out.print("*");
//            }
//            System.out.print("\n");
//        }

//        *
//        **
//        ***
//        ****
//        int n=4;
//        for (int i=1;i<=n;i++){
//            for (int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println( );
//        }
//          //questuion 2
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter your limit: ");
//        int n=sc.nextInt();
//        int i=1;
//        int sum=0;
//        while(i<=n){
//            if (i%2==0){
//                System.out.printf("the number %d is even number\n",i);
//                sum=sum+i;
//            }
//            i++;
//        }
//        System.out.print("\n the summation is "+ sum);

//        //question 3
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter the multiplication table: ");
//        int n=sc.nextInt();
//        int k=1;
//        for (int i=1;i<=10;i++){
//            k=n*i;
//            System.out.println(k);
//        }
        ///////////////
//        Scanner pt=new Scanner(System.in);
//        System.out.println("enter your limit: ");
//        int p=pt.nextInt();
//        int l=1;
//        for (int i=1;i<=p;i++){
//            System.out.printf("the multiplication table of %d is \n",i);
//            for (int j=1;j<=10;j++){
//                l=i*j;
//
//                System.out.println(l);
//            }
//            System.out.println("\n");
//        }

//        //question 4
//        int n=10;
//        int k=1;
//        for (int i=n;i>0;i--){
//            k=n*i;
//            System.out.println(k);
//        }
        //question 5
//        Scanner sc =new Scanner(System.in);
//        System.out.println("enter the number: ");
//        int n =sc.nextInt();
//        int fact=1;
//        for (int i=1;i<=n;i++){
//            fact=fact*i;
//
//        }
//        System.out.printf("the factorial of %d is %d",n,fact);


        //question 6

//        Scanner sc =new Scanner(System.in);
//        System.out.println("enter the number: ");
//        int n = sc.nextInt();
//        int fact=1;
//        int i=1;
//        while (i<=n){
//            fact=fact*i;
//            i++;
//        }
//        System.out.printf("the factorial of %d is %d",n,fact);

//        //question 7
//        int i;
//        int n=5;
//        i=n;
//        int j=0;
//        while(i>0){
//
//            j=1;
//            while (j<=i){
//                System.out.print("*");
//                j++;
//            }
//            i--;
//            System.out.println();
//        }


        //question 8
//        int n=8;
//        int sum=0;
//        int k=1;
//        for(int i=1;i<=10;i++){
//            k=n*i;
//            sum=sum+k;
//            System.out.println(k);
//        }
//        System.out.println(sum);

//        //question 10
          Scanner sc =new Scanner(System.in);
        System.out.println("enter your limit:  ");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            if(i%2==0){
                System.out.printf("the even number is %d\n",i);
                sum=sum+i;
            }

        }
        System.out.print("theb summation is " + sum);
    }
}
