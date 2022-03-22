package com.company;

import java.util.HashSet;

public class ch15_95_HashSet {
    public static void main(String[] args) {
//        HashSet<Integer> numbers=new HashSet<>();
//        numbers.add(4);
//        numbers.add(7);
//        numbers.add(8);
//
//
//        for (int i=0;i<=10;i++){
//            if(numbers.contains(i)){
//                System.out.println(i+"was found in the set");
//            }
//            else {
//                System.out.println(i+ "was not found in the set");
//            }
//        }

        HashSet<Integer> myHashSet=new HashSet<>(6,0.5f);
        myHashSet.add(6);
        myHashSet.add(8);
        myHashSet.add(11);
        myHashSet.add(11);
    }
}
