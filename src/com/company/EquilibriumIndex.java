package com.company;
import java.util.*;

public class EquilibriumIndex {
    int equilibrium(int arr[], int n) {
        int i, j;
        int leftSum, rightSum;
        for (i = 0; i < n; ++i) {
            leftSum = 0;
            for (j = 0; j < i; j++)
                leftSum += arr[j];

            rightSum = 0;
            for (j = i + 1; j < n; j++)
                rightSum += arr[j];

            if (leftSum == rightSum)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        EquilibriumIndex equi= new EquilibriumIndex();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length: ");
        int arrSize=sc.nextInt();
        int []arr=new int[arrSize];
        System.out.println("enter the elements: ");
        for (int i=0;i<arrSize;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println(equi.equilibrium(arr, arrSize));

    }
}

