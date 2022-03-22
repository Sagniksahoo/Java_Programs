package com.company;

public class ch7_32_methods_overloading {
    //method overloading
    static  void foo(){
        System.out.println("good morning bro!");
    }
    static void foo(int a){
        System.out.println("good morning" +a+" bro");
    }
    static  void foo(int a,int b){
        System.out.println("i love"+a+" you");
        System.out.println("go fuck "+b+" yourself");
    }


    /////////////////////////////////////////
    static  void change(int a){
        a=98;
    }
    static  void change2(int []arr){
        arr[0]=98;
    }

    static void telljoke(){
        System.out.println("i invented a new word! \n "+"Plagiarism");
    }
    public static void main(String[] args) {
        //telljoke();
        //case1:changing the integer
        //int x=45;
        //change(x);
        //System.out.println("the value of x after change is:"+ x);
        //case2:changing the array element
//        int [] marks={52,73,77,89,98,94};
//        change2(marks);
//        System.out.println("the value of marks[0] after changing is: "+marks[0]);


        //method overloadig
        foo();
        foo(3000);
        foo(3000,4000);
    }
}
