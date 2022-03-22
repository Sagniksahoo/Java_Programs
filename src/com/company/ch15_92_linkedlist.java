package com.company;

import java.util.*;

public class ch15_92_linkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> li= new LinkedList<>();
        LinkedList<Integer> l2= new LinkedList<>();
        l2.add(15);
        l2.add(18);
        l2.add(19);
        l2.add(34);
        li.add(6);
        li.add(7);
        li.add(4);
        li.add(6);
        li.add(2,8);
        li.addAll(3,l2);
        li.addLast(7);
        li.addFirst(888);
        //li.clear();
        for(int i=0;i<li.size();i++){
            System.out.print(li.get(i));
            System.out.print(", ");
        }
    }
}
