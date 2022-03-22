package com.company;

abstract class Parent2{

    public  Parent2(){
        System.out.println("I am the constructor of base2");
    }
    public void sayhello(){
        System.out.println("Hello");
    }
    abstract public void greet();
    abstract public void greet1();
}
class child2 extends Parent2{
    @Override
    public void greet(){
        System.out.println("Good morning");
    }
    @Override
    public void greet1(){
        System.out.println("Good afternoon");
    }
}
abstract  class child3 extends Parent2{
    public void th(){
        System.out.println("I am good");
    }
}
abstract class Shape{
    public int r;
    public int h;
    public int side;
    Shape(){
        System.out.println("hello ji");
    }
    Shape(int r){
        this.r=r;
        System.out.println("i am a constructor of Shape with one parameters");
    }
    Shape(int a,int b){
        this.side=a;
        this.h=b;
        System.out.println("i am a constructor of Shape with two parameters");
    }
    abstract void example();
}
class circle3 extends Shape{
    @Override
    public void example(){
        System.out.println("I am a circle");
    }
    circle3(int a){
        super(a);
        System.out.println("i am aconstructor of circle");
    }
    public double area(){
        return Math.PI*r*r;
    }
}
class rectangle3 extends Shape{
    rectangle3(int a,int b){
       super(a,b);
    }
    @Override
    public void example(){
        System.out.println("i am a rectangle");
    }
    public double area(){
        return 2*(h+side);
    }
}
class rombos extends Shape{
    public void example(){
        System.out.println("I am a Rombos");
    }
    public rombos(int a){
        super(a);
    }
    public double perimeter(){
        return 4*r;
    }
}
public class ch11_53_abstract_class_interface {
    public static void main(String[] args) {
        //Parent2 p=new Parent2();-->throws Error
//         child2 c=new child2();
//         c.greet();
//         c.greet1();
//         c.sayhello();
       //child3 c3=new child3();-->throws Error

//        circle3 c=new circle3(4);
//        System.out.println(c.area());

//        rectangle3 rc=new rectangle3(2,4);
//        System.out.println(rc.area());

        rombos ro=new rombos(4);
        System.out.println(ro.perimeter());
    }
}
