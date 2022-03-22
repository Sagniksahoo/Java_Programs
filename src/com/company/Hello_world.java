package com.company;
import java.util.*;
interface cycle{
    int a=45;
    void applyBreak(int decrement);
    void speedUp(int increment);
}
interface HornCycle{
    void blow3g();
    void blow4g();
}
class HeroCycle implements cycle, HornCycle{
    int speed=10;
    @Override
    public void applyBreak(int decrement) {
        speed=speed-decrement;
        System.out.println("this breaking speed is:"+speed);
    }

    @Override
    public void speedUp(int increment) {
        speed =speed+increment;
        System.out.println("the new speed is:"+speed);
    }

    @Override
    public void blow3g() {
        System.out.println("pooooooooooooooo poooooooooooo piiiiiiiiiii");
    }

    @Override
    public void blow4g() {
        System.out.println("tiii tooooooo tiiiii tooooooo");
    }
}
public class Hello_world {
    public static void main(String[] args) {
//      HeroCycle h=new HeroCycle();
//      h.applyBreak(5);
//      h.speedUp(5);
//      h.blow3g();
//      h.blow4g();
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter the size of the array: ");
//        int n=sc.nextInt();
//        int[] arr=new int[n];
//        System.out.println("Enter the elements of the array:");
//        for(int i=0;i<n;i++){
//            arr[i]=sc.nextInt();
//        }
//        for (int i=0;i<n;i++){
//            System.out.println(arr[i]);
//        }

    }
}
