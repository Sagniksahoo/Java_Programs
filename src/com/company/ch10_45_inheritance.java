package com.company;
class base{
    public int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("i am setting X now");
        this.x = x;
    }

    public void printMe(){
        System.out.println("I am sagnik sahoo");
    }
}
class Derived extends base{
    public int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
class Animal{
    public String a;

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }
}
class dog extends Animal{
    public String b;

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }
}
public class ch10_45_inheritance {
    public static void main(String[] args) {
//        //calling base class
//        base b=new base();
//        b.setX(4);
//        b.printMe();
//        System.out.println(b.getX());
//        //calling Drived Class
//        Derived d=new Derived();
//        d.setX(43);
//        System.out.println(d.getX());


        //quick quiz
        Animal A=new Animal();
        A.setA("Hi i am Animal");
        System.out.println(A.getA());
        //
        dog d=new dog();
        d.setA("Hi i am a sweet dog");
        System.out.println(d.getA());
        d.setB("baaaoooo naoooo");
        System.out.println(d.getB());
    }
}
