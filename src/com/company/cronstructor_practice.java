package com.company;
class sagnik{
    int uid;
    public sagnik(int x){
        System.out.println("Hi i am sagnik sahoo");
        this.uid=x;
    }
}
public class cronstructor_practice {
    public static void main(String[] args) {
        sagnik s=new sagnik(5);
        System.out.println(s.uid);
    }
}
