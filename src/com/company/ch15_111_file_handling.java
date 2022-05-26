package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

public class ch15_111_file_handling {
    public static void main(String[] args) {
        //File myFile=new File("sagnik.txt");
        //code to create a new file
        /**
         *

        try{
            myFile.createNewFile();
        }
        catch (Exception e){
            System.out.println("unable to ctrate a file");
            e.printStackTrace();
        }

        //code to write to a file
        try {
            FileWriter fileWriter=new FileWriter("sagnik.txt");
            fileWriter.write("this is our first  file from the course\n ok now bye");
            fileWriter.close();
        }
        catch (Exception e){
            System.out.println("Unable to write in the file");
            e.printStackTrace();
        }

        //code to read a file
        File myFile=new File("sagnik.txt");
        try {
            Scanner sc=new Scanner(myFile);
            while(sc.hasNextLine()){
                String line=sc.nextLine();
                System.out.println(line);
            }
        }
        catch (FileNotFoundException e){
            System.out.println("File not found");
            e.printStackTrace();
        }
         */
        //code to delete a file
        File Myfile=new File("sagnik.txt");
        if(Myfile.delete()){
            System.out.println("I have delete the file "+Myfile.getName());
        }
        else {
            System.out.println("Some problem occourd while deleting file");
        }
    }
}
