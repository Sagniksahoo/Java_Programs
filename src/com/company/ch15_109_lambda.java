package com.company;
@FunctionalInterface
interface  DemoAno{
    void meth1(int a);
//    void meth2();
}
@FunctionalInterface
interface sagnik333{
    void pokpok();
//    void hola();
}
//class HarryFunc implements DemoAno{
//    @Override
//    public void meth1() {
//        System.out.println("This is method 1");
//    }
//}
//class  AnonyDemo implements DemoAno{
//    @Override
//    public void meth1() {
//        System.out.println("Method 1");
//    }
//
//    @Override
//    public void meth2() {
//        System.out.println("MEthod 2");
//    }
//    public void Display(){
//        System.out.println("hello");
//    }
//}
public class ch15_109_lambda {

    public static void main(String[] args) {
//        AnonyDemo obj=new AnonyDemo();
//        obj.meth1();
        //Anonymous class
//        DemoAno obj=new DemoAno() {
//            @Override
//            public void meth1() {
//                System.out.println("Method 1");
//            }
//
////            @Override
////            public void meth2() {
////                System.out.println("Method 2");
////            }
//        };
//        obj.meth1();
        //Lambda Expression
//        DemoAno h=new HarryFunc();
//        h.meth1();
//        DemoAno obj=(a)->{
//            System.out.println("hi i am method 1 from lambda"+ ""+ a);
//        };
//        obj.meth1(8);







//        1St way
//        sagnik333 obj=new sagnik333() {
//            @Override
//            public void pokpok() {
//                System.out.println("pokpok");
//            }
//
//            @Override
//            public void hola() {
//                System.out.println("hola hola");
//            }
//        };
        //2nd way
        sagnik333 obj=()->{
            System.out.println("kaka kaka");
        };
    }
}
