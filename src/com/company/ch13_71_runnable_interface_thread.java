package com.company;
class MyThreadRunnable1 implements Runnable{
    @Override
    public void run() {
        int i=0;
        while (i<4000) {
            System.out.println("I am a thread 1 not a threat 1");
            i++;
        }
    }
}
class pThread extends Thread{
    @Override
    public void run() {
        int i=0;
        while (i<50000) {
            System.out.println("Hi i am priyanka!");
            i++;
        }
    }
}
class sThread extends Thread{
    @Override
    public void run() {
        int i=0;
        while (i<5000) {
            System.out.println("Hi i am sagnik sahoo");
            i++;
        }
    }
}
class MyThreadRunnable2 implements Runnable{
    @Override
    public void run() {
        int i=0;
        while (i<4000) {
            System.out.println("I am a thread 2 not a threat 2");
            i++;
        }
    }
}
public class ch13_71_runnable_interface_thread {
    public static void main(String[] args) {
//    MyThreadRunnable1 bullet1=new MyThreadRunnable1();
//    Thread gun1=new Thread(bullet1);
//    MyThreadRunnable2 bullet2=new MyThreadRunnable2();
//    Thread gun2=new Thread(bullet2);
//    gun1.start();
//    gun2.start();
//    pThread p=new pThread();
//    p.start();
//    sThread s=new sThread();
//    s.start();
        MyThreadRunnable1 t1=new MyThreadRunnable1();
        Thread p1=new Thread(t1);
        MyThreadRunnable2 t2=new MyThreadRunnable2();
        Thread p2=new Thread(t2);
        p1.start();
        p2.start();

    }
}
