package com.company;
import java.util.Scanner;
public class ch2_12_pratice_set {
    public static void main(String[] args) {
        float a = 7/4.0f * 9/2.0f;
        System.out.println(a);

        //////////////////////
        char grade = 'B';
        grade = (char)(grade + 8);
        System.out.println(grade);
        // Decrypting the grade
        grade = (char)(grade - 8);
        System.out.println(grade);


        //////////////////////////////////
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        System.out.println(t>8);
        System.out.println(7*49/7+35/7);
    }
}
