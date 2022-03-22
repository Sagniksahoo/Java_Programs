package com.company;

public class ch7_33_variable_arguments {
//    static int sum(int a,int b){
//        return (a+b);
//    }
//    static int sum(int a,int b,int c){
//        return (a+b+c);
//    }
//    static int sum(int a,int b,int c,int d){
//        return (a+b+c+d);
//    }
//    static int sum(int ...arr){
//        //avalable as int [] arr;
//        int result=0;
//        for (int a:arr){
//            result +=a;
//        }
//        return result;
//    }
    static int sum(int x,int ...arr){
        //avalable as int [] arr;
        int result=x;
        for (int a:arr){
            result +=a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Welcome  to varargs");
        System.out.println("the sum of 4 and 5 is: "+ sum(4,5));
        System.out.println("the sum of 4,3 and 5 is:"+sum(4,3,5));
        System.out.println("the sum of 2,4,3 and 5 is: "+sum(2,4,3,5));
        System.out.println(sum(1,2,3,4,5,6,7,8,9,10));
    }
}
