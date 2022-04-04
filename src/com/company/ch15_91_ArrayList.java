package com.company;
import java.lang.reflect.Array;
import java.util.*;


public class ch15_91_ArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> li= new ArrayList<>(5);
        ArrayList<Integer> l2= new ArrayList<>();

//        ArrayList<String > cars=new ArrayList<>();
//        cars.add("VOLVO");
//        cars.add("BMW");
//        cars.add("FORD");
//        cars.add("MAZDA");
//
//        Collections.sort(cars);


//        for (String i: cars) {
//            System.out.println(i);
//        }





//        l2.add(15);
//        l2.add(18);
//        l2.add(19);
//        l2.add(34);
        li.add(6);
        li.add(7);
        li.add(4);
        li.add(6);
        li.add(2,8);
        li.remove(2);
//        li.addAll(3,l2);
        //li.clear();
        //System.out.println(l2.clone());
//        System.out.println(li.contains(27));
//        System.out.println(li.indexOf(7));
//
//        System.out.println(li.equals(l2));
//
//        if (li.lastIndexOf(6)== -1){
//            System.out.println("fuck off");
//        }
//        else {
//            System.out.println("I love you");
//        }
//        li.remove(2);
//        li.remove(l2);
//        System.out.println( li.subList(1,3));
        for(int i=0;i<li.size();i++){
            System.out.print(li.get(i));
            System.out.print(", ");

        }
        System.out.println();
        for (int a:li) {
            System.out.print(a);
            System.out.print(", ");
        }
       }
}
