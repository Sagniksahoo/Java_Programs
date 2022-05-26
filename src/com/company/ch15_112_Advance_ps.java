package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

@FunctionalInterface
interface hellokaka{
    void Display();
}
class Mydepricated{
    @Deprecated
    void meth1(){
        System.out.println("hi i am method 1");
    }
}
public class ch15_112_Advance_ps {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
//        Mydepricated md=new Mydepricated();
//        md.meth1();
//        hellokaka he=()->{
//            System.out.println("hi i am hello");
//        };
//        he.Display();

//        File myfile=new File("sagnik.txt");
//        try {
//            myfile.createNewFile();
//        }
//        catch (Exception e){
//            System.out.println("error");
//            e.printStackTrace();
//        }
        int i=5;
        String table="";
        for(int j=0;j<=10;j++){
            table+=i+"X"+j+"="+i*j;
            table+="\n";
        }

        try{
            FileWriter fileWriter=new FileWriter("sagnik.txt");
            fileWriter.write(table);
            fileWriter.close();
        }
        catch (IOException e){
            System.out.println("Error");
            e.printStackTrace();
        }

    }
}
