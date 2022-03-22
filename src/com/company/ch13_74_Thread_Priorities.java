package com.company;
class MyThre extends Thread{
    int i;
    public MyThre(String name){
        super(name);
    }
    @Override
    public void run() {
        while(true) {
            System.out.println("Thank You" + Thread.currentThread().getName());
        }
        }
    }

public class ch13_74_Thread_Priorities {
    public static void main(String[] args) {
        //Ready Queue: T1,T2,T3,T4,T5
        MyThre t1=new MyThre("Sagnik");
        MyThre t2=new MyThre("sagnik2");
        MyThre t3=new MyThre("sagnik3");
        MyThre t4=new MyThre("sagnik4");
        MyThre t5=new MyThre("sagnik5 (MOst Important)");
        t5.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }
}
