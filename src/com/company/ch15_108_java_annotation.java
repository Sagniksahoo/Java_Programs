package com.company;
class helloee{
    @Deprecated
    public int sum(int a,int b){
        return a+b;
    }
}
public class ch15_108_java_annotation {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
    helloee h=new helloee();
    int c=h.sum(5,6);
        System.out.println(c);
    }
}
