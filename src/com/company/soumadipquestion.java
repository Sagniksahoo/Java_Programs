package com.company;
import  java.util.Scanner;


public class soumadipquestion {
    /*
    Given an integer number n, return the difference between the product of its digits and the sum of its digits.


Example 1:

Input: n = 234
Output: 15
Explanation:
Product of digits = 2 * 3 * 4 = 24
Sum of digits = 2 + 3 + 4 = 9
Result = 24 - 9 = 15
Example 2:

Input: n = 4421
Output: 21
Explanation:
Product of digits = 4 * 4 * 2 * 1 = 32
Sum of digits = 4 + 4 + 2 + 1 = 11
Result = 32 - 11 = 21
     */

    //    static int sum(int a){
//        int sum=0;
//        int pro=1;
//        while(a!=0){
//            sum=sum+a%10;
//            a=a/10;
//        }
//        return sum;
//    }
//    static int product(int b){
//        int pro=1;
//        while (b!=0){
//            pro=pro*(b%10);
//            b=b/10;
//        }
//        return pro;
//    }
    static void greater(int a,int b,int c){
        if(a>b && a>c){
            System.out.println("a is greater");
        }
        else if (b>a && b>c)
        {
            System.out.println("b is greater");
        }
        else {
            System.out.println("c is gretarer");
        }
    }
    static void total_avg(int a,int b,int c,int d,int e){
        int total =a+b+c+d+e;
        int avarage=total/5;
        System.out.println("total is:"+total);
        System.out.println("the avarage is:"+avarage);
    }
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter the integer: ");
//        int n=sc.nextInt();
//        int a=sum(n);
//        int b=product(n);
//        int res=b-a;
//        System.out.println("the sum of the integer is: "+sum(n));
//        System.out.println("the product of the integer is: "+product(n));
//        System.out.println("the result is:"+res);
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter the number: ");
//        int a=sc.nextInt();
//        int fact=1;
//        for (int i=a;i>0;i--){
//            fact=fact*i;
//        }
//        System.out.printf("\n the factorial of %d is %d",a,fact);


        //Print a particular year month days using switch case
        //
        //Input :
        // Enter a year : 2020
        // Enter a month no : 2
        //Output :
        // The day of February is 29 and it is a leap year

//        Scanner sc =new Scanner(System.in);
//        System.out.println("enter a year: ");
//        int a = sc.nextInt();
//        System.out.println("enter a month no: ");
//        int b = sc.nextInt();
//        int noiam=0;//number of days
//        String Mname = "undiscovered";
//        switch (b){
//            case 1:
//                Mname ="january";
//                noiam =31;
//                break;
//            case 2:
//                Mname ="february";
//                if ((a % 400 == 0) || ((a % 4 == 0) && (a % 100 != 0))){
//                    noiam=29;
//                }
//                else {
//                    noiam=28;
//                }
//                break;
//            case 3:
//                Mname="march";
//                noiam=31;
//                break;
//            case 4:
//                Mname="april";
//                noiam=30;
//                break;
//            case 5:
//                Mname="may";
//                noiam=31;
//                break;
//            case 6:
//                Mname="june";
//                noiam=30;
//                break;
//            case 7:
//                Mname="july";
//                noiam=31;
//                break;
//            case 8:
//                Mname="august";
//                noiam=31;
//                break;
//            case 9:
//                Mname="september";
//                noiam=30;
//                break;
//            case 10:
//                Mname="octobar";
//                noiam=31;
//                break;
//            case 11:
//                Mname="november";
//                noiam=30;
//                break;
//            case 12:
//                Mname="december";
//                noiam=31;
//                break;
//            default:
//                System.out.println("enter a proper numbee");
//        }
//
//
//        System.out.print("the day of " + Mname  + " is " + noiam + "days and ");
//
//        if (((a % 4 ==0 ) && (a % 100 != 0) || (a % 400 == 0))){
//           System.out.println("it is leap year!");
//      }
//       else {
//            System.out.println("it is not leap year!");
//        }

        //find the greatest number among 3 numbers

//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the 1st number: ");
//        int a =sc.nextInt();
//        System.out.println("enter the 2nd number: ");
//        int b= sc.nextInt();
//        System.out.println("enter the 3rd number: ");
//        int c = sc.nextInt();
//
//        if (a>b && a>c){
//            System.out.printf("%d is greatest",a);
//        }
//        else if (b>c && b>a){
//            System.out.printf("%d is greatest",b);
//        }
//        else {
//            System.out.printf("%d is greatest",c);
//        }
        //swipe two number without using any third variable

//        Scanner sc =new Scanner(System.in);
//        System.out.println("enter the 1st number: ");
//        int a= sc.nextInt();
//        System.out.println("enter the 2nd number: ");
//        int b= sc.nextInt();
//
//        a=a+b;
//        b=a-b;
//        a=a-b;
//
//
//        System.out.printf("the value of a is %d\n",a);
//        System.out.printf("the value of b is %d",b);
//          Scanner sc = new Scanner(System.in);
//          System.out.println("enter the integer: ");
//          int a = sc.nextInt();

//        Scanner sc =new Scanner(System.in);
//        int a=sc.nextInt();
//        if(a%2 !=0){
//            System.out.println("Weird");
//        }
//        else if(a%2==0){
//            if(a>=2 && a<=5){
//                System.out.println("Not Weird");
//            }
//            if(a>=6 && a<=20){
//                System.out.println("Weird");
//            }
//            if(a>20){
//                System.out.println("Not Weird");
//            }
//        }

//      Scanner sc=new Scanner(System.in);
//      int t=sc.nextInt();
//      for (int i=0;i<t;i++){
//          int a= sc.nextInt();
//          int b= sc.nextInt();
//          int n=sc.nextInt();
//          int calc=a;
//          for (int j=0;j<n;j++){
//              calc +=(Math.pow(2,j)*b);
//              System.out.println(calc+" ");
//          }
//          System.out.println( );
//      }
//      sc.close();
        //matrix multiplication
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter length");
//        int a= sc.nextInt();
//        System.out.println("enter length");
//        int b= sc.nextInt();
//        int[][] fla = new int[a][b];
//        int[][] fla1 = new int[a][b];
//
//        int [][] fla2=new int[a][b];
//        System.out.println("enter the elements of the 1st MATRIX:");
//        for (int i = 0; i <a; i++) {
//            for (int j = 0; j <b; j++) {
//                fla[i][j] = sc.nextInt();
//            }
//        }
//        System.out.println("enter the elements of the second MATRIX:");
//        for (int i = 0; i < a; i++) {
//            for (int j = 0; j <b; j++) {
//                fla1[i][j] = sc.nextInt();
//            }
//        }
//        for(int i=0;i<a;i++){
//            for(int j=0;j<b;j++){
//                fla2[i][j]=0;
//                for(int k=0;k<a;k++)
//                {
//                    fla2[i][j]+=fla[i][k]*fla1[k][j];
//                }
//                System.out.print(fla2[i][j]+" ");
//            }
//            System.out.println();
//        }
//        Scanner sc=new Scanner(System.in);
//        String a=sc.next();
//        String b=new StringBuilder(a).reverse().toString();
//        if (a.equals(b)){
//            System.out.println("Yes");
//        }
//        else {
//            System.out.println("No");
//        }
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
//        greater(a,b,c);
        int d=sc.nextInt();
        int e=sc.nextInt();
        total_avg(a,b,c,d,e);


        System.out.println();
        System.out.println();
    }
}
