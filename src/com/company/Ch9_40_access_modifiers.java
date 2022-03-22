package com.company;
class MyEmployee{
    private int id;
    private String name;
    public String kk;
    public String  getName(){
        return name;
    }
    public void setName(String n){
        this.name=n;
    }
    public void setName1(){
        this.name="Sourav Kundu";
    }
    public String getName1(){
        return name;
    }
    public void setId(int n){
        this.id=n;
    }
    public int getId() {
        return id;
    }
}
class circle1{
    private int radius;
    private float area;
    private float perimeter;
    public void setRadius(int n){
        this.radius=n;
    }
    public int getRadius(){
        return radius;
    }
    public void  setArea(float n){
        area=3.14f*radius*radius;
        if (n==area){
            this.area=n;
        }
        else {
            System.out.println("wrong input");
        }
    }
    public float getArea(){
        return area;
    }
    public void setPerimeter(float n){
        perimeter=2*3.142f*radius;
        if(n==perimeter){
            perimeter=n;
        }
        else{
            System.out.println("Wrong Value for Perimeter!");
        }
    }
    public float getPerimeter(){
        return perimeter;
    }
}
public class Ch9_40_access_modifiers {
    public static void main(String[] args) {
    MyEmployee sagnik=new MyEmployee();
//    sagnik.id=45;
//    sagnik.name="sagnik sahoo";-->Throws an error due to private access modifier
        sagnik.setName("sagnik sahoo");
        sagnik.setName1();
        sagnik.setId(45);
        System.out.println(sagnik.getName1());
        System.out.println(sagnik.getName());
        System.out.println(sagnik.getId());

//        circle1 c=new circle1();
//        c.setRadius(5);
//        c.setArea(78.5f);
////
//        c.setPerimeter(34.55f);
//        System.out.println(c.getRadius());
//        System.out.println(c.getArea());
//        System.out.println(c.getPerimeter());

    }
}
