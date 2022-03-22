package com.company;

import java.util.ArrayDeque;

public class ch15_93_ArrayDequeue {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad1=new ArrayDeque<>();
        ad1.add(6);
        ad1.add(56);
        ad1.add(9);

      try {
          ad1.addFirst(5);
          System.out.println("HEllo");
      }
      catch (ArrayIndexOutOfBoundsException e)
      {
          System.out.println(e);

      }
        for (int i: ad1) {
            System.out.print(i);
            System.out.print(",");
        }

//        System.out.println(ad1.getFirst());
//        System.out.println(ad1.getLast());
    }
}
