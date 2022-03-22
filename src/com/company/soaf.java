package com.company;
import java.util.*;
import java.io.*;
public class soaf {
    static int divsum(int n){
        if (n==1)
            return 1;
        int result=0;
        for (int i=2;i<=Math.sqrt(n);i++){
            if (n%i==0){
                if (i==(n/i))
                    result +=i;
                else
                    result += (i+n/i);
            }
        }
        return (result+n+1);
    }
    public static void main(String[] args) {
        int n=30;
        System.out.println(divsum(n));
    }
}
