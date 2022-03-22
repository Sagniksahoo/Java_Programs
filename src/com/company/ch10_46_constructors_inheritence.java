package com.company;

class Base1{
    public int x;
    Base1(){
        System.out.println("I am a constructor");
    }
    Base1(int x){
        System.out.println("I am a overloaded constructor of base with the value of x:"+x);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
class Derived1 extends Base1{
    Derived1(){
//        super(2);//for running base class argument wala conwstructor
        System.out.println("i am derived class constructor");
    }
    Derived1(int x,int y){
        super(x);
        System.out.println("I am a overloaded constructor of derived with the value of y:"+y);
    }

}
class ChildOfDerived extends Derived1{
    ChildOfDerived(){
        System.out.println("I am a child of Derived Constructor");
    }
    ChildOfDerived(int x,int y,int z){
        super(x,y);
        System.out.println("I am a child of Derived Constructor with the value of z"+z);
    }
}
public class ch10_46_constructors_inheritence {
    public static void main(String[] args) {
//    Base1 b=new Base1();
    //Derived1 d=new Derived1();
//        Derived1 d=new Derived1(14,9);
//        ChildOfDerived c=new ChildOfDerived();
        ChildOfDerived c=new ChildOfDerived(1,2,3);
    }
}
