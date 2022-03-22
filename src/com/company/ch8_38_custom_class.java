package com.company;
import java.util.*;
class Employee1{
    int id;
    String name;
    int salary;
    public  void printDetails(){
        System.out.println("my id is:"+id);
        System.out.println("and my name is"+name);
    }
    public int getSalary(){
        return salary;
    }
}
class Employee2{
    int basicsalary;
    int dm;
    public int salary(){
        return (basicsalary+dm);
    }

}
public class ch8_38_custom_class {
    int add(int a,int b){
        return a+b;
    }
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee1 harry = new Employee1();// Instantiating a new Employee object
        Employee1 jhon=new Employee1();
        //Setting Properties(Attributes)
        harry.id=12;
        harry.name="SagnikSahoo";
        harry.salary=13;
        Scanner sc=new Scanner(System.in);
        jhon.id= sc.nextInt();
        jhon.salary=13;
        sc.nextLine();
        jhon.name= sc.nextLine();
        sc.close();
        harry.printDetails();
        jhon.printDetails();
//        printing the attributes
        int c= jhon.getSalary();
        int d= harry.getSalary();
        System.out.println(c);
        System.out.println(d);
//        System.out.println(harry.id);
//        System.out.println(harry.name);

//        Employee1 sagnik=new Employee1();
//        sagnik.basicsalary= sc.nextInt();
//        sagnik.dm= sc.nextInt();
//        sagnik.salary();
//        System.out.println(sagnik.salary());
        ch8_38_custom_class obj=new ch8_38_custom_class();
        int a=5;
        int b=7;
        int cc;
        cc=obj.add(a,b);
        System.out.println(cc);
    }
}
