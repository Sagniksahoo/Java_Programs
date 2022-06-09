package com.company;

import java.util.ArrayList;
class MyGeneric<T1,T2>{
    int val;
    private T1 t1;
    private T2 t2;

    public MyGeneric(int val, T1 t1,T2 t2) {
        this.val = val;
        this.t1 = t1;
        this.t2 = t2;
    }

    public T2 getT2() {
        return t2;
    }

    public void setT2(T2 t2) {
        this.t2 = t2;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public T1 getT1() {
        return t1;
    }

    public void setT1(T1 t1) {
        this.t1 = t1;
    }
}

class Generic <T1,T2,T3>{
    int valu;
    private T1 t1;
    private T2 t2;
    private T3 t3;
    public Generic(int valu,T1 t1,T2 t2,T3 t3){
        this.valu=valu;
        this.t1=t1;
        this.t2=t2;
        this.t3=t3;
    }
    public void setT1(T1 t1){
        this.t1=t1;
    }

    public T1 getT1() {
        return t1;
    }

    public int getValu() {
        return valu;
    }

    public void setValu(int valu) {
        this.valu = valu;
    }

    public T2 getT2() {
        return t2;
    }

    public void setT2(T2 t2) {
        this.t2 = t2;
    }

    public T3 getT3() {
        return t3;
    }

    public void setT3(T3 t3) {
        this.t3 = t3;
    }
}
public class ch15_110_Java_Generics {
    public static void main(String[] args) {
//        ArrayList arrayList=new ArrayList();
//        arrayList.add("str 1");
//        arrayList.add(54);
//        arrayList.add(636);
//
//        int a=(int) arrayList.get(2);
//        System.out.println(a);


//        ArrayList<Integer> arrayList=new ArrayList<>();
//        arrayList.add(5);
//        arrayList.add(54);
//        arrayList.add(636);
//        System.out.println(arrayList.get(2));
//        MyGeneric<String,Integer> g1=new MyGeneric<>(23,"myString",788);
//        String str= g1.getT1();
//        int kaka=g1.getT2();
//        System.out.println(str);
//        System.out.println(kaka);

        Generic<String,Integer,String> obj=new Generic<>(56,"hello",67,"sahoo");
        int v=obj.getValu();
        String a=obj.getT1();
        int b=obj.getT2();
        String c=obj.getT3();
        System.out.println(v+" "+a+" "+b+" "+" "+c);
    }
}
