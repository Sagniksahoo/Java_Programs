package com.company;
class Max_Multiplier extends Exception{
    Max_Multiplier(String a){

    }
    @Override
    public String toString() {
        return "cannot multiply 70000";
    }

    @Override
    public String getMessage() {
        return "cannot multiply 70000";
    }
}
class MaxinputException extends Exception{
    @Override
    public String getMessage() {
        return "cannot take input greater than 100000";
    }
    @Override
    public String toString() {
        return "cannot take input greater than 100000";
    }
}
class InvalidInputException extends Exception{
    @Override
    public String getMessage() {
        return "Cannot add 8 and 9";
    }

    @Override
    public String toString() {
        return "i am InvalidInputException";
    }
}
class cannotDivideByZero extends Exception{
    @Override
    public String toString() {
        return "Cannot divide by Zero";
    }

    @Override
    public String getMessage() {
        return "Cannot divide by Zero";
    }
}
class customCalculator{
    double addition(double a, double b) throws InvalidInputException,MaxinputException {
        if (a>100000 || b>100000){
            throw new MaxinputException();
        }
        if(a==8 || b==9){
            throw new InvalidInputException();
        }
        return a+b;
    }
    double subtraction(double a, double b) throws MaxinputException{
        if (a>100000 || b>100000){
            throw new MaxinputException();
        }
        return a-b;
    }
    double multiplication(double a, double b) throws MaxinputException,Max_Multiplier{
        if (a>7000 || b>7000){
            throw new Max_Multiplier("cannot multiply by 70000");
        }
        if (a>100000 || b>100000){
            throw new MaxinputException();
        }
        return a*b;
    }
    double division(double a, double b) throws cannotDivideByZero,MaxinputException{

        if (a>100000 || b>100000){
            throw new MaxinputException();
        }
        if (b==0){
            throw new cannotDivideByZero();
        }
        return a/b;
    }
}

public class custom_103_Calculator {
    public static void main(String[] args) throws InvalidInputException,cannotDivideByZero,MaxinputException,Max_Multiplier{
          /*
          you have to create a custom calculator with following operations
          1. --> Addition
          2. --> Subtraction
          3. --> Multiplication
          4. --> Division
          which throws the following exception
          1. invalid input exception
          2. cannot divide by 0 exception
          3. Max Input Exception if any of the inputs is greater than 100000
          4. Max Multiplier Reached Exception - Don't allow multiplication input to be greater than 7000
           */
        customCalculator c=new customCalculator();
//        c.addition(8,9);
//        c.division(4,0);
//        c.addition(1100000,10);
        System.out.println( c.multiplication(8,4));

    }
}
