package com.company;
class Employee{
    int salary;
    String name;

    public int getSalary(){
        return  salary;
    }
    public String getName(){
        return name;
    }
    public void setname(String n){
        name=n;

    }
}
class cellPhone{
    public void ringing(){
        System.out.println("Ringing..........");
    }
    public void vibrating(){
        System.out.println("vibretiting...........");
    }
}
class square{
    int side;
   public int area(){
       return side*side;
   }
   public int perimeter(){
       return 4*side;
   }
}
class rectangle{
    int height;
    int breadth;
    public int area1(){
        return height*breadth;
    }
    public int perimeter1(){
        return 2*(height+breadth);
    }
}
class tommyVerCity{
    public void tommy(){
        System.out.println("Hitting.......");
    }
    public void tommyv(){
        System.out.println("Running from thr emeny........");
    }
    public void fire(){
        System.out.println("Fireingggg..............");
    }
}
class circle{
    int r;
    public float areac(){
        return (3.14f*r*r);
    }
    public float perimetersc(){
        return (2*3.14f*r);
    }
}
public class ch8_39_customclass_practice_set {
    public static void main(String[] args) {
    /*
        //Problem 1
//        Employee sagnik=new Employee();
////        sagnik.name="sagnoik sahoo";
//        sagnik.setname("Sagnik Sahoo");
//        sagnik.salary=200;
//        System.out.println(sagnik.getSalary());
//        System.out.println(sagnik.getName());

        //problem 2
        cellPhone apple=new cellPhone();
        apple.ringing();
        apple.vibrating();

        //problem 3
     square a=new square();
     a.side=4;
        System.out.println(a.area());
        System.out.println(a.perimeter());

        //problem 4
        rectangle b=new rectangle();
        b.height=4;
        b.breadth=3;
        System.out.println(b.area1());
        System.out.println(b.perimeter1());

        //problem 5
        tommyVerCity c= new tommyVerCity();
        c.tommy();
        c.tommyv();
        c.fire();
     */
        //problem 6
    circle d=new circle();
    d.r=3;
        System.out.println(d.areac());
        System.out.println(d.perimetersc());

    }
}
