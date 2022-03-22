package com.company;
public class ch6_28_multidimensional_array {
    public static void main(String[] args) {
        int [][] flats=new int[3][4];
        flats[0][0]=101;
        flats[0][1]=102;
        flats[0][2]=103;
        flats[0][3]=104;
        flats[1][0]=201;
        flats[1][1]=202;
        flats[1][2]=203;
        flats[1][3]=204;
        flats[2][0]=301;
        flats[2][1]=302;
        flats[2][2]=303;
        flats[2][3]=304;


        for (int i=0;i<flats.length;i++){
            for (int j=0;j<flats[i].length;j++){
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}
