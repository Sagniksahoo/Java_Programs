package com.company;
class MyMainEmployee{
    private int id;
    private String name;
    private int salary;
    //constructorn
    public MyMainEmployee(){
        id=45;
        name="Sagnik Sahooooo";
    }
    public MyMainEmployee(String myName,int myId){
        id=myId;
        name=myName;
    }
    public MyMainEmployee(int n){
        salary=n;
    }
    public int getSalary(){
        return salary;
    }

    public String  getName(){
        return name;
    }
    public void setName(String n){
        this.name=n;
    }
    public void setId(int n){
        this.id=n;
    }
    public int getId() {
        return id;
    }
}
public class ch9_42_constructors {
    public static void main(String[] args) {
    MyMainEmployee sagnik=new MyMainEmployee();
//        MyMainEmployee sagnik=new MyMainEmployee(100000);
//    sagnik.setName("sagnik sahoo");
//    sagnik.setId(35);
        System.out.println(sagnik.getName());
        System.out.println(sagnik.getId());
        System.out.println(sagnik.getSalary());
    }
}
