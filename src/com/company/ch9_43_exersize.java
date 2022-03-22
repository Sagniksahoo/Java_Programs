package com.company;
import java.util.*;
class game{
    public int rand,guess,no_of_guess=0;
    public game(){
        Random rd=new Random();
        rand= rd.nextInt(20);
    }
    public void userInput(int num){
        guess=num;
    }
    public boolean isCorrect(){
        if (rand>guess){
            System.out.println("YOu have choosen lesser");
            no_of_guess=no_of_guess+1;
            return false;
        }
        else if(rand<guess){
            System.out.println("You have choosen a bigger number");
            no_of_guess=no_of_guess+1;
            return false;
        }
        else {
            System.out.println("correct guess");
            no_of_guess=no_of_guess+1;
            System.out.println("no of gusses:"+no_of_guess);
            return  true;
        }
    }
}
public class ch9_43_exersize {
    public static void main(String[] args) {
        /*
        Create a class game, which allows a user to play "Guess the number"
        game once. Game should have the following methods:
        1.Constructor to generate the random number
        2.takeUserInput() to take a user input of number
        3.isCorrectNumber()  to detect weather the number entered by the user is true
        4.getter and setter for noOfGuesses
        Use properties such as noOfGuesses(int), etc to get this task done!
         */
//        System.out.println("welcome to Guess the number Game-->>>");
//        System.out.println("You have to choose the correct number:");
//        Scanner sc=new Scanner(System.in);
//        game gm=new game();
//        System.out.println("Guess the number:");
//        gm.userInput(sc.nextInt());
//        while (!gm.isCorrect()){
//            System.out.println("guss a number:");
//            gm.userInput(sc.nextInt());
//        }
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to Our Guess the number GAme->>");
        System.out.println("you have to choose the correct number");
        game gm=new game();
        System.out.println("guess the number:");
        gm.userInput(sc.nextInt());
        while (!gm.isCorrect()){
            System.out.println("Guess a number:");
            gm.userInput(sc.nextInt());
        }
    }
}
