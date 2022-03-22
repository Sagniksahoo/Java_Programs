package com.company;
//class circle2{
//    public int r;
//    circle2(int a){
//        System.out.println("i am circle paramiterized constructor");
//        this.r=a;
//    }
//    public double area(){
//        System.out.println("I am the area of circle");
//        return Math.PI*this.r*this.r;
//    }
//}
//class cylinder1 extends circle2{
//    public int h;
//    cylinder1(int r,int h){
//    super(r);
//        System.out.println("i am cylinder1 parameterized constructor");
//    this.h=h;
//    }
//    public double volume(){
//        return Math.PI*this.r*this.r*h;
//    }
//}
class ectangle1{
    public int height;
    public int side;
    ectangle1(int s,int h){
        this.side=s;
        this.height=h;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public int area(){
        System.out.println("i am the area of Rectangle");
        return 2*(side+height);
    }
    public int volume(){
        System.out.println("i am the volume of Rectangle");
        return side*height;
    }
}
class cuboid extends ectangle1{
    public int width;
    cuboid(int s,int h,int w){
        super(s,h);
        this.width=w;
    }
    public int carea(){
        System.out.println("I am the area of cuboid");
        return 2*side*width+2*side*height+2*height*width;
    }
    public  int cvolume(){
        System.out.println("I sam the volume of cuboid");
        return side*width*height;
    }
}
public class ch10_52_Practice_set {
    public static void main(String[] args) {
    //problem 1
//     circle2 ob1=new circle2(4);
//        cylinder1 obj2=new cylinder1(4,5);
//        System.out.println(obj2.area());
//        System.out.println(obj2.volume());

        //problem 2
//        ectangle1 obj1=new ectangle1(4,3);
       cuboid obj=new cuboid(4,3,2);
        System.out.println(obj.area());
        System.out.println(obj.carea());
        System.out.println(obj.volume());
        System.out.println(obj.cvolume());
    }
}
