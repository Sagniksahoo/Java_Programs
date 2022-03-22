package com.company;
class MyThr extends Thread{
    int i;
    public MyThr(String name){
        super(name);
    }
    @Override
    public void run() {
        int i=0;
        while(i<40){
            System.out.println("I am thread");
            i++;
        }
    }
}
class Myth1 implements Runnable {
    @Override
    public void run() {
        System.out.println("HI sagnik"+Thread.currentThread().getName());
    }
}
public class ch13_73_thread_constructor {
    public static void main(String[] args) {
//    MyThr th=new MyThr("sagnik");
//    MyThr th2=new MyThr("Ram Das");
//    th.start();
//    th2.start();
//        System.out.println("The id of the thread th is "+ th.getId());
//        System.out.println("the name of the thread is"+th.getName());
//
//        System.out.println("The id of the thread th is "+ th2.getId());
//        System.out.println("the name of the thread is"+th2.getName());

        Myth1 bullets=new Myth1();
        Thread gun=new Thread(bullets,"  priyanka");
        gun.start();
    }
}
