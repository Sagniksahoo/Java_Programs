package com.company;

import java.util.SortedMap;

abstract class pen{
    abstract void write();
    abstract void refill();
}
class FountainPen extends pen{
    @Override
    public void write(){
        System.out.println("Writting a paragraph");
    }
    @Override
    public void refill(){
        System.out.println("refilling the pen");
    }
    public void changeNib(){
        System.out.println("Changing the nib!!");
    }
}
class Monkey{
    public void jump(){
        System.out.println("Jumping........");
    }
    public void bite(){
        System.out.println("this will ite u...");
    }
}
interface BasicAnimalInterface{
    void eat();
    void sleep();
}
class Human extends Monkey implements BasicAnimalInterface{
    @Override
    public void eat() {
        System.out.println("everyone loves to eat.....");
    }

    @Override
    public void sleep() {
        System.out.println("Everyone have to sleep ");
    }
    public void speak(){
        System.out.println("spaking");
    }
}
abstract class TelePhone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}
class  SmartTelePhone extends TelePhone{
    @Override
    public void ring(){
        System.out.println("ringing...");
    }
    @Override
    public void lift(){
        System.out.println("lifting");
    }
    @Override
    public void disconnect(){
        System.out.println("disconnecting.....");
    }
    public void fax(){
        System.out.println("sending fax");
    }
}
interface TvRemote{
    void switchOn();
    void switchOff();
}
interface SmartTvRemote extends TvRemote{
    void changeChannel();
    void soundUpDown();
}
class Tv implements TvRemote{
    @Override
    public void switchOff() {
        System.out.println("Switching of...........");
    }

    @Override
    public void switchOn() {
        System.out.println("Switch on.........");
    }
}
public class ch11_60_practice_set {
    public static void main(String[] args) {
        //problem 1 and 2
//    FountainPen p=new FountainPen();
//    p.changeNib();
        //problem 3
//        Human h=new Human();
//        h.sleep();
//        h.bite();
//        h.eat();
//        h.jump();
//        //problem 5
//        Monkey m1=new Human();
//        m1.bite();
//        m1.jump();
//        //m1.speak(); --> cannot use speak method because the interface is monkey wich does not support speak method
//        BasicAnimalInterface b=new Human();
//        b.eat();
//        b.sleep();
        //b.speak();--> cannot use speak method
//        //problem 4
//        TelePhone tp=new SmartTelePhone();
//        tp.ring();
//        tp.lift();
//        tp.disconnect();
//        //tp.fax(); -->cannot use fax method
        //problem 6 and 7
        Tv t=new Tv();
        t.switchOff();
        t.switchOn();
       // t.soundUpDown(); --> cannot use this method
    }
}
