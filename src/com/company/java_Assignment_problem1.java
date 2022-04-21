package com.company;
import java.util.*;
class Atransport{
    String name;
    int w;
    int charge;
    double total_charge;
    public void accept(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the name");
        name=sc.nextLine();
        System.out.println("enter the weight");
        w=sc.nextInt();
    }
    public void calculate(){
        if(w<=10){
            charge=w*25;
            total_charge=charge+0.25*charge;
        }
        else if(w>10 && w<=30){
            charge=w*20;
            total_charge=charge+0.25*charge;
        }
        else if(w>30){
            charge=w*10;
            total_charge=charge+0.25*charge;
        }
        else {
            System.out.println("Wrong Input");
        }
    }
    public void print(){
        System.out.print("Name");
        System.out.print("\t\t");
        System.out.print("Weight");
        System.out.print("\t\t");
        System.out.print("Bill Amount");
        System.out.println();
        System.out.print(name+"\t\t");
        System.out.print(w+"\t\t");
        System.out.print(total_charge+"\n");
        System.out.print("____");
        System.out.print("\t");
        System.out.print("____");
        System.out.print("\t\t");
        System.out.print("____");
        System.out.print("\t\t");
        System.out.println();

    }

}
public class java_Assignment_problem1 {
    public static void main(String[] args) {
        Atransport aa=new Atransport();
        System.out.println("Enter how many data you want to enter:");
        Scanner se=new Scanner(System.in);
        int n= se.nextInt();
        for (int i=1;i<=n;i++){
            aa.accept();
            aa.calculate();
            aa.print();
        }
    }
}
