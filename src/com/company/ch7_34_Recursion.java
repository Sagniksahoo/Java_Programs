package com.company;

public class ch7_34_Recursion {
    //factorial(0)=1;
    //factorial(n)=n*n-1*........1
    //factorial(n)=n*(n-1)
    static int factorial(int n){
        if(n==1 || n==0){
            return 1;
        }
        else {
            return n*factorial(n-1);
        }
    }
    static int factorial_iterative(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            int product = 1;
            for (int i=1;i<=n;i++){ // 1 to n
                product *= i;
            }
            return product;
        }
    }
    public static void main(String[] args) {
        int a=5;
        System.out.println("the factorial of 5 is:"+factorial(a));
        System.out.println("The value of factorial x is: " + factorial_iterative(a));
    }
}
