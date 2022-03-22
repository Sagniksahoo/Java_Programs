package com.company;
//class MyThre1 extends Thread{
//    int i=0;
//    @Override
//    public void run() {
//        while(i<56) {
//            System.out.println("Thank You");
//            i++;
//        }
//    }
//}
//class MyThre2 extends Thread{
//    int i=0;
//    @Override
//    public void run() {
//        while(i<56) {
//            System.out.println("Fuck you");
//            i++;
//        }
//    }
//}
class MyThre1 extends Thread{
    int i=0;
    @Override
    public void run() {
        while(true) {
            System.out.println("Thank You");
//            try{
//                Thread.sleep(455);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            i++;
        }
    }
}
class MyThre2 extends Thread{
    int i=0;
    @Override
    public void run() {
        while(true) {
            System.out.println("Fuck you");
            i++;
        }
    }
}
public class ch13_75_Thread_methods {
    public static void main(String[] args) {
    MyThre1  t1=new MyThre1();
    MyThre2 t2=new MyThre2();
    t1.start();
    try{
        t1.join();
    }
    catch (Exception e){
        System.out.println(e);
    }
    t2.start();
    }
}
