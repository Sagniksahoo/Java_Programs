package com.company;

public class ch7_31_methods {
//    static int logic(int x,int y){
//        int z;
//        if(x>y){
//            z=x+y;
//        }
//        else {
//            z=(x+y)*5;
//        }
//        return z;
//    }
    static int sum(int x,int y){
        int z;
        z=x+y;
        System.out.println(z);
        return z;
    }
     int logic(int x,int y){
        int z;
        if(x>y){
            z=x+y;
        }
        else {
            z=(x+y)*5;
        }
        return z;
    }
    public static void main(String[] args) {
        int a=5;
        int b=7;
        int c;
        ch7_31_methods obj=new ch7_31_methods();
        //c=logic(a,b);
        c=obj.logic(a,b);
        System.out.println(c);
        int a1=2;
        int b2=1;
        int c1;
//        c1=logic(a1,b2);
        c1= obj.logic(a1,b2);
        System.out.println(c1);
        int a3=5;
        int b3=10;
        int c3;
        c3=sum(a3,b3);
        System.out.println(c3);

    }
}
