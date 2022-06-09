package com.company;
interface  sag{
    void me1();
    void m2();
}
interface pri extends sag{
    void m3();
    void m4();
}
class sagn{
    public void m5(){
        System.out.println("Sagnik is a good boy");
    }
}
class hari extends sagn implements pri{
    @Override
    public void me1() {
        System.out.println("Hi i am method 1");
    }

    @Override
    public void m2() {
        System.out.println("Hi i am method 2");
    }

    @Override
    public void m3() {
        System.out.println("Hi i am method 3");
    }

    @Override
    public void m4() {
        System.out.println("Hi i am method 4");
    }
}
public class interfackjkj {
    public static void main(String[] args) {
       pri p=new hari();
       p.m2();
    }
}
