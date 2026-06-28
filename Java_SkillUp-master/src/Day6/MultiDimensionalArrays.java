package Day6;

import java.util.Arrays;

public class MultiDimensionalArrays {
    public static void main(String[] args) {

        //1st approach
        /*int a[][]=new int[3][2];
        a[0][0]=100;
        a[0][1]=200;
        a[1][0]=300;
        a[1][1]=400;
        a[2][0]=500;
        a[2][1]=600;*/


        //2nd approach
        int ab[][] = { {100,200}, {300,400}, {500,600}};

        for(int row=0;row<3;row++){
            for(int col=0;col<2;col++)
            {
                System.out.print(ab[row][col]+" ");
            }
            System.out.println();
        }
        }
        //System.out.println(ab[0][1]);
        //size of array

        //System.out.println("length of rows " + a.length);
        //System.out.println("length of columns " + a[0].length);
    }

