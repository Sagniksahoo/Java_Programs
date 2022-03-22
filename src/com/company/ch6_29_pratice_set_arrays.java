package com.company;
import  java.util.*;
public class ch6_29_pratice_set_arrays {
    public static void main(String[] args) {
        //question 1
//        float [] marks={22.34f,66.78f,89.88f,66.88f,98.90f};
//        float sum=0.0f;
//        for (float ele:marks){
//            sum=sum+ele;
//        }
//        System.out.println(sum);

//        float [] marks={22.34f,66.78f,89.88f,66.88f,98.90f};
//        float num=89.88f;
//        boolean isInArray=false;
//        for (float ele:marks){
//            if (num==ele){
//                isInArray=true;
//                break;
//            }
//        }
//        if (isInArray){
//            System.out.println("the value is present in the array");
//        }
//        else {
//            System.out.println("the value is not present in the array");
//        }
          // question no arpit
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter the length: ");
//        int n=sc.nextInt();
//        int []array= new int[n];
//        System.out.println("enter the elements of the array: ");
//        for (int i=0;i<n;i++){
//            array[i]= sc.nextInt();
//        }
//        System.out.println("the elements are: ");
//        for (int i=0;i<n;i++){
//            System.out.println(array[i]);
//        }
        //question 3
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter the number of students: ");
//        int n =sc.nextInt();
//        int ava=0;
//        int sum=0;
//        int [] marks=new int[n];
//        System.out.println("enter the marks of the students: ");
//        for (int ele:marks){
//            marks[ele]=sc.nextInt();
//            sum=sum+marks[ele];
//
//        }
//        ava=sum/n;
//        System.out.printf("\nthe ava is %d",ava);



//        //question 4
        Scanner sc=new Scanner(System.in);

       int [][] fla=new int[2][3];
       int [][] fla1=new int[2][3];
        System.out.println("enter the elements of the 1st matrix: ");
        for (int i=0;i< fla.length;i++){
            for (int j=0;j<fla[i].length;j++){
                fla[i][j]=sc.nextInt();
            }
        }
        System.out.println("emter the elements of 2nd matrix: ");
        for (int k=0;k< fla.length;k++){
            for (int l=0;l<fla[k].length;l++){
                fla1[k][l]=sc.nextInt();
            }
        }
        System.out.println("the summation is: ");
        int [][] array=new int[2][3];
        for (int i=0;i< fla.length;i++){
            for (int j=0;j<fla[i].length;j++){
                array[i][j]=fla[i][j]+fla1[i][j];
                System.out.print(array[i][j]);
                System.out.print("  ");
            }
            System.out.println( );
        }

//       for (int i=0;i< fla.length;i++){
//           for (int j=0;j<fla[i].length;j++){
//               System.out.print(fla[i][j]);
//               System.out.print(" ");
//           }
//           System.out.println( );
//       }
//
//        for (int k=0;k< fla.length;k++){
//            for (int l=0;l<fla[k].length;l++){
//                System.out.print(fla[k][l]);
//                System.out.print(" ");
//            }
//            System.out.println( );
//        }

        //question 5 my method
//        Scanner sc =new Scanner(System.in);
//        System.out.println("enter the length: ");
//        int n=sc.nextInt();
//        int [] array=new int[n];
//
//        System.out.println("enter the elements of the array: ");
//        for (int i=0;i<array.length;i++){
//            array[i]=sc.nextInt();
//            System.out.print(array[i]);
//            System.out.print(" ");
//        }
//        System.out.println( );
//        System.out.println("the reverse array is: ");
//        for (int j=array.length-1;j>=0;j--){
//            System.out.print(array[j]);
//            System.out.print(" ");
//        }
       //question 5

//        Scanner sc =new Scanner(System.in);
//        System.out.println("enter your length: ");
//        int l=sc.nextInt();
//        System.out.println("enter the elements: ");
//        int [] arr =new int[l];
//        for (int i=0;i<l;i++){
//            arr[i]= sc.nextInt();
////            System.out.print(arr[i] +" ");
//        }
//        int temp;
//        int k=Math.floorDiv(l, 2);
////        System.out.println(k);
//        for (int i=0;i<k;i++){
//            temp=arr[i];
//            arr[i]=arr[l-i-1];
//            arr[l-i-1]=temp;
//        }
//        for (int ele: arr){
//            System.out.print(ele +" ");
//        }

        //question 6

//        Scanner sc =new Scanner(System.in);
//        System.out.println("enter your length: ");
//        int l=sc.nextInt();
//        System.out.println("enter the elements: ");
//        int [] arr =new int[l];
//        for (int i=0;i<l;i++){
//            arr[i]= sc.nextInt();
////            System.out.print(arr[i] +" ");
//        }
//        int max=Integer.MIN_VALUE;
//        for(int ele:arr){
//            if (ele>max){
//                max=ele;
//            }
//        }
//        System.out.println("the value of thge maximus element in the arry is " + max);

        //question 7
//        Scanner sc =new Scanner(System.in);
//        System.out.println("enter your length: ");
//        int l=sc.nextInt();
//        System.out.println("enter the elements: ");
//        int [] arr =new int[l];
//        for (int i=0;i<l;i++){
//            arr[i]= sc.nextInt();
////            System.out.print(arr[i] +" ");
//        }
//        int min=Integer.MAX_VALUE;
//        for (int ele:arr){
//            if (ele<min){
//                min=ele;
//            }
//        }
//        System.out.println("the value of the minimum element in the array is  " + min);
        //question 8
//        Scanner sc =new Scanner(System.in);
//        System.out.println("enter your length: ");
//        int l=sc.nextInt();
//        System.out.println("enter the elements: ");
//        int [] arr =new int[l];
//        for (int i=0;i<l;i++){
//            arr[i]= sc.nextInt();
////            System.out.print(arr[i] +" ");
//        }
//        boolean isSorted=true;
//        for (int i=0;i<l-1;i++){
//            if(arr[i]>arr[i+1]){
//                isSorted=false;
//                break;
//            }
//        }
//        if (isSorted){
//            System.out.println("the array is sorted");
//        }
//        else {
//            System.out.println("the array is not sorted");
//        }
        //matrix multiplication
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter length");
//        int a= sc.nextInt();
//        System.out.println("enter length");
//        int b= sc.nextInt();
//        int[][] fla = new int[a][b];
//        int[][] fla1 = new int[a][b];
//
//        int [][] fla2=new int[a][b];
//        System.out.println("enter the elements of the 1st MATRIX:");
//        for (int i = 0; i <a; i++) {
//            for (int j = 0; j <b; j++) {
//                fla[i][j] = sc.nextInt();
//            }
//        }
//        System.out.println("enter the elements of the second MATRIX:");
//        for (int i = 0; i < a; i++) {
//            for (int j = 0; j <b; j++) {
//                fla1[i][j] = sc.nextInt();
//            }
//        }
//        for(int i=0;i<a;i++){
//            for(int j=0;j<b;j++){
//                fla2[i][j]=0;
//                for(int k=0;k<a;k++)
//                {
//                    fla2[i][j]+=fla[i][k]*fla1[k][j];
//                }
//                System.out.print(fla2[i][j]+" ");
//            }
//            System.out.println();
//        }
    }
}
