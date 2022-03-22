package com.company;
import java.util.*;
import java.text.*;
public class hacker_rank {
//   static int b;
//   static int h;
//   static boolean flag=true;
//   static {
//       Scanner sc=new Scanner(System.in);
//       b=sc.nextInt();
//       h=sc.nextInt();
//       if(b<=0 || h<=0){
//           System.out.println("java.lang.Exception: Breadth and height must be positive");
//           flag = false;
//       }
//   }
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int t=sc.nextInt();
//
//        for(int i=0;i<t;i++)
//        {
//
//            try
//            {
//                long x=sc.nextLong();
//                System.out.println(x+" can be fitted in:");
//                if(x<=Byte.MAX_VALUE && x>=Byte.MIN_VALUE) {
//                    System.out.println("* byte");
//                    System.out.println("* short");
//                    System.out.println("* int");
//                    System.out.println("* long");
//                }
//                else if(x<=Short.MAX_VALUE && x>=Short.MIN_VALUE){
//                    System.out.println("* short");
//                    System.out.println("* int");
//                    System.out.println("* long");
//                }
//                else if(x<=Integer.MAX_VALUE && x>=Integer.MIN_VALUE){
//                    System.out.println("* int");
//                    System.out.println("* long");
//                }
//                else {
//                    System.out.println("* long");
//                }
//
//                //Complete the code
//            }
//            catch(Exception e)
//            {
//                System.out.println(sc.next()+" can't be fitted anywhere.");
//            }
//
//        }

        /*
        "In computing, End Of File (commonly abbreviated EOF) is a condition in a computer operating system where no more data can be read from a data source." — (Wikipedia: End-of-file)

The challenge here is to read  lines of input until you reach EOF, then number and print all  lines of content.

Hint: Java's Scanner.hasNext() method is helpful for this problem.

Input Format

Read some unknown  lines of input from stdin(System.in) until you reach EOF; each line of input contains a non-empty String.

Output Format

For each line, print the line number, followed by a single space, and then the line content received as input.

Sample Input

Hello world
I am a file
Read me until end-of-file.
Sample Output

1 Hello world
2 I am a file
3 Read me until end-of-file.
         */

//        int lineNumber=0;
//        while(sc.hasNext()){
//            lineNumber ++;
//            System.out.println(""+lineNumber +" "+sc.nextLine());
//        }
        /*
        Static initialization blocks are executed when the class is loaded, and you can initialize static variables in those blocks.

It's time to test your knowledge of Static initialization blocks. You can read about it here.

You are given a class Solution with a main method. Complete the given code so that it outputs the area of a parallelogram with breadth  and height . You should read the variables from the standard input.

If  or  , the output should be "java.lang.Exception: Breadth and height must be positive" without quotes.

Input Format

There are two lines of input. The first line contains : the breadth of the parallelogram. The next line contains : the height of the parallelogram.

Constraints

Output Format

If both values are greater than zero, then the main method must output the area of the parallelogram. Otherwise, print "java.lang.Exception: Breadth and height must be positive" without quotes.

Sample input 1

1
3
Sample output 1

3
Sample input 2

-1
2
Sample output 2

java.lang.Exception: Breadth and height must be positive
         */

//        if (flag){
//            int area=b*h;
//            System.out.println(area);
//        }
//        Scanner sc=new Scanner(System.in);
//        double payment= sc.nextDouble();
//        sc.close();
//        NumberFormat n=NumberFormat.getCurrencyInstance(Locale.US);
//        String us=n.format(payment);
//        NumberFormat n1=NumberFormat.getCurrencyInstance(new Locale("en","IN"));
//        String india=n1.format(payment);
//        NumberFormat n2=NumberFormat.getCurrencyInstance(Locale.CHINA);
//        String china=n2.format(payment);
//        NumberFormat n3=NumberFormat.getCurrencyInstance(Locale.FRANCE);
//        String france=n3.format(payment);
//
//        System.out.println("us: "+us);
//        System.out.println("india: "+india);
//        System.out.println("china: "+china);
//        System.out.println("France: "+france);
//        String str="hello world";
////        String output=str.substring(1);
//        String output=str.substring(0,1).toUpperCase()+str.substring(1);
//        System.out.println(output);//Hlo world

        Scanner sc=new Scanner(System.in);
        String a= sc.next();
        String b=sc.next();
        int c=a.length();
        int d=b.length();
        int e=c+d;
        System.out.println(e);
        if(a.compareTo(b)>0){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
        String f=a.substring(0,1).toUpperCase()+a.substring(1);
        String g=b.substring(0,1).toUpperCase()+b.substring(1);
        System.out.println(f+" "+g);





    }
}
