package com.company;
//class goodMorning extends Thread{
//    @Override
//    public void run() {
//        while (true) {
//            System.out.println("Good Morning");
//        }
//    }
//}
class goodMorning extends Thread{
    @Override
    public void run() {
            System.out.println("Good Morning");
    }
}
class welcome extends Thread{
    @Override
    public void run() {
        while (true) {

//            try {
//                Thread.sleep(200);
//            }
//            catch (Exception e){
//                System.out.println(e);
//            }
            System.out.println("Welcome");
        }
    }
}
public class ch13_Threads_Practice_set {
    public static void main(String[] args) {
        goodMorning gm=new goodMorning();
        welcome we=new welcome();
        gm.setPriority(Thread.MAX_PRIORITY);
        System.out.println(gm.getPriority());
        we.setPriority(Thread.MIN_PRIORITY);
        System.out.println(we.getPriority());
        System.out.println(gm.getState());
        System.out.println(Thread.currentThread().getState());
        gm.start();
//        we.start();
    }
}
