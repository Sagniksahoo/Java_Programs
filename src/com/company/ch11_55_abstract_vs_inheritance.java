package com.company;
interface Bycyle1{
    int a=45;
    void applybreak(int decrement);
    void speedUp(int increment);
}
interface HornBycycle{
    void blowHorn3g();
    void blowHornmhn();
}
class AronCycle1 implements Bycyle1, HornBycycle{
    void blowHorn(){
        System.out.println("pee pee poo poo .......i am a disco dancer");
    }

    @Override
    public void applybreak(int decrement) {
        System.out.println("Applying break");
    }

    @Override
    public void speedUp(int increment) {
        System.out.println("Applying SpeedUp");
    }

    @Override
    public void blowHorn3g() {
        System.out.println("Khaabi khui khavi gam");
    }

    @Override
    public void blowHornmhn() {
        System.out.println("Main hoo na POOO piii poooo");
    }
}
public class ch11_55_abstract_vs_inheritance {
    public static void main(String[] args) {
    AronCycle1 c=new AronCycle1();
    c.applybreak(1);
    //you can create properties in Interface
    System.out.println(c.a);
    /*
     you cannot modify the propertied in Interface as they are final
      c.a=33;//thorws an error
      System.out.println(c.a);
      */
        c.blowHorn();
        c.blowHornmhn();
        c.blowHorn3g();
    }
}
