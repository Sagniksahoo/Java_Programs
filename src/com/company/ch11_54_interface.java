package com.company;
interface Bycycle{
    void applyBreak(int decrement);
    void speedUp(int increment);
}
class AronCycle implements Bycycle{
    int speed=7;
    @Override
    public void applyBreak(int decrement){
        speed -= decrement;
        System.out.println(speed);
    }
    @Override
    public void speedUp(int increment){
        speed=speed+increment;
        System.out.println(speed);
    }
}
public class ch11_54_interface {
    public static void main(String[] args) {
    AronCycle c=new AronCycle();
    c.applyBreak(6);
    c.speedUp(7);
    }
}
