package com.company;

import java.util.SortedMap;

class parent{
    int a;

    public int getA() {
        return a;
    }

    public parent(int v){
        this.a=v;

    }
    public int returnone(){
        return 1;
    }
}
class child extends parent{
    child(int c){
        super(c);
        System.out.println("i am a constructor");
    }
}
public class ch10_47_this_super {
    public static void main(String[] args) {
//    parent p=new parent(5);
    child c=new child(4);
        System.out.println(c.getA());



    }
}
