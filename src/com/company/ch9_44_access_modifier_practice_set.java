package com.company;
class cylinder{
    private int radius;
    private int height;

    public cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
   public double surfaceArea(){
        return 2*Math.PI *radius*height+2*Math.PI*radius*radius;
   }
   public double volume(){
        return Math.PI*radius*radius*height;
   }

}
class rectangle1{
    private int length;
    private int breadth;

    public rectangle1() {
        this.length = 4;
        this.breadth =5;
    }

    public rectangle1(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }
}
class spare{
    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double surfaceArea(){
        return 4*Math.PI*radius*radius;
    }
    public double volume(){
        return 4/3*Math.PI*radius*radius*radius;
    }
}
public class ch9_44_access_modifier_practice_set {
    public static void main(String[] args) {
        //question 1
        /*
        cylinder cc=new cylinder();
        cc.setRadius(5);
        cc.setHeight(7);
        System.out.println(cc.getRadius());
        System.out.println(cc.getHeight());


        //Question 2
        cylinder cc=new cylinder();
        cc.setRadius(5);
        cc.setHeight(7);
        System.out.println(cc.surfaceArea());
        System.out.println(cc.volume());


        //question 3
    cylinder cc=new cylinder(5,7);
        System.out.println(cc.volume());
        System.out.println(cc.surfaceArea());
        System.out.println(cc.getHeight());
        System.out.println(cc.getRadius());

        //question 4
    rectangle1 rr=new rectangle1(10,15);
        System.out.println(rr.getBreadth());
        System.out.println(rr.getLength());

         */
        //question 5
    spare ss=new spare();
    ss.setRadius(5);
        System.out.println(ss.surfaceArea());
        System.out.println(ss.volume());
    }
}
