package com.company;

import java.util.Scanner;

class overload{
    public int Sum(int A,int B){
        int sum=0;
        for(int i=A;i<=B;i++){
            if(i%2==0){
                sum=sum+i;
            }
        }
        return sum;
    }
    public double Sum(double N){
        double a=1.0;
        for(double i=1.0;i<=N;i+=0.2){
            a*=i;
        }
        return a;
    }
    public int sum(int N){
        int sum=0;
        while (N!=0){
            int d=N%10;
            if(d%2!=0){
                sum=sum+d;
            }
            N=N/10;
        }
        return sum;
    }
}
public class javaAssignmentCollage2 {
    public static void main(String[] args) {
        overload ol=new overload();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range of A");
        int A= sc.nextInt();
        System.out.println("Enter the range of B");
        int B= sc.nextInt();
        int a= ol.Sum(A,B);
        System.out.println("Even sum from A to B is "+a);

        System.out.println("Enter the series number:");
        double dd= sc.nextDouble();
        double se=ol.Sum(dd);
        System.out.println("Series Product = "+se);
        System.out.println("Enter the long number:");
        int nn=sc.nextInt();
        int odd=ol.sum(nn);
        System.out.println("Odd didits sum= "+odd);
    }
}
