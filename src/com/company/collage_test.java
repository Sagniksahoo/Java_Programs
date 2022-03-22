package com.company;
import  java.util.*;
public class collage_test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int t = sc.nextInt();
        int[] e = new int[t];
        int[] l = new int[t];
        int leftGuest = 0;
        int maxGuest = -1;

        for(int i=0;i<t;i++){
            e[i]=sc.nextInt();
        }

        for(int i=0;i<t;i++){
            l[i]=sc.nextInt();
        }

        for(int i=0;i<t;i++){
            if(e[i] == 0){
                leftGuest-=(l[i]);

                if(leftGuest>maxGuest){
                    maxGuest = leftGuest;
                }
            }
            else{
                int temp = e[i] - l[i];
                leftGuest += temp;

                if(leftGuest>maxGuest){
                    maxGuest = leftGuest;
                }
            }


        }

        System.out.println("Max No. of guests on ship is "+maxGuest);

    }
}
